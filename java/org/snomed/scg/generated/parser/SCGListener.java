// Generated from SCG.txt by ANTLR 4.5.3
package org.snomed.scg.generated.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SCGParser}.
 */
public interface SCGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SCGParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SCGParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SCGParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#subexpression}.
	 * @param ctx the parse tree
	 */
	void enterSubexpression(SCGParser.SubexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#subexpression}.
	 * @param ctx the parse tree
	 */
	void exitSubexpression(SCGParser.SubexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#definitionstatus}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionstatus(SCGParser.DefinitionstatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#definitionstatus}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionstatus(SCGParser.DefinitionstatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#equivalentto}.
	 * @param ctx the parse tree
	 */
	void enterEquivalentto(SCGParser.EquivalenttoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#equivalentto}.
	 * @param ctx the parse tree
	 */
	void exitEquivalentto(SCGParser.EquivalenttoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#subtypeof}.
	 * @param ctx the parse tree
	 */
	void enterSubtypeof(SCGParser.SubtypeofContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#subtypeof}.
	 * @param ctx the parse tree
	 */
	void exitSubtypeof(SCGParser.SubtypeofContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#focusconcept}.
	 * @param ctx the parse tree
	 */
	void enterFocusconcept(SCGParser.FocusconceptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#focusconcept}.
	 * @param ctx the parse tree
	 */
	void exitFocusconcept(SCGParser.FocusconceptContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#conceptreference}.
	 * @param ctx the parse tree
	 */
	void enterConceptreference(SCGParser.ConceptreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#conceptreference}.
	 * @param ctx the parse tree
	 */
	void exitConceptreference(SCGParser.ConceptreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#conceptid}.
	 * @param ctx the parse tree
	 */
	void enterConceptid(SCGParser.ConceptidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#conceptid}.
	 * @param ctx the parse tree
	 */
	void exitConceptid(SCGParser.ConceptidContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SCGParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SCGParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#refinement}.
	 * @param ctx the parse tree
	 */
	void enterRefinement(SCGParser.RefinementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#refinement}.
	 * @param ctx the parse tree
	 */
	void exitRefinement(SCGParser.RefinementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#attributegroup}.
	 * @param ctx the parse tree
	 */
	void enterAttributegroup(SCGParser.AttributegroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#attributegroup}.
	 * @param ctx the parse tree
	 */
	void exitAttributegroup(SCGParser.AttributegroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#attributeset}.
	 * @param ctx the parse tree
	 */
	void enterAttributeset(SCGParser.AttributesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#attributeset}.
	 * @param ctx the parse tree
	 */
	void exitAttributeset(SCGParser.AttributesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(SCGParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(SCGParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#attributename}.
	 * @param ctx the parse tree
	 */
	void enterAttributename(SCGParser.AttributenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#attributename}.
	 * @param ctx the parse tree
	 */
	void exitAttributename(SCGParser.AttributenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#attributevalue}.
	 * @param ctx the parse tree
	 */
	void enterAttributevalue(SCGParser.AttributevalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#attributevalue}.
	 * @param ctx the parse tree
	 */
	void exitAttributevalue(SCGParser.AttributevalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#expressionvalue}.
	 * @param ctx the parse tree
	 */
	void enterExpressionvalue(SCGParser.ExpressionvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#expressionvalue}.
	 * @param ctx the parse tree
	 */
	void exitExpressionvalue(SCGParser.ExpressionvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#stringvalue}.
	 * @param ctx the parse tree
	 */
	void enterStringvalue(SCGParser.StringvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#stringvalue}.
	 * @param ctx the parse tree
	 */
	void exitStringvalue(SCGParser.StringvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#numericvalue}.
	 * @param ctx the parse tree
	 */
	void enterNumericvalue(SCGParser.NumericvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#numericvalue}.
	 * @param ctx the parse tree
	 */
	void exitNumericvalue(SCGParser.NumericvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#integervalue}.
	 * @param ctx the parse tree
	 */
	void enterIntegervalue(SCGParser.IntegervalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#integervalue}.
	 * @param ctx the parse tree
	 */
	void exitIntegervalue(SCGParser.IntegervalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#decimalvalue}.
	 * @param ctx the parse tree
	 */
	void enterDecimalvalue(SCGParser.DecimalvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#decimalvalue}.
	 * @param ctx the parse tree
	 */
	void exitDecimalvalue(SCGParser.DecimalvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#sctid}.
	 * @param ctx the parse tree
	 */
	void enterSctid(SCGParser.SctidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#sctid}.
	 * @param ctx the parse tree
	 */
	void exitSctid(SCGParser.SctidContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(SCGParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(SCGParser.WsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#sp}.
	 * @param ctx the parse tree
	 */
	void enterSp(SCGParser.SpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#sp}.
	 * @param ctx the parse tree
	 */
	void exitSp(SCGParser.SpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#htab}.
	 * @param ctx the parse tree
	 */
	void enterHtab(SCGParser.HtabContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#htab}.
	 * @param ctx the parse tree
	 */
	void exitHtab(SCGParser.HtabContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#cr}.
	 * @param ctx the parse tree
	 */
	void enterCr(SCGParser.CrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#cr}.
	 * @param ctx the parse tree
	 */
	void exitCr(SCGParser.CrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#lf}.
	 * @param ctx the parse tree
	 */
	void enterLf(SCGParser.LfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#lf}.
	 * @param ctx the parse tree
	 */
	void exitLf(SCGParser.LfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#qm}.
	 * @param ctx the parse tree
	 */
	void enterQm(SCGParser.QmContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#qm}.
	 * @param ctx the parse tree
	 */
	void exitQm(SCGParser.QmContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#bs}.
	 * @param ctx the parse tree
	 */
	void enterBs(SCGParser.BsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#bs}.
	 * @param ctx the parse tree
	 */
	void exitBs(SCGParser.BsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(SCGParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(SCGParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#zero}.
	 * @param ctx the parse tree
	 */
	void enterZero(SCGParser.ZeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#zero}.
	 * @param ctx the parse tree
	 */
	void exitZero(SCGParser.ZeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#digitnonzero}.
	 * @param ctx the parse tree
	 */
	void enterDigitnonzero(SCGParser.DigitnonzeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#digitnonzero}.
	 * @param ctx the parse tree
	 */
	void exitDigitnonzero(SCGParser.DigitnonzeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#nonwsnonpipe}.
	 * @param ctx the parse tree
	 */
	void enterNonwsnonpipe(SCGParser.NonwsnonpipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#nonwsnonpipe}.
	 * @param ctx the parse tree
	 */
	void exitNonwsnonpipe(SCGParser.NonwsnonpipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#anynonescapedchar}.
	 * @param ctx the parse tree
	 */
	void enterAnynonescapedchar(SCGParser.AnynonescapedcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#anynonescapedchar}.
	 * @param ctx the parse tree
	 */
	void exitAnynonescapedchar(SCGParser.AnynonescapedcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#escapedchar}.
	 * @param ctx the parse tree
	 */
	void enterEscapedchar(SCGParser.EscapedcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#escapedchar}.
	 * @param ctx the parse tree
	 */
	void exitEscapedchar(SCGParser.EscapedcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#utf8_2}.
	 * @param ctx the parse tree
	 */
	void enterUtf8_2(SCGParser.Utf8_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#utf8_2}.
	 * @param ctx the parse tree
	 */
	void exitUtf8_2(SCGParser.Utf8_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#utf8_3}.
	 * @param ctx the parse tree
	 */
	void enterUtf8_3(SCGParser.Utf8_3Context ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#utf8_3}.
	 * @param ctx the parse tree
	 */
	void exitUtf8_3(SCGParser.Utf8_3Context ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#utf8_4}.
	 * @param ctx the parse tree
	 */
	void enterUtf8_4(SCGParser.Utf8_4Context ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#utf8_4}.
	 * @param ctx the parse tree
	 */
	void exitUtf8_4(SCGParser.Utf8_4Context ctx);
	/**
	 * Enter a parse tree produced by {@link SCGParser#utf8_tail}.
	 * @param ctx the parse tree
	 */
	void enterUtf8_tail(SCGParser.Utf8_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCGParser#utf8_tail}.
	 * @param ctx the parse tree
	 */
	void exitUtf8_tail(SCGParser.Utf8_tailContext ctx);
}