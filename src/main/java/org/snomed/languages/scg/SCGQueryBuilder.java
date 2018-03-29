package org.snomed.languages.scg;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.snomed.languages.scg.domain.model.Attribute;
import org.snomed.languages.scg.domain.model.AttributeGroup;
import org.snomed.languages.scg.domain.model.AttributeValue;
import org.snomed.languages.scg.domain.model.DefinitionStatus;
import org.snomed.languages.scg.domain.model.Expression;
import org.snomed.languages.scg.generated.ImpotentSCGListener;
import org.snomed.languages.scg.generated.SCGParserErrorListener;
import org.snomed.languages.scg.generated.parser.SCGLexer;
import org.snomed.languages.scg.generated.parser.SCGParser;
import org.snomed.languages.scg.generated.parser.SCGParser.AttributeContext;
import org.snomed.languages.scg.generated.parser.SCGParser.AttributegroupContext;
import org.snomed.languages.scg.generated.parser.SCGParser.ConceptreferenceContext;
import org.snomed.languages.scg.generated.parser.SCGParser.DefinitionstatusContext;
import org.snomed.languages.scg.generated.parser.SCGParser.ExpressionContext;
import org.snomed.languages.scg.generated.parser.SCGParser.ExpressionvalueContext;
import org.snomed.languages.scg.generated.parser.SCGParser.SubexpressionContext;

public class SCGQueryBuilder {

	private SCGObjectFactory scgObjectFactory;
	
	public SCGQueryBuilder(SCGObjectFactory scgObjectFactory) {
		this.scgObjectFactory = scgObjectFactory;
	}

	public Expression createQuery(String scg) throws SCGException{
		
		ANTLRInputStream inputStream = new ANTLRInputStream(scg);
		final SCGLexer lexer = new SCGLexer(inputStream);
		final CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		final SCGParser parser = new SCGParser(tokenStream);
		parser.addErrorListener(new SCGParserErrorListener());
		ParserRuleContext tree;
		try {
			tree = parser.expression();
		} catch (NullPointerException | RecognitionException | ParseCancellationException e) {
			throw new SCGException("Failed to parse SCG expression '" + scg + "'", e);
		}
		final ParseTreeWalker walker = new ParseTreeWalker();
		final SCGListenerImpl listener = new SCGListenerImpl(scgObjectFactory);
		walker.walk(listener, tree);

		return listener.getExpression();
	}
	
	
	private static class SCGListenerImpl extends ImpotentSCGListener{
		
		private SCGObjectFactory scgObjectFactory;
		private Expression rootExpression;

		public SCGListenerImpl(SCGObjectFactory scgObjectFactory) {
			this.scgObjectFactory = scgObjectFactory;
		}
	
		@Override
		public void enterExpression(ExpressionContext ctx) {
			Expression expression = build(ctx);
			if (rootExpression == null) {
				rootExpression = expression;
			}
		}
		
		private Expression build(ExpressionContext ctx) {
			Expression root = null;
			if (ctx.definitionstatus() != null) {
				root = build(ctx.definitionstatus());
			}
			if (ctx.subexpression() != null) {
				Expression expression = build(ctx.subexpression());
				if (root != null) {
					expression.setDefinitionStatus(root.getDefinitionStatus());
				} 
				root = expression;
			}
			return root;
		}
		
		public Expression build(DefinitionstatusContext ctx) {
			Expression expression = scgObjectFactory.getExpression();
			expression.setDefinitionStatus(DefinitionStatus.textLookup(ctx.getText()));
			return expression;
		}

		public Expression build(SubexpressionContext ctx) {
			Expression expression = scgObjectFactory.getExpression();
			if (ctx.focusconcept() != null) {
				if (ctx.focusconcept().conceptreference() != null) {
					List<String> conceptIds = ctx.focusconcept()
							 					 .conceptreference()
							 					 .stream()
							 					 .map(c -> c.conceptid().getText())
							 					 .collect(Collectors.toList());
					expression.setFocusConcepts(conceptIds);
				}
			}
			
			if (ctx.refinement() != null) {
				if (ctx.refinement().attributegroup() != null 
						&& !ctx.refinement().attributegroup().isEmpty()) {
					Set<AttributeGroup> groups = ctx.refinement()
							.attributegroup()
							.stream()
							.map(g -> mapAttributeGroup(g))
							.collect(Collectors.toSet());
					expression.setAttributeGroups(groups);
				}
				
				if (ctx.refinement().attributeset() != null) {
					if (ctx.refinement().attributeset().attribute() != null) {
						List<Attribute> attributes = ctx.refinement()
								.attributeset()
								.attribute()
								.stream()
								.map(a -> mapAttributes(a))
								.collect(Collectors.toList());
						expression.setAttributes(attributes);
					}
				}
			}
			return expression;
		}

		private Attribute mapAttributes(AttributeContext ctx) {
			Attribute attribute = new Attribute();
			ConceptreferenceContext conceptreference = ctx.attributename().conceptreference();
			if (conceptreference != null && conceptreference.conceptid() != null) {
				attribute.setAttributeId(conceptreference.conceptid().getText());
			}
			
			ExpressionvalueContext expressionvalue = ctx.attributevalue().expressionvalue();
			if (expressionvalue != null) {
				AttributeValue value = scgObjectFactory.getAttributeValue();
				if (expressionvalue.subexpression() != null) {
					value.setNestedExpression(build(expressionvalue.subexpression()));
				}
				
				if (expressionvalue.conceptreference() != null) {
					value.setConceptId(expressionvalue.conceptreference().conceptid().getText());
				}
				attribute.setAttributeValue(value);
			}
			return attribute;
		}

		private AttributeGroup mapAttributeGroup(AttributegroupContext ctx) {
			if (ctx.attributeset() != null) {
				AttributeGroup group = scgObjectFactory.getAttributeGroup();
				if (ctx.attributeset().attribute() != null) {
					List<Attribute> attributes = ctx.attributeset()
							.attribute()
							.stream()
							.map(a -> mapAttributes(a))
							.collect(Collectors.toList());
					group.setAttributes(attributes);
				}
				return group;
			}
			return null;
		}

		public Expression getExpression() {
			return rootExpression;
		}
	}
}
