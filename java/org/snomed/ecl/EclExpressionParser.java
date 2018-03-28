// Generated from EclExpression.txt by ANTLR 4.5.3
package org.snomed.ecl;
import java.util.List;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EclExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAB=1, LF=2, CR=3, SPACE=4, EXCLAMATION=5, QUOTE=6, POUND=7, DOLLAR=8, 
		PERCENT=9, AMPERSAND=10, APOSTROPHE=11, LEFT_PAREN=12, RIGHT_PAREN=13, 
		ASTERISK=14, PLUS=15, COMMA=16, DASH=17, PERIOD=18, SLASH=19, ZERO=20, 
		ONE=21, TWO=22, THREE=23, FOUR=24, FIVE=25, SIX=26, SEVEN=27, EIGHT=28, 
		NINE=29, COLON=30, SEMICOLON=31, LESS_THAN=32, EQUALS=33, GREATER_THAN=34, 
		QUESTION=35, AT=36, CAP_A=37, CAP_B=38, CAP_C=39, CAP_D=40, CAP_E=41, 
		CAP_F=42, CAP_G=43, CAP_H=44, CAP_I=45, CAP_J=46, CAP_K=47, CAP_L=48, 
		CAP_M=49, CAP_N=50, CAP_O=51, CAP_P=52, CAP_Q=53, CAP_R=54, CAP_S=55, 
		CAP_T=56, CAP_U=57, CAP_V=58, CAP_W=59, CAP_X=60, CAP_Y=61, CAP_Z=62, 
		LEFT_BRACE=63, BACKSLASH=64, RIGHT_BRACE=65, CARAT=66, UNDERSCORE=67, 
		ACCENT=68, A=69, B=70, C=71, D=72, E=73, F=74, G=75, H=76, I=77, J=78, 
		K=79, L=80, M=81, N=82, O=83, P=84, Q=85, R=86, S=87, T=88, U=89, V=90, 
		W=91, X=92, Y=93, Z=94, LEFT_CURLY_BRACE=95, PIPE=96, RIGHT_CURLY_BRACE=97, 
		TILDE=98, U_0080=99, U_0081=100, U_0082=101, U_0083=102, U_0084=103, U_0085=104, 
		U_0086=105, U_0087=106, U_0088=107, U_0089=108, U_008A=109, U_008B=110, 
		U_008C=111, U_008D=112, U_008E=113, U_008F=114, U_0090=115, U_0091=116, 
		U_0092=117, U_0093=118, U_0094=119, U_0095=120, U_0096=121, U_0097=122, 
		U_0098=123, U_0099=124, U_009A=125, U_009B=126, U_009C=127, U_009D=128, 
		U_009E=129, U_009F=130, U_00A0=131, U_00A1=132, U_00A2=133, U_00A3=134, 
		U_00A4=135, U_00A5=136, U_00A6=137, U_00A7=138, U_00A8=139, U_00A9=140, 
		U_00AA=141, U_00AB=142, U_00AC=143, U_00AD=144, U_00AE=145, U_00AF=146, 
		U_00B0=147, U_00B1=148, U_00B2=149, U_00B3=150, U_00B4=151, U_00B5=152, 
		U_00B6=153, U_00B7=154, U_00B8=155, U_00B9=156, U_00BA=157, U_00BB=158, 
		U_00BC=159, U_00BD=160, U_00BE=161, U_00BF=162, U_00C2=163, U_00C3=164, 
		U_00C4=165, U_00C5=166, U_00C6=167, U_00C7=168, U_00C8=169, U_00C9=170, 
		U_00CA=171, U_00CB=172, U_00CC=173, U_00CD=174, U_00CE=175, U_00CF=176, 
		U_00D0=177, U_00D1=178, U_00D2=179, U_00D3=180, U_00D4=181, U_00D5=182, 
		U_00D6=183, U_00D7=184, U_00D8=185, U_00D9=186, U_00DA=187, U_00DB=188, 
		U_00DC=189, U_00DD=190, U_00DE=191, U_00DF=192, U_00E0=193, U_00E1=194, 
		U_00E2=195, U_00E3=196, U_00E4=197, U_00E5=198, U_00E6=199, U_00E7=200, 
		U_00E8=201, U_00E9=202, U_00EA=203, U_00EB=204, U_00EC=205, U_00ED=206, 
		U_00EE=207, U_00EF=208, U_00F0=209, U_00F1=210, U_00F2=211, U_00F3=212, 
		U_00F4=213;
	public static final int
		RULE_expressionconstraint = 0, RULE_refinedexpressionconstraint = 1, RULE_compoundexpressionconstraint = 2, 
		RULE_conjunctionexpressionconstraint = 3, RULE_disjunctionexpressionconstraint = 4, 
		RULE_exclusionexpressionconstraint = 5, RULE_dottedexpressionconstraint = 6, 
		RULE_subexpressionconstraint = 7, RULE_simpleexpressionconstraint = 8, 
		RULE_eclfocusconcept = 9, RULE_dot = 10, RULE_memberof = 11, RULE_conceptreference = 12, 
		RULE_conceptid = 13, RULE_term = 14, RULE_wildcard = 15, RULE_constraintoperator = 16, 
		RULE_descendantof = 17, RULE_descendantorselfof = 18, RULE_childof = 19, 
		RULE_ancestorof = 20, RULE_ancestororselfof = 21, RULE_parentof = 22, 
		RULE_conjunction = 23, RULE_disjunction = 24, RULE_exclusion = 25, RULE_eclrefinement = 26, 
		RULE_conjunctionrefinementset = 27, RULE_disjunctionrefinementset = 28, 
		RULE_subrefinement = 29, RULE_eclattributeset = 30, RULE_conjunctionattributeset = 31, 
		RULE_disjunctionattributeset = 32, RULE_subattributeset = 33, RULE_eclattributegroup = 34, 
		RULE_eclattribute = 35, RULE_cardinality = 36, RULE_minvalue = 37, RULE_to = 38, 
		RULE_maxvalue = 39, RULE_many = 40, RULE_reverseflag = 41, RULE_attributeoperator = 42, 
		RULE_eclattributename = 43, RULE_expressioncomparisonoperator = 44, RULE_numericcomparisonoperator = 45, 
		RULE_stringcomparisonoperator = 46, RULE_numericvalue = 47, RULE_stringvalue = 48, 
		RULE_integervalue = 49, RULE_decimalvalue = 50, RULE_nonnegativeintegervalue = 51, 
		RULE_sctid = 52, RULE_ws = 53, RULE_mws = 54, RULE_comment = 55, RULE_nonstarchar = 56, 
		RULE_starwithnonfslash = 57, RULE_nonfslash = 58, RULE_sp = 59, RULE_htab = 60, 
		RULE_cr = 61, RULE_lf = 62, RULE_qm = 63, RULE_bs = 64, RULE_digit = 65, 
		RULE_zero = 66, RULE_digitnonzero = 67, RULE_nonwsnonpipe = 68, RULE_anynonescapedchar = 69, 
		RULE_escapedchar = 70, RULE_utf8_2 = 71, RULE_utf8_3 = 72, RULE_utf8_4 = 73, 
		RULE_utf8_tail = 74;
	public static final String[] ruleNames = {
		"expressionconstraint", "refinedexpressionconstraint", "compoundexpressionconstraint", 
		"conjunctionexpressionconstraint", "disjunctionexpressionconstraint", 
		"exclusionexpressionconstraint", "dottedexpressionconstraint", "subexpressionconstraint", 
		"simpleexpressionconstraint", "eclfocusconcept", "dot", "memberof", "conceptreference", 
		"conceptid", "term", "wildcard", "constraintoperator", "descendantof", 
		"descendantorselfof", "childof", "ancestorof", "ancestororselfof", "parentof", 
		"conjunction", "disjunction", "exclusion", "eclrefinement", "conjunctionrefinementset", 
		"disjunctionrefinementset", "subrefinement", "eclattributeset", "conjunctionattributeset", 
		"disjunctionattributeset", "subattributeset", "eclattributegroup", "eclattribute", 
		"cardinality", "minvalue", "to", "maxvalue", "many", "reverseflag", "attributeoperator", 
		"eclattributename", "expressioncomparisonoperator", "numericcomparisonoperator", 
		"stringcomparisonoperator", "numericvalue", "stringvalue", "integervalue", 
		"decimalvalue", "nonnegativeintegervalue", "sctid", "ws", "mws", "comment", 
		"nonstarchar", "starwithnonfslash", "nonfslash", "sp", "htab", "cr", "lf", 
		"qm", "bs", "digit", "zero", "digitnonzero", "nonwsnonpipe", "anynonescapedchar", 
		"escapedchar", "utf8_2", "utf8_3", "utf8_4", "utf8_tail"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\\u0009'", "'\\u000A'", "'\\u000D'", "' '", "'!'", "'\"'", "'#'", 
		"'$'", "'%'", "'&'", "'''", "'('", "')'", "'*'", "'+'", "','", "'-'", 
		"'.'", "'/'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", 
		"'8'", "'9'", "':'", "';'", "'<'", "'='", "'>'", "'?'", "'@'", "'A'", 
		"'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", 
		"'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", 
		"'V'", "'W'", "'X'", "'Y'", "'Z'", "'['", "'\\'", "']'", "'^'", "'_'", 
		"'`'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", 
		"'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", 
		"'t'", "'u'", "'v'", "'w'", "'x'", "'y'", "'z'", "'{'", "'|'", "'}'", 
		"'~'", "'\\u0080'", "'\\u0081'", "'\\u0082'", "'\\u0083'", "'\\u0084'", 
		"'\\u0085'", "'\\u0086'", "'\\u0087'", "'\\u0088'", "'\\u0089'", "'\\u008A'", 
		"'\\u008B'", "'\\u008C'", "'\\u008D'", "'\\u008E'", "'\\u008F'", "'\\u0090'", 
		"'\\u0091'", "'\\u0092'", "'\\u0093'", "'\\u0094'", "'\\u0095'", "'\\u0096'", 
		"'\\u0097'", "'\\u0098'", "'\\u0099'", "'\\u009A'", "'\\u009B'", "'\\u009C'", 
		"'\\u009D'", "'\\u009E'", "'\\u009F'", "'\\u00A0'", "'\\u00A1'", "'\\u00A2'", 
		"'\\u00A3'", "'\\u00A4'", "'\\u00A5'", "'\\u00A6'", "'\\u00A7'", "'\\u00A8'", 
		"'\\u00A9'", "'\\u00AA'", "'\\u00AB'", "'\\u00AC'", "'\\u00AD'", "'\\u00AE'", 
		"'\\u00AF'", "'\\u00B0'", "'\\u00B1'", "'\\u00B2'", "'\\u00B3'", "'\\u00B4'", 
		"'\\u00B5'", "'\\u00B6'", "'\\u00B7'", "'\\u00B8'", "'\\u00B9'", "'\\u00BA'", 
		"'\\u00BB'", "'\\u00BC'", "'\\u00BD'", "'\\u00BE'", "'\\u00BF'", "'\\u00C2'", 
		"'\\u00C3'", "'\\u00C4'", "'\\u00C5'", "'\\u00C6'", "'\\u00C7'", "'\\u00C8'", 
		"'\\u00C9'", "'\\u00CA'", "'\\u00CB'", "'\\u00CC'", "'\\u00CD'", "'\\u00CE'", 
		"'\\u00CF'", "'\\u00D0'", "'\\u00D1'", "'\\u00D2'", "'\\u00D3'", "'\\u00D4'", 
		"'\\u00D5'", "'\\u00D6'", "'\\u00D7'", "'\\u00D8'", "'\\u00D9'", "'\\u00DA'", 
		"'\\u00DB'", "'\\u00DC'", "'\\u00DD'", "'\\u00DE'", "'\\u00DF'", "'\\u00E0'", 
		"'\\u00E1'", "'\\u00E2'", "'\\u00E3'", "'\\u00E4'", "'\\u00E5'", "'\\u00E6'", 
		"'\\u00E7'", "'\\u00E8'", "'\\u00E9'", "'\\u00EA'", "'\\u00EB'", "'\\u00EC'", 
		"'\\u00ED'", "'\\u00EE'", "'\\u00EF'", "'\\u00F0'", "'\\u00F1'", "'\\u00F2'", 
		"'\\u00F3'", "'\\u00F4'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TAB", "LF", "CR", "SPACE", "EXCLAMATION", "QUOTE", "POUND", "DOLLAR", 
		"PERCENT", "AMPERSAND", "APOSTROPHE", "LEFT_PAREN", "RIGHT_PAREN", "ASTERISK", 
		"PLUS", "COMMA", "DASH", "PERIOD", "SLASH", "ZERO", "ONE", "TWO", "THREE", 
		"FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "COLON", "SEMICOLON", 
		"LESS_THAN", "EQUALS", "GREATER_THAN", "QUESTION", "AT", "CAP_A", "CAP_B", 
		"CAP_C", "CAP_D", "CAP_E", "CAP_F", "CAP_G", "CAP_H", "CAP_I", "CAP_J", 
		"CAP_K", "CAP_L", "CAP_M", "CAP_N", "CAP_O", "CAP_P", "CAP_Q", "CAP_R", 
		"CAP_S", "CAP_T", "CAP_U", "CAP_V", "CAP_W", "CAP_X", "CAP_Y", "CAP_Z", 
		"LEFT_BRACE", "BACKSLASH", "RIGHT_BRACE", "CARAT", "UNDERSCORE", "ACCENT", 
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "LEFT_CURLY_BRACE", 
		"PIPE", "RIGHT_CURLY_BRACE", "TILDE", "U_0080", "U_0081", "U_0082", "U_0083", 
		"U_0084", "U_0085", "U_0086", "U_0087", "U_0088", "U_0089", "U_008A", 
		"U_008B", "U_008C", "U_008D", "U_008E", "U_008F", "U_0090", "U_0091", 
		"U_0092", "U_0093", "U_0094", "U_0095", "U_0096", "U_0097", "U_0098", 
		"U_0099", "U_009A", "U_009B", "U_009C", "U_009D", "U_009E", "U_009F", 
		"U_00A0", "U_00A1", "U_00A2", "U_00A3", "U_00A4", "U_00A5", "U_00A6", 
		"U_00A7", "U_00A8", "U_00A9", "U_00AA", "U_00AB", "U_00AC", "U_00AD", 
		"U_00AE", "U_00AF", "U_00B0", "U_00B1", "U_00B2", "U_00B3", "U_00B4", 
		"U_00B5", "U_00B6", "U_00B7", "U_00B8", "U_00B9", "U_00BA", "U_00BB", 
		"U_00BC", "U_00BD", "U_00BE", "U_00BF", "U_00C2", "U_00C3", "U_00C4", 
		"U_00C5", "U_00C6", "U_00C7", "U_00C8", "U_00C9", "U_00CA", "U_00CB", 
		"U_00CC", "U_00CD", "U_00CE", "U_00CF", "U_00D0", "U_00D1", "U_00D2", 
		"U_00D3", "U_00D4", "U_00D5", "U_00D6", "U_00D7", "U_00D8", "U_00D9", 
		"U_00DA", "U_00DB", "U_00DC", "U_00DD", "U_00DE", "U_00DF", "U_00E0", 
		"U_00E1", "U_00E2", "U_00E3", "U_00E4", "U_00E5", "U_00E6", "U_00E7", 
		"U_00E8", "U_00E9", "U_00EA", "U_00EB", "U_00EC", "U_00ED", "U_00EE", 
		"U_00EF", "U_00F0", "U_00F1", "U_00F2", "U_00F3", "U_00F4"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "EclExpression.txt"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EclExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionconstraintContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public RefinedexpressionconstraintContext refinedexpressionconstraint() {
			return getRuleContext(RefinedexpressionconstraintContext.class,0);
		}
		public CompoundexpressionconstraintContext compoundexpressionconstraint() {
			return getRuleContext(CompoundexpressionconstraintContext.class,0);
		}
		public DottedexpressionconstraintContext dottedexpressionconstraint() {
			return getRuleContext(DottedexpressionconstraintContext.class,0);
		}
		public SubexpressionconstraintContext subexpressionconstraint() {
			return getRuleContext(SubexpressionconstraintContext.class,0);
		}
		public ExpressionconstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionconstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterExpressionconstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitExpressionconstraint(this);
		}
	}

	public final ExpressionconstraintContext expressionconstraint() throws RecognitionException {
		ExpressionconstraintContext _localctx = new ExpressionconstraintContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expressionconstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			ws();
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(151);
				refinedexpressionconstraint();
				}
				break;
			case 2:
				{
				setState(152);
				compoundexpressionconstraint();
				}
				break;
			case 3:
				{
				setState(153);
				dottedexpressionconstraint();
				}
				break;
			case 4:
				{
				setState(154);
				subexpressionconstraint();
				}
				break;
			}
			setState(157);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefinedexpressionconstraintContext extends ParserRuleContext {
		public SimpleexpressionconstraintContext simpleexpressionconstraint() {
			return getRuleContext(SimpleexpressionconstraintContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode COLON() { return getToken(EclExpressionParser.COLON, 0); }
		public EclrefinementContext eclrefinement() {
			return getRuleContext(EclrefinementContext.class,0);
		}
		public RefinedexpressionconstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refinedexpressionconstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterRefinedexpressionconstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitRefinedexpressionconstraint(this);
		}
	}

	public final RefinedexpressionconstraintContext refinedexpressionconstraint() throws RecognitionException {
		RefinedexpressionconstraintContext _localctx = new RefinedexpressionconstraintContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_refinedexpressionconstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			simpleexpressionconstraint();
			setState(160);
			ws();
			setState(161);
			match(COLON);
			setState(162);
			ws();
			setState(163);
			eclrefinement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundexpressionconstraintContext extends ParserRuleContext {
		public ConjunctionexpressionconstraintContext conjunctionexpressionconstraint() {
			return getRuleContext(ConjunctionexpressionconstraintContext.class,0);
		}
		public DisjunctionexpressionconstraintContext disjunctionexpressionconstraint() {
			return getRuleContext(DisjunctionexpressionconstraintContext.class,0);
		}
		public ExclusionexpressionconstraintContext exclusionexpressionconstraint() {
			return getRuleContext(ExclusionexpressionconstraintContext.class,0);
		}
		public CompoundexpressionconstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundexpressionconstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterCompoundexpressionconstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitCompoundexpressionconstraint(this);
		}
	}

	public final CompoundexpressionconstraintContext compoundexpressionconstraint() throws RecognitionException {
		CompoundexpressionconstraintContext _localctx = new CompoundexpressionconstraintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compoundexpressionconstraint);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				conjunctionexpressionconstraint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				disjunctionexpressionconstraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				exclusionexpressionconstraint();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjunctionexpressionconstraintContext extends ParserRuleContext {
		public List<SubexpressionconstraintContext> subexpressionconstraint() {
			return getRuleContexts(SubexpressionconstraintContext.class);
		}
		public SubexpressionconstraintContext subexpressionconstraint(int i) {
			return getRuleContext(SubexpressionconstraintContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public ConjunctionexpressionconstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunctionexpressionconstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterConjunctionexpressionconstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitConjunctionexpressionconstraint(this);
		}
	}

	public final ConjunctionexpressionconstraintContext conjunctionexpressionconstraint() throws RecognitionException {
		ConjunctionexpressionconstraintContext _localctx = new ConjunctionexpressionconstraintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conjunctionexpressionconstraint);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			subexpressionconstraint();
			setState(176); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(171);
					ws();
					setState(172);
					conjunction();
					setState(173);
					ws();
					setState(174);
					subexpressionconstraint();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(178); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisjunctionexpressionconstraintContext extends ParserRuleContext {
		public List<SubexpressionconstraintContext> subexpressionconstraint() {
			return getRuleContexts(SubexpressionconstraintContext.class);
		}
		public SubexpressionconstraintContext subexpressionconstraint(int i) {
			return getRuleContext(SubexpressionconstraintContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public DisjunctionexpressionconstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunctionexpressionconstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterDisjunctionexpressionconstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitDisjunctionexpressionconstraint(this);
		}
	}

	public final DisjunctionexpressionconstraintContext disjunctionexpressionconstraint() throws RecognitionException {
		DisjunctionexpressionconstraintContext _localctx = new DisjunctionexpressionconstraintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_disjunctionexpressionconstraint);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			subexpressionconstraint();
			setState(186); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(181);
					ws();
					setState(182);
					disjunction();
					setState(183);
					ws();
					setState(184);
					subexpressionconstraint();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(188); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExclusionexpressionconstraintContext extends ParserRuleContext {
		public List<SubexpressionconstraintContext> subexpressionconstraint() {
			return getRuleContexts(SubexpressionconstraintContext.class);
		}
		public SubexpressionconstraintContext subexpressionconstraint(int i) {
			return getRuleContext(SubexpressionconstraintContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ExclusionContext exclusion() {
			return getRuleContext(ExclusionContext.class,0);
		}
		public ExclusionexpressionconstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusionexpressionconstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterExclusionexpressionconstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitExclusionexpressionconstraint(this);
		}
	}

	public final ExclusionexpressionconstraintContext exclusionexpressionconstraint() throws RecognitionException {
		ExclusionexpressionconstraintContext _localctx = new ExclusionexpressionconstraintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exclusionexpressionconstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			subexpressionconstraint();
			setState(191);
			ws();
			setState(192);
			exclusion();
			setState(193);
			ws();
			setState(194);
			subexpressionconstraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DottedexpressionconstraintContext extends ParserRuleContext {
		public SubexpressionconstraintContext subexpressionconstraint() {
			return getRuleContext(SubexpressionconstraintContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<DotContext> dot() {
			return getRuleContexts(DotContext.class);
		}
		public DotContext dot(int i) {
			return getRuleContext(DotContext.class,i);
		}
		public List<EclattributenameContext> eclattributename() {
			return getRuleContexts(EclattributenameContext.class);
		}
		public EclattributenameContext eclattributename(int i) {
			return getRuleContext(EclattributenameContext.class,i);
		}
		public List<AttributeoperatorContext> attributeoperator() {
			return getRuleContexts(AttributeoperatorContext.class);
		}
		public AttributeoperatorContext attributeoperator(int i) {
			return getRuleContext(AttributeoperatorContext.class,i);
		}
		public DottedexpressionconstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dottedexpressionconstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterDottedexpressionconstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitDottedexpressionconstraint(this);
		}
	}

	public final DottedexpressionconstraintContext dottedexpressionconstraint() throws RecognitionException {
		DottedexpressionconstraintContext _localctx = new DottedexpressionconstraintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dottedexpressionconstraint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			subexpressionconstraint();
			setState(207); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(197);
					ws();
					setState(198);
					dot();
					setState(199);
					ws();
					setState(203);
					_la = _input.LA(1);
					if (_la==LESS_THAN) {
						{
						setState(200);
						attributeoperator();
						setState(201);
						ws();
						}
					}

					setState(205);
					eclattributename();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(209); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubexpressionconstraintContext extends ParserRuleContext {
		public EclfocusconceptContext eclfocusconcept() {
			return getRuleContext(EclfocusconceptContext.class,0);
		}
		public ConstraintoperatorContext constraintoperator() {
			return getRuleContext(ConstraintoperatorContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MemberofContext memberof() {
			return getRuleContext(MemberofContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(EclExpressionParser.LEFT_PAREN, 0); }
		public ExpressionconstraintContext expressionconstraint() {
			return getRuleContext(ExpressionconstraintContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(EclExpressionParser.RIGHT_PAREN, 0); }
		public SubexpressionconstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subexpressionconstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterSubexpressionconstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitSubexpressionconstraint(this);
		}
	}

	public final SubexpressionconstraintContext subexpressionconstraint() throws RecognitionException {
		SubexpressionconstraintContext _localctx = new SubexpressionconstraintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_subexpressionconstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if (_la==LESS_THAN || _la==GREATER_THAN) {
				{
				setState(211);
				constraintoperator();
				setState(212);
				ws();
				}
			}

			setState(219);
			_la = _input.LA(1);
			if (_la==CARAT) {
				{
				setState(216);
				memberof();
				setState(217);
				ws();
				}
			}

			setState(228);
			switch (_input.LA(1)) {
			case ASTERISK:
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
				{
				setState(221);
				eclfocusconcept();
				}
				break;
			case LEFT_PAREN:
				{
				{
				setState(222);
				match(LEFT_PAREN);
				setState(223);
				ws();
				setState(224);
				expressionconstraint();
				setState(225);
				ws();
				setState(226);
				match(RIGHT_PAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleexpressionconstraintContext extends ParserRuleContext {
		public EclfocusconceptContext eclfocusconcept() {
			return getRuleContext(EclfocusconceptContext.class,0);
		}
		public ConstraintoperatorContext constraintoperator() {
			return getRuleContext(ConstraintoperatorContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MemberofContext memberof() {
			return getRuleContext(MemberofContext.class,0);
		}
		public SimpleexpressionconstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleexpressionconstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterSimpleexpressionconstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitSimpleexpressionconstraint(this);
		}
	}

	public final SimpleexpressionconstraintContext simpleexpressionconstraint() throws RecognitionException {
		SimpleexpressionconstraintContext _localctx = new SimpleexpressionconstraintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpleexpressionconstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if (_la==LESS_THAN || _la==GREATER_THAN) {
				{
				setState(230);
				constraintoperator();
				setState(231);
				ws();
				}
			}

			setState(238);
			_la = _input.LA(1);
			if (_la==CARAT) {
				{
				setState(235);
				memberof();
				setState(236);
				ws();
				}
			}

			setState(240);
			eclfocusconcept();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EclfocusconceptContext extends ParserRuleContext {
		public ConceptreferenceContext conceptreference() {
			return getRuleContext(ConceptreferenceContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public EclfocusconceptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eclfocusconcept; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterEclfocusconcept(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitEclfocusconcept(this);
		}
	}

	public final EclfocusconceptContext eclfocusconcept() throws RecognitionException {
		EclfocusconceptContext _localctx = new EclfocusconceptContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_eclfocusconcept);
		try {
			setState(244);
			switch (_input.LA(1)) {
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				conceptreference();
				}
				break;
			case ASTERISK:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				wildcard();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(EclExpressionParser.PERIOD, 0); }
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitDot(this);
		}
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(PERIOD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberofContext extends ParserRuleContext {
		public TerminalNode CARAT() { return getToken(EclExpressionParser.CARAT, 0); }
		public MemberofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterMemberof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitMemberof(this);
		}
	}

	public final MemberofContext memberof() throws RecognitionException {
		MemberofContext _localctx = new MemberofContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_memberof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(CARAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConceptreferenceContext extends ParserRuleContext {
		public ConceptidContext conceptid() {
			return getRuleContext(ConceptidContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(EclExpressionParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(EclExpressionParser.PIPE, i);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ConceptreferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conceptreference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterConceptreference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitConceptreference(this);
		}
	}

	public final ConceptreferenceContext conceptreference() throws RecognitionException {
		ConceptreferenceContext _localctx = new ConceptreferenceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conceptreference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			conceptid();
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(251);
				ws();
				setState(252);
				match(PIPE);
				setState(253);
				ws();
				setState(254);
				term();
				setState(255);
				ws();
				setState(256);
				match(PIPE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConceptidContext extends ParserRuleContext {
		public SctidContext sctid() {
			return getRuleContext(SctidContext.class,0);
		}
		public ConceptidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conceptid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterConceptid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitConceptid(this);
		}
	}

	public final ConceptidContext conceptid() throws RecognitionException {
		ConceptidContext _localctx = new ConceptidContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conceptid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			sctid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<NonwsnonpipeContext> nonwsnonpipe() {
			return getRuleContexts(NonwsnonpipeContext.class);
		}
		public NonwsnonpipeContext nonwsnonpipe(int i) {
			return getRuleContext(NonwsnonpipeContext.class,i);
		}
		public List<SpContext> sp() {
			return getRuleContexts(SpContext.class);
		}
		public SpContext sp(int i) {
			return getRuleContext(SpContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(262);
					nonwsnonpipe();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(265); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(268); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(267);
						sp();
						}
						}
						setState(270); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SPACE );
					setState(273); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(272);
							nonwsnonpipe();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(275); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(EclExpressionParser.ASTERISK, 0); }
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitWildcard(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_wildcard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(ASTERISK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintoperatorContext extends ParserRuleContext {
		public ChildofContext childof() {
			return getRuleContext(ChildofContext.class,0);
		}
		public DescendantorselfofContext descendantorselfof() {
			return getRuleContext(DescendantorselfofContext.class,0);
		}
		public DescendantofContext descendantof() {
			return getRuleContext(DescendantofContext.class,0);
		}
		public ParentofContext parentof() {
			return getRuleContext(ParentofContext.class,0);
		}
		public AncestororselfofContext ancestororselfof() {
			return getRuleContext(AncestororselfofContext.class,0);
		}
		public AncestorofContext ancestorof() {
			return getRuleContext(AncestorofContext.class,0);
		}
		public ConstraintoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterConstraintoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitConstraintoperator(this);
		}
	}

	public final ConstraintoperatorContext constraintoperator() throws RecognitionException {
		ConstraintoperatorContext _localctx = new ConstraintoperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constraintoperator);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				childof();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				descendantorselfof();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				descendantof();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				parentof();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(288);
				ancestororselfof();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(289);
				ancestorof();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescendantofContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(EclExpressionParser.LESS_THAN, 0); }
		public DescendantofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descendantof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterDescendantof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitDescendantof(this);
		}
	}

	public final DescendantofContext descendantof() throws RecognitionException {
		DescendantofContext _localctx = new DescendantofContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_descendantof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(LESS_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescendantorselfofContext extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(EclExpressionParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(EclExpressionParser.LESS_THAN, i);
		}
		public DescendantorselfofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descendantorselfof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterDescendantorselfof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitDescendantorselfof(this);
		}
	}

	public final DescendantorselfofContext descendantorselfof() throws RecognitionException {
		DescendantorselfofContext _localctx = new DescendantorselfofContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_descendantorselfof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(294);
			match(LESS_THAN);
			setState(295);
			match(LESS_THAN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildofContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(EclExpressionParser.LESS_THAN, 0); }
		public TerminalNode EXCLAMATION() { return getToken(EclExpressionParser.EXCLAMATION, 0); }
		public ChildofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterChildof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitChildof(this);
		}
	}

	public final ChildofContext childof() throws RecognitionException {
		ChildofContext _localctx = new ChildofContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_childof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(297);
			match(LESS_THAN);
			setState(298);
			match(EXCLAMATION);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AncestorofContext extends ParserRuleContext {
		public TerminalNode GREATER_THAN() { return getToken(EclExpressionParser.GREATER_THAN, 0); }
		public AncestorofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ancestorof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterAncestorof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitAncestorof(this);
		}
	}

	public final AncestorofContext ancestorof() throws RecognitionException {
		AncestorofContext _localctx = new AncestorofContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ancestorof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(GREATER_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AncestororselfofContext extends ParserRuleContext {
		public List<TerminalNode> GREATER_THAN() { return getTokens(EclExpressionParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(EclExpressionParser.GREATER_THAN, i);
		}
		public AncestororselfofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ancestororselfof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterAncestororselfof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitAncestororselfof(this);
		}
	}

	public final AncestororselfofContext ancestororselfof() throws RecognitionException {
		AncestororselfofContext _localctx = new AncestororselfofContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ancestororselfof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(302);
			match(GREATER_THAN);
			setState(303);
			match(GREATER_THAN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParentofContext extends ParserRuleContext {
		public TerminalNode GREATER_THAN() { return getToken(EclExpressionParser.GREATER_THAN, 0); }
		public TerminalNode EXCLAMATION() { return getToken(EclExpressionParser.EXCLAMATION, 0); }
		public ParentofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterParentof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitParentof(this);
		}
	}

	public final ParentofContext parentof() throws RecognitionException {
		ParentofContext _localctx = new ParentofContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parentof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(305);
			match(GREATER_THAN);
			setState(306);
			match(EXCLAMATION);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjunctionContext extends ParserRuleContext {
		public MwsContext mws() {
			return getRuleContext(MwsContext.class,0);
		}
		public TerminalNode A() { return getToken(EclExpressionParser.A, 0); }
		public TerminalNode CAP_A() { return getToken(EclExpressionParser.CAP_A, 0); }
		public TerminalNode N() { return getToken(EclExpressionParser.N, 0); }
		public TerminalNode CAP_N() { return getToken(EclExpressionParser.CAP_N, 0); }
		public TerminalNode D() { return getToken(EclExpressionParser.D, 0); }
		public TerminalNode CAP_D() { return getToken(EclExpressionParser.CAP_D, 0); }
		public TerminalNode COMMA() { return getToken(EclExpressionParser.COMMA, 0); }
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitConjunction(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_conjunction);
		int _la;
		try {
			setState(313);
			switch (_input.LA(1)) {
			case CAP_A:
			case A:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(308);
				_la = _input.LA(1);
				if ( !(_la==CAP_A || _la==A) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(309);
				_la = _input.LA(1);
				if ( !(_la==CAP_N || _la==N) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(310);
				_la = _input.LA(1);
				if ( !(_la==CAP_D || _la==D) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(311);
				mws();
				}
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(COMMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisjunctionContext extends ParserRuleContext {
		public MwsContext mws() {
			return getRuleContext(MwsContext.class,0);
		}
		public TerminalNode O() { return getToken(EclExpressionParser.O, 0); }
		public TerminalNode CAP_O() { return getToken(EclExpressionParser.CAP_O, 0); }
		public TerminalNode R() { return getToken(EclExpressionParser.R, 0); }
		public TerminalNode CAP_R() { return getToken(EclExpressionParser.CAP_R, 0); }
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitDisjunction(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_disjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !(_la==CAP_O || _la==O) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(316);
			_la = _input.LA(1);
			if ( !(_la==CAP_R || _la==R) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(317);
			mws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExclusionContext extends ParserRuleContext {
		public MwsContext mws() {
			return getRuleContext(MwsContext.class,0);
		}
		public TerminalNode M() { return getToken(EclExpressionParser.M, 0); }
		public TerminalNode CAP_M() { return getToken(EclExpressionParser.CAP_M, 0); }
		public TerminalNode I() { return getToken(EclExpressionParser.I, 0); }
		public TerminalNode CAP_I() { return getToken(EclExpressionParser.CAP_I, 0); }
		public TerminalNode N() { return getToken(EclExpressionParser.N, 0); }
		public TerminalNode CAP_N() { return getToken(EclExpressionParser.CAP_N, 0); }
		public TerminalNode U() { return getToken(EclExpressionParser.U, 0); }
		public TerminalNode CAP_U() { return getToken(EclExpressionParser.CAP_U, 0); }
		public TerminalNode S() { return getToken(EclExpressionParser.S, 0); }
		public TerminalNode CAP_S() { return getToken(EclExpressionParser.CAP_S, 0); }
		public ExclusionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterExclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitExclusion(this);
		}
	}

	public final ExclusionContext exclusion() throws RecognitionException {
		ExclusionContext _localctx = new ExclusionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_exclusion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_la = _input.LA(1);
			if ( !(_la==CAP_M || _la==M) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(320);
			_la = _input.LA(1);
			if ( !(_la==CAP_I || _la==I) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(321);
			_la = _input.LA(1);
			if ( !(_la==CAP_N || _la==N) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(322);
			_la = _input.LA(1);
			if ( !(_la==CAP_U || _la==U) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(323);
			_la = _input.LA(1);
			if ( !(_la==CAP_S || _la==S) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(324);
			mws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EclrefinementContext extends ParserRuleContext {
		public SubrefinementContext subrefinement() {
			return getRuleContext(SubrefinementContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ConjunctionrefinementsetContext conjunctionrefinementset() {
			return getRuleContext(ConjunctionrefinementsetContext.class,0);
		}
		public DisjunctionrefinementsetContext disjunctionrefinementset() {
			return getRuleContext(DisjunctionrefinementsetContext.class,0);
		}
		public EclrefinementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eclrefinement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterEclrefinement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitEclrefinement(this);
		}
	}

	public final EclrefinementContext eclrefinement() throws RecognitionException {
		EclrefinementContext _localctx = new EclrefinementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_eclrefinement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			subrefinement();
			setState(327);
			ws();
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(328);
				conjunctionrefinementset();
				}
				break;
			case 2:
				{
				setState(329);
				disjunctionrefinementset();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjunctionrefinementsetContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public List<SubrefinementContext> subrefinement() {
			return getRuleContexts(SubrefinementContext.class);
		}
		public SubrefinementContext subrefinement(int i) {
			return getRuleContext(SubrefinementContext.class,i);
		}
		public ConjunctionrefinementsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunctionrefinementset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterConjunctionrefinementset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitConjunctionrefinementset(this);
		}
	}

	public final ConjunctionrefinementsetContext conjunctionrefinementset() throws RecognitionException {
		ConjunctionrefinementsetContext _localctx = new ConjunctionrefinementsetContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_conjunctionrefinementset);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(337); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(332);
					ws();
					setState(333);
					conjunction();
					setState(334);
					ws();
					setState(335);
					subrefinement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(339); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisjunctionrefinementsetContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public List<SubrefinementContext> subrefinement() {
			return getRuleContexts(SubrefinementContext.class);
		}
		public SubrefinementContext subrefinement(int i) {
			return getRuleContext(SubrefinementContext.class,i);
		}
		public DisjunctionrefinementsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunctionrefinementset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterDisjunctionrefinementset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitDisjunctionrefinementset(this);
		}
	}

	public final DisjunctionrefinementsetContext disjunctionrefinementset() throws RecognitionException {
		DisjunctionrefinementsetContext _localctx = new DisjunctionrefinementsetContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_disjunctionrefinementset);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(341);
					ws();
					setState(342);
					disjunction();
					setState(343);
					ws();
					setState(344);
					subrefinement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(348); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubrefinementContext extends ParserRuleContext {
		public EclattributesetContext eclattributeset() {
			return getRuleContext(EclattributesetContext.class,0);
		}
		public EclattributegroupContext eclattributegroup() {
			return getRuleContext(EclattributegroupContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(EclExpressionParser.LEFT_PAREN, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public EclrefinementContext eclrefinement() {
			return getRuleContext(EclrefinementContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(EclExpressionParser.RIGHT_PAREN, 0); }
		public SubrefinementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrefinement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterSubrefinement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitSubrefinement(this);
		}
	}

	public final SubrefinementContext subrefinement() throws RecognitionException {
		SubrefinementContext _localctx = new SubrefinementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_subrefinement);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				eclattributeset();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				eclattributegroup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(352);
				match(LEFT_PAREN);
				setState(353);
				ws();
				setState(354);
				eclrefinement();
				setState(355);
				ws();
				setState(356);
				match(RIGHT_PAREN);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EclattributesetContext extends ParserRuleContext {
		public SubattributesetContext subattributeset() {
			return getRuleContext(SubattributesetContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ConjunctionattributesetContext conjunctionattributeset() {
			return getRuleContext(ConjunctionattributesetContext.class,0);
		}
		public DisjunctionattributesetContext disjunctionattributeset() {
			return getRuleContext(DisjunctionattributesetContext.class,0);
		}
		public EclattributesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eclattributeset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterEclattributeset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitEclattributeset(this);
		}
	}

	public final EclattributesetContext eclattributeset() throws RecognitionException {
		EclattributesetContext _localctx = new EclattributesetContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_eclattributeset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			subattributeset();
			setState(361);
			ws();
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(362);
				conjunctionattributeset();
				}
				break;
			case 2:
				{
				setState(363);
				disjunctionattributeset();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjunctionattributesetContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public List<SubattributesetContext> subattributeset() {
			return getRuleContexts(SubattributesetContext.class);
		}
		public SubattributesetContext subattributeset(int i) {
			return getRuleContext(SubattributesetContext.class,i);
		}
		public ConjunctionattributesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunctionattributeset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterConjunctionattributeset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitConjunctionattributeset(this);
		}
	}

	public final ConjunctionattributesetContext conjunctionattributeset() throws RecognitionException {
		ConjunctionattributesetContext _localctx = new ConjunctionattributesetContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_conjunctionattributeset);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(366);
					ws();
					setState(367);
					conjunction();
					setState(368);
					ws();
					setState(369);
					subattributeset();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(373); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisjunctionattributesetContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public List<SubattributesetContext> subattributeset() {
			return getRuleContexts(SubattributesetContext.class);
		}
		public SubattributesetContext subattributeset(int i) {
			return getRuleContext(SubattributesetContext.class,i);
		}
		public DisjunctionattributesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunctionattributeset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterDisjunctionattributeset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitDisjunctionattributeset(this);
		}
	}

	public final DisjunctionattributesetContext disjunctionattributeset() throws RecognitionException {
		DisjunctionattributesetContext _localctx = new DisjunctionattributesetContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_disjunctionattributeset);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(380); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(375);
					ws();
					setState(376);
					disjunction();
					setState(377);
					ws();
					setState(378);
					subattributeset();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(382); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubattributesetContext extends ParserRuleContext {
		public EclattributeContext eclattribute() {
			return getRuleContext(EclattributeContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(EclExpressionParser.LEFT_PAREN, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public EclattributesetContext eclattributeset() {
			return getRuleContext(EclattributesetContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(EclExpressionParser.RIGHT_PAREN, 0); }
		public SubattributesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subattributeset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterSubattributeset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitSubattributeset(this);
		}
	}

	public final SubattributesetContext subattributeset() throws RecognitionException {
		SubattributesetContext _localctx = new SubattributesetContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_subattributeset);
		try {
			setState(391);
			switch (_input.LA(1)) {
			case ASTERISK:
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
			case LESS_THAN:
			case CAP_R:
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				eclattribute();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(385);
				match(LEFT_PAREN);
				setState(386);
				ws();
				setState(387);
				eclattributeset();
				setState(388);
				ws();
				setState(389);
				match(RIGHT_PAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EclattributegroupContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(EclExpressionParser.LEFT_CURLY_BRACE, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public EclattributesetContext eclattributeset() {
			return getRuleContext(EclattributesetContext.class,0);
		}
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(EclExpressionParser.RIGHT_CURLY_BRACE, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(EclExpressionParser.LEFT_BRACE, 0); }
		public CardinalityContext cardinality() {
			return getRuleContext(CardinalityContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(EclExpressionParser.RIGHT_BRACE, 0); }
		public EclattributegroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eclattributegroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterEclattributegroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitEclattributegroup(this);
		}
	}

	public final EclattributegroupContext eclattributegroup() throws RecognitionException {
		EclattributegroupContext _localctx = new EclattributegroupContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_eclattributegroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_la = _input.LA(1);
			if (_la==LEFT_BRACE) {
				{
				setState(393);
				match(LEFT_BRACE);
				setState(394);
				cardinality();
				setState(395);
				match(RIGHT_BRACE);
				setState(396);
				ws();
				}
			}

			setState(400);
			match(LEFT_CURLY_BRACE);
			setState(401);
			ws();
			setState(402);
			eclattributeset();
			setState(403);
			ws();
			setState(404);
			match(RIGHT_CURLY_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EclattributeContext extends ParserRuleContext {
		public EclattributenameContext eclattributename() {
			return getRuleContext(EclattributenameContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode LEFT_BRACE() { return getToken(EclExpressionParser.LEFT_BRACE, 0); }
		public CardinalityContext cardinality() {
			return getRuleContext(CardinalityContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(EclExpressionParser.RIGHT_BRACE, 0); }
		public ReverseflagContext reverseflag() {
			return getRuleContext(ReverseflagContext.class,0);
		}
		public AttributeoperatorContext attributeoperator() {
			return getRuleContext(AttributeoperatorContext.class,0);
		}
		public ExpressioncomparisonoperatorContext expressioncomparisonoperator() {
			return getRuleContext(ExpressioncomparisonoperatorContext.class,0);
		}
		public SubexpressionconstraintContext subexpressionconstraint() {
			return getRuleContext(SubexpressionconstraintContext.class,0);
		}
		public NumericcomparisonoperatorContext numericcomparisonoperator() {
			return getRuleContext(NumericcomparisonoperatorContext.class,0);
		}
		public TerminalNode POUND() { return getToken(EclExpressionParser.POUND, 0); }
		public NumericvalueContext numericvalue() {
			return getRuleContext(NumericvalueContext.class,0);
		}
		public StringcomparisonoperatorContext stringcomparisonoperator() {
			return getRuleContext(StringcomparisonoperatorContext.class,0);
		}
		public List<QmContext> qm() {
			return getRuleContexts(QmContext.class);
		}
		public QmContext qm(int i) {
			return getRuleContext(QmContext.class,i);
		}
		public StringvalueContext stringvalue() {
			return getRuleContext(StringvalueContext.class,0);
		}
		public EclattributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eclattribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterEclattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitEclattribute(this);
		}
	}

	public final EclattributeContext eclattribute() throws RecognitionException {
		EclattributeContext _localctx = new EclattributeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_eclattribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_la = _input.LA(1);
			if (_la==LEFT_BRACE) {
				{
				setState(406);
				match(LEFT_BRACE);
				setState(407);
				cardinality();
				setState(408);
				match(RIGHT_BRACE);
				setState(409);
				ws();
				}
			}

			setState(416);
			_la = _input.LA(1);
			if (_la==CAP_R) {
				{
				setState(413);
				reverseflag();
				setState(414);
				ws();
				}
			}

			setState(421);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(418);
				attributeoperator();
				setState(419);
				ws();
				}
			}

			setState(423);
			eclattributename();
			setState(424);
			ws();
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				{
				setState(425);
				expressioncomparisonoperator();
				setState(426);
				ws();
				setState(427);
				subexpressionconstraint();
				}
				}
				break;
			case 2:
				{
				{
				setState(429);
				numericcomparisonoperator();
				setState(430);
				ws();
				setState(431);
				match(POUND);
				setState(432);
				numericvalue();
				}
				}
				break;
			case 3:
				{
				{
				setState(434);
				stringcomparisonoperator();
				setState(435);
				ws();
				setState(436);
				qm();
				setState(437);
				stringvalue();
				setState(438);
				qm();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CardinalityContext extends ParserRuleContext {
		public MinvalueContext minvalue() {
			return getRuleContext(MinvalueContext.class,0);
		}
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public MaxvalueContext maxvalue() {
			return getRuleContext(MaxvalueContext.class,0);
		}
		public CardinalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardinality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterCardinality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitCardinality(this);
		}
	}

	public final CardinalityContext cardinality() throws RecognitionException {
		CardinalityContext _localctx = new CardinalityContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cardinality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			minvalue();
			setState(443);
			to();
			setState(444);
			maxvalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinvalueContext extends ParserRuleContext {
		public NonnegativeintegervalueContext nonnegativeintegervalue() {
			return getRuleContext(NonnegativeintegervalueContext.class,0);
		}
		public MinvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterMinvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitMinvalue(this);
		}
	}

	public final MinvalueContext minvalue() throws RecognitionException {
		MinvalueContext _localctx = new MinvalueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_minvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			nonnegativeintegervalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ToContext extends ParserRuleContext {
		public List<TerminalNode> PERIOD() { return getTokens(EclExpressionParser.PERIOD); }
		public TerminalNode PERIOD(int i) {
			return getToken(EclExpressionParser.PERIOD, i);
		}
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitTo(this);
		}
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(448);
			match(PERIOD);
			setState(449);
			match(PERIOD);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaxvalueContext extends ParserRuleContext {
		public NonnegativeintegervalueContext nonnegativeintegervalue() {
			return getRuleContext(NonnegativeintegervalueContext.class,0);
		}
		public ManyContext many() {
			return getRuleContext(ManyContext.class,0);
		}
		public MaxvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterMaxvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitMaxvalue(this);
		}
	}

	public final MaxvalueContext maxvalue() throws RecognitionException {
		MaxvalueContext _localctx = new MaxvalueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_maxvalue);
		try {
			setState(453);
			switch (_input.LA(1)) {
			case ZERO:
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				nonnegativeintegervalue();
				}
				break;
			case ASTERISK:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				many();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ManyContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(EclExpressionParser.ASTERISK, 0); }
		public ManyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_many; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitMany(this);
		}
	}

	public final ManyContext many() throws RecognitionException {
		ManyContext _localctx = new ManyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_many);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(ASTERISK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReverseflagContext extends ParserRuleContext {
		public TerminalNode CAP_R() { return getToken(EclExpressionParser.CAP_R, 0); }
		public ReverseflagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reverseflag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterReverseflag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitReverseflag(this);
		}
	}

	public final ReverseflagContext reverseflag() throws RecognitionException {
		ReverseflagContext _localctx = new ReverseflagContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_reverseflag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(CAP_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeoperatorContext extends ParserRuleContext {
		public DescendantorselfofContext descendantorselfof() {
			return getRuleContext(DescendantorselfofContext.class,0);
		}
		public DescendantofContext descendantof() {
			return getRuleContext(DescendantofContext.class,0);
		}
		public AttributeoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterAttributeoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitAttributeoperator(this);
		}
	}

	public final AttributeoperatorContext attributeoperator() throws RecognitionException {
		AttributeoperatorContext _localctx = new AttributeoperatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_attributeoperator);
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				descendantorselfof();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				descendantof();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EclattributenameContext extends ParserRuleContext {
		public ConceptreferenceContext conceptreference() {
			return getRuleContext(ConceptreferenceContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public EclattributenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eclattributename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterEclattributename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitEclattributename(this);
		}
	}

	public final EclattributenameContext eclattributename() throws RecognitionException {
		EclattributenameContext _localctx = new EclattributenameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_eclattributename);
		try {
			setState(465);
			switch (_input.LA(1)) {
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				conceptreference();
				}
				break;
			case ASTERISK:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				wildcard();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressioncomparisonoperatorContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(EclExpressionParser.EQUALS, 0); }
		public TerminalNode EXCLAMATION() { return getToken(EclExpressionParser.EXCLAMATION, 0); }
		public ExpressioncomparisonoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressioncomparisonoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterExpressioncomparisonoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitExpressioncomparisonoperator(this);
		}
	}

	public final ExpressioncomparisonoperatorContext expressioncomparisonoperator() throws RecognitionException {
		ExpressioncomparisonoperatorContext _localctx = new ExpressioncomparisonoperatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expressioncomparisonoperator);
		try {
			setState(470);
			switch (_input.LA(1)) {
			case EQUALS:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(EQUALS);
				}
				break;
			case EXCLAMATION:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(468);
				match(EXCLAMATION);
				setState(469);
				match(EQUALS);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericcomparisonoperatorContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(EclExpressionParser.EQUALS, 0); }
		public TerminalNode EXCLAMATION() { return getToken(EclExpressionParser.EXCLAMATION, 0); }
		public TerminalNode LESS_THAN() { return getToken(EclExpressionParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(EclExpressionParser.GREATER_THAN, 0); }
		public NumericcomparisonoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericcomparisonoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterNumericcomparisonoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitNumericcomparisonoperator(this);
		}
	}

	public final NumericcomparisonoperatorContext numericcomparisonoperator() throws RecognitionException {
		NumericcomparisonoperatorContext _localctx = new NumericcomparisonoperatorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_numericcomparisonoperator);
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(EQUALS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(473);
				match(EXCLAMATION);
				setState(474);
				match(EQUALS);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(475);
				match(LESS_THAN);
				setState(476);
				match(EQUALS);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(477);
				match(LESS_THAN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(478);
				match(GREATER_THAN);
				setState(479);
				match(EQUALS);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(480);
				match(GREATER_THAN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringcomparisonoperatorContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(EclExpressionParser.EQUALS, 0); }
		public TerminalNode EXCLAMATION() { return getToken(EclExpressionParser.EXCLAMATION, 0); }
		public StringcomparisonoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringcomparisonoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterStringcomparisonoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitStringcomparisonoperator(this);
		}
	}

	public final StringcomparisonoperatorContext stringcomparisonoperator() throws RecognitionException {
		StringcomparisonoperatorContext _localctx = new StringcomparisonoperatorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_stringcomparisonoperator);
		try {
			setState(486);
			switch (_input.LA(1)) {
			case EQUALS:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(EQUALS);
				}
				break;
			case EXCLAMATION:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(484);
				match(EXCLAMATION);
				setState(485);
				match(EQUALS);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericvalueContext extends ParserRuleContext {
		public DecimalvalueContext decimalvalue() {
			return getRuleContext(DecimalvalueContext.class,0);
		}
		public IntegervalueContext integervalue() {
			return getRuleContext(IntegervalueContext.class,0);
		}
		public TerminalNode DASH() { return getToken(EclExpressionParser.DASH, 0); }
		public TerminalNode PLUS() { return getToken(EclExpressionParser.PLUS, 0); }
		public NumericvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterNumericvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitNumericvalue(this);
		}
	}

	public final NumericvalueContext numericvalue() throws RecognitionException {
		NumericvalueContext _localctx = new NumericvalueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_numericvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_la = _input.LA(1);
			if (_la==PLUS || _la==DASH) {
				{
				setState(488);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==DASH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(491);
				decimalvalue();
				}
				break;
			case 2:
				{
				setState(492);
				integervalue();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringvalueContext extends ParserRuleContext {
		public List<AnynonescapedcharContext> anynonescapedchar() {
			return getRuleContexts(AnynonescapedcharContext.class);
		}
		public AnynonescapedcharContext anynonescapedchar(int i) {
			return getRuleContext(AnynonescapedcharContext.class,i);
		}
		public List<EscapedcharContext> escapedchar() {
			return getRuleContexts(EscapedcharContext.class);
		}
		public EscapedcharContext escapedchar(int i) {
			return getRuleContext(EscapedcharContext.class,i);
		}
		public StringvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterStringvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitStringvalue(this);
		}
	}

	public final StringvalueContext stringvalue() throws RecognitionException {
		StringvalueContext _localctx = new StringvalueContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_stringvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(497);
				switch (_input.LA(1)) {
				case TAB:
				case LF:
				case CR:
				case SPACE:
				case EXCLAMATION:
				case POUND:
				case DOLLAR:
				case PERCENT:
				case AMPERSAND:
				case APOSTROPHE:
				case LEFT_PAREN:
				case RIGHT_PAREN:
				case ASTERISK:
				case PLUS:
				case COMMA:
				case DASH:
				case PERIOD:
				case SLASH:
				case ZERO:
				case ONE:
				case TWO:
				case THREE:
				case FOUR:
				case FIVE:
				case SIX:
				case SEVEN:
				case EIGHT:
				case NINE:
				case COLON:
				case SEMICOLON:
				case LESS_THAN:
				case EQUALS:
				case GREATER_THAN:
				case QUESTION:
				case AT:
				case CAP_A:
				case CAP_B:
				case CAP_C:
				case CAP_D:
				case CAP_E:
				case CAP_F:
				case CAP_G:
				case CAP_H:
				case CAP_I:
				case CAP_J:
				case CAP_K:
				case CAP_L:
				case CAP_M:
				case CAP_N:
				case CAP_O:
				case CAP_P:
				case CAP_Q:
				case CAP_R:
				case CAP_S:
				case CAP_T:
				case CAP_U:
				case CAP_V:
				case CAP_W:
				case CAP_X:
				case CAP_Y:
				case CAP_Z:
				case LEFT_BRACE:
				case RIGHT_BRACE:
				case CARAT:
				case UNDERSCORE:
				case ACCENT:
				case A:
				case B:
				case C:
				case D:
				case E:
				case F:
				case G:
				case H:
				case I:
				case J:
				case K:
				case L:
				case M:
				case N:
				case O:
				case P:
				case Q:
				case R:
				case S:
				case T:
				case U:
				case V:
				case W:
				case X:
				case Y:
				case Z:
				case LEFT_CURLY_BRACE:
				case PIPE:
				case RIGHT_CURLY_BRACE:
				case TILDE:
				case U_00C2:
				case U_00C3:
				case U_00C4:
				case U_00C5:
				case U_00C6:
				case U_00C7:
				case U_00C8:
				case U_00C9:
				case U_00CA:
				case U_00CB:
				case U_00CC:
				case U_00CD:
				case U_00CE:
				case U_00CF:
				case U_00D0:
				case U_00D1:
				case U_00D2:
				case U_00D3:
				case U_00D4:
				case U_00D5:
				case U_00D6:
				case U_00D7:
				case U_00D8:
				case U_00D9:
				case U_00DA:
				case U_00DB:
				case U_00DC:
				case U_00DD:
				case U_00DE:
				case U_00DF:
				case U_00E0:
				case U_00E1:
				case U_00E2:
				case U_00E3:
				case U_00E4:
				case U_00E5:
				case U_00E6:
				case U_00E7:
				case U_00E8:
				case U_00E9:
				case U_00EA:
				case U_00EB:
				case U_00EC:
				case U_00ED:
				case U_00EE:
				case U_00EF:
				case U_00F0:
				case U_00F1:
				case U_00F2:
				case U_00F3:
				case U_00F4:
					{
					setState(495);
					anynonescapedchar();
					}
					break;
				case BACKSLASH:
					{
					setState(496);
					escapedchar();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(499); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAB) | (1L << LF) | (1L << CR) | (1L << SPACE) | (1L << EXCLAMATION) | (1L << POUND) | (1L << DOLLAR) | (1L << PERCENT) | (1L << AMPERSAND) | (1L << APOSTROPHE) | (1L << LEFT_PAREN) | (1L << RIGHT_PAREN) | (1L << ASTERISK) | (1L << PLUS) | (1L << COMMA) | (1L << DASH) | (1L << PERIOD) | (1L << SLASH) | (1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << COLON) | (1L << SEMICOLON) | (1L << LESS_THAN) | (1L << EQUALS) | (1L << GREATER_THAN) | (1L << QUESTION) | (1L << AT) | (1L << CAP_A) | (1L << CAP_B) | (1L << CAP_C) | (1L << CAP_D) | (1L << CAP_E) | (1L << CAP_F) | (1L << CAP_G) | (1L << CAP_H) | (1L << CAP_I) | (1L << CAP_J) | (1L << CAP_K) | (1L << CAP_L) | (1L << CAP_M) | (1L << CAP_N) | (1L << CAP_O) | (1L << CAP_P) | (1L << CAP_Q) | (1L << CAP_R) | (1L << CAP_S) | (1L << CAP_T) | (1L << CAP_U) | (1L << CAP_V) | (1L << CAP_W) | (1L << CAP_X) | (1L << CAP_Y) | (1L << CAP_Z) | (1L << LEFT_BRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BACKSLASH - 64)) | (1L << (RIGHT_BRACE - 64)) | (1L << (CARAT - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (ACCENT - 64)) | (1L << (A - 64)) | (1L << (B - 64)) | (1L << (C - 64)) | (1L << (D - 64)) | (1L << (E - 64)) | (1L << (F - 64)) | (1L << (G - 64)) | (1L << (H - 64)) | (1L << (I - 64)) | (1L << (J - 64)) | (1L << (K - 64)) | (1L << (L - 64)) | (1L << (M - 64)) | (1L << (N - 64)) | (1L << (O - 64)) | (1L << (P - 64)) | (1L << (Q - 64)) | (1L << (R - 64)) | (1L << (S - 64)) | (1L << (T - 64)) | (1L << (U - 64)) | (1L << (V - 64)) | (1L << (W - 64)) | (1L << (X - 64)) | (1L << (Y - 64)) | (1L << (Z - 64)) | (1L << (LEFT_CURLY_BRACE - 64)) | (1L << (PIPE - 64)) | (1L << (RIGHT_CURLY_BRACE - 64)) | (1L << (TILDE - 64)))) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (U_00C2 - 163)) | (1L << (U_00C3 - 163)) | (1L << (U_00C4 - 163)) | (1L << (U_00C5 - 163)) | (1L << (U_00C6 - 163)) | (1L << (U_00C7 - 163)) | (1L << (U_00C8 - 163)) | (1L << (U_00C9 - 163)) | (1L << (U_00CA - 163)) | (1L << (U_00CB - 163)) | (1L << (U_00CC - 163)) | (1L << (U_00CD - 163)) | (1L << (U_00CE - 163)) | (1L << (U_00CF - 163)) | (1L << (U_00D0 - 163)) | (1L << (U_00D1 - 163)) | (1L << (U_00D2 - 163)) | (1L << (U_00D3 - 163)) | (1L << (U_00D4 - 163)) | (1L << (U_00D5 - 163)) | (1L << (U_00D6 - 163)) | (1L << (U_00D7 - 163)) | (1L << (U_00D8 - 163)) | (1L << (U_00D9 - 163)) | (1L << (U_00DA - 163)) | (1L << (U_00DB - 163)) | (1L << (U_00DC - 163)) | (1L << (U_00DD - 163)) | (1L << (U_00DE - 163)) | (1L << (U_00DF - 163)) | (1L << (U_00E0 - 163)) | (1L << (U_00E1 - 163)) | (1L << (U_00E2 - 163)) | (1L << (U_00E3 - 163)) | (1L << (U_00E4 - 163)) | (1L << (U_00E5 - 163)) | (1L << (U_00E6 - 163)) | (1L << (U_00E7 - 163)) | (1L << (U_00E8 - 163)) | (1L << (U_00E9 - 163)) | (1L << (U_00EA - 163)) | (1L << (U_00EB - 163)) | (1L << (U_00EC - 163)) | (1L << (U_00ED - 163)) | (1L << (U_00EE - 163)) | (1L << (U_00EF - 163)) | (1L << (U_00F0 - 163)) | (1L << (U_00F1 - 163)) | (1L << (U_00F2 - 163)) | (1L << (U_00F3 - 163)) | (1L << (U_00F4 - 163)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegervalueContext extends ParserRuleContext {
		public DigitnonzeroContext digitnonzero() {
			return getRuleContext(DigitnonzeroContext.class,0);
		}
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public ZeroContext zero() {
			return getRuleContext(ZeroContext.class,0);
		}
		public IntegervalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integervalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterIntegervalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitIntegervalue(this);
		}
	}

	public final IntegervalueContext integervalue() throws RecognitionException {
		IntegervalueContext _localctx = new IntegervalueContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_integervalue);
		int _la;
		try {
			setState(509);
			switch (_input.LA(1)) {
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(501);
				digitnonzero();
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) {
					{
					{
					setState(502);
					digit();
					}
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				zero();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalvalueContext extends ParserRuleContext {
		public IntegervalueContext integervalue() {
			return getRuleContext(IntegervalueContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(EclExpressionParser.PERIOD, 0); }
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public DecimalvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterDecimalvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitDecimalvalue(this);
		}
	}

	public final DecimalvalueContext decimalvalue() throws RecognitionException {
		DecimalvalueContext _localctx = new DecimalvalueContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_decimalvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			integervalue();
			setState(512);
			match(PERIOD);
			setState(514); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(513);
				digit();
				}
				}
				setState(516); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonnegativeintegervalueContext extends ParserRuleContext {
		public DigitnonzeroContext digitnonzero() {
			return getRuleContext(DigitnonzeroContext.class,0);
		}
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public ZeroContext zero() {
			return getRuleContext(ZeroContext.class,0);
		}
		public NonnegativeintegervalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonnegativeintegervalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterNonnegativeintegervalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitNonnegativeintegervalue(this);
		}
	}

	public final NonnegativeintegervalueContext nonnegativeintegervalue() throws RecognitionException {
		NonnegativeintegervalueContext _localctx = new NonnegativeintegervalueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_nonnegativeintegervalue);
		int _la;
		try {
			setState(526);
			switch (_input.LA(1)) {
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(518);
				digitnonzero();
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) {
					{
					{
					setState(519);
					digit();
					}
					}
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				zero();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SctidContext extends ParserRuleContext {
		public DigitnonzeroContext digitnonzero() {
			return getRuleContext(DigitnonzeroContext.class,0);
		}
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public SctidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sctid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterSctid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitSctid(this);
		}
	}

	public final SctidContext sctid() throws RecognitionException {
		SctidContext _localctx = new SctidContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_sctid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			digitnonzero();
			{
			setState(529);
			digit();
			}
			{
			setState(530);
			digit();
			}
			{
			setState(531);
			digit();
			}
			{
			setState(532);
			digit();
			}
			{
			setState(533);
			digit();
			}
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(535);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) {
					{
					setState(534);
					digit();
					}
				}

				}
				break;
			case 2:
				{
				{
				{
				setState(537);
				digit();
				}
				{
				setState(538);
				digit();
				}
				}
				}
				break;
			case 3:
				{
				{
				{
				setState(540);
				digit();
				}
				{
				setState(541);
				digit();
				}
				{
				setState(542);
				digit();
				}
				}
				}
				break;
			case 4:
				{
				{
				{
				setState(544);
				digit();
				}
				{
				setState(545);
				digit();
				}
				{
				setState(546);
				digit();
				}
				{
				setState(547);
				digit();
				}
				}
				}
				break;
			case 5:
				{
				{
				{
				setState(549);
				digit();
				}
				{
				setState(550);
				digit();
				}
				{
				setState(551);
				digit();
				}
				{
				setState(552);
				digit();
				}
				{
				setState(553);
				digit();
				}
				}
				}
				break;
			case 6:
				{
				{
				{
				setState(555);
				digit();
				}
				{
				setState(556);
				digit();
				}
				{
				setState(557);
				digit();
				}
				{
				setState(558);
				digit();
				}
				{
				setState(559);
				digit();
				}
				{
				setState(560);
				digit();
				}
				}
				}
				break;
			case 7:
				{
				{
				{
				setState(562);
				digit();
				}
				{
				setState(563);
				digit();
				}
				{
				setState(564);
				digit();
				}
				{
				setState(565);
				digit();
				}
				{
				setState(566);
				digit();
				}
				{
				setState(567);
				digit();
				}
				{
				setState(568);
				digit();
				}
				}
				}
				break;
			case 8:
				{
				{
				{
				setState(570);
				digit();
				}
				{
				setState(571);
				digit();
				}
				{
				setState(572);
				digit();
				}
				{
				setState(573);
				digit();
				}
				{
				setState(574);
				digit();
				}
				{
				setState(575);
				digit();
				}
				{
				setState(576);
				digit();
				}
				{
				setState(577);
				digit();
				}
				}
				}
				break;
			case 9:
				{
				{
				{
				setState(579);
				digit();
				}
				{
				setState(580);
				digit();
				}
				{
				setState(581);
				digit();
				}
				{
				setState(582);
				digit();
				}
				{
				setState(583);
				digit();
				}
				{
				setState(584);
				digit();
				}
				{
				setState(585);
				digit();
				}
				{
				setState(586);
				digit();
				}
				{
				setState(587);
				digit();
				}
				}
				}
				break;
			case 10:
				{
				{
				{
				setState(589);
				digit();
				}
				{
				setState(590);
				digit();
				}
				{
				setState(591);
				digit();
				}
				{
				setState(592);
				digit();
				}
				{
				setState(593);
				digit();
				}
				{
				setState(594);
				digit();
				}
				{
				setState(595);
				digit();
				}
				{
				setState(596);
				digit();
				}
				{
				setState(597);
				digit();
				}
				{
				setState(598);
				digit();
				}
				}
				}
				break;
			case 11:
				{
				{
				{
				setState(600);
				digit();
				}
				{
				setState(601);
				digit();
				}
				{
				setState(602);
				digit();
				}
				{
				setState(603);
				digit();
				}
				{
				setState(604);
				digit();
				}
				{
				setState(605);
				digit();
				}
				{
				setState(606);
				digit();
				}
				{
				setState(607);
				digit();
				}
				{
				setState(608);
				digit();
				}
				{
				setState(609);
				digit();
				}
				{
				setState(610);
				digit();
				}
				}
				}
				break;
			case 12:
				{
				{
				{
				setState(612);
				digit();
				}
				{
				setState(613);
				digit();
				}
				{
				setState(614);
				digit();
				}
				{
				setState(615);
				digit();
				}
				{
				setState(616);
				digit();
				}
				{
				setState(617);
				digit();
				}
				{
				setState(618);
				digit();
				}
				{
				setState(619);
				digit();
				}
				{
				setState(620);
				digit();
				}
				{
				setState(621);
				digit();
				}
				{
				setState(622);
				digit();
				}
				{
				setState(623);
				digit();
				}
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WsContext extends ParserRuleContext {
		public List<SpContext> sp() {
			return getRuleContexts(SpContext.class);
		}
		public SpContext sp(int i) {
			return getRuleContext(SpContext.class,i);
		}
		public List<HtabContext> htab() {
			return getRuleContexts(HtabContext.class);
		}
		public HtabContext htab(int i) {
			return getRuleContext(HtabContext.class,i);
		}
		public List<CrContext> cr() {
			return getRuleContexts(CrContext.class);
		}
		public CrContext cr(int i) {
			return getRuleContext(CrContext.class,i);
		}
		public List<LfContext> lf() {
			return getRuleContexts(LfContext.class);
		}
		public LfContext lf(int i) {
			return getRuleContext(LfContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitWs(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_ws);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(632);
					switch (_input.LA(1)) {
					case SPACE:
						{
						setState(627);
						sp();
						}
						break;
					case TAB:
						{
						setState(628);
						htab();
						}
						break;
					case CR:
						{
						setState(629);
						cr();
						}
						break;
					case LF:
						{
						setState(630);
						lf();
						}
						break;
					case SLASH:
						{
						setState(631);
						comment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MwsContext extends ParserRuleContext {
		public List<SpContext> sp() {
			return getRuleContexts(SpContext.class);
		}
		public SpContext sp(int i) {
			return getRuleContext(SpContext.class,i);
		}
		public List<HtabContext> htab() {
			return getRuleContexts(HtabContext.class);
		}
		public HtabContext htab(int i) {
			return getRuleContext(HtabContext.class,i);
		}
		public List<CrContext> cr() {
			return getRuleContexts(CrContext.class);
		}
		public CrContext cr(int i) {
			return getRuleContext(CrContext.class,i);
		}
		public List<LfContext> lf() {
			return getRuleContexts(LfContext.class);
		}
		public LfContext lf(int i) {
			return getRuleContext(LfContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public MwsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterMws(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitMws(this);
		}
	}

	public final MwsContext mws() throws RecognitionException {
		MwsContext _localctx = new MwsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_mws);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(642); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(642);
					switch (_input.LA(1)) {
					case SPACE:
						{
						setState(637);
						sp();
						}
						break;
					case TAB:
						{
						setState(638);
						htab();
						}
						break;
					case CR:
						{
						setState(639);
						cr();
						}
						break;
					case LF:
						{
						setState(640);
						lf();
						}
						break;
					case SLASH:
						{
						setState(641);
						comment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(644); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public List<TerminalNode> SLASH() { return getTokens(EclExpressionParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(EclExpressionParser.SLASH, i);
		}
		public List<TerminalNode> ASTERISK() { return getTokens(EclExpressionParser.ASTERISK); }
		public TerminalNode ASTERISK(int i) {
			return getToken(EclExpressionParser.ASTERISK, i);
		}
		public List<NonstarcharContext> nonstarchar() {
			return getRuleContexts(NonstarcharContext.class);
		}
		public NonstarcharContext nonstarchar(int i) {
			return getRuleContext(NonstarcharContext.class,i);
		}
		public List<StarwithnonfslashContext> starwithnonfslash() {
			return getRuleContexts(StarwithnonfslashContext.class);
		}
		public StarwithnonfslashContext starwithnonfslash(int i) {
			return getRuleContext(StarwithnonfslashContext.class,i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_comment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(646);
			match(SLASH);
			setState(647);
			match(ASTERISK);
			}
			setState(653);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(651);
					switch (_input.LA(1)) {
					case TAB:
					case LF:
					case CR:
					case SPACE:
					case EXCLAMATION:
					case QUOTE:
					case POUND:
					case DOLLAR:
					case PERCENT:
					case AMPERSAND:
					case APOSTROPHE:
					case LEFT_PAREN:
					case RIGHT_PAREN:
					case PLUS:
					case COMMA:
					case DASH:
					case PERIOD:
					case SLASH:
					case ZERO:
					case ONE:
					case TWO:
					case THREE:
					case FOUR:
					case FIVE:
					case SIX:
					case SEVEN:
					case EIGHT:
					case NINE:
					case COLON:
					case SEMICOLON:
					case LESS_THAN:
					case EQUALS:
					case GREATER_THAN:
					case QUESTION:
					case AT:
					case CAP_A:
					case CAP_B:
					case CAP_C:
					case CAP_D:
					case CAP_E:
					case CAP_F:
					case CAP_G:
					case CAP_H:
					case CAP_I:
					case CAP_J:
					case CAP_K:
					case CAP_L:
					case CAP_M:
					case CAP_N:
					case CAP_O:
					case CAP_P:
					case CAP_Q:
					case CAP_R:
					case CAP_S:
					case CAP_T:
					case CAP_U:
					case CAP_V:
					case CAP_W:
					case CAP_X:
					case CAP_Y:
					case CAP_Z:
					case LEFT_BRACE:
					case BACKSLASH:
					case RIGHT_BRACE:
					case CARAT:
					case UNDERSCORE:
					case ACCENT:
					case A:
					case B:
					case C:
					case D:
					case E:
					case F:
					case G:
					case H:
					case I:
					case J:
					case K:
					case L:
					case M:
					case N:
					case O:
					case P:
					case Q:
					case R:
					case S:
					case T:
					case U:
					case V:
					case W:
					case X:
					case Y:
					case Z:
					case LEFT_CURLY_BRACE:
					case PIPE:
					case RIGHT_CURLY_BRACE:
					case TILDE:
					case U_00C2:
					case U_00C3:
					case U_00C4:
					case U_00C5:
					case U_00C6:
					case U_00C7:
					case U_00C8:
					case U_00C9:
					case U_00CA:
					case U_00CB:
					case U_00CC:
					case U_00CD:
					case U_00CE:
					case U_00CF:
					case U_00D0:
					case U_00D1:
					case U_00D2:
					case U_00D3:
					case U_00D4:
					case U_00D5:
					case U_00D6:
					case U_00D7:
					case U_00D8:
					case U_00D9:
					case U_00DA:
					case U_00DB:
					case U_00DC:
					case U_00DD:
					case U_00DE:
					case U_00DF:
					case U_00E0:
					case U_00E1:
					case U_00E2:
					case U_00E3:
					case U_00E4:
					case U_00E5:
					case U_00E6:
					case U_00E7:
					case U_00E8:
					case U_00E9:
					case U_00EA:
					case U_00EB:
					case U_00EC:
					case U_00ED:
					case U_00EE:
					case U_00EF:
					case U_00F0:
					case U_00F1:
					case U_00F2:
					case U_00F3:
					case U_00F4:
						{
						setState(649);
						nonstarchar();
						}
						break;
					case ASTERISK:
						{
						setState(650);
						starwithnonfslash();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			{
			setState(656);
			match(ASTERISK);
			setState(657);
			match(SLASH);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonstarcharContext extends ParserRuleContext {
		public SpContext sp() {
			return getRuleContext(SpContext.class,0);
		}
		public HtabContext htab() {
			return getRuleContext(HtabContext.class,0);
		}
		public CrContext cr() {
			return getRuleContext(CrContext.class,0);
		}
		public LfContext lf() {
			return getRuleContext(LfContext.class,0);
		}
		public TerminalNode EXCLAMATION() { return getToken(EclExpressionParser.EXCLAMATION, 0); }
		public TerminalNode QUOTE() { return getToken(EclExpressionParser.QUOTE, 0); }
		public TerminalNode POUND() { return getToken(EclExpressionParser.POUND, 0); }
		public TerminalNode DOLLAR() { return getToken(EclExpressionParser.DOLLAR, 0); }
		public TerminalNode PERCENT() { return getToken(EclExpressionParser.PERCENT, 0); }
		public TerminalNode AMPERSAND() { return getToken(EclExpressionParser.AMPERSAND, 0); }
		public TerminalNode APOSTROPHE() { return getToken(EclExpressionParser.APOSTROPHE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(EclExpressionParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(EclExpressionParser.RIGHT_PAREN, 0); }
		public TerminalNode PLUS() { return getToken(EclExpressionParser.PLUS, 0); }
		public TerminalNode COMMA() { return getToken(EclExpressionParser.COMMA, 0); }
		public TerminalNode DASH() { return getToken(EclExpressionParser.DASH, 0); }
		public TerminalNode PERIOD() { return getToken(EclExpressionParser.PERIOD, 0); }
		public TerminalNode SLASH() { return getToken(EclExpressionParser.SLASH, 0); }
		public TerminalNode ZERO() { return getToken(EclExpressionParser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(EclExpressionParser.ONE, 0); }
		public TerminalNode TWO() { return getToken(EclExpressionParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(EclExpressionParser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(EclExpressionParser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(EclExpressionParser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(EclExpressionParser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(EclExpressionParser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(EclExpressionParser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(EclExpressionParser.NINE, 0); }
		public TerminalNode COLON() { return getToken(EclExpressionParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(EclExpressionParser.SEMICOLON, 0); }
		public TerminalNode LESS_THAN() { return getToken(EclExpressionParser.LESS_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(EclExpressionParser.EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(EclExpressionParser.GREATER_THAN, 0); }
		public TerminalNode QUESTION() { return getToken(EclExpressionParser.QUESTION, 0); }
		public TerminalNode AT() { return getToken(EclExpressionParser.AT, 0); }
		public TerminalNode CAP_A() { return getToken(EclExpressionParser.CAP_A, 0); }
		public TerminalNode CAP_B() { return getToken(EclExpressionParser.CAP_B, 0); }
		public TerminalNode CAP_C() { return getToken(EclExpressionParser.CAP_C, 0); }
		public TerminalNode CAP_D() { return getToken(EclExpressionParser.CAP_D, 0); }
		public TerminalNode CAP_E() { return getToken(EclExpressionParser.CAP_E, 0); }
		public TerminalNode CAP_F() { return getToken(EclExpressionParser.CAP_F, 0); }
		public TerminalNode CAP_G() { return getToken(EclExpressionParser.CAP_G, 0); }
		public TerminalNode CAP_H() { return getToken(EclExpressionParser.CAP_H, 0); }
		public TerminalNode CAP_I() { return getToken(EclExpressionParser.CAP_I, 0); }
		public TerminalNode CAP_J() { return getToken(EclExpressionParser.CAP_J, 0); }
		public TerminalNode CAP_K() { return getToken(EclExpressionParser.CAP_K, 0); }
		public TerminalNode CAP_L() { return getToken(EclExpressionParser.CAP_L, 0); }
		public TerminalNode CAP_M() { return getToken(EclExpressionParser.CAP_M, 0); }
		public TerminalNode CAP_N() { return getToken(EclExpressionParser.CAP_N, 0); }
		public TerminalNode CAP_O() { return getToken(EclExpressionParser.CAP_O, 0); }
		public TerminalNode CAP_P() { return getToken(EclExpressionParser.CAP_P, 0); }
		public TerminalNode CAP_Q() { return getToken(EclExpressionParser.CAP_Q, 0); }
		public TerminalNode CAP_R() { return getToken(EclExpressionParser.CAP_R, 0); }
		public TerminalNode CAP_S() { return getToken(EclExpressionParser.CAP_S, 0); }
		public TerminalNode CAP_T() { return getToken(EclExpressionParser.CAP_T, 0); }
		public TerminalNode CAP_U() { return getToken(EclExpressionParser.CAP_U, 0); }
		public TerminalNode CAP_V() { return getToken(EclExpressionParser.CAP_V, 0); }
		public TerminalNode CAP_W() { return getToken(EclExpressionParser.CAP_W, 0); }
		public TerminalNode CAP_X() { return getToken(EclExpressionParser.CAP_X, 0); }
		public TerminalNode CAP_Y() { return getToken(EclExpressionParser.CAP_Y, 0); }
		public TerminalNode CAP_Z() { return getToken(EclExpressionParser.CAP_Z, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(EclExpressionParser.LEFT_BRACE, 0); }
		public TerminalNode BACKSLASH() { return getToken(EclExpressionParser.BACKSLASH, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(EclExpressionParser.RIGHT_BRACE, 0); }
		public TerminalNode CARAT() { return getToken(EclExpressionParser.CARAT, 0); }
		public TerminalNode UNDERSCORE() { return getToken(EclExpressionParser.UNDERSCORE, 0); }
		public TerminalNode ACCENT() { return getToken(EclExpressionParser.ACCENT, 0); }
		public TerminalNode A() { return getToken(EclExpressionParser.A, 0); }
		public TerminalNode B() { return getToken(EclExpressionParser.B, 0); }
		public TerminalNode C() { return getToken(EclExpressionParser.C, 0); }
		public TerminalNode D() { return getToken(EclExpressionParser.D, 0); }
		public TerminalNode E() { return getToken(EclExpressionParser.E, 0); }
		public TerminalNode F() { return getToken(EclExpressionParser.F, 0); }
		public TerminalNode G() { return getToken(EclExpressionParser.G, 0); }
		public TerminalNode H() { return getToken(EclExpressionParser.H, 0); }
		public TerminalNode I() { return getToken(EclExpressionParser.I, 0); }
		public TerminalNode J() { return getToken(EclExpressionParser.J, 0); }
		public TerminalNode K() { return getToken(EclExpressionParser.K, 0); }
		public TerminalNode L() { return getToken(EclExpressionParser.L, 0); }
		public TerminalNode M() { return getToken(EclExpressionParser.M, 0); }
		public TerminalNode N() { return getToken(EclExpressionParser.N, 0); }
		public TerminalNode O() { return getToken(EclExpressionParser.O, 0); }
		public TerminalNode P() { return getToken(EclExpressionParser.P, 0); }
		public TerminalNode Q() { return getToken(EclExpressionParser.Q, 0); }
		public TerminalNode R() { return getToken(EclExpressionParser.R, 0); }
		public TerminalNode S() { return getToken(EclExpressionParser.S, 0); }
		public TerminalNode T() { return getToken(EclExpressionParser.T, 0); }
		public TerminalNode U() { return getToken(EclExpressionParser.U, 0); }
		public TerminalNode V() { return getToken(EclExpressionParser.V, 0); }
		public TerminalNode W() { return getToken(EclExpressionParser.W, 0); }
		public TerminalNode X() { return getToken(EclExpressionParser.X, 0); }
		public TerminalNode Y() { return getToken(EclExpressionParser.Y, 0); }
		public TerminalNode Z() { return getToken(EclExpressionParser.Z, 0); }
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(EclExpressionParser.LEFT_CURLY_BRACE, 0); }
		public TerminalNode PIPE() { return getToken(EclExpressionParser.PIPE, 0); }
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(EclExpressionParser.RIGHT_CURLY_BRACE, 0); }
		public TerminalNode TILDE() { return getToken(EclExpressionParser.TILDE, 0); }
		public Utf8_2Context utf8_2() {
			return getRuleContext(Utf8_2Context.class,0);
		}
		public Utf8_3Context utf8_3() {
			return getRuleContext(Utf8_3Context.class,0);
		}
		public Utf8_4Context utf8_4() {
			return getRuleContext(Utf8_4Context.class,0);
		}
		public NonstarcharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonstarchar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterNonstarchar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitNonstarchar(this);
		}
	}

	public final NonstarcharContext nonstarchar() throws RecognitionException {
		NonstarcharContext _localctx = new NonstarcharContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_nonstarchar);
		int _la;
		try {
			setState(668);
			switch (_input.LA(1)) {
			case SPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				sp();
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				htab();
				}
				break;
			case CR:
				enterOuterAlt(_localctx, 3);
				{
				setState(661);
				cr();
				}
				break;
			case LF:
				enterOuterAlt(_localctx, 4);
				{
				setState(662);
				lf();
				}
				break;
			case EXCLAMATION:
			case QUOTE:
			case POUND:
			case DOLLAR:
			case PERCENT:
			case AMPERSAND:
			case APOSTROPHE:
			case LEFT_PAREN:
			case RIGHT_PAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(663);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATION) | (1L << QUOTE) | (1L << POUND) | (1L << DOLLAR) | (1L << PERCENT) | (1L << AMPERSAND) | (1L << APOSTROPHE) | (1L << LEFT_PAREN) | (1L << RIGHT_PAREN))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case PLUS:
			case COMMA:
			case DASH:
			case PERIOD:
			case SLASH:
			case ZERO:
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
			case COLON:
			case SEMICOLON:
			case LESS_THAN:
			case EQUALS:
			case GREATER_THAN:
			case QUESTION:
			case AT:
			case CAP_A:
			case CAP_B:
			case CAP_C:
			case CAP_D:
			case CAP_E:
			case CAP_F:
			case CAP_G:
			case CAP_H:
			case CAP_I:
			case CAP_J:
			case CAP_K:
			case CAP_L:
			case CAP_M:
			case CAP_N:
			case CAP_O:
			case CAP_P:
			case CAP_Q:
			case CAP_R:
			case CAP_S:
			case CAP_T:
			case CAP_U:
			case CAP_V:
			case CAP_W:
			case CAP_X:
			case CAP_Y:
			case CAP_Z:
			case LEFT_BRACE:
			case BACKSLASH:
			case RIGHT_BRACE:
			case CARAT:
			case UNDERSCORE:
			case ACCENT:
			case A:
			case B:
			case C:
			case D:
			case E:
			case F:
			case G:
			case H:
			case I:
			case J:
			case K:
			case L:
			case M:
			case N:
			case O:
			case P:
			case Q:
			case R:
			case S:
			case T:
			case U:
			case V:
			case W:
			case X:
			case Y:
			case Z:
			case LEFT_CURLY_BRACE:
			case PIPE:
			case RIGHT_CURLY_BRACE:
			case TILDE:
				enterOuterAlt(_localctx, 6);
				{
				setState(664);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << COMMA) | (1L << DASH) | (1L << PERIOD) | (1L << SLASH) | (1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << COLON) | (1L << SEMICOLON) | (1L << LESS_THAN) | (1L << EQUALS) | (1L << GREATER_THAN) | (1L << QUESTION) | (1L << AT) | (1L << CAP_A) | (1L << CAP_B) | (1L << CAP_C) | (1L << CAP_D) | (1L << CAP_E) | (1L << CAP_F) | (1L << CAP_G) | (1L << CAP_H) | (1L << CAP_I) | (1L << CAP_J) | (1L << CAP_K) | (1L << CAP_L) | (1L << CAP_M) | (1L << CAP_N) | (1L << CAP_O) | (1L << CAP_P) | (1L << CAP_Q) | (1L << CAP_R) | (1L << CAP_S) | (1L << CAP_T) | (1L << CAP_U) | (1L << CAP_V) | (1L << CAP_W) | (1L << CAP_X) | (1L << CAP_Y) | (1L << CAP_Z) | (1L << LEFT_BRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BACKSLASH - 64)) | (1L << (RIGHT_BRACE - 64)) | (1L << (CARAT - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (ACCENT - 64)) | (1L << (A - 64)) | (1L << (B - 64)) | (1L << (C - 64)) | (1L << (D - 64)) | (1L << (E - 64)) | (1L << (F - 64)) | (1L << (G - 64)) | (1L << (H - 64)) | (1L << (I - 64)) | (1L << (J - 64)) | (1L << (K - 64)) | (1L << (L - 64)) | (1L << (M - 64)) | (1L << (N - 64)) | (1L << (O - 64)) | (1L << (P - 64)) | (1L << (Q - 64)) | (1L << (R - 64)) | (1L << (S - 64)) | (1L << (T - 64)) | (1L << (U - 64)) | (1L << (V - 64)) | (1L << (W - 64)) | (1L << (X - 64)) | (1L << (Y - 64)) | (1L << (Z - 64)) | (1L << (LEFT_CURLY_BRACE - 64)) | (1L << (PIPE - 64)) | (1L << (RIGHT_CURLY_BRACE - 64)) | (1L << (TILDE - 64)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case U_00C2:
			case U_00C3:
			case U_00C4:
			case U_00C5:
			case U_00C6:
			case U_00C7:
			case U_00C8:
			case U_00C9:
			case U_00CA:
			case U_00CB:
			case U_00CC:
			case U_00CD:
			case U_00CE:
			case U_00CF:
			case U_00D0:
			case U_00D1:
			case U_00D2:
			case U_00D3:
			case U_00D4:
			case U_00D5:
			case U_00D6:
			case U_00D7:
			case U_00D8:
			case U_00D9:
			case U_00DA:
			case U_00DB:
			case U_00DC:
			case U_00DD:
			case U_00DE:
			case U_00DF:
				enterOuterAlt(_localctx, 7);
				{
				setState(665);
				utf8_2();
				}
				break;
			case U_00E0:
			case U_00E1:
			case U_00E2:
			case U_00E3:
			case U_00E4:
			case U_00E5:
			case U_00E6:
			case U_00E7:
			case U_00E8:
			case U_00E9:
			case U_00EA:
			case U_00EB:
			case U_00EC:
			case U_00ED:
			case U_00EE:
			case U_00EF:
				enterOuterAlt(_localctx, 8);
				{
				setState(666);
				utf8_3();
				}
				break;
			case U_00F0:
			case U_00F1:
			case U_00F2:
			case U_00F3:
			case U_00F4:
				enterOuterAlt(_localctx, 9);
				{
				setState(667);
				utf8_4();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StarwithnonfslashContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(EclExpressionParser.ASTERISK, 0); }
		public NonfslashContext nonfslash() {
			return getRuleContext(NonfslashContext.class,0);
		}
		public StarwithnonfslashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starwithnonfslash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterStarwithnonfslash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitStarwithnonfslash(this);
		}
	}

	public final StarwithnonfslashContext starwithnonfslash() throws RecognitionException {
		StarwithnonfslashContext _localctx = new StarwithnonfslashContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_starwithnonfslash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(ASTERISK);
			setState(671);
			nonfslash();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonfslashContext extends ParserRuleContext {
		public SpContext sp() {
			return getRuleContext(SpContext.class,0);
		}
		public HtabContext htab() {
			return getRuleContext(HtabContext.class,0);
		}
		public CrContext cr() {
			return getRuleContext(CrContext.class,0);
		}
		public LfContext lf() {
			return getRuleContext(LfContext.class,0);
		}
		public TerminalNode EXCLAMATION() { return getToken(EclExpressionParser.EXCLAMATION, 0); }
		public TerminalNode QUOTE() { return getToken(EclExpressionParser.QUOTE, 0); }
		public TerminalNode POUND() { return getToken(EclExpressionParser.POUND, 0); }
		public TerminalNode DOLLAR() { return getToken(EclExpressionParser.DOLLAR, 0); }
		public TerminalNode PERCENT() { return getToken(EclExpressionParser.PERCENT, 0); }
		public TerminalNode AMPERSAND() { return getToken(EclExpressionParser.AMPERSAND, 0); }
		public TerminalNode APOSTROPHE() { return getToken(EclExpressionParser.APOSTROPHE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(EclExpressionParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(EclExpressionParser.RIGHT_PAREN, 0); }
		public TerminalNode ASTERISK() { return getToken(EclExpressionParser.ASTERISK, 0); }
		public TerminalNode PLUS() { return getToken(EclExpressionParser.PLUS, 0); }
		public TerminalNode COMMA() { return getToken(EclExpressionParser.COMMA, 0); }
		public TerminalNode DASH() { return getToken(EclExpressionParser.DASH, 0); }
		public TerminalNode PERIOD() { return getToken(EclExpressionParser.PERIOD, 0); }
		public TerminalNode ZERO() { return getToken(EclExpressionParser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(EclExpressionParser.ONE, 0); }
		public TerminalNode TWO() { return getToken(EclExpressionParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(EclExpressionParser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(EclExpressionParser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(EclExpressionParser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(EclExpressionParser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(EclExpressionParser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(EclExpressionParser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(EclExpressionParser.NINE, 0); }
		public TerminalNode COLON() { return getToken(EclExpressionParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(EclExpressionParser.SEMICOLON, 0); }
		public TerminalNode LESS_THAN() { return getToken(EclExpressionParser.LESS_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(EclExpressionParser.EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(EclExpressionParser.GREATER_THAN, 0); }
		public TerminalNode QUESTION() { return getToken(EclExpressionParser.QUESTION, 0); }
		public TerminalNode AT() { return getToken(EclExpressionParser.AT, 0); }
		public TerminalNode CAP_A() { return getToken(EclExpressionParser.CAP_A, 0); }
		public TerminalNode CAP_B() { return getToken(EclExpressionParser.CAP_B, 0); }
		public TerminalNode CAP_C() { return getToken(EclExpressionParser.CAP_C, 0); }
		public TerminalNode CAP_D() { return getToken(EclExpressionParser.CAP_D, 0); }
		public TerminalNode CAP_E() { return getToken(EclExpressionParser.CAP_E, 0); }
		public TerminalNode CAP_F() { return getToken(EclExpressionParser.CAP_F, 0); }
		public TerminalNode CAP_G() { return getToken(EclExpressionParser.CAP_G, 0); }
		public TerminalNode CAP_H() { return getToken(EclExpressionParser.CAP_H, 0); }
		public TerminalNode CAP_I() { return getToken(EclExpressionParser.CAP_I, 0); }
		public TerminalNode CAP_J() { return getToken(EclExpressionParser.CAP_J, 0); }
		public TerminalNode CAP_K() { return getToken(EclExpressionParser.CAP_K, 0); }
		public TerminalNode CAP_L() { return getToken(EclExpressionParser.CAP_L, 0); }
		public TerminalNode CAP_M() { return getToken(EclExpressionParser.CAP_M, 0); }
		public TerminalNode CAP_N() { return getToken(EclExpressionParser.CAP_N, 0); }
		public TerminalNode CAP_O() { return getToken(EclExpressionParser.CAP_O, 0); }
		public TerminalNode CAP_P() { return getToken(EclExpressionParser.CAP_P, 0); }
		public TerminalNode CAP_Q() { return getToken(EclExpressionParser.CAP_Q, 0); }
		public TerminalNode CAP_R() { return getToken(EclExpressionParser.CAP_R, 0); }
		public TerminalNode CAP_S() { return getToken(EclExpressionParser.CAP_S, 0); }
		public TerminalNode CAP_T() { return getToken(EclExpressionParser.CAP_T, 0); }
		public TerminalNode CAP_U() { return getToken(EclExpressionParser.CAP_U, 0); }
		public TerminalNode CAP_V() { return getToken(EclExpressionParser.CAP_V, 0); }
		public TerminalNode CAP_W() { return getToken(EclExpressionParser.CAP_W, 0); }
		public TerminalNode CAP_X() { return getToken(EclExpressionParser.CAP_X, 0); }
		public TerminalNode CAP_Y() { return getToken(EclExpressionParser.CAP_Y, 0); }
		public TerminalNode CAP_Z() { return getToken(EclExpressionParser.CAP_Z, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(EclExpressionParser.LEFT_BRACE, 0); }
		public TerminalNode BACKSLASH() { return getToken(EclExpressionParser.BACKSLASH, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(EclExpressionParser.RIGHT_BRACE, 0); }
		public TerminalNode CARAT() { return getToken(EclExpressionParser.CARAT, 0); }
		public TerminalNode UNDERSCORE() { return getToken(EclExpressionParser.UNDERSCORE, 0); }
		public TerminalNode ACCENT() { return getToken(EclExpressionParser.ACCENT, 0); }
		public TerminalNode A() { return getToken(EclExpressionParser.A, 0); }
		public TerminalNode B() { return getToken(EclExpressionParser.B, 0); }
		public TerminalNode C() { return getToken(EclExpressionParser.C, 0); }
		public TerminalNode D() { return getToken(EclExpressionParser.D, 0); }
		public TerminalNode E() { return getToken(EclExpressionParser.E, 0); }
		public TerminalNode F() { return getToken(EclExpressionParser.F, 0); }
		public TerminalNode G() { return getToken(EclExpressionParser.G, 0); }
		public TerminalNode H() { return getToken(EclExpressionParser.H, 0); }
		public TerminalNode I() { return getToken(EclExpressionParser.I, 0); }
		public TerminalNode J() { return getToken(EclExpressionParser.J, 0); }
		public TerminalNode K() { return getToken(EclExpressionParser.K, 0); }
		public TerminalNode L() { return getToken(EclExpressionParser.L, 0); }
		public TerminalNode M() { return getToken(EclExpressionParser.M, 0); }
		public TerminalNode N() { return getToken(EclExpressionParser.N, 0); }
		public TerminalNode O() { return getToken(EclExpressionParser.O, 0); }
		public TerminalNode P() { return getToken(EclExpressionParser.P, 0); }
		public TerminalNode Q() { return getToken(EclExpressionParser.Q, 0); }
		public TerminalNode R() { return getToken(EclExpressionParser.R, 0); }
		public TerminalNode S() { return getToken(EclExpressionParser.S, 0); }
		public TerminalNode T() { return getToken(EclExpressionParser.T, 0); }
		public TerminalNode U() { return getToken(EclExpressionParser.U, 0); }
		public TerminalNode V() { return getToken(EclExpressionParser.V, 0); }
		public TerminalNode W() { return getToken(EclExpressionParser.W, 0); }
		public TerminalNode X() { return getToken(EclExpressionParser.X, 0); }
		public TerminalNode Y() { return getToken(EclExpressionParser.Y, 0); }
		public TerminalNode Z() { return getToken(EclExpressionParser.Z, 0); }
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(EclExpressionParser.LEFT_CURLY_BRACE, 0); }
		public TerminalNode PIPE() { return getToken(EclExpressionParser.PIPE, 0); }
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(EclExpressionParser.RIGHT_CURLY_BRACE, 0); }
		public TerminalNode TILDE() { return getToken(EclExpressionParser.TILDE, 0); }
		public Utf8_2Context utf8_2() {
			return getRuleContext(Utf8_2Context.class,0);
		}
		public Utf8_3Context utf8_3() {
			return getRuleContext(Utf8_3Context.class,0);
		}
		public Utf8_4Context utf8_4() {
			return getRuleContext(Utf8_4Context.class,0);
		}
		public NonfslashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonfslash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterNonfslash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitNonfslash(this);
		}
	}

	public final NonfslashContext nonfslash() throws RecognitionException {
		NonfslashContext _localctx = new NonfslashContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_nonfslash);
		int _la;
		try {
			setState(682);
			switch (_input.LA(1)) {
			case SPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				sp();
				}
				break;
			case TAB:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				htab();
				}
				break;
			case CR:
				enterOuterAlt(_localctx, 3);
				{
				setState(675);
				cr();
				}
				break;
			case LF:
				enterOuterAlt(_localctx, 4);
				{
				setState(676);
				lf();
				}
				break;
			case EXCLAMATION:
			case QUOTE:
			case POUND:
			case DOLLAR:
			case PERCENT:
			case AMPERSAND:
			case APOSTROPHE:
			case LEFT_PAREN:
			case RIGHT_PAREN:
			case ASTERISK:
			case PLUS:
			case COMMA:
			case DASH:
			case PERIOD:
				enterOuterAlt(_localctx, 5);
				{
				setState(677);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATION) | (1L << QUOTE) | (1L << POUND) | (1L << DOLLAR) | (1L << PERCENT) | (1L << AMPERSAND) | (1L << APOSTROPHE) | (1L << LEFT_PAREN) | (1L << RIGHT_PAREN) | (1L << ASTERISK) | (1L << PLUS) | (1L << COMMA) | (1L << DASH) | (1L << PERIOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case ZERO:
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
			case COLON:
			case SEMICOLON:
			case LESS_THAN:
			case EQUALS:
			case GREATER_THAN:
			case QUESTION:
			case AT:
			case CAP_A:
			case CAP_B:
			case CAP_C:
			case CAP_D:
			case CAP_E:
			case CAP_F:
			case CAP_G:
			case CAP_H:
			case CAP_I:
			case CAP_J:
			case CAP_K:
			case CAP_L:
			case CAP_M:
			case CAP_N:
			case CAP_O:
			case CAP_P:
			case CAP_Q:
			case CAP_R:
			case CAP_S:
			case CAP_T:
			case CAP_U:
			case CAP_V:
			case CAP_W:
			case CAP_X:
			case CAP_Y:
			case CAP_Z:
			case LEFT_BRACE:
			case BACKSLASH:
			case RIGHT_BRACE:
			case CARAT:
			case UNDERSCORE:
			case ACCENT:
			case A:
			case B:
			case C:
			case D:
			case E:
			case F:
			case G:
			case H:
			case I:
			case J:
			case K:
			case L:
			case M:
			case N:
			case O:
			case P:
			case Q:
			case R:
			case S:
			case T:
			case U:
			case V:
			case W:
			case X:
			case Y:
			case Z:
			case LEFT_CURLY_BRACE:
			case PIPE:
			case RIGHT_CURLY_BRACE:
			case TILDE:
				enterOuterAlt(_localctx, 6);
				{
				setState(678);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << COLON) | (1L << SEMICOLON) | (1L << LESS_THAN) | (1L << EQUALS) | (1L << GREATER_THAN) | (1L << QUESTION) | (1L << AT) | (1L << CAP_A) | (1L << CAP_B) | (1L << CAP_C) | (1L << CAP_D) | (1L << CAP_E) | (1L << CAP_F) | (1L << CAP_G) | (1L << CAP_H) | (1L << CAP_I) | (1L << CAP_J) | (1L << CAP_K) | (1L << CAP_L) | (1L << CAP_M) | (1L << CAP_N) | (1L << CAP_O) | (1L << CAP_P) | (1L << CAP_Q) | (1L << CAP_R) | (1L << CAP_S) | (1L << CAP_T) | (1L << CAP_U) | (1L << CAP_V) | (1L << CAP_W) | (1L << CAP_X) | (1L << CAP_Y) | (1L << CAP_Z) | (1L << LEFT_BRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BACKSLASH - 64)) | (1L << (RIGHT_BRACE - 64)) | (1L << (CARAT - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (ACCENT - 64)) | (1L << (A - 64)) | (1L << (B - 64)) | (1L << (C - 64)) | (1L << (D - 64)) | (1L << (E - 64)) | (1L << (F - 64)) | (1L << (G - 64)) | (1L << (H - 64)) | (1L << (I - 64)) | (1L << (J - 64)) | (1L << (K - 64)) | (1L << (L - 64)) | (1L << (M - 64)) | (1L << (N - 64)) | (1L << (O - 64)) | (1L << (P - 64)) | (1L << (Q - 64)) | (1L << (R - 64)) | (1L << (S - 64)) | (1L << (T - 64)) | (1L << (U - 64)) | (1L << (V - 64)) | (1L << (W - 64)) | (1L << (X - 64)) | (1L << (Y - 64)) | (1L << (Z - 64)) | (1L << (LEFT_CURLY_BRACE - 64)) | (1L << (PIPE - 64)) | (1L << (RIGHT_CURLY_BRACE - 64)) | (1L << (TILDE - 64)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case U_00C2:
			case U_00C3:
			case U_00C4:
			case U_00C5:
			case U_00C6:
			case U_00C7:
			case U_00C8:
			case U_00C9:
			case U_00CA:
			case U_00CB:
			case U_00CC:
			case U_00CD:
			case U_00CE:
			case U_00CF:
			case U_00D0:
			case U_00D1:
			case U_00D2:
			case U_00D3:
			case U_00D4:
			case U_00D5:
			case U_00D6:
			case U_00D7:
			case U_00D8:
			case U_00D9:
			case U_00DA:
			case U_00DB:
			case U_00DC:
			case U_00DD:
			case U_00DE:
			case U_00DF:
				enterOuterAlt(_localctx, 7);
				{
				setState(679);
				utf8_2();
				}
				break;
			case U_00E0:
			case U_00E1:
			case U_00E2:
			case U_00E3:
			case U_00E4:
			case U_00E5:
			case U_00E6:
			case U_00E7:
			case U_00E8:
			case U_00E9:
			case U_00EA:
			case U_00EB:
			case U_00EC:
			case U_00ED:
			case U_00EE:
			case U_00EF:
				enterOuterAlt(_localctx, 8);
				{
				setState(680);
				utf8_3();
				}
				break;
			case U_00F0:
			case U_00F1:
			case U_00F2:
			case U_00F3:
			case U_00F4:
				enterOuterAlt(_localctx, 9);
				{
				setState(681);
				utf8_4();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(EclExpressionParser.SPACE, 0); }
		public SpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterSp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitSp(this);
		}
	}

	public final SpContext sp() throws RecognitionException {
		SpContext _localctx = new SpContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_sp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(SPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtabContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(EclExpressionParser.TAB, 0); }
		public HtabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterHtab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitHtab(this);
		}
	}

	public final HtabContext htab() throws RecognitionException {
		HtabContext _localctx = new HtabContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_htab);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(TAB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CrContext extends ParserRuleContext {
		public TerminalNode CR() { return getToken(EclExpressionParser.CR, 0); }
		public CrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterCr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitCr(this);
		}
	}

	public final CrContext cr() throws RecognitionException {
		CrContext _localctx = new CrContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_cr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(CR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LfContext extends ParserRuleContext {
		public TerminalNode LF() { return getToken(EclExpressionParser.LF, 0); }
		public LfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterLf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitLf(this);
		}
	}

	public final LfContext lf() throws RecognitionException {
		LfContext _localctx = new LfContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_lf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(LF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QmContext extends ParserRuleContext {
		public TerminalNode QUOTE() { return getToken(EclExpressionParser.QUOTE, 0); }
		public QmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterQm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitQm(this);
		}
	}

	public final QmContext qm() throws RecognitionException {
		QmContext _localctx = new QmContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_qm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BsContext extends ParserRuleContext {
		public TerminalNode BACKSLASH() { return getToken(EclExpressionParser.BACKSLASH, 0); }
		public BsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterBs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitBs(this);
		}
	}

	public final BsContext bs() throws RecognitionException {
		BsContext _localctx = new BsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_bs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(BACKSLASH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(EclExpressionParser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(EclExpressionParser.ONE, 0); }
		public TerminalNode TWO() { return getToken(EclExpressionParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(EclExpressionParser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(EclExpressionParser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(EclExpressionParser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(EclExpressionParser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(EclExpressionParser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(EclExpressionParser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(EclExpressionParser.NINE, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitDigit(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ZeroContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(EclExpressionParser.ZERO, 0); }
		public ZeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterZero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitZero(this);
		}
	}

	public final ZeroContext zero() throws RecognitionException {
		ZeroContext _localctx = new ZeroContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_zero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(ZERO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitnonzeroContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(EclExpressionParser.ONE, 0); }
		public TerminalNode TWO() { return getToken(EclExpressionParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(EclExpressionParser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(EclExpressionParser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(EclExpressionParser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(EclExpressionParser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(EclExpressionParser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(EclExpressionParser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(EclExpressionParser.NINE, 0); }
		public DigitnonzeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digitnonzero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterDigitnonzero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitDigitnonzero(this);
		}
	}

	public final DigitnonzeroContext digitnonzero() throws RecognitionException {
		DigitnonzeroContext _localctx = new DigitnonzeroContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_digitnonzero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonwsnonpipeContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION() { return getToken(EclExpressionParser.EXCLAMATION, 0); }
		public TerminalNode QUOTE() { return getToken(EclExpressionParser.QUOTE, 0); }
		public TerminalNode POUND() { return getToken(EclExpressionParser.POUND, 0); }
		public TerminalNode DOLLAR() { return getToken(EclExpressionParser.DOLLAR, 0); }
		public TerminalNode PERCENT() { return getToken(EclExpressionParser.PERCENT, 0); }
		public TerminalNode AMPERSAND() { return getToken(EclExpressionParser.AMPERSAND, 0); }
		public TerminalNode APOSTROPHE() { return getToken(EclExpressionParser.APOSTROPHE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(EclExpressionParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(EclExpressionParser.RIGHT_PAREN, 0); }
		public TerminalNode ASTERISK() { return getToken(EclExpressionParser.ASTERISK, 0); }
		public TerminalNode PLUS() { return getToken(EclExpressionParser.PLUS, 0); }
		public TerminalNode COMMA() { return getToken(EclExpressionParser.COMMA, 0); }
		public TerminalNode DASH() { return getToken(EclExpressionParser.DASH, 0); }
		public TerminalNode PERIOD() { return getToken(EclExpressionParser.PERIOD, 0); }
		public TerminalNode SLASH() { return getToken(EclExpressionParser.SLASH, 0); }
		public TerminalNode ZERO() { return getToken(EclExpressionParser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(EclExpressionParser.ONE, 0); }
		public TerminalNode TWO() { return getToken(EclExpressionParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(EclExpressionParser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(EclExpressionParser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(EclExpressionParser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(EclExpressionParser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(EclExpressionParser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(EclExpressionParser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(EclExpressionParser.NINE, 0); }
		public TerminalNode COLON() { return getToken(EclExpressionParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(EclExpressionParser.SEMICOLON, 0); }
		public TerminalNode LESS_THAN() { return getToken(EclExpressionParser.LESS_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(EclExpressionParser.EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(EclExpressionParser.GREATER_THAN, 0); }
		public TerminalNode QUESTION() { return getToken(EclExpressionParser.QUESTION, 0); }
		public TerminalNode AT() { return getToken(EclExpressionParser.AT, 0); }
		public TerminalNode CAP_A() { return getToken(EclExpressionParser.CAP_A, 0); }
		public TerminalNode CAP_B() { return getToken(EclExpressionParser.CAP_B, 0); }
		public TerminalNode CAP_C() { return getToken(EclExpressionParser.CAP_C, 0); }
		public TerminalNode CAP_D() { return getToken(EclExpressionParser.CAP_D, 0); }
		public TerminalNode CAP_E() { return getToken(EclExpressionParser.CAP_E, 0); }
		public TerminalNode CAP_F() { return getToken(EclExpressionParser.CAP_F, 0); }
		public TerminalNode CAP_G() { return getToken(EclExpressionParser.CAP_G, 0); }
		public TerminalNode CAP_H() { return getToken(EclExpressionParser.CAP_H, 0); }
		public TerminalNode CAP_I() { return getToken(EclExpressionParser.CAP_I, 0); }
		public TerminalNode CAP_J() { return getToken(EclExpressionParser.CAP_J, 0); }
		public TerminalNode CAP_K() { return getToken(EclExpressionParser.CAP_K, 0); }
		public TerminalNode CAP_L() { return getToken(EclExpressionParser.CAP_L, 0); }
		public TerminalNode CAP_M() { return getToken(EclExpressionParser.CAP_M, 0); }
		public TerminalNode CAP_N() { return getToken(EclExpressionParser.CAP_N, 0); }
		public TerminalNode CAP_O() { return getToken(EclExpressionParser.CAP_O, 0); }
		public TerminalNode CAP_P() { return getToken(EclExpressionParser.CAP_P, 0); }
		public TerminalNode CAP_Q() { return getToken(EclExpressionParser.CAP_Q, 0); }
		public TerminalNode CAP_R() { return getToken(EclExpressionParser.CAP_R, 0); }
		public TerminalNode CAP_S() { return getToken(EclExpressionParser.CAP_S, 0); }
		public TerminalNode CAP_T() { return getToken(EclExpressionParser.CAP_T, 0); }
		public TerminalNode CAP_U() { return getToken(EclExpressionParser.CAP_U, 0); }
		public TerminalNode CAP_V() { return getToken(EclExpressionParser.CAP_V, 0); }
		public TerminalNode CAP_W() { return getToken(EclExpressionParser.CAP_W, 0); }
		public TerminalNode CAP_X() { return getToken(EclExpressionParser.CAP_X, 0); }
		public TerminalNode CAP_Y() { return getToken(EclExpressionParser.CAP_Y, 0); }
		public TerminalNode CAP_Z() { return getToken(EclExpressionParser.CAP_Z, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(EclExpressionParser.LEFT_BRACE, 0); }
		public TerminalNode BACKSLASH() { return getToken(EclExpressionParser.BACKSLASH, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(EclExpressionParser.RIGHT_BRACE, 0); }
		public TerminalNode CARAT() { return getToken(EclExpressionParser.CARAT, 0); }
		public TerminalNode UNDERSCORE() { return getToken(EclExpressionParser.UNDERSCORE, 0); }
		public TerminalNode ACCENT() { return getToken(EclExpressionParser.ACCENT, 0); }
		public TerminalNode A() { return getToken(EclExpressionParser.A, 0); }
		public TerminalNode B() { return getToken(EclExpressionParser.B, 0); }
		public TerminalNode C() { return getToken(EclExpressionParser.C, 0); }
		public TerminalNode D() { return getToken(EclExpressionParser.D, 0); }
		public TerminalNode E() { return getToken(EclExpressionParser.E, 0); }
		public TerminalNode F() { return getToken(EclExpressionParser.F, 0); }
		public TerminalNode G() { return getToken(EclExpressionParser.G, 0); }
		public TerminalNode H() { return getToken(EclExpressionParser.H, 0); }
		public TerminalNode I() { return getToken(EclExpressionParser.I, 0); }
		public TerminalNode J() { return getToken(EclExpressionParser.J, 0); }
		public TerminalNode K() { return getToken(EclExpressionParser.K, 0); }
		public TerminalNode L() { return getToken(EclExpressionParser.L, 0); }
		public TerminalNode M() { return getToken(EclExpressionParser.M, 0); }
		public TerminalNode N() { return getToken(EclExpressionParser.N, 0); }
		public TerminalNode O() { return getToken(EclExpressionParser.O, 0); }
		public TerminalNode P() { return getToken(EclExpressionParser.P, 0); }
		public TerminalNode Q() { return getToken(EclExpressionParser.Q, 0); }
		public TerminalNode R() { return getToken(EclExpressionParser.R, 0); }
		public TerminalNode S() { return getToken(EclExpressionParser.S, 0); }
		public TerminalNode T() { return getToken(EclExpressionParser.T, 0); }
		public TerminalNode U() { return getToken(EclExpressionParser.U, 0); }
		public TerminalNode V() { return getToken(EclExpressionParser.V, 0); }
		public TerminalNode W() { return getToken(EclExpressionParser.W, 0); }
		public TerminalNode X() { return getToken(EclExpressionParser.X, 0); }
		public TerminalNode Y() { return getToken(EclExpressionParser.Y, 0); }
		public TerminalNode Z() { return getToken(EclExpressionParser.Z, 0); }
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(EclExpressionParser.LEFT_CURLY_BRACE, 0); }
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(EclExpressionParser.RIGHT_CURLY_BRACE, 0); }
		public TerminalNode TILDE() { return getToken(EclExpressionParser.TILDE, 0); }
		public Utf8_2Context utf8_2() {
			return getRuleContext(Utf8_2Context.class,0);
		}
		public Utf8_3Context utf8_3() {
			return getRuleContext(Utf8_3Context.class,0);
		}
		public Utf8_4Context utf8_4() {
			return getRuleContext(Utf8_4Context.class,0);
		}
		public NonwsnonpipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonwsnonpipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterNonwsnonpipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitNonwsnonpipe(this);
		}
	}

	public final NonwsnonpipeContext nonwsnonpipe() throws RecognitionException {
		NonwsnonpipeContext _localctx = new NonwsnonpipeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_nonwsnonpipe);
		int _la;
		try {
			setState(707);
			switch (_input.LA(1)) {
			case EXCLAMATION:
			case QUOTE:
			case POUND:
			case DOLLAR:
			case PERCENT:
			case AMPERSAND:
			case APOSTROPHE:
			case LEFT_PAREN:
			case RIGHT_PAREN:
			case ASTERISK:
			case PLUS:
			case COMMA:
			case DASH:
			case PERIOD:
			case SLASH:
			case ZERO:
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
			case COLON:
			case SEMICOLON:
			case LESS_THAN:
			case EQUALS:
			case GREATER_THAN:
			case QUESTION:
			case AT:
			case CAP_A:
			case CAP_B:
			case CAP_C:
			case CAP_D:
			case CAP_E:
			case CAP_F:
			case CAP_G:
			case CAP_H:
			case CAP_I:
			case CAP_J:
			case CAP_K:
			case CAP_L:
			case CAP_M:
			case CAP_N:
			case CAP_O:
			case CAP_P:
			case CAP_Q:
			case CAP_R:
			case CAP_S:
			case CAP_T:
			case CAP_U:
			case CAP_V:
			case CAP_W:
			case CAP_X:
			case CAP_Y:
			case CAP_Z:
			case LEFT_BRACE:
			case BACKSLASH:
			case RIGHT_BRACE:
			case CARAT:
			case UNDERSCORE:
			case ACCENT:
			case A:
			case B:
			case C:
			case D:
			case E:
			case F:
			case G:
			case H:
			case I:
			case J:
			case K:
			case L:
			case M:
			case N:
			case O:
			case P:
			case Q:
			case R:
			case S:
			case T:
			case U:
			case V:
			case W:
			case X:
			case Y:
			case Z:
			case LEFT_CURLY_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATION) | (1L << QUOTE) | (1L << POUND) | (1L << DOLLAR) | (1L << PERCENT) | (1L << AMPERSAND) | (1L << APOSTROPHE) | (1L << LEFT_PAREN) | (1L << RIGHT_PAREN) | (1L << ASTERISK) | (1L << PLUS) | (1L << COMMA) | (1L << DASH) | (1L << PERIOD) | (1L << SLASH) | (1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << COLON) | (1L << SEMICOLON) | (1L << LESS_THAN) | (1L << EQUALS) | (1L << GREATER_THAN) | (1L << QUESTION) | (1L << AT) | (1L << CAP_A) | (1L << CAP_B) | (1L << CAP_C) | (1L << CAP_D) | (1L << CAP_E) | (1L << CAP_F) | (1L << CAP_G) | (1L << CAP_H) | (1L << CAP_I) | (1L << CAP_J) | (1L << CAP_K) | (1L << CAP_L) | (1L << CAP_M) | (1L << CAP_N) | (1L << CAP_O) | (1L << CAP_P) | (1L << CAP_Q) | (1L << CAP_R) | (1L << CAP_S) | (1L << CAP_T) | (1L << CAP_U) | (1L << CAP_V) | (1L << CAP_W) | (1L << CAP_X) | (1L << CAP_Y) | (1L << CAP_Z) | (1L << LEFT_BRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BACKSLASH - 64)) | (1L << (RIGHT_BRACE - 64)) | (1L << (CARAT - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (ACCENT - 64)) | (1L << (A - 64)) | (1L << (B - 64)) | (1L << (C - 64)) | (1L << (D - 64)) | (1L << (E - 64)) | (1L << (F - 64)) | (1L << (G - 64)) | (1L << (H - 64)) | (1L << (I - 64)) | (1L << (J - 64)) | (1L << (K - 64)) | (1L << (L - 64)) | (1L << (M - 64)) | (1L << (N - 64)) | (1L << (O - 64)) | (1L << (P - 64)) | (1L << (Q - 64)) | (1L << (R - 64)) | (1L << (S - 64)) | (1L << (T - 64)) | (1L << (U - 64)) | (1L << (V - 64)) | (1L << (W - 64)) | (1L << (X - 64)) | (1L << (Y - 64)) | (1L << (Z - 64)) | (1L << (LEFT_CURLY_BRACE - 64)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case RIGHT_CURLY_BRACE:
			case TILDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
				_la = _input.LA(1);
				if ( !(_la==RIGHT_CURLY_BRACE || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case U_00C2:
			case U_00C3:
			case U_00C4:
			case U_00C5:
			case U_00C6:
			case U_00C7:
			case U_00C8:
			case U_00C9:
			case U_00CA:
			case U_00CB:
			case U_00CC:
			case U_00CD:
			case U_00CE:
			case U_00CF:
			case U_00D0:
			case U_00D1:
			case U_00D2:
			case U_00D3:
			case U_00D4:
			case U_00D5:
			case U_00D6:
			case U_00D7:
			case U_00D8:
			case U_00D9:
			case U_00DA:
			case U_00DB:
			case U_00DC:
			case U_00DD:
			case U_00DE:
			case U_00DF:
				enterOuterAlt(_localctx, 3);
				{
				setState(704);
				utf8_2();
				}
				break;
			case U_00E0:
			case U_00E1:
			case U_00E2:
			case U_00E3:
			case U_00E4:
			case U_00E5:
			case U_00E6:
			case U_00E7:
			case U_00E8:
			case U_00E9:
			case U_00EA:
			case U_00EB:
			case U_00EC:
			case U_00ED:
			case U_00EE:
			case U_00EF:
				enterOuterAlt(_localctx, 4);
				{
				setState(705);
				utf8_3();
				}
				break;
			case U_00F0:
			case U_00F1:
			case U_00F2:
			case U_00F3:
			case U_00F4:
				enterOuterAlt(_localctx, 5);
				{
				setState(706);
				utf8_4();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnynonescapedcharContext extends ParserRuleContext {
		public SpContext sp() {
			return getRuleContext(SpContext.class,0);
		}
		public HtabContext htab() {
			return getRuleContext(HtabContext.class,0);
		}
		public CrContext cr() {
			return getRuleContext(CrContext.class,0);
		}
		public LfContext lf() {
			return getRuleContext(LfContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EclExpressionParser.SPACE, 0); }
		public TerminalNode EXCLAMATION() { return getToken(EclExpressionParser.EXCLAMATION, 0); }
		public TerminalNode POUND() { return getToken(EclExpressionParser.POUND, 0); }
		public TerminalNode DOLLAR() { return getToken(EclExpressionParser.DOLLAR, 0); }
		public TerminalNode PERCENT() { return getToken(EclExpressionParser.PERCENT, 0); }
		public TerminalNode AMPERSAND() { return getToken(EclExpressionParser.AMPERSAND, 0); }
		public TerminalNode APOSTROPHE() { return getToken(EclExpressionParser.APOSTROPHE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(EclExpressionParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(EclExpressionParser.RIGHT_PAREN, 0); }
		public TerminalNode ASTERISK() { return getToken(EclExpressionParser.ASTERISK, 0); }
		public TerminalNode PLUS() { return getToken(EclExpressionParser.PLUS, 0); }
		public TerminalNode COMMA() { return getToken(EclExpressionParser.COMMA, 0); }
		public TerminalNode DASH() { return getToken(EclExpressionParser.DASH, 0); }
		public TerminalNode PERIOD() { return getToken(EclExpressionParser.PERIOD, 0); }
		public TerminalNode SLASH() { return getToken(EclExpressionParser.SLASH, 0); }
		public TerminalNode ZERO() { return getToken(EclExpressionParser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(EclExpressionParser.ONE, 0); }
		public TerminalNode TWO() { return getToken(EclExpressionParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(EclExpressionParser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(EclExpressionParser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(EclExpressionParser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(EclExpressionParser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(EclExpressionParser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(EclExpressionParser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(EclExpressionParser.NINE, 0); }
		public TerminalNode COLON() { return getToken(EclExpressionParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(EclExpressionParser.SEMICOLON, 0); }
		public TerminalNode LESS_THAN() { return getToken(EclExpressionParser.LESS_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(EclExpressionParser.EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(EclExpressionParser.GREATER_THAN, 0); }
		public TerminalNode QUESTION() { return getToken(EclExpressionParser.QUESTION, 0); }
		public TerminalNode AT() { return getToken(EclExpressionParser.AT, 0); }
		public TerminalNode CAP_A() { return getToken(EclExpressionParser.CAP_A, 0); }
		public TerminalNode CAP_B() { return getToken(EclExpressionParser.CAP_B, 0); }
		public TerminalNode CAP_C() { return getToken(EclExpressionParser.CAP_C, 0); }
		public TerminalNode CAP_D() { return getToken(EclExpressionParser.CAP_D, 0); }
		public TerminalNode CAP_E() { return getToken(EclExpressionParser.CAP_E, 0); }
		public TerminalNode CAP_F() { return getToken(EclExpressionParser.CAP_F, 0); }
		public TerminalNode CAP_G() { return getToken(EclExpressionParser.CAP_G, 0); }
		public TerminalNode CAP_H() { return getToken(EclExpressionParser.CAP_H, 0); }
		public TerminalNode CAP_I() { return getToken(EclExpressionParser.CAP_I, 0); }
		public TerminalNode CAP_J() { return getToken(EclExpressionParser.CAP_J, 0); }
		public TerminalNode CAP_K() { return getToken(EclExpressionParser.CAP_K, 0); }
		public TerminalNode CAP_L() { return getToken(EclExpressionParser.CAP_L, 0); }
		public TerminalNode CAP_M() { return getToken(EclExpressionParser.CAP_M, 0); }
		public TerminalNode CAP_N() { return getToken(EclExpressionParser.CAP_N, 0); }
		public TerminalNode CAP_O() { return getToken(EclExpressionParser.CAP_O, 0); }
		public TerminalNode CAP_P() { return getToken(EclExpressionParser.CAP_P, 0); }
		public TerminalNode CAP_Q() { return getToken(EclExpressionParser.CAP_Q, 0); }
		public TerminalNode CAP_R() { return getToken(EclExpressionParser.CAP_R, 0); }
		public TerminalNode CAP_S() { return getToken(EclExpressionParser.CAP_S, 0); }
		public TerminalNode CAP_T() { return getToken(EclExpressionParser.CAP_T, 0); }
		public TerminalNode CAP_U() { return getToken(EclExpressionParser.CAP_U, 0); }
		public TerminalNode CAP_V() { return getToken(EclExpressionParser.CAP_V, 0); }
		public TerminalNode CAP_W() { return getToken(EclExpressionParser.CAP_W, 0); }
		public TerminalNode CAP_X() { return getToken(EclExpressionParser.CAP_X, 0); }
		public TerminalNode CAP_Y() { return getToken(EclExpressionParser.CAP_Y, 0); }
		public TerminalNode CAP_Z() { return getToken(EclExpressionParser.CAP_Z, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(EclExpressionParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(EclExpressionParser.RIGHT_BRACE, 0); }
		public TerminalNode CARAT() { return getToken(EclExpressionParser.CARAT, 0); }
		public TerminalNode UNDERSCORE() { return getToken(EclExpressionParser.UNDERSCORE, 0); }
		public TerminalNode ACCENT() { return getToken(EclExpressionParser.ACCENT, 0); }
		public TerminalNode A() { return getToken(EclExpressionParser.A, 0); }
		public TerminalNode B() { return getToken(EclExpressionParser.B, 0); }
		public TerminalNode C() { return getToken(EclExpressionParser.C, 0); }
		public TerminalNode D() { return getToken(EclExpressionParser.D, 0); }
		public TerminalNode E() { return getToken(EclExpressionParser.E, 0); }
		public TerminalNode F() { return getToken(EclExpressionParser.F, 0); }
		public TerminalNode G() { return getToken(EclExpressionParser.G, 0); }
		public TerminalNode H() { return getToken(EclExpressionParser.H, 0); }
		public TerminalNode I() { return getToken(EclExpressionParser.I, 0); }
		public TerminalNode J() { return getToken(EclExpressionParser.J, 0); }
		public TerminalNode K() { return getToken(EclExpressionParser.K, 0); }
		public TerminalNode L() { return getToken(EclExpressionParser.L, 0); }
		public TerminalNode M() { return getToken(EclExpressionParser.M, 0); }
		public TerminalNode N() { return getToken(EclExpressionParser.N, 0); }
		public TerminalNode O() { return getToken(EclExpressionParser.O, 0); }
		public TerminalNode P() { return getToken(EclExpressionParser.P, 0); }
		public TerminalNode Q() { return getToken(EclExpressionParser.Q, 0); }
		public TerminalNode R() { return getToken(EclExpressionParser.R, 0); }
		public TerminalNode S() { return getToken(EclExpressionParser.S, 0); }
		public TerminalNode T() { return getToken(EclExpressionParser.T, 0); }
		public TerminalNode U() { return getToken(EclExpressionParser.U, 0); }
		public TerminalNode V() { return getToken(EclExpressionParser.V, 0); }
		public TerminalNode W() { return getToken(EclExpressionParser.W, 0); }
		public TerminalNode X() { return getToken(EclExpressionParser.X, 0); }
		public TerminalNode Y() { return getToken(EclExpressionParser.Y, 0); }
		public TerminalNode Z() { return getToken(EclExpressionParser.Z, 0); }
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(EclExpressionParser.LEFT_CURLY_BRACE, 0); }
		public TerminalNode PIPE() { return getToken(EclExpressionParser.PIPE, 0); }
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(EclExpressionParser.RIGHT_CURLY_BRACE, 0); }
		public TerminalNode TILDE() { return getToken(EclExpressionParser.TILDE, 0); }
		public Utf8_2Context utf8_2() {
			return getRuleContext(Utf8_2Context.class,0);
		}
		public Utf8_3Context utf8_3() {
			return getRuleContext(Utf8_3Context.class,0);
		}
		public Utf8_4Context utf8_4() {
			return getRuleContext(Utf8_4Context.class,0);
		}
		public AnynonescapedcharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anynonescapedchar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterAnynonescapedchar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitAnynonescapedchar(this);
		}
	}

	public final AnynonescapedcharContext anynonescapedchar() throws RecognitionException {
		AnynonescapedcharContext _localctx = new AnynonescapedcharContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_anynonescapedchar);
		int _la;
		try {
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				sp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				htab();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(711);
				cr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(712);
				lf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(713);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==EXCLAMATION) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(714);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POUND) | (1L << DOLLAR) | (1L << PERCENT) | (1L << AMPERSAND) | (1L << APOSTROPHE) | (1L << LEFT_PAREN) | (1L << RIGHT_PAREN) | (1L << ASTERISK) | (1L << PLUS) | (1L << COMMA) | (1L << DASH) | (1L << PERIOD) | (1L << SLASH) | (1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << COLON) | (1L << SEMICOLON) | (1L << LESS_THAN) | (1L << EQUALS) | (1L << GREATER_THAN) | (1L << QUESTION) | (1L << AT) | (1L << CAP_A) | (1L << CAP_B) | (1L << CAP_C) | (1L << CAP_D) | (1L << CAP_E) | (1L << CAP_F) | (1L << CAP_G) | (1L << CAP_H) | (1L << CAP_I) | (1L << CAP_J) | (1L << CAP_K) | (1L << CAP_L) | (1L << CAP_M) | (1L << CAP_N) | (1L << CAP_O) | (1L << CAP_P) | (1L << CAP_Q) | (1L << CAP_R) | (1L << CAP_S) | (1L << CAP_T) | (1L << CAP_U) | (1L << CAP_V) | (1L << CAP_W) | (1L << CAP_X) | (1L << CAP_Y) | (1L << CAP_Z) | (1L << LEFT_BRACE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(715);
				_la = _input.LA(1);
				if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (RIGHT_BRACE - 65)) | (1L << (CARAT - 65)) | (1L << (UNDERSCORE - 65)) | (1L << (ACCENT - 65)) | (1L << (A - 65)) | (1L << (B - 65)) | (1L << (C - 65)) | (1L << (D - 65)) | (1L << (E - 65)) | (1L << (F - 65)) | (1L << (G - 65)) | (1L << (H - 65)) | (1L << (I - 65)) | (1L << (J - 65)) | (1L << (K - 65)) | (1L << (L - 65)) | (1L << (M - 65)) | (1L << (N - 65)) | (1L << (O - 65)) | (1L << (P - 65)) | (1L << (Q - 65)) | (1L << (R - 65)) | (1L << (S - 65)) | (1L << (T - 65)) | (1L << (U - 65)) | (1L << (V - 65)) | (1L << (W - 65)) | (1L << (X - 65)) | (1L << (Y - 65)) | (1L << (Z - 65)) | (1L << (LEFT_CURLY_BRACE - 65)) | (1L << (PIPE - 65)) | (1L << (RIGHT_CURLY_BRACE - 65)) | (1L << (TILDE - 65)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(716);
				utf8_2();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(717);
				utf8_3();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(718);
				utf8_4();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscapedcharContext extends ParserRuleContext {
		public List<BsContext> bs() {
			return getRuleContexts(BsContext.class);
		}
		public BsContext bs(int i) {
			return getRuleContext(BsContext.class,i);
		}
		public QmContext qm() {
			return getRuleContext(QmContext.class,0);
		}
		public EscapedcharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escapedchar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterEscapedchar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitEscapedchar(this);
		}
	}

	public final EscapedcharContext escapedchar() throws RecognitionException {
		EscapedcharContext _localctx = new EscapedcharContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_escapedchar);
		try {
			setState(727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(721);
				bs();
				setState(722);
				qm();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(724);
				bs();
				setState(725);
				bs();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Utf8_2Context extends ParserRuleContext {
		public Utf8_tailContext utf8_tail() {
			return getRuleContext(Utf8_tailContext.class,0);
		}
		public TerminalNode U_00C2() { return getToken(EclExpressionParser.U_00C2, 0); }
		public TerminalNode U_00C3() { return getToken(EclExpressionParser.U_00C3, 0); }
		public TerminalNode U_00C4() { return getToken(EclExpressionParser.U_00C4, 0); }
		public TerminalNode U_00C5() { return getToken(EclExpressionParser.U_00C5, 0); }
		public TerminalNode U_00C6() { return getToken(EclExpressionParser.U_00C6, 0); }
		public TerminalNode U_00C7() { return getToken(EclExpressionParser.U_00C7, 0); }
		public TerminalNode U_00C8() { return getToken(EclExpressionParser.U_00C8, 0); }
		public TerminalNode U_00C9() { return getToken(EclExpressionParser.U_00C9, 0); }
		public TerminalNode U_00CA() { return getToken(EclExpressionParser.U_00CA, 0); }
		public TerminalNode U_00CB() { return getToken(EclExpressionParser.U_00CB, 0); }
		public TerminalNode U_00CC() { return getToken(EclExpressionParser.U_00CC, 0); }
		public TerminalNode U_00CD() { return getToken(EclExpressionParser.U_00CD, 0); }
		public TerminalNode U_00CE() { return getToken(EclExpressionParser.U_00CE, 0); }
		public TerminalNode U_00CF() { return getToken(EclExpressionParser.U_00CF, 0); }
		public TerminalNode U_00D0() { return getToken(EclExpressionParser.U_00D0, 0); }
		public TerminalNode U_00D1() { return getToken(EclExpressionParser.U_00D1, 0); }
		public TerminalNode U_00D2() { return getToken(EclExpressionParser.U_00D2, 0); }
		public TerminalNode U_00D3() { return getToken(EclExpressionParser.U_00D3, 0); }
		public TerminalNode U_00D4() { return getToken(EclExpressionParser.U_00D4, 0); }
		public TerminalNode U_00D5() { return getToken(EclExpressionParser.U_00D5, 0); }
		public TerminalNode U_00D6() { return getToken(EclExpressionParser.U_00D6, 0); }
		public TerminalNode U_00D7() { return getToken(EclExpressionParser.U_00D7, 0); }
		public TerminalNode U_00D8() { return getToken(EclExpressionParser.U_00D8, 0); }
		public TerminalNode U_00D9() { return getToken(EclExpressionParser.U_00D9, 0); }
		public TerminalNode U_00DA() { return getToken(EclExpressionParser.U_00DA, 0); }
		public TerminalNode U_00DB() { return getToken(EclExpressionParser.U_00DB, 0); }
		public TerminalNode U_00DC() { return getToken(EclExpressionParser.U_00DC, 0); }
		public TerminalNode U_00DD() { return getToken(EclExpressionParser.U_00DD, 0); }
		public TerminalNode U_00DE() { return getToken(EclExpressionParser.U_00DE, 0); }
		public TerminalNode U_00DF() { return getToken(EclExpressionParser.U_00DF, 0); }
		public Utf8_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utf8_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterUtf8_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitUtf8_2(this);
		}
	}

	public final Utf8_2Context utf8_2() throws RecognitionException {
		Utf8_2Context _localctx = new Utf8_2Context(_ctx, getState());
		enterRule(_localctx, 142, RULE_utf8_2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			_la = _input.LA(1);
			if ( !(((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & ((1L << (U_00C2 - 163)) | (1L << (U_00C3 - 163)) | (1L << (U_00C4 - 163)) | (1L << (U_00C5 - 163)) | (1L << (U_00C6 - 163)) | (1L << (U_00C7 - 163)) | (1L << (U_00C8 - 163)) | (1L << (U_00C9 - 163)) | (1L << (U_00CA - 163)) | (1L << (U_00CB - 163)) | (1L << (U_00CC - 163)) | (1L << (U_00CD - 163)) | (1L << (U_00CE - 163)) | (1L << (U_00CF - 163)) | (1L << (U_00D0 - 163)) | (1L << (U_00D1 - 163)) | (1L << (U_00D2 - 163)) | (1L << (U_00D3 - 163)) | (1L << (U_00D4 - 163)) | (1L << (U_00D5 - 163)) | (1L << (U_00D6 - 163)) | (1L << (U_00D7 - 163)) | (1L << (U_00D8 - 163)) | (1L << (U_00D9 - 163)) | (1L << (U_00DA - 163)) | (1L << (U_00DB - 163)) | (1L << (U_00DC - 163)) | (1L << (U_00DD - 163)) | (1L << (U_00DE - 163)) | (1L << (U_00DF - 163)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(730);
			utf8_tail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Utf8_3Context extends ParserRuleContext {
		public TerminalNode U_00E0() { return getToken(EclExpressionParser.U_00E0, 0); }
		public List<Utf8_tailContext> utf8_tail() {
			return getRuleContexts(Utf8_tailContext.class);
		}
		public Utf8_tailContext utf8_tail(int i) {
			return getRuleContext(Utf8_tailContext.class,i);
		}
		public TerminalNode U_00A0() { return getToken(EclExpressionParser.U_00A0, 0); }
		public TerminalNode U_00A1() { return getToken(EclExpressionParser.U_00A1, 0); }
		public TerminalNode U_00A2() { return getToken(EclExpressionParser.U_00A2, 0); }
		public TerminalNode U_00A3() { return getToken(EclExpressionParser.U_00A3, 0); }
		public TerminalNode U_00A4() { return getToken(EclExpressionParser.U_00A4, 0); }
		public TerminalNode U_00A5() { return getToken(EclExpressionParser.U_00A5, 0); }
		public TerminalNode U_00A6() { return getToken(EclExpressionParser.U_00A6, 0); }
		public TerminalNode U_00A7() { return getToken(EclExpressionParser.U_00A7, 0); }
		public TerminalNode U_00A8() { return getToken(EclExpressionParser.U_00A8, 0); }
		public TerminalNode U_00A9() { return getToken(EclExpressionParser.U_00A9, 0); }
		public TerminalNode U_00AA() { return getToken(EclExpressionParser.U_00AA, 0); }
		public TerminalNode U_00AB() { return getToken(EclExpressionParser.U_00AB, 0); }
		public TerminalNode U_00AC() { return getToken(EclExpressionParser.U_00AC, 0); }
		public TerminalNode U_00AD() { return getToken(EclExpressionParser.U_00AD, 0); }
		public TerminalNode U_00AE() { return getToken(EclExpressionParser.U_00AE, 0); }
		public TerminalNode U_00AF() { return getToken(EclExpressionParser.U_00AF, 0); }
		public TerminalNode U_00B0() { return getToken(EclExpressionParser.U_00B0, 0); }
		public TerminalNode U_00B1() { return getToken(EclExpressionParser.U_00B1, 0); }
		public TerminalNode U_00B2() { return getToken(EclExpressionParser.U_00B2, 0); }
		public TerminalNode U_00B3() { return getToken(EclExpressionParser.U_00B3, 0); }
		public TerminalNode U_00B4() { return getToken(EclExpressionParser.U_00B4, 0); }
		public TerminalNode U_00B5() { return getToken(EclExpressionParser.U_00B5, 0); }
		public TerminalNode U_00B6() { return getToken(EclExpressionParser.U_00B6, 0); }
		public TerminalNode U_00B7() { return getToken(EclExpressionParser.U_00B7, 0); }
		public TerminalNode U_00B8() { return getToken(EclExpressionParser.U_00B8, 0); }
		public TerminalNode U_00B9() { return getToken(EclExpressionParser.U_00B9, 0); }
		public TerminalNode U_00BA() { return getToken(EclExpressionParser.U_00BA, 0); }
		public TerminalNode U_00BB() { return getToken(EclExpressionParser.U_00BB, 0); }
		public TerminalNode U_00BC() { return getToken(EclExpressionParser.U_00BC, 0); }
		public TerminalNode U_00BD() { return getToken(EclExpressionParser.U_00BD, 0); }
		public TerminalNode U_00BE() { return getToken(EclExpressionParser.U_00BE, 0); }
		public TerminalNode U_00BF() { return getToken(EclExpressionParser.U_00BF, 0); }
		public TerminalNode U_00E1() { return getToken(EclExpressionParser.U_00E1, 0); }
		public TerminalNode U_00E2() { return getToken(EclExpressionParser.U_00E2, 0); }
		public TerminalNode U_00E3() { return getToken(EclExpressionParser.U_00E3, 0); }
		public TerminalNode U_00E4() { return getToken(EclExpressionParser.U_00E4, 0); }
		public TerminalNode U_00E5() { return getToken(EclExpressionParser.U_00E5, 0); }
		public TerminalNode U_00E6() { return getToken(EclExpressionParser.U_00E6, 0); }
		public TerminalNode U_00E7() { return getToken(EclExpressionParser.U_00E7, 0); }
		public TerminalNode U_00E8() { return getToken(EclExpressionParser.U_00E8, 0); }
		public TerminalNode U_00E9() { return getToken(EclExpressionParser.U_00E9, 0); }
		public TerminalNode U_00EA() { return getToken(EclExpressionParser.U_00EA, 0); }
		public TerminalNode U_00EB() { return getToken(EclExpressionParser.U_00EB, 0); }
		public TerminalNode U_00EC() { return getToken(EclExpressionParser.U_00EC, 0); }
		public TerminalNode U_00ED() { return getToken(EclExpressionParser.U_00ED, 0); }
		public TerminalNode U_0080() { return getToken(EclExpressionParser.U_0080, 0); }
		public TerminalNode U_0081() { return getToken(EclExpressionParser.U_0081, 0); }
		public TerminalNode U_0082() { return getToken(EclExpressionParser.U_0082, 0); }
		public TerminalNode U_0083() { return getToken(EclExpressionParser.U_0083, 0); }
		public TerminalNode U_0084() { return getToken(EclExpressionParser.U_0084, 0); }
		public TerminalNode U_0085() { return getToken(EclExpressionParser.U_0085, 0); }
		public TerminalNode U_0086() { return getToken(EclExpressionParser.U_0086, 0); }
		public TerminalNode U_0087() { return getToken(EclExpressionParser.U_0087, 0); }
		public TerminalNode U_0088() { return getToken(EclExpressionParser.U_0088, 0); }
		public TerminalNode U_0089() { return getToken(EclExpressionParser.U_0089, 0); }
		public TerminalNode U_008A() { return getToken(EclExpressionParser.U_008A, 0); }
		public TerminalNode U_008B() { return getToken(EclExpressionParser.U_008B, 0); }
		public TerminalNode U_008C() { return getToken(EclExpressionParser.U_008C, 0); }
		public TerminalNode U_008D() { return getToken(EclExpressionParser.U_008D, 0); }
		public TerminalNode U_008E() { return getToken(EclExpressionParser.U_008E, 0); }
		public TerminalNode U_008F() { return getToken(EclExpressionParser.U_008F, 0); }
		public TerminalNode U_0090() { return getToken(EclExpressionParser.U_0090, 0); }
		public TerminalNode U_0091() { return getToken(EclExpressionParser.U_0091, 0); }
		public TerminalNode U_0092() { return getToken(EclExpressionParser.U_0092, 0); }
		public TerminalNode U_0093() { return getToken(EclExpressionParser.U_0093, 0); }
		public TerminalNode U_0094() { return getToken(EclExpressionParser.U_0094, 0); }
		public TerminalNode U_0095() { return getToken(EclExpressionParser.U_0095, 0); }
		public TerminalNode U_0096() { return getToken(EclExpressionParser.U_0096, 0); }
		public TerminalNode U_0097() { return getToken(EclExpressionParser.U_0097, 0); }
		public TerminalNode U_0098() { return getToken(EclExpressionParser.U_0098, 0); }
		public TerminalNode U_0099() { return getToken(EclExpressionParser.U_0099, 0); }
		public TerminalNode U_009A() { return getToken(EclExpressionParser.U_009A, 0); }
		public TerminalNode U_009B() { return getToken(EclExpressionParser.U_009B, 0); }
		public TerminalNode U_009C() { return getToken(EclExpressionParser.U_009C, 0); }
		public TerminalNode U_009D() { return getToken(EclExpressionParser.U_009D, 0); }
		public TerminalNode U_009E() { return getToken(EclExpressionParser.U_009E, 0); }
		public TerminalNode U_009F() { return getToken(EclExpressionParser.U_009F, 0); }
		public TerminalNode U_00EE() { return getToken(EclExpressionParser.U_00EE, 0); }
		public TerminalNode U_00EF() { return getToken(EclExpressionParser.U_00EF, 0); }
		public Utf8_3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utf8_3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterUtf8_3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitUtf8_3(this);
		}
	}

	public final Utf8_3Context utf8_3() throws RecognitionException {
		Utf8_3Context _localctx = new Utf8_3Context(_ctx, getState());
		enterRule(_localctx, 144, RULE_utf8_3);
		int _la;
		try {
			setState(746);
			switch (_input.LA(1)) {
			case U_00E0:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(732);
				match(U_00E0);
				setState(733);
				_la = _input.LA(1);
				if ( !(((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (U_00A0 - 131)) | (1L << (U_00A1 - 131)) | (1L << (U_00A2 - 131)) | (1L << (U_00A3 - 131)) | (1L << (U_00A4 - 131)) | (1L << (U_00A5 - 131)) | (1L << (U_00A6 - 131)) | (1L << (U_00A7 - 131)) | (1L << (U_00A8 - 131)) | (1L << (U_00A9 - 131)) | (1L << (U_00AA - 131)) | (1L << (U_00AB - 131)) | (1L << (U_00AC - 131)) | (1L << (U_00AD - 131)) | (1L << (U_00AE - 131)) | (1L << (U_00AF - 131)) | (1L << (U_00B0 - 131)) | (1L << (U_00B1 - 131)) | (1L << (U_00B2 - 131)) | (1L << (U_00B3 - 131)) | (1L << (U_00B4 - 131)) | (1L << (U_00B5 - 131)) | (1L << (U_00B6 - 131)) | (1L << (U_00B7 - 131)) | (1L << (U_00B8 - 131)) | (1L << (U_00B9 - 131)) | (1L << (U_00BA - 131)) | (1L << (U_00BB - 131)) | (1L << (U_00BC - 131)) | (1L << (U_00BD - 131)) | (1L << (U_00BE - 131)) | (1L << (U_00BF - 131)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(734);
				utf8_tail();
				}
				}
				break;
			case U_00E1:
			case U_00E2:
			case U_00E3:
			case U_00E4:
			case U_00E5:
			case U_00E6:
			case U_00E7:
			case U_00E8:
			case U_00E9:
			case U_00EA:
			case U_00EB:
			case U_00EC:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(735);
				_la = _input.LA(1);
				if ( !(((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (U_00E1 - 194)) | (1L << (U_00E2 - 194)) | (1L << (U_00E3 - 194)) | (1L << (U_00E4 - 194)) | (1L << (U_00E5 - 194)) | (1L << (U_00E6 - 194)) | (1L << (U_00E7 - 194)) | (1L << (U_00E8 - 194)) | (1L << (U_00E9 - 194)) | (1L << (U_00EA - 194)) | (1L << (U_00EB - 194)) | (1L << (U_00EC - 194)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				{
				setState(736);
				utf8_tail();
				}
				{
				setState(737);
				utf8_tail();
				}
				}
				}
				break;
			case U_00ED:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(739);
				match(U_00ED);
				setState(740);
				_la = _input.LA(1);
				if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (U_0080 - 99)) | (1L << (U_0081 - 99)) | (1L << (U_0082 - 99)) | (1L << (U_0083 - 99)) | (1L << (U_0084 - 99)) | (1L << (U_0085 - 99)) | (1L << (U_0086 - 99)) | (1L << (U_0087 - 99)) | (1L << (U_0088 - 99)) | (1L << (U_0089 - 99)) | (1L << (U_008A - 99)) | (1L << (U_008B - 99)) | (1L << (U_008C - 99)) | (1L << (U_008D - 99)) | (1L << (U_008E - 99)) | (1L << (U_008F - 99)) | (1L << (U_0090 - 99)) | (1L << (U_0091 - 99)) | (1L << (U_0092 - 99)) | (1L << (U_0093 - 99)) | (1L << (U_0094 - 99)) | (1L << (U_0095 - 99)) | (1L << (U_0096 - 99)) | (1L << (U_0097 - 99)) | (1L << (U_0098 - 99)) | (1L << (U_0099 - 99)) | (1L << (U_009A - 99)) | (1L << (U_009B - 99)) | (1L << (U_009C - 99)) | (1L << (U_009D - 99)) | (1L << (U_009E - 99)) | (1L << (U_009F - 99)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(741);
				utf8_tail();
				}
				}
				break;
			case U_00EE:
			case U_00EF:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(742);
				_la = _input.LA(1);
				if ( !(_la==U_00EE || _la==U_00EF) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				{
				setState(743);
				utf8_tail();
				}
				{
				setState(744);
				utf8_tail();
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Utf8_4Context extends ParserRuleContext {
		public TerminalNode U_00F0() { return getToken(EclExpressionParser.U_00F0, 0); }
		public TerminalNode U_0090() { return getToken(EclExpressionParser.U_0090, 0); }
		public TerminalNode U_0091() { return getToken(EclExpressionParser.U_0091, 0); }
		public TerminalNode U_0092() { return getToken(EclExpressionParser.U_0092, 0); }
		public TerminalNode U_0093() { return getToken(EclExpressionParser.U_0093, 0); }
		public TerminalNode U_0094() { return getToken(EclExpressionParser.U_0094, 0); }
		public TerminalNode U_0095() { return getToken(EclExpressionParser.U_0095, 0); }
		public TerminalNode U_0096() { return getToken(EclExpressionParser.U_0096, 0); }
		public TerminalNode U_0097() { return getToken(EclExpressionParser.U_0097, 0); }
		public TerminalNode U_0098() { return getToken(EclExpressionParser.U_0098, 0); }
		public TerminalNode U_0099() { return getToken(EclExpressionParser.U_0099, 0); }
		public TerminalNode U_009A() { return getToken(EclExpressionParser.U_009A, 0); }
		public TerminalNode U_009B() { return getToken(EclExpressionParser.U_009B, 0); }
		public TerminalNode U_009C() { return getToken(EclExpressionParser.U_009C, 0); }
		public TerminalNode U_009D() { return getToken(EclExpressionParser.U_009D, 0); }
		public TerminalNode U_009E() { return getToken(EclExpressionParser.U_009E, 0); }
		public TerminalNode U_009F() { return getToken(EclExpressionParser.U_009F, 0); }
		public TerminalNode U_00A0() { return getToken(EclExpressionParser.U_00A0, 0); }
		public TerminalNode U_00A1() { return getToken(EclExpressionParser.U_00A1, 0); }
		public TerminalNode U_00A2() { return getToken(EclExpressionParser.U_00A2, 0); }
		public TerminalNode U_00A3() { return getToken(EclExpressionParser.U_00A3, 0); }
		public TerminalNode U_00A4() { return getToken(EclExpressionParser.U_00A4, 0); }
		public TerminalNode U_00A5() { return getToken(EclExpressionParser.U_00A5, 0); }
		public TerminalNode U_00A6() { return getToken(EclExpressionParser.U_00A6, 0); }
		public TerminalNode U_00A7() { return getToken(EclExpressionParser.U_00A7, 0); }
		public TerminalNode U_00A8() { return getToken(EclExpressionParser.U_00A8, 0); }
		public TerminalNode U_00A9() { return getToken(EclExpressionParser.U_00A9, 0); }
		public TerminalNode U_00AA() { return getToken(EclExpressionParser.U_00AA, 0); }
		public TerminalNode U_00AB() { return getToken(EclExpressionParser.U_00AB, 0); }
		public TerminalNode U_00AC() { return getToken(EclExpressionParser.U_00AC, 0); }
		public TerminalNode U_00AD() { return getToken(EclExpressionParser.U_00AD, 0); }
		public TerminalNode U_00AE() { return getToken(EclExpressionParser.U_00AE, 0); }
		public TerminalNode U_00AF() { return getToken(EclExpressionParser.U_00AF, 0); }
		public TerminalNode U_00B0() { return getToken(EclExpressionParser.U_00B0, 0); }
		public TerminalNode U_00B1() { return getToken(EclExpressionParser.U_00B1, 0); }
		public TerminalNode U_00B2() { return getToken(EclExpressionParser.U_00B2, 0); }
		public TerminalNode U_00B3() { return getToken(EclExpressionParser.U_00B3, 0); }
		public TerminalNode U_00B4() { return getToken(EclExpressionParser.U_00B4, 0); }
		public TerminalNode U_00B5() { return getToken(EclExpressionParser.U_00B5, 0); }
		public TerminalNode U_00B6() { return getToken(EclExpressionParser.U_00B6, 0); }
		public TerminalNode U_00B7() { return getToken(EclExpressionParser.U_00B7, 0); }
		public TerminalNode U_00B8() { return getToken(EclExpressionParser.U_00B8, 0); }
		public TerminalNode U_00B9() { return getToken(EclExpressionParser.U_00B9, 0); }
		public TerminalNode U_00BA() { return getToken(EclExpressionParser.U_00BA, 0); }
		public TerminalNode U_00BB() { return getToken(EclExpressionParser.U_00BB, 0); }
		public TerminalNode U_00BC() { return getToken(EclExpressionParser.U_00BC, 0); }
		public TerminalNode U_00BD() { return getToken(EclExpressionParser.U_00BD, 0); }
		public TerminalNode U_00BE() { return getToken(EclExpressionParser.U_00BE, 0); }
		public TerminalNode U_00BF() { return getToken(EclExpressionParser.U_00BF, 0); }
		public List<Utf8_tailContext> utf8_tail() {
			return getRuleContexts(Utf8_tailContext.class);
		}
		public Utf8_tailContext utf8_tail(int i) {
			return getRuleContext(Utf8_tailContext.class,i);
		}
		public TerminalNode U_00F1() { return getToken(EclExpressionParser.U_00F1, 0); }
		public TerminalNode U_00F2() { return getToken(EclExpressionParser.U_00F2, 0); }
		public TerminalNode U_00F3() { return getToken(EclExpressionParser.U_00F3, 0); }
		public TerminalNode U_00F4() { return getToken(EclExpressionParser.U_00F4, 0); }
		public TerminalNode U_0080() { return getToken(EclExpressionParser.U_0080, 0); }
		public TerminalNode U_0081() { return getToken(EclExpressionParser.U_0081, 0); }
		public TerminalNode U_0082() { return getToken(EclExpressionParser.U_0082, 0); }
		public TerminalNode U_0083() { return getToken(EclExpressionParser.U_0083, 0); }
		public TerminalNode U_0084() { return getToken(EclExpressionParser.U_0084, 0); }
		public TerminalNode U_0085() { return getToken(EclExpressionParser.U_0085, 0); }
		public TerminalNode U_0086() { return getToken(EclExpressionParser.U_0086, 0); }
		public TerminalNode U_0087() { return getToken(EclExpressionParser.U_0087, 0); }
		public TerminalNode U_0088() { return getToken(EclExpressionParser.U_0088, 0); }
		public TerminalNode U_0089() { return getToken(EclExpressionParser.U_0089, 0); }
		public TerminalNode U_008A() { return getToken(EclExpressionParser.U_008A, 0); }
		public TerminalNode U_008B() { return getToken(EclExpressionParser.U_008B, 0); }
		public TerminalNode U_008C() { return getToken(EclExpressionParser.U_008C, 0); }
		public TerminalNode U_008D() { return getToken(EclExpressionParser.U_008D, 0); }
		public TerminalNode U_008E() { return getToken(EclExpressionParser.U_008E, 0); }
		public TerminalNode U_008F() { return getToken(EclExpressionParser.U_008F, 0); }
		public Utf8_4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utf8_4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterUtf8_4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitUtf8_4(this);
		}
	}

	public final Utf8_4Context utf8_4() throws RecognitionException {
		Utf8_4Context _localctx = new Utf8_4Context(_ctx, getState());
		enterRule(_localctx, 146, RULE_utf8_4);
		int _la;
		try {
			setState(763);
			switch (_input.LA(1)) {
			case U_00F0:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(748);
				match(U_00F0);
				setState(749);
				_la = _input.LA(1);
				if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (U_0090 - 115)) | (1L << (U_0091 - 115)) | (1L << (U_0092 - 115)) | (1L << (U_0093 - 115)) | (1L << (U_0094 - 115)) | (1L << (U_0095 - 115)) | (1L << (U_0096 - 115)) | (1L << (U_0097 - 115)) | (1L << (U_0098 - 115)) | (1L << (U_0099 - 115)) | (1L << (U_009A - 115)) | (1L << (U_009B - 115)) | (1L << (U_009C - 115)) | (1L << (U_009D - 115)) | (1L << (U_009E - 115)) | (1L << (U_009F - 115)) | (1L << (U_00A0 - 115)) | (1L << (U_00A1 - 115)) | (1L << (U_00A2 - 115)) | (1L << (U_00A3 - 115)) | (1L << (U_00A4 - 115)) | (1L << (U_00A5 - 115)) | (1L << (U_00A6 - 115)) | (1L << (U_00A7 - 115)) | (1L << (U_00A8 - 115)) | (1L << (U_00A9 - 115)) | (1L << (U_00AA - 115)) | (1L << (U_00AB - 115)) | (1L << (U_00AC - 115)) | (1L << (U_00AD - 115)) | (1L << (U_00AE - 115)) | (1L << (U_00AF - 115)) | (1L << (U_00B0 - 115)) | (1L << (U_00B1 - 115)) | (1L << (U_00B2 - 115)) | (1L << (U_00B3 - 115)) | (1L << (U_00B4 - 115)) | (1L << (U_00B5 - 115)) | (1L << (U_00B6 - 115)) | (1L << (U_00B7 - 115)) | (1L << (U_00B8 - 115)) | (1L << (U_00B9 - 115)) | (1L << (U_00BA - 115)) | (1L << (U_00BB - 115)) | (1L << (U_00BC - 115)) | (1L << (U_00BD - 115)) | (1L << (U_00BE - 115)) | (1L << (U_00BF - 115)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				{
				setState(750);
				utf8_tail();
				}
				{
				setState(751);
				utf8_tail();
				}
				}
				}
				break;
			case U_00F1:
			case U_00F2:
			case U_00F3:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(753);
				_la = _input.LA(1);
				if ( !(((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & ((1L << (U_00F1 - 210)) | (1L << (U_00F2 - 210)) | (1L << (U_00F3 - 210)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				{
				setState(754);
				utf8_tail();
				}
				{
				setState(755);
				utf8_tail();
				}
				{
				setState(756);
				utf8_tail();
				}
				}
				}
				break;
			case U_00F4:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(758);
				match(U_00F4);
				setState(759);
				_la = _input.LA(1);
				if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (U_0080 - 99)) | (1L << (U_0081 - 99)) | (1L << (U_0082 - 99)) | (1L << (U_0083 - 99)) | (1L << (U_0084 - 99)) | (1L << (U_0085 - 99)) | (1L << (U_0086 - 99)) | (1L << (U_0087 - 99)) | (1L << (U_0088 - 99)) | (1L << (U_0089 - 99)) | (1L << (U_008A - 99)) | (1L << (U_008B - 99)) | (1L << (U_008C - 99)) | (1L << (U_008D - 99)) | (1L << (U_008E - 99)) | (1L << (U_008F - 99)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				{
				setState(760);
				utf8_tail();
				}
				{
				setState(761);
				utf8_tail();
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Utf8_tailContext extends ParserRuleContext {
		public TerminalNode U_0080() { return getToken(EclExpressionParser.U_0080, 0); }
		public TerminalNode U_0081() { return getToken(EclExpressionParser.U_0081, 0); }
		public TerminalNode U_0082() { return getToken(EclExpressionParser.U_0082, 0); }
		public TerminalNode U_0083() { return getToken(EclExpressionParser.U_0083, 0); }
		public TerminalNode U_0084() { return getToken(EclExpressionParser.U_0084, 0); }
		public TerminalNode U_0085() { return getToken(EclExpressionParser.U_0085, 0); }
		public TerminalNode U_0086() { return getToken(EclExpressionParser.U_0086, 0); }
		public TerminalNode U_0087() { return getToken(EclExpressionParser.U_0087, 0); }
		public TerminalNode U_0088() { return getToken(EclExpressionParser.U_0088, 0); }
		public TerminalNode U_0089() { return getToken(EclExpressionParser.U_0089, 0); }
		public TerminalNode U_008A() { return getToken(EclExpressionParser.U_008A, 0); }
		public TerminalNode U_008B() { return getToken(EclExpressionParser.U_008B, 0); }
		public TerminalNode U_008C() { return getToken(EclExpressionParser.U_008C, 0); }
		public TerminalNode U_008D() { return getToken(EclExpressionParser.U_008D, 0); }
		public TerminalNode U_008E() { return getToken(EclExpressionParser.U_008E, 0); }
		public TerminalNode U_008F() { return getToken(EclExpressionParser.U_008F, 0); }
		public TerminalNode U_0090() { return getToken(EclExpressionParser.U_0090, 0); }
		public TerminalNode U_0091() { return getToken(EclExpressionParser.U_0091, 0); }
		public TerminalNode U_0092() { return getToken(EclExpressionParser.U_0092, 0); }
		public TerminalNode U_0093() { return getToken(EclExpressionParser.U_0093, 0); }
		public TerminalNode U_0094() { return getToken(EclExpressionParser.U_0094, 0); }
		public TerminalNode U_0095() { return getToken(EclExpressionParser.U_0095, 0); }
		public TerminalNode U_0096() { return getToken(EclExpressionParser.U_0096, 0); }
		public TerminalNode U_0097() { return getToken(EclExpressionParser.U_0097, 0); }
		public TerminalNode U_0098() { return getToken(EclExpressionParser.U_0098, 0); }
		public TerminalNode U_0099() { return getToken(EclExpressionParser.U_0099, 0); }
		public TerminalNode U_009A() { return getToken(EclExpressionParser.U_009A, 0); }
		public TerminalNode U_009B() { return getToken(EclExpressionParser.U_009B, 0); }
		public TerminalNode U_009C() { return getToken(EclExpressionParser.U_009C, 0); }
		public TerminalNode U_009D() { return getToken(EclExpressionParser.U_009D, 0); }
		public TerminalNode U_009E() { return getToken(EclExpressionParser.U_009E, 0); }
		public TerminalNode U_009F() { return getToken(EclExpressionParser.U_009F, 0); }
		public TerminalNode U_00A0() { return getToken(EclExpressionParser.U_00A0, 0); }
		public TerminalNode U_00A1() { return getToken(EclExpressionParser.U_00A1, 0); }
		public TerminalNode U_00A2() { return getToken(EclExpressionParser.U_00A2, 0); }
		public TerminalNode U_00A3() { return getToken(EclExpressionParser.U_00A3, 0); }
		public TerminalNode U_00A4() { return getToken(EclExpressionParser.U_00A4, 0); }
		public TerminalNode U_00A5() { return getToken(EclExpressionParser.U_00A5, 0); }
		public TerminalNode U_00A6() { return getToken(EclExpressionParser.U_00A6, 0); }
		public TerminalNode U_00A7() { return getToken(EclExpressionParser.U_00A7, 0); }
		public TerminalNode U_00A8() { return getToken(EclExpressionParser.U_00A8, 0); }
		public TerminalNode U_00A9() { return getToken(EclExpressionParser.U_00A9, 0); }
		public TerminalNode U_00AA() { return getToken(EclExpressionParser.U_00AA, 0); }
		public TerminalNode U_00AB() { return getToken(EclExpressionParser.U_00AB, 0); }
		public TerminalNode U_00AC() { return getToken(EclExpressionParser.U_00AC, 0); }
		public TerminalNode U_00AD() { return getToken(EclExpressionParser.U_00AD, 0); }
		public TerminalNode U_00AE() { return getToken(EclExpressionParser.U_00AE, 0); }
		public TerminalNode U_00AF() { return getToken(EclExpressionParser.U_00AF, 0); }
		public TerminalNode U_00B0() { return getToken(EclExpressionParser.U_00B0, 0); }
		public TerminalNode U_00B1() { return getToken(EclExpressionParser.U_00B1, 0); }
		public TerminalNode U_00B2() { return getToken(EclExpressionParser.U_00B2, 0); }
		public TerminalNode U_00B3() { return getToken(EclExpressionParser.U_00B3, 0); }
		public TerminalNode U_00B4() { return getToken(EclExpressionParser.U_00B4, 0); }
		public TerminalNode U_00B5() { return getToken(EclExpressionParser.U_00B5, 0); }
		public TerminalNode U_00B6() { return getToken(EclExpressionParser.U_00B6, 0); }
		public TerminalNode U_00B7() { return getToken(EclExpressionParser.U_00B7, 0); }
		public TerminalNode U_00B8() { return getToken(EclExpressionParser.U_00B8, 0); }
		public TerminalNode U_00B9() { return getToken(EclExpressionParser.U_00B9, 0); }
		public TerminalNode U_00BA() { return getToken(EclExpressionParser.U_00BA, 0); }
		public TerminalNode U_00BB() { return getToken(EclExpressionParser.U_00BB, 0); }
		public TerminalNode U_00BC() { return getToken(EclExpressionParser.U_00BC, 0); }
		public TerminalNode U_00BD() { return getToken(EclExpressionParser.U_00BD, 0); }
		public TerminalNode U_00BE() { return getToken(EclExpressionParser.U_00BE, 0); }
		public TerminalNode U_00BF() { return getToken(EclExpressionParser.U_00BF, 0); }
		public Utf8_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utf8_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).enterUtf8_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclExpressionListener ) ((EclExpressionListener)listener).exitUtf8_tail(this);
		}
	}

	public final Utf8_tailContext utf8_tail() throws RecognitionException {
		Utf8_tailContext _localctx = new Utf8_tailContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_utf8_tail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (U_0080 - 99)) | (1L << (U_0081 - 99)) | (1L << (U_0082 - 99)) | (1L << (U_0083 - 99)) | (1L << (U_0084 - 99)) | (1L << (U_0085 - 99)) | (1L << (U_0086 - 99)) | (1L << (U_0087 - 99)) | (1L << (U_0088 - 99)) | (1L << (U_0089 - 99)) | (1L << (U_008A - 99)) | (1L << (U_008B - 99)) | (1L << (U_008C - 99)) | (1L << (U_008D - 99)) | (1L << (U_008E - 99)) | (1L << (U_008F - 99)) | (1L << (U_0090 - 99)) | (1L << (U_0091 - 99)) | (1L << (U_0092 - 99)) | (1L << (U_0093 - 99)) | (1L << (U_0094 - 99)) | (1L << (U_0095 - 99)) | (1L << (U_0096 - 99)) | (1L << (U_0097 - 99)) | (1L << (U_0098 - 99)) | (1L << (U_0099 - 99)) | (1L << (U_009A - 99)) | (1L << (U_009B - 99)) | (1L << (U_009C - 99)) | (1L << (U_009D - 99)) | (1L << (U_009E - 99)) | (1L << (U_009F - 99)) | (1L << (U_00A0 - 99)) | (1L << (U_00A1 - 99)) | (1L << (U_00A2 - 99)) | (1L << (U_00A3 - 99)) | (1L << (U_00A4 - 99)) | (1L << (U_00A5 - 99)) | (1L << (U_00A6 - 99)) | (1L << (U_00A7 - 99)) | (1L << (U_00A8 - 99)) | (1L << (U_00A9 - 99)) | (1L << (U_00AA - 99)) | (1L << (U_00AB - 99)) | (1L << (U_00AC - 99)) | (1L << (U_00AD - 99)) | (1L << (U_00AE - 99)) | (1L << (U_00AF - 99)) | (1L << (U_00B0 - 99)) | (1L << (U_00B1 - 99)) | (1L << (U_00B2 - 99)) | (1L << (U_00B3 - 99)) | (1L << (U_00B4 - 99)) | (1L << (U_00B5 - 99)) | (1L << (U_00B6 - 99)) | (1L << (U_00B7 - 99)) | (1L << (U_00B8 - 99)) | (1L << (U_00B9 - 99)) | (1L << (U_00BA - 99)) | (1L << (U_00BB - 99)) | (1L << (U_00BC - 99)) | (1L << (U_00BD - 99)) | (1L << (U_00BE - 99)) | (1L << (U_00BF - 99)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00d7\u0302\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\2\3\2\5\2\u009e\n\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4\u00ab\n\4\3\5\3\5\3\5\3\5\3\5\3\5\6"+
		"\5\u00b3\n\5\r\5\16\5\u00b4\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00bd\n\6\r\6"+
		"\16\6\u00be\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ce"+
		"\n\b\3\b\3\b\6\b\u00d2\n\b\r\b\16\b\u00d3\3\t\3\t\3\t\5\t\u00d9\n\t\3"+
		"\t\3\t\3\t\5\t\u00de\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e7\n\t\3\n"+
		"\3\n\3\n\5\n\u00ec\n\n\3\n\3\n\3\n\5\n\u00f1\n\n\3\n\3\n\3\13\3\13\5\13"+
		"\u00f7\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u0105\n\16\3\17\3\17\3\20\6\20\u010a\n\20\r\20\16\20\u010b\3\20\6"+
		"\20\u010f\n\20\r\20\16\20\u0110\3\20\6\20\u0114\n\20\r\20\16\20\u0115"+
		"\7\20\u0118\n\20\f\20\16\20\u011b\13\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0125\n\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u013c"+
		"\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\5\34\u014d\n\34\3\35\3\35\3\35\3\35\3\35\6\35\u0154\n\35\r"+
		"\35\16\35\u0155\3\36\3\36\3\36\3\36\3\36\6\36\u015d\n\36\r\36\16\36\u015e"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0169\n\37\3 \3 \3 \3 \5"+
		" \u016f\n \3!\3!\3!\3!\3!\6!\u0176\n!\r!\16!\u0177\3\"\3\"\3\"\3\"\3\""+
		"\6\"\u017f\n\"\r\"\16\"\u0180\3#\3#\3#\3#\3#\3#\3#\5#\u018a\n#\3$\3$\3"+
		"$\3$\3$\5$\u0191\n$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\5%\u019e\n%\3%\3"+
		"%\3%\5%\u01a3\n%\3%\3%\3%\5%\u01a8\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\5%\u01bb\n%\3&\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\5)"+
		"\u01c8\n)\3*\3*\3+\3+\3,\3,\5,\u01d0\n,\3-\3-\5-\u01d4\n-\3.\3.\3.\5."+
		"\u01d9\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u01e4\n/\3\60\3\60\3\60\5\60\u01e9"+
		"\n\60\3\61\5\61\u01ec\n\61\3\61\3\61\5\61\u01f0\n\61\3\62\3\62\6\62\u01f4"+
		"\n\62\r\62\16\62\u01f5\3\63\3\63\7\63\u01fa\n\63\f\63\16\63\u01fd\13\63"+
		"\3\63\5\63\u0200\n\63\3\64\3\64\3\64\6\64\u0205\n\64\r\64\16\64\u0206"+
		"\3\65\3\65\7\65\u020b\n\65\f\65\16\65\u020e\13\65\3\65\5\65\u0211\n\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u021a\n\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\5\66\u0274\n\66\3\67\3\67\3\67\3\67\3\67\7\67\u027b\n\67\f\67\16\67\u027e"+
		"\13\67\38\38\38\38\38\68\u0285\n8\r8\168\u0286\39\39\39\39\39\79\u028e"+
		"\n9\f9\169\u0291\139\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u029f\n:\3"+
		";\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u02ad\n<\3=\3=\3>\3>\3?\3?\3@\3"+
		"@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3F\3F\3F\5F\u02c6\nF\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\5G\u02d2\nG\3H\3H\3H\3H\3H\3H\5H\u02da\nH\3I\3I\3"+
		"I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u02ed\nJ\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u02fe\nK\3L\3L\3L\2\2M\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\2 \4\2\'\'GG\4\2\64\64TT\4\2**JJ\4\2\65\65UU\4\288"+
		"XX\4\2\63\63SS\4\2//OO\4\2;;[[\4\299YY\4\2\21\21\23\23\3\2\7\17\3\2\21"+
		"d\3\2\7\24\3\2\26d\3\2\26\37\3\2\27\37\3\2\7a\3\2cd\3\2\6\7\3\2\tA\3\2"+
		"Cd\3\2\u00a5\u00c2\3\2\u0085\u00a4\3\2\u00c4\u00cf\3\2e\u0084\3\2\u00d1"+
		"\u00d2\3\2u\u00a4\3\2\u00d4\u00d6\3\2et\3\2e\u00a4\u032f\2\u0098\3\2\2"+
		"\2\4\u00a1\3\2\2\2\6\u00aa\3\2\2\2\b\u00ac\3\2\2\2\n\u00b6\3\2\2\2\f\u00c0"+
		"\3\2\2\2\16\u00c6\3\2\2\2\20\u00d8\3\2\2\2\22\u00eb\3\2\2\2\24\u00f6\3"+
		"\2\2\2\26\u00f8\3\2\2\2\30\u00fa\3\2\2\2\32\u00fc\3\2\2\2\34\u0106\3\2"+
		"\2\2\36\u0109\3\2\2\2 \u011c\3\2\2\2\"\u0124\3\2\2\2$\u0126\3\2\2\2&\u0128"+
		"\3\2\2\2(\u012b\3\2\2\2*\u012e\3\2\2\2,\u0130\3\2\2\2.\u0133\3\2\2\2\60"+
		"\u013b\3\2\2\2\62\u013d\3\2\2\2\64\u0141\3\2\2\2\66\u0148\3\2\2\28\u0153"+
		"\3\2\2\2:\u015c\3\2\2\2<\u0168\3\2\2\2>\u016a\3\2\2\2@\u0175\3\2\2\2B"+
		"\u017e\3\2\2\2D\u0189\3\2\2\2F\u0190\3\2\2\2H\u019d\3\2\2\2J\u01bc\3\2"+
		"\2\2L\u01c0\3\2\2\2N\u01c2\3\2\2\2P\u01c7\3\2\2\2R\u01c9\3\2\2\2T\u01cb"+
		"\3\2\2\2V\u01cf\3\2\2\2X\u01d3\3\2\2\2Z\u01d8\3\2\2\2\\\u01e3\3\2\2\2"+
		"^\u01e8\3\2\2\2`\u01eb\3\2\2\2b\u01f3\3\2\2\2d\u01ff\3\2\2\2f\u0201\3"+
		"\2\2\2h\u0210\3\2\2\2j\u0212\3\2\2\2l\u027c\3\2\2\2n\u0284\3\2\2\2p\u0288"+
		"\3\2\2\2r\u029e\3\2\2\2t\u02a0\3\2\2\2v\u02ac\3\2\2\2x\u02ae\3\2\2\2z"+
		"\u02b0\3\2\2\2|\u02b2\3\2\2\2~\u02b4\3\2\2\2\u0080\u02b6\3\2\2\2\u0082"+
		"\u02b8\3\2\2\2\u0084\u02ba\3\2\2\2\u0086\u02bc\3\2\2\2\u0088\u02be\3\2"+
		"\2\2\u008a\u02c5\3\2\2\2\u008c\u02d1\3\2\2\2\u008e\u02d9\3\2\2\2\u0090"+
		"\u02db\3\2\2\2\u0092\u02ec\3\2\2\2\u0094\u02fd\3\2\2\2\u0096\u02ff\3\2"+
		"\2\2\u0098\u009d\5l\67\2\u0099\u009e\5\4\3\2\u009a\u009e\5\6\4\2\u009b"+
		"\u009e\5\16\b\2\u009c\u009e\5\20\t\2\u009d\u0099\3\2\2\2\u009d\u009a\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\5l\67\2\u00a0\3\3\2\2\2\u00a1\u00a2\5\22\n\2\u00a2\u00a3\5l\67"+
		"\2\u00a3\u00a4\7 \2\2\u00a4\u00a5\5l\67\2\u00a5\u00a6\5\66\34\2\u00a6"+
		"\5\3\2\2\2\u00a7\u00ab\5\b\5\2\u00a8\u00ab\5\n\6\2\u00a9\u00ab\5\f\7\2"+
		"\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\7\3"+
		"\2\2\2\u00ac\u00b2\5\20\t\2\u00ad\u00ae\5l\67\2\u00ae\u00af\5\60\31\2"+
		"\u00af\u00b0\5l\67\2\u00b0\u00b1\5\20\t\2\u00b1\u00b3\3\2\2\2\u00b2\u00ad"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\t\3\2\2\2\u00b6\u00bc\5\20\t\2\u00b7\u00b8\5l\67\2\u00b8\u00b9\5\62\32"+
		"\2\u00b9\u00ba\5l\67\2\u00ba\u00bb\5\20\t\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00b7\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\13\3\2\2\2\u00c0\u00c1\5\20\t\2\u00c1\u00c2\5l\67\2\u00c2\u00c3"+
		"\5\64\33\2\u00c3\u00c4\5l\67\2\u00c4\u00c5\5\20\t\2\u00c5\r\3\2\2\2\u00c6"+
		"\u00d1\5\20\t\2\u00c7\u00c8\5l\67\2\u00c8\u00c9\5\26\f\2\u00c9\u00cd\5"+
		"l\67\2\u00ca\u00cb\5V,\2\u00cb\u00cc\5l\67\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00ca\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\5X"+
		"-\2\u00d0\u00d2\3\2\2\2\u00d1\u00c7\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\17\3\2\2\2\u00d5\u00d6\5\"\22"+
		"\2\u00d6\u00d7\5l\67\2\u00d7\u00d9\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00dd\3\2\2\2\u00da\u00db\5\30\r\2\u00db\u00dc\5l\67\2"+
		"\u00dc\u00de\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e6"+
		"\3\2\2\2\u00df\u00e7\5\24\13\2\u00e0\u00e1\7\16\2\2\u00e1\u00e2\5l\67"+
		"\2\u00e2\u00e3\5\2\2\2\u00e3\u00e4\5l\67\2\u00e4\u00e5\7\17\2\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00df\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e7\21\3\2\2"+
		"\2\u00e8\u00e9\5\"\22\2\u00e9\u00ea\5l\67\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00e8\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f0\3\2\2\2\u00ed\u00ee\5\30"+
		"\r\2\u00ee\u00ef\5l\67\2\u00ef\u00f1\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\5\24\13\2\u00f3\23\3\2"+
		"\2\2\u00f4\u00f7\5\32\16\2\u00f5\u00f7\5 \21\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\25\3\2\2\2\u00f8\u00f9\7\24\2\2\u00f9\27\3\2\2\2"+
		"\u00fa\u00fb\7D\2\2\u00fb\31\3\2\2\2\u00fc\u0104\5\34\17\2\u00fd\u00fe"+
		"\5l\67\2\u00fe\u00ff\7b\2\2\u00ff\u0100\5l\67\2\u0100\u0101\5\36\20\2"+
		"\u0101\u0102\5l\67\2\u0102\u0103\7b\2\2\u0103\u0105\3\2\2\2\u0104\u00fd"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\33\3\2\2\2\u0106\u0107\5j\66\2\u0107"+
		"\35\3\2\2\2\u0108\u010a\5\u008aF\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0119\3\2\2\2\u010d"+
		"\u010f\5x=\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2"+
		"\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0114\5\u008aF\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0118\3\2\2\2\u0117\u010e\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\37\3\2\2\2\u011b\u0119\3\2\2"+
		"\2\u011c\u011d\7\20\2\2\u011d!\3\2\2\2\u011e\u0125\5(\25\2\u011f\u0125"+
		"\5&\24\2\u0120\u0125\5$\23\2\u0121\u0125\5.\30\2\u0122\u0125\5,\27\2\u0123"+
		"\u0125\5*\26\2\u0124\u011e\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0120\3\2"+
		"\2\2\u0124\u0121\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125"+
		"#\3\2\2\2\u0126\u0127\7\"\2\2\u0127%\3\2\2\2\u0128\u0129\7\"\2\2\u0129"+
		"\u012a\7\"\2\2\u012a\'\3\2\2\2\u012b\u012c\7\"\2\2\u012c\u012d\7\7\2\2"+
		"\u012d)\3\2\2\2\u012e\u012f\7$\2\2\u012f+\3\2\2\2\u0130\u0131\7$\2\2\u0131"+
		"\u0132\7$\2\2\u0132-\3\2\2\2\u0133\u0134\7$\2\2\u0134\u0135\7\7\2\2\u0135"+
		"/\3\2\2\2\u0136\u0137\t\2\2\2\u0137\u0138\t\3\2\2\u0138\u0139\t\4\2\2"+
		"\u0139\u013c\5n8\2\u013a\u013c\7\22\2\2\u013b\u0136\3\2\2\2\u013b\u013a"+
		"\3\2\2\2\u013c\61\3\2\2\2\u013d\u013e\t\5\2\2\u013e\u013f\t\6\2\2\u013f"+
		"\u0140\5n8\2\u0140\63\3\2\2\2\u0141\u0142\t\7\2\2\u0142\u0143\t\b\2\2"+
		"\u0143\u0144\t\3\2\2\u0144\u0145\t\t\2\2\u0145\u0146\t\n\2\2\u0146\u0147"+
		"\5n8\2\u0147\65\3\2\2\2\u0148\u0149\5<\37\2\u0149\u014c\5l\67\2\u014a"+
		"\u014d\58\35\2\u014b\u014d\5:\36\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\67\3\2\2\2\u014e\u014f\5l\67\2\u014f\u0150"+
		"\5\60\31\2\u0150\u0151\5l\67\2\u0151\u0152\5<\37\2\u0152\u0154\3\2\2\2"+
		"\u0153\u014e\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u01569\3\2\2\2\u0157\u0158\5l\67\2\u0158\u0159\5\62\32\2\u0159"+
		"\u015a\5l\67\2\u015a\u015b\5<\37\2\u015b\u015d\3\2\2\2\u015c\u0157\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		";\3\2\2\2\u0160\u0169\5> \2\u0161\u0169\5F$\2\u0162\u0163\7\16\2\2\u0163"+
		"\u0164\5l\67\2\u0164\u0165\5\66\34\2\u0165\u0166\5l\67\2\u0166\u0167\7"+
		"\17\2\2\u0167\u0169\3\2\2\2\u0168\u0160\3\2\2\2\u0168\u0161\3\2\2\2\u0168"+
		"\u0162\3\2\2\2\u0169=\3\2\2\2\u016a\u016b\5D#\2\u016b\u016e\5l\67\2\u016c"+
		"\u016f\5@!\2\u016d\u016f\5B\"\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2"+
		"\2\u016e\u016f\3\2\2\2\u016f?\3\2\2\2\u0170\u0171\5l\67\2\u0171\u0172"+
		"\5\60\31\2\u0172\u0173\5l\67\2\u0173\u0174\5D#\2\u0174\u0176\3\2\2\2\u0175"+
		"\u0170\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178A\3\2\2\2\u0179\u017a\5l\67\2\u017a\u017b\5\62\32\2\u017b\u017c"+
		"\5l\67\2\u017c\u017d\5D#\2\u017d\u017f\3\2\2\2\u017e\u0179\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181C\3\2\2\2"+
		"\u0182\u018a\5H%\2\u0183\u0184\7\16\2\2\u0184\u0185\5l\67\2\u0185\u0186"+
		"\5> \2\u0186\u0187\5l\67\2\u0187\u0188\7\17\2\2\u0188\u018a\3\2\2\2\u0189"+
		"\u0182\3\2\2\2\u0189\u0183\3\2\2\2\u018aE\3\2\2\2\u018b\u018c\7A\2\2\u018c"+
		"\u018d\5J&\2\u018d\u018e\7C\2\2\u018e\u018f\5l\67\2\u018f\u0191\3\2\2"+
		"\2\u0190\u018b\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193"+
		"\7a\2\2\u0193\u0194\5l\67\2\u0194\u0195\5> \2\u0195\u0196\5l\67\2\u0196"+
		"\u0197\7c\2\2\u0197G\3\2\2\2\u0198\u0199\7A\2\2\u0199\u019a\5J&\2\u019a"+
		"\u019b\7C\2\2\u019b\u019c\5l\67\2\u019c\u019e\3\2\2\2\u019d\u0198\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019e\u01a2\3\2\2\2\u019f\u01a0\5T+\2\u01a0\u01a1"+
		"\5l\67\2\u01a1\u01a3\3\2\2\2\u01a2\u019f\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a7\3\2\2\2\u01a4\u01a5\5V,\2\u01a5\u01a6\5l\67\2\u01a6\u01a8\3\2\2"+
		"\2\u01a7\u01a4\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa"+
		"\5X-\2\u01aa\u01ba\5l\67\2\u01ab\u01ac\5Z.\2\u01ac\u01ad\5l\67\2\u01ad"+
		"\u01ae\5\20\t\2\u01ae\u01bb\3\2\2\2\u01af\u01b0\5\\/\2\u01b0\u01b1\5l"+
		"\67\2\u01b1\u01b2\7\t\2\2\u01b2\u01b3\5`\61\2\u01b3\u01bb\3\2\2\2\u01b4"+
		"\u01b5\5^\60\2\u01b5\u01b6\5l\67\2\u01b6\u01b7\5\u0080A\2\u01b7\u01b8"+
		"\5b\62\2\u01b8\u01b9\5\u0080A\2\u01b9\u01bb\3\2\2\2\u01ba\u01ab\3\2\2"+
		"\2\u01ba\u01af\3\2\2\2\u01ba\u01b4\3\2\2\2\u01bbI\3\2\2\2\u01bc\u01bd"+
		"\5L\'\2\u01bd\u01be\5N(\2\u01be\u01bf\5P)\2\u01bfK\3\2\2\2\u01c0\u01c1"+
		"\5h\65\2\u01c1M\3\2\2\2\u01c2\u01c3\7\24\2\2\u01c3\u01c4\7\24\2\2\u01c4"+
		"O\3\2\2\2\u01c5\u01c8\5h\65\2\u01c6\u01c8\5R*\2\u01c7\u01c5\3\2\2\2\u01c7"+
		"\u01c6\3\2\2\2\u01c8Q\3\2\2\2\u01c9\u01ca\7\20\2\2\u01caS\3\2\2\2\u01cb"+
		"\u01cc\78\2\2\u01ccU\3\2\2\2\u01cd\u01d0\5&\24\2\u01ce\u01d0\5$\23\2\u01cf"+
		"\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0W\3\2\2\2\u01d1\u01d4\5\32\16"+
		"\2\u01d2\u01d4\5 \21\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4Y"+
		"\3\2\2\2\u01d5\u01d9\7#\2\2\u01d6\u01d7\7\7\2\2\u01d7\u01d9\7#\2\2\u01d8"+
		"\u01d5\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9[\3\2\2\2\u01da\u01e4\7#\2\2\u01db"+
		"\u01dc\7\7\2\2\u01dc\u01e4\7#\2\2\u01dd\u01de\7\"\2\2\u01de\u01e4\7#\2"+
		"\2\u01df\u01e4\7\"\2\2\u01e0\u01e1\7$\2\2\u01e1\u01e4\7#\2\2\u01e2\u01e4"+
		"\7$\2\2\u01e3\u01da\3\2\2\2\u01e3\u01db\3\2\2\2\u01e3\u01dd\3\2\2\2\u01e3"+
		"\u01df\3\2\2\2\u01e3\u01e0\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4]\3\2\2\2"+
		"\u01e5\u01e9\7#\2\2\u01e6\u01e7\7\7\2\2\u01e7\u01e9\7#\2\2\u01e8\u01e5"+
		"\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9_\3\2\2\2\u01ea\u01ec\t\13\2\2\u01eb"+
		"\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01f0\5f"+
		"\64\2\u01ee\u01f0\5d\63\2\u01ef\u01ed\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0"+
		"a\3\2\2\2\u01f1\u01f4\5\u008cG\2\u01f2\u01f4\5\u008eH\2\u01f3\u01f1\3"+
		"\2\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6c\3\2\2\2\u01f7\u01fb\5\u0088E\2\u01f8\u01fa\5\u0084"+
		"C\2\u01f9\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u0200\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0200\5\u0086"+
		"D\2\u01ff\u01f7\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200e\3\2\2\2\u0201\u0202"+
		"\5d\63\2\u0202\u0204\7\24\2\2\u0203\u0205\5\u0084C\2\u0204\u0203\3\2\2"+
		"\2\u0205\u0206\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207g"+
		"\3\2\2\2\u0208\u020c\5\u0088E\2\u0209\u020b\5\u0084C\2\u020a\u0209\3\2"+
		"\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u0211\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0211\5\u0086D\2\u0210\u0208"+
		"\3\2\2\2\u0210\u020f\3\2\2\2\u0211i\3\2\2\2\u0212\u0213\5\u0088E\2\u0213"+
		"\u0214\5\u0084C\2\u0214\u0215\5\u0084C\2\u0215\u0216\5\u0084C\2\u0216"+
		"\u0217\5\u0084C\2\u0217\u0273\5\u0084C\2\u0218\u021a\5\u0084C\2\u0219"+
		"\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u0274\3\2\2\2\u021b\u021c\5\u0084"+
		"C\2\u021c\u021d\5\u0084C\2\u021d\u0274\3\2\2\2\u021e\u021f\5\u0084C\2"+
		"\u021f\u0220\5\u0084C\2\u0220\u0221\5\u0084C\2\u0221\u0274\3\2\2\2\u0222"+
		"\u0223\5\u0084C\2\u0223\u0224\5\u0084C\2\u0224\u0225\5\u0084C\2\u0225"+
		"\u0226\5\u0084C\2\u0226\u0274\3\2\2\2\u0227\u0228\5\u0084C\2\u0228\u0229"+
		"\5\u0084C\2\u0229\u022a\5\u0084C\2\u022a\u022b\5\u0084C\2\u022b\u022c"+
		"\5\u0084C\2\u022c\u0274\3\2\2\2\u022d\u022e\5\u0084C\2\u022e\u022f\5\u0084"+
		"C\2\u022f\u0230\5\u0084C\2\u0230\u0231\5\u0084C\2\u0231\u0232\5\u0084"+
		"C\2\u0232\u0233\5\u0084C\2\u0233\u0274\3\2\2\2\u0234\u0235\5\u0084C\2"+
		"\u0235\u0236\5\u0084C\2\u0236\u0237\5\u0084C\2\u0237\u0238\5\u0084C\2"+
		"\u0238\u0239\5\u0084C\2\u0239\u023a\5\u0084C\2\u023a\u023b\5\u0084C\2"+
		"\u023b\u0274\3\2\2\2\u023c\u023d\5\u0084C\2\u023d\u023e\5\u0084C\2\u023e"+
		"\u023f\5\u0084C\2\u023f\u0240\5\u0084C\2\u0240\u0241\5\u0084C\2\u0241"+
		"\u0242\5\u0084C\2\u0242\u0243\5\u0084C\2\u0243\u0244\5\u0084C\2\u0244"+
		"\u0274\3\2\2\2\u0245\u0246\5\u0084C\2\u0246\u0247\5\u0084C\2\u0247\u0248"+
		"\5\u0084C\2\u0248\u0249\5\u0084C\2\u0249\u024a\5\u0084C\2\u024a\u024b"+
		"\5\u0084C\2\u024b\u024c\5\u0084C\2\u024c\u024d\5\u0084C\2\u024d\u024e"+
		"\5\u0084C\2\u024e\u0274\3\2\2\2\u024f\u0250\5\u0084C\2\u0250\u0251\5\u0084"+
		"C\2\u0251\u0252\5\u0084C\2\u0252\u0253\5\u0084C\2\u0253\u0254\5\u0084"+
		"C\2\u0254\u0255\5\u0084C\2\u0255\u0256\5\u0084C\2\u0256\u0257\5\u0084"+
		"C\2\u0257\u0258\5\u0084C\2\u0258\u0259\5\u0084C\2\u0259\u0274\3\2\2\2"+
		"\u025a\u025b\5\u0084C\2\u025b\u025c\5\u0084C\2\u025c\u025d\5\u0084C\2"+
		"\u025d\u025e\5\u0084C\2\u025e\u025f\5\u0084C\2\u025f\u0260\5\u0084C\2"+
		"\u0260\u0261\5\u0084C\2\u0261\u0262\5\u0084C\2\u0262\u0263\5\u0084C\2"+
		"\u0263\u0264\5\u0084C\2\u0264\u0265\5\u0084C\2\u0265\u0274\3\2\2\2\u0266"+
		"\u0267\5\u0084C\2\u0267\u0268\5\u0084C\2\u0268\u0269\5\u0084C\2\u0269"+
		"\u026a\5\u0084C\2\u026a\u026b\5\u0084C\2\u026b\u026c\5\u0084C\2\u026c"+
		"\u026d\5\u0084C\2\u026d\u026e\5\u0084C\2\u026e\u026f\5\u0084C\2\u026f"+
		"\u0270\5\u0084C\2\u0270\u0271\5\u0084C\2\u0271\u0272\5\u0084C\2\u0272"+
		"\u0274\3\2\2\2\u0273\u0219\3\2\2\2\u0273\u021b\3\2\2\2\u0273\u021e\3\2"+
		"\2\2\u0273\u0222\3\2\2\2\u0273\u0227\3\2\2\2\u0273\u022d\3\2\2\2\u0273"+
		"\u0234\3\2\2\2\u0273\u023c\3\2\2\2\u0273\u0245\3\2\2\2\u0273\u024f\3\2"+
		"\2\2\u0273\u025a\3\2\2\2\u0273\u0266\3\2\2\2\u0274k\3\2\2\2\u0275\u027b"+
		"\5x=\2\u0276\u027b\5z>\2\u0277\u027b\5|?\2\u0278\u027b\5~@\2\u0279\u027b"+
		"\5p9\2\u027a\u0275\3\2\2\2\u027a\u0276\3\2\2\2\u027a\u0277\3\2\2\2\u027a"+
		"\u0278\3\2\2\2\u027a\u0279\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2"+
		"\2\2\u027c\u027d\3\2\2\2\u027dm\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0285"+
		"\5x=\2\u0280\u0285\5z>\2\u0281\u0285\5|?\2\u0282\u0285\5~@\2\u0283\u0285"+
		"\5p9\2\u0284\u027f\3\2\2\2\u0284\u0280\3\2\2\2\u0284\u0281\3\2\2\2\u0284"+
		"\u0282\3\2\2\2\u0284\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0284\3\2"+
		"\2\2\u0286\u0287\3\2\2\2\u0287o\3\2\2\2\u0288\u0289\7\25\2\2\u0289\u028a"+
		"\7\20\2\2\u028a\u028f\3\2\2\2\u028b\u028e\5r:\2\u028c\u028e\5t;\2\u028d"+
		"\u028b\3\2\2\2\u028d\u028c\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2"+
		"\2\2\u028f\u0290\3\2\2\2\u0290\u0292\3\2\2\2\u0291\u028f\3\2\2\2\u0292"+
		"\u0293\7\20\2\2\u0293\u0294\7\25\2\2\u0294q\3\2\2\2\u0295\u029f\5x=\2"+
		"\u0296\u029f\5z>\2\u0297\u029f\5|?\2\u0298\u029f\5~@\2\u0299\u029f\t\f"+
		"\2\2\u029a\u029f\t\r\2\2\u029b\u029f\5\u0090I\2\u029c\u029f\5\u0092J\2"+
		"\u029d\u029f\5\u0094K\2\u029e\u0295\3\2\2\2\u029e\u0296\3\2\2\2\u029e"+
		"\u0297\3\2\2\2\u029e\u0298\3\2\2\2\u029e\u0299\3\2\2\2\u029e\u029a\3\2"+
		"\2\2\u029e\u029b\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029d\3\2\2\2\u029f"+
		"s\3\2\2\2\u02a0\u02a1\7\20\2\2\u02a1\u02a2\5v<\2\u02a2u\3\2\2\2\u02a3"+
		"\u02ad\5x=\2\u02a4\u02ad\5z>\2\u02a5\u02ad\5|?\2\u02a6\u02ad\5~@\2\u02a7"+
		"\u02ad\t\16\2\2\u02a8\u02ad\t\17\2\2\u02a9\u02ad\5\u0090I\2\u02aa\u02ad"+
		"\5\u0092J\2\u02ab\u02ad\5\u0094K\2\u02ac\u02a3\3\2\2\2\u02ac\u02a4\3\2"+
		"\2\2\u02ac\u02a5\3\2\2\2\u02ac\u02a6\3\2\2\2\u02ac\u02a7\3\2\2\2\u02ac"+
		"\u02a8\3\2\2\2\u02ac\u02a9\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ab\3\2"+
		"\2\2\u02adw\3\2\2\2\u02ae\u02af\7\6\2\2\u02afy\3\2\2\2\u02b0\u02b1\7\3"+
		"\2\2\u02b1{\3\2\2\2\u02b2\u02b3\7\5\2\2\u02b3}\3\2\2\2\u02b4\u02b5\7\4"+
		"\2\2\u02b5\177\3\2\2\2\u02b6\u02b7\7\b\2\2\u02b7\u0081\3\2\2\2\u02b8\u02b9"+
		"\7B\2\2\u02b9\u0083\3\2\2\2\u02ba\u02bb\t\20\2\2\u02bb\u0085\3\2\2\2\u02bc"+
		"\u02bd\7\26\2\2\u02bd\u0087\3\2\2\2\u02be\u02bf\t\21\2\2\u02bf\u0089\3"+
		"\2\2\2\u02c0\u02c6\t\22\2\2\u02c1\u02c6\t\23\2\2\u02c2\u02c6\5\u0090I"+
		"\2\u02c3\u02c6\5\u0092J\2\u02c4\u02c6\5\u0094K\2\u02c5\u02c0\3\2\2\2\u02c5"+
		"\u02c1\3\2\2\2\u02c5\u02c2\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c4\3\2"+
		"\2\2\u02c6\u008b\3\2\2\2\u02c7\u02d2\5x=\2\u02c8\u02d2\5z>\2\u02c9\u02d2"+
		"\5|?\2\u02ca\u02d2\5~@\2\u02cb\u02d2\t\24\2\2\u02cc\u02d2\t\25\2\2\u02cd"+
		"\u02d2\t\26\2\2\u02ce\u02d2\5\u0090I\2\u02cf\u02d2\5\u0092J\2\u02d0\u02d2"+
		"\5\u0094K\2\u02d1\u02c7\3\2\2\2\u02d1\u02c8\3\2\2\2\u02d1\u02c9\3\2\2"+
		"\2\u02d1\u02ca\3\2\2\2\u02d1\u02cb\3\2\2\2\u02d1\u02cc\3\2\2\2\u02d1\u02cd"+
		"\3\2\2\2\u02d1\u02ce\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d0\3\2\2\2\u02d2"+
		"\u008d\3\2\2\2\u02d3\u02d4\5\u0082B\2\u02d4\u02d5\5\u0080A\2\u02d5\u02da"+
		"\3\2\2\2\u02d6\u02d7\5\u0082B\2\u02d7\u02d8\5\u0082B\2\u02d8\u02da\3\2"+
		"\2\2\u02d9\u02d3\3\2\2\2\u02d9\u02d6\3\2\2\2\u02da\u008f\3\2\2\2\u02db"+
		"\u02dc\t\27\2\2\u02dc\u02dd\5\u0096L\2\u02dd\u0091\3\2\2\2\u02de\u02df"+
		"\7\u00c3\2\2\u02df\u02e0\t\30\2\2\u02e0\u02ed\5\u0096L\2\u02e1\u02e2\t"+
		"\31\2\2\u02e2\u02e3\5\u0096L\2\u02e3\u02e4\5\u0096L\2\u02e4\u02ed\3\2"+
		"\2\2\u02e5\u02e6\7\u00d0\2\2\u02e6\u02e7\t\32\2\2\u02e7\u02ed\5\u0096"+
		"L\2\u02e8\u02e9\t\33\2\2\u02e9\u02ea\5\u0096L\2\u02ea\u02eb\5\u0096L\2"+
		"\u02eb\u02ed\3\2\2\2\u02ec\u02de\3\2\2\2\u02ec\u02e1\3\2\2\2\u02ec\u02e5"+
		"\3\2\2\2\u02ec\u02e8\3\2\2\2\u02ed\u0093\3\2\2\2\u02ee\u02ef\7\u00d3\2"+
		"\2\u02ef\u02f0\t\34\2\2\u02f0\u02f1\5\u0096L\2\u02f1\u02f2\5\u0096L\2"+
		"\u02f2\u02fe\3\2\2\2\u02f3\u02f4\t\35\2\2\u02f4\u02f5\5\u0096L\2\u02f5"+
		"\u02f6\5\u0096L\2\u02f6\u02f7\5\u0096L\2\u02f7\u02fe\3\2\2\2\u02f8\u02f9"+
		"\7\u00d7\2\2\u02f9\u02fa\t\36\2\2\u02fa\u02fb\5\u0096L\2\u02fb\u02fc\5"+
		"\u0096L\2\u02fc\u02fe\3\2\2\2\u02fd\u02ee\3\2\2\2\u02fd\u02f3\3\2\2\2"+
		"\u02fd\u02f8\3\2\2\2\u02fe\u0095\3\2\2\2\u02ff\u0300\t\37\2\2\u0300\u0097"+
		"\3\2\2\2@\u009d\u00aa\u00b4\u00be\u00cd\u00d3\u00d8\u00dd\u00e6\u00eb"+
		"\u00f0\u00f6\u0104\u010b\u0110\u0115\u0119\u0124\u013b\u014c\u0155\u015e"+
		"\u0168\u016e\u0177\u0180\u0189\u0190\u019d\u01a2\u01a7\u01ba\u01c7\u01cf"+
		"\u01d3\u01d8\u01e3\u01e8\u01eb\u01ef\u01f3\u01f5\u01fb\u01ff\u0206\u020c"+
		"\u0210\u0219\u0273\u027a\u027c\u0284\u0286\u028d\u028f\u029e\u02ac\u02c5"+
		"\u02d1\u02d9\u02ec\u02fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}