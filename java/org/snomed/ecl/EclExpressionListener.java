// Generated from EclExpression.txt by ANTLR 4.5.3
package org.snomed.ecl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EclExpressionParser}.
 */
public interface EclExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#expressionconstraint}.
	 * @param ctx the parse tree
	 */
	void enterExpressionconstraint(EclExpressionParser.ExpressionconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#expressionconstraint}.
	 * @param ctx the parse tree
	 */
	void exitExpressionconstraint(EclExpressionParser.ExpressionconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#refinedexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void enterRefinedexpressionconstraint(EclExpressionParser.RefinedexpressionconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#refinedexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void exitRefinedexpressionconstraint(EclExpressionParser.RefinedexpressionconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#compoundexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void enterCompoundexpressionconstraint(EclExpressionParser.CompoundexpressionconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#compoundexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void exitCompoundexpressionconstraint(EclExpressionParser.CompoundexpressionconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#conjunctionexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void enterConjunctionexpressionconstraint(EclExpressionParser.ConjunctionexpressionconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#conjunctionexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void exitConjunctionexpressionconstraint(EclExpressionParser.ConjunctionexpressionconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#disjunctionexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void enterDisjunctionexpressionconstraint(EclExpressionParser.DisjunctionexpressionconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#disjunctionexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void exitDisjunctionexpressionconstraint(EclExpressionParser.DisjunctionexpressionconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#exclusionexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void enterExclusionexpressionconstraint(EclExpressionParser.ExclusionexpressionconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#exclusionexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void exitExclusionexpressionconstraint(EclExpressionParser.ExclusionexpressionconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#dottedexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void enterDottedexpressionconstraint(EclExpressionParser.DottedexpressionconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#dottedexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void exitDottedexpressionconstraint(EclExpressionParser.DottedexpressionconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#subexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void enterSubexpressionconstraint(EclExpressionParser.SubexpressionconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#subexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void exitSubexpressionconstraint(EclExpressionParser.SubexpressionconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#simpleexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void enterSimpleexpressionconstraint(EclExpressionParser.SimpleexpressionconstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#simpleexpressionconstraint}.
	 * @param ctx the parse tree
	 */
	void exitSimpleexpressionconstraint(EclExpressionParser.SimpleexpressionconstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#eclfocusconcept}.
	 * @param ctx the parse tree
	 */
	void enterEclfocusconcept(EclExpressionParser.EclfocusconceptContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#eclfocusconcept}.
	 * @param ctx the parse tree
	 */
	void exitEclfocusconcept(EclExpressionParser.EclfocusconceptContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#dot}.
	 * @param ctx the parse tree
	 */
	void enterDot(EclExpressionParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#dot}.
	 * @param ctx the parse tree
	 */
	void exitDot(EclExpressionParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#memberof}.
	 * @param ctx the parse tree
	 */
	void enterMemberof(EclExpressionParser.MemberofContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#memberof}.
	 * @param ctx the parse tree
	 */
	void exitMemberof(EclExpressionParser.MemberofContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#conceptreference}.
	 * @param ctx the parse tree
	 */
	void enterConceptreference(EclExpressionParser.ConceptreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#conceptreference}.
	 * @param ctx the parse tree
	 */
	void exitConceptreference(EclExpressionParser.ConceptreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#conceptid}.
	 * @param ctx the parse tree
	 */
	void enterConceptid(EclExpressionParser.ConceptidContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#conceptid}.
	 * @param ctx the parse tree
	 */
	void exitConceptid(EclExpressionParser.ConceptidContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(EclExpressionParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(EclExpressionParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(EclExpressionParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(EclExpressionParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#constraintoperator}.
	 * @param ctx the parse tree
	 */
	void enterConstraintoperator(EclExpressionParser.ConstraintoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#constraintoperator}.
	 * @param ctx the parse tree
	 */
	void exitConstraintoperator(EclExpressionParser.ConstraintoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#descendantof}.
	 * @param ctx the parse tree
	 */
	void enterDescendantof(EclExpressionParser.DescendantofContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#descendantof}.
	 * @param ctx the parse tree
	 */
	void exitDescendantof(EclExpressionParser.DescendantofContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#descendantorselfof}.
	 * @param ctx the parse tree
	 */
	void enterDescendantorselfof(EclExpressionParser.DescendantorselfofContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#descendantorselfof}.
	 * @param ctx the parse tree
	 */
	void exitDescendantorselfof(EclExpressionParser.DescendantorselfofContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#childof}.
	 * @param ctx the parse tree
	 */
	void enterChildof(EclExpressionParser.ChildofContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#childof}.
	 * @param ctx the parse tree
	 */
	void exitChildof(EclExpressionParser.ChildofContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#ancestorof}.
	 * @param ctx the parse tree
	 */
	void enterAncestorof(EclExpressionParser.AncestorofContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#ancestorof}.
	 * @param ctx the parse tree
	 */
	void exitAncestorof(EclExpressionParser.AncestorofContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#ancestororselfof}.
	 * @param ctx the parse tree
	 */
	void enterAncestororselfof(EclExpressionParser.AncestororselfofContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#ancestororselfof}.
	 * @param ctx the parse tree
	 */
	void exitAncestororselfof(EclExpressionParser.AncestororselfofContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#parentof}.
	 * @param ctx the parse tree
	 */
	void enterParentof(EclExpressionParser.ParentofContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#parentof}.
	 * @param ctx the parse tree
	 */
	void exitParentof(EclExpressionParser.ParentofContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(EclExpressionParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(EclExpressionParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(EclExpressionParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(EclExpressionParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#exclusion}.
	 * @param ctx the parse tree
	 */
	void enterExclusion(EclExpressionParser.ExclusionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#exclusion}.
	 * @param ctx the parse tree
	 */
	void exitExclusion(EclExpressionParser.ExclusionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#eclrefinement}.
	 * @param ctx the parse tree
	 */
	void enterEclrefinement(EclExpressionParser.EclrefinementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#eclrefinement}.
	 * @param ctx the parse tree
	 */
	void exitEclrefinement(EclExpressionParser.EclrefinementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#conjunctionrefinementset}.
	 * @param ctx the parse tree
	 */
	void enterConjunctionrefinementset(EclExpressionParser.ConjunctionrefinementsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#conjunctionrefinementset}.
	 * @param ctx the parse tree
	 */
	void exitConjunctionrefinementset(EclExpressionParser.ConjunctionrefinementsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#disjunctionrefinementset}.
	 * @param ctx the parse tree
	 */
	void enterDisjunctionrefinementset(EclExpressionParser.DisjunctionrefinementsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#disjunctionrefinementset}.
	 * @param ctx the parse tree
	 */
	void exitDisjunctionrefinementset(EclExpressionParser.DisjunctionrefinementsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#subrefinement}.
	 * @param ctx the parse tree
	 */
	void enterSubrefinement(EclExpressionParser.SubrefinementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#subrefinement}.
	 * @param ctx the parse tree
	 */
	void exitSubrefinement(EclExpressionParser.SubrefinementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#eclattributeset}.
	 * @param ctx the parse tree
	 */
	void enterEclattributeset(EclExpressionParser.EclattributesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#eclattributeset}.
	 * @param ctx the parse tree
	 */
	void exitEclattributeset(EclExpressionParser.EclattributesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#conjunctionattributeset}.
	 * @param ctx the parse tree
	 */
	void enterConjunctionattributeset(EclExpressionParser.ConjunctionattributesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#conjunctionattributeset}.
	 * @param ctx the parse tree
	 */
	void exitConjunctionattributeset(EclExpressionParser.ConjunctionattributesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#disjunctionattributeset}.
	 * @param ctx the parse tree
	 */
	void enterDisjunctionattributeset(EclExpressionParser.DisjunctionattributesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#disjunctionattributeset}.
	 * @param ctx the parse tree
	 */
	void exitDisjunctionattributeset(EclExpressionParser.DisjunctionattributesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#subattributeset}.
	 * @param ctx the parse tree
	 */
	void enterSubattributeset(EclExpressionParser.SubattributesetContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#subattributeset}.
	 * @param ctx the parse tree
	 */
	void exitSubattributeset(EclExpressionParser.SubattributesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#eclattributegroup}.
	 * @param ctx the parse tree
	 */
	void enterEclattributegroup(EclExpressionParser.EclattributegroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#eclattributegroup}.
	 * @param ctx the parse tree
	 */
	void exitEclattributegroup(EclExpressionParser.EclattributegroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#eclattribute}.
	 * @param ctx the parse tree
	 */
	void enterEclattribute(EclExpressionParser.EclattributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#eclattribute}.
	 * @param ctx the parse tree
	 */
	void exitEclattribute(EclExpressionParser.EclattributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#cardinality}.
	 * @param ctx the parse tree
	 */
	void enterCardinality(EclExpressionParser.CardinalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#cardinality}.
	 * @param ctx the parse tree
	 */
	void exitCardinality(EclExpressionParser.CardinalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#minvalue}.
	 * @param ctx the parse tree
	 */
	void enterMinvalue(EclExpressionParser.MinvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#minvalue}.
	 * @param ctx the parse tree
	 */
	void exitMinvalue(EclExpressionParser.MinvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(EclExpressionParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(EclExpressionParser.ToContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#maxvalue}.
	 * @param ctx the parse tree
	 */
	void enterMaxvalue(EclExpressionParser.MaxvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#maxvalue}.
	 * @param ctx the parse tree
	 */
	void exitMaxvalue(EclExpressionParser.MaxvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#many}.
	 * @param ctx the parse tree
	 */
	void enterMany(EclExpressionParser.ManyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#many}.
	 * @param ctx the parse tree
	 */
	void exitMany(EclExpressionParser.ManyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#reverseflag}.
	 * @param ctx the parse tree
	 */
	void enterReverseflag(EclExpressionParser.ReverseflagContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#reverseflag}.
	 * @param ctx the parse tree
	 */
	void exitReverseflag(EclExpressionParser.ReverseflagContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#attributeoperator}.
	 * @param ctx the parse tree
	 */
	void enterAttributeoperator(EclExpressionParser.AttributeoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#attributeoperator}.
	 * @param ctx the parse tree
	 */
	void exitAttributeoperator(EclExpressionParser.AttributeoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#eclattributename}.
	 * @param ctx the parse tree
	 */
	void enterEclattributename(EclExpressionParser.EclattributenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#eclattributename}.
	 * @param ctx the parse tree
	 */
	void exitEclattributename(EclExpressionParser.EclattributenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#expressioncomparisonoperator}.
	 * @param ctx the parse tree
	 */
	void enterExpressioncomparisonoperator(EclExpressionParser.ExpressioncomparisonoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#expressioncomparisonoperator}.
	 * @param ctx the parse tree
	 */
	void exitExpressioncomparisonoperator(EclExpressionParser.ExpressioncomparisonoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#numericcomparisonoperator}.
	 * @param ctx the parse tree
	 */
	void enterNumericcomparisonoperator(EclExpressionParser.NumericcomparisonoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#numericcomparisonoperator}.
	 * @param ctx the parse tree
	 */
	void exitNumericcomparisonoperator(EclExpressionParser.NumericcomparisonoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#stringcomparisonoperator}.
	 * @param ctx the parse tree
	 */
	void enterStringcomparisonoperator(EclExpressionParser.StringcomparisonoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#stringcomparisonoperator}.
	 * @param ctx the parse tree
	 */
	void exitStringcomparisonoperator(EclExpressionParser.StringcomparisonoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#numericvalue}.
	 * @param ctx the parse tree
	 */
	void enterNumericvalue(EclExpressionParser.NumericvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#numericvalue}.
	 * @param ctx the parse tree
	 */
	void exitNumericvalue(EclExpressionParser.NumericvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#stringvalue}.
	 * @param ctx the parse tree
	 */
	void enterStringvalue(EclExpressionParser.StringvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#stringvalue}.
	 * @param ctx the parse tree
	 */
	void exitStringvalue(EclExpressionParser.StringvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#integervalue}.
	 * @param ctx the parse tree
	 */
	void enterIntegervalue(EclExpressionParser.IntegervalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#integervalue}.
	 * @param ctx the parse tree
	 */
	void exitIntegervalue(EclExpressionParser.IntegervalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#decimalvalue}.
	 * @param ctx the parse tree
	 */
	void enterDecimalvalue(EclExpressionParser.DecimalvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#decimalvalue}.
	 * @param ctx the parse tree
	 */
	void exitDecimalvalue(EclExpressionParser.DecimalvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#nonnegativeintegervalue}.
	 * @param ctx the parse tree
	 */
	void enterNonnegativeintegervalue(EclExpressionParser.NonnegativeintegervalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#nonnegativeintegervalue}.
	 * @param ctx the parse tree
	 */
	void exitNonnegativeintegervalue(EclExpressionParser.NonnegativeintegervalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#sctid}.
	 * @param ctx the parse tree
	 */
	void enterSctid(EclExpressionParser.SctidContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#sctid}.
	 * @param ctx the parse tree
	 */
	void exitSctid(EclExpressionParser.SctidContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(EclExpressionParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(EclExpressionParser.WsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#mws}.
	 * @param ctx the parse tree
	 */
	void enterMws(EclExpressionParser.MwsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#mws}.
	 * @param ctx the parse tree
	 */
	void exitMws(EclExpressionParser.MwsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(EclExpressionParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(EclExpressionParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#nonstarchar}.
	 * @param ctx the parse tree
	 */
	void enterNonstarchar(EclExpressionParser.NonstarcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#nonstarchar}.
	 * @param ctx the parse tree
	 */
	void exitNonstarchar(EclExpressionParser.NonstarcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#starwithnonfslash}.
	 * @param ctx the parse tree
	 */
	void enterStarwithnonfslash(EclExpressionParser.StarwithnonfslashContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#starwithnonfslash}.
	 * @param ctx the parse tree
	 */
	void exitStarwithnonfslash(EclExpressionParser.StarwithnonfslashContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#nonfslash}.
	 * @param ctx the parse tree
	 */
	void enterNonfslash(EclExpressionParser.NonfslashContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#nonfslash}.
	 * @param ctx the parse tree
	 */
	void exitNonfslash(EclExpressionParser.NonfslashContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#sp}.
	 * @param ctx the parse tree
	 */
	void enterSp(EclExpressionParser.SpContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#sp}.
	 * @param ctx the parse tree
	 */
	void exitSp(EclExpressionParser.SpContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#htab}.
	 * @param ctx the parse tree
	 */
	void enterHtab(EclExpressionParser.HtabContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#htab}.
	 * @param ctx the parse tree
	 */
	void exitHtab(EclExpressionParser.HtabContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#cr}.
	 * @param ctx the parse tree
	 */
	void enterCr(EclExpressionParser.CrContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#cr}.
	 * @param ctx the parse tree
	 */
	void exitCr(EclExpressionParser.CrContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#lf}.
	 * @param ctx the parse tree
	 */
	void enterLf(EclExpressionParser.LfContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#lf}.
	 * @param ctx the parse tree
	 */
	void exitLf(EclExpressionParser.LfContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#qm}.
	 * @param ctx the parse tree
	 */
	void enterQm(EclExpressionParser.QmContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#qm}.
	 * @param ctx the parse tree
	 */
	void exitQm(EclExpressionParser.QmContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#bs}.
	 * @param ctx the parse tree
	 */
	void enterBs(EclExpressionParser.BsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#bs}.
	 * @param ctx the parse tree
	 */
	void exitBs(EclExpressionParser.BsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(EclExpressionParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(EclExpressionParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#zero}.
	 * @param ctx the parse tree
	 */
	void enterZero(EclExpressionParser.ZeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#zero}.
	 * @param ctx the parse tree
	 */
	void exitZero(EclExpressionParser.ZeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#digitnonzero}.
	 * @param ctx the parse tree
	 */
	void enterDigitnonzero(EclExpressionParser.DigitnonzeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#digitnonzero}.
	 * @param ctx the parse tree
	 */
	void exitDigitnonzero(EclExpressionParser.DigitnonzeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#nonwsnonpipe}.
	 * @param ctx the parse tree
	 */
	void enterNonwsnonpipe(EclExpressionParser.NonwsnonpipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#nonwsnonpipe}.
	 * @param ctx the parse tree
	 */
	void exitNonwsnonpipe(EclExpressionParser.NonwsnonpipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#anynonescapedchar}.
	 * @param ctx the parse tree
	 */
	void enterAnynonescapedchar(EclExpressionParser.AnynonescapedcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#anynonescapedchar}.
	 * @param ctx the parse tree
	 */
	void exitAnynonescapedchar(EclExpressionParser.AnynonescapedcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#escapedchar}.
	 * @param ctx the parse tree
	 */
	void enterEscapedchar(EclExpressionParser.EscapedcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#escapedchar}.
	 * @param ctx the parse tree
	 */
	void exitEscapedchar(EclExpressionParser.EscapedcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#utf8_2}.
	 * @param ctx the parse tree
	 */
	void enterUtf8_2(EclExpressionParser.Utf8_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#utf8_2}.
	 * @param ctx the parse tree
	 */
	void exitUtf8_2(EclExpressionParser.Utf8_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#utf8_3}.
	 * @param ctx the parse tree
	 */
	void enterUtf8_3(EclExpressionParser.Utf8_3Context ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#utf8_3}.
	 * @param ctx the parse tree
	 */
	void exitUtf8_3(EclExpressionParser.Utf8_3Context ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#utf8_4}.
	 * @param ctx the parse tree
	 */
	void enterUtf8_4(EclExpressionParser.Utf8_4Context ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#utf8_4}.
	 * @param ctx the parse tree
	 */
	void exitUtf8_4(EclExpressionParser.Utf8_4Context ctx);
	/**
	 * Enter a parse tree produced by {@link EclExpressionParser#utf8_tail}.
	 * @param ctx the parse tree
	 */
	void enterUtf8_tail(EclExpressionParser.Utf8_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link EclExpressionParser#utf8_tail}.
	 * @param ctx the parse tree
	 */
	void exitUtf8_tail(EclExpressionParser.Utf8_tailContext ctx);
}