// Generated from SCG.txt by ANTLR 4.13.2
package org.snomed.languages.scg.generated.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SCGParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

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
		RULE_expression = 0, RULE_subexpression = 1, RULE_definitionstatus = 2, 
		RULE_equivalentto = 3, RULE_subtypeof = 4, RULE_focusconcept = 5, RULE_conceptreference = 6, 
		RULE_conceptid = 7, RULE_term = 8, RULE_refinement = 9, RULE_attributegroup = 10, 
		RULE_attributeset = 11, RULE_attribute = 12, RULE_attributename = 13, 
		RULE_attributevalue = 14, RULE_expressionvalue = 15, RULE_stringvalue = 16, 
		RULE_numericvalue = 17, RULE_integervalue = 18, RULE_decimalvalue = 19, 
		RULE_sctid = 20, RULE_ws = 21, RULE_sp = 22, RULE_htab = 23, RULE_cr = 24, 
		RULE_lf = 25, RULE_qm = 26, RULE_bs = 27, RULE_digit = 28, RULE_zero = 29, 
		RULE_digitnonzero = 30, RULE_nonwsnonpipe = 31, RULE_anynonescapedchar = 32, 
		RULE_escapedchar = 33, RULE_utf8_2 = 34, RULE_utf8_3 = 35, RULE_utf8_4 = 36, 
		RULE_utf8_tail = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "subexpression", "definitionstatus", "equivalentto", "subtypeof", 
			"focusconcept", "conceptreference", "conceptid", "term", "refinement", 
			"attributegroup", "attributeset", "attribute", "attributename", "attributevalue", 
			"expressionvalue", "stringvalue", "numericvalue", "integervalue", "decimalvalue", 
			"sctid", "ws", "sp", "htab", "cr", "lf", "qm", "bs", "digit", "zero", 
			"digitnonzero", "nonwsnonpipe", "anynonescapedchar", "escapedchar", "utf8_2", 
			"utf8_3", "utf8_4", "utf8_tail"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
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
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "SCG.txt"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SCGParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public SubexpressionContext subexpression() {
			return getRuleContext(SubexpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SCGParser.EOF, 0); }
		public DefinitionstatusContext definitionstatus() {
			return getRuleContext(DefinitionstatusContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			ws();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN || _la==EQUALS) {
				{
				setState(77);
				definitionstatus();
				setState(78);
				ws();
				}
			}

			setState(82);
			subexpression();
			setState(83);
			ws();
			setState(84);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubexpressionContext extends ParserRuleContext {
		public FocusconceptContext focusconcept() {
			return getRuleContext(FocusconceptContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode COLON() { return getToken(SCGParser.COLON, 0); }
		public RefinementContext refinement() {
			return getRuleContext(RefinementContext.class,0);
		}
		public SubexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterSubexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitSubexpression(this);
		}
	}

	public final SubexpressionContext subexpression() throws RecognitionException {
		SubexpressionContext _localctx = new SubexpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_subexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			focusconcept();
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(87);
				ws();
				setState(88);
				match(COLON);
				setState(89);
				ws();
				setState(90);
				refinement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionstatusContext extends ParserRuleContext {
		public EquivalenttoContext equivalentto() {
			return getRuleContext(EquivalenttoContext.class,0);
		}
		public SubtypeofContext subtypeof() {
			return getRuleContext(SubtypeofContext.class,0);
		}
		public DefinitionstatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionstatus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterDefinitionstatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitDefinitionstatus(this);
		}
	}

	public final DefinitionstatusContext definitionstatus() throws RecognitionException {
		DefinitionstatusContext _localctx = new DefinitionstatusContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definitionstatus);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUALS:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				equivalentto();
				}
				break;
			case LESS_THAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				subtypeof();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EquivalenttoContext extends ParserRuleContext {
		public List<TerminalNode> EQUALS() { return getTokens(SCGParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(SCGParser.EQUALS, i);
		}
		public EquivalenttoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equivalentto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterEquivalentto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitEquivalentto(this);
		}
	}

	public final EquivalenttoContext equivalentto() throws RecognitionException {
		EquivalenttoContext _localctx = new EquivalenttoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_equivalentto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(98);
			match(EQUALS);
			setState(99);
			match(EQUALS);
			setState(100);
			match(EQUALS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubtypeofContext extends ParserRuleContext {
		public List<TerminalNode> LESS_THAN() { return getTokens(SCGParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(SCGParser.LESS_THAN, i);
		}
		public SubtypeofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtypeof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterSubtypeof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitSubtypeof(this);
		}
	}

	public final SubtypeofContext subtypeof() throws RecognitionException {
		SubtypeofContext _localctx = new SubtypeofContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subtypeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(102);
			match(LESS_THAN);
			setState(103);
			match(LESS_THAN);
			setState(104);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FocusconceptContext extends ParserRuleContext {
		public List<ConceptreferenceContext> conceptreference() {
			return getRuleContexts(ConceptreferenceContext.class);
		}
		public ConceptreferenceContext conceptreference(int i) {
			return getRuleContext(ConceptreferenceContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SCGParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SCGParser.PLUS, i);
		}
		public FocusconceptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_focusconcept; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterFocusconcept(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitFocusconcept(this);
		}
	}

	public final FocusconceptContext focusconcept() throws RecognitionException {
		FocusconceptContext _localctx = new FocusconceptContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_focusconcept);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			conceptreference();
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					ws();
					setState(108);
					match(PLUS);
					setState(109);
					ws();
					setState(110);
					conceptreference();
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
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
		public List<TerminalNode> PIPE() { return getTokens(SCGParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(SCGParser.PIPE, i);
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
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterConceptreference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitConceptreference(this);
		}
	}

	public final ConceptreferenceContext conceptreference() throws RecognitionException {
		ConceptreferenceContext _localctx = new ConceptreferenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conceptreference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			conceptid();
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(118);
				ws();
				setState(119);
				match(PIPE);
				setState(120);
				ws();
				setState(121);
				term();
				setState(122);
				ws();
				setState(123);
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

	@SuppressWarnings("CheckReturnValue")
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
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterConceptid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitConceptid(this);
		}
	}

	public final ConceptidContext conceptid() throws RecognitionException {
		ConceptidContext _localctx = new ConceptidContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conceptid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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

	@SuppressWarnings("CheckReturnValue")
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
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			nonwsnonpipe();
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(130);
						sp();
						}
						}
						setState(135);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(136);
					nonwsnonpipe();
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RefinementContext extends ParserRuleContext {
		public AttributesetContext attributeset() {
			return getRuleContext(AttributesetContext.class,0);
		}
		public List<AttributegroupContext> attributegroup() {
			return getRuleContexts(AttributegroupContext.class);
		}
		public AttributegroupContext attributegroup(int i) {
			return getRuleContext(AttributegroupContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SCGParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SCGParser.COMMA, i);
		}
		public RefinementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refinement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterRefinement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitRefinement(this);
		}
	}

	public final RefinementContext refinement() throws RecognitionException {
		RefinementContext _localctx = new RefinementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_refinement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
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
				{
				setState(142);
				attributeset();
				}
				break;
			case LEFT_CURLY_BRACE:
				{
				setState(143);
				attributegroup();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(146);
					ws();
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(147);
						match(COMMA);
						setState(148);
						ws();
						}
					}

					setState(151);
					attributegroup();
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributegroupContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(SCGParser.LEFT_CURLY_BRACE, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public AttributesetContext attributeset() {
			return getRuleContext(AttributesetContext.class,0);
		}
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(SCGParser.RIGHT_CURLY_BRACE, 0); }
		public AttributegroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributegroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterAttributegroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitAttributegroup(this);
		}
	}

	public final AttributegroupContext attributegroup() throws RecognitionException {
		AttributegroupContext _localctx = new AttributegroupContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attributegroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(LEFT_CURLY_BRACE);
			setState(159);
			ws();
			setState(160);
			attributeset();
			setState(161);
			ws();
			setState(162);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributesetContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SCGParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SCGParser.COMMA, i);
		}
		public AttributesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterAttributeset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitAttributeset(this);
		}
	}

	public final AttributesetContext attributeset() throws RecognitionException {
		AttributesetContext _localctx = new AttributesetContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attributeset);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			attribute();
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					ws();
					setState(166);
					match(COMMA);
					setState(167);
					ws();
					setState(168);
					attribute();
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public AttributenameContext attributename() {
			return getRuleContext(AttributenameContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(SCGParser.EQUALS, 0); }
		public AttributevalueContext attributevalue() {
			return getRuleContext(AttributevalueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			attributename();
			setState(176);
			ws();
			setState(177);
			match(EQUALS);
			setState(178);
			ws();
			setState(179);
			attributevalue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributenameContext extends ParserRuleContext {
		public ConceptreferenceContext conceptreference() {
			return getRuleContext(ConceptreferenceContext.class,0);
		}
		public AttributenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterAttributename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitAttributename(this);
		}
	}

	public final AttributenameContext attributename() throws RecognitionException {
		AttributenameContext _localctx = new AttributenameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attributename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			conceptreference();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributevalueContext extends ParserRuleContext {
		public ExpressionvalueContext expressionvalue() {
			return getRuleContext(ExpressionvalueContext.class,0);
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
		public TerminalNode POUND() { return getToken(SCGParser.POUND, 0); }
		public NumericvalueContext numericvalue() {
			return getRuleContext(NumericvalueContext.class,0);
		}
		public AttributevalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributevalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterAttributevalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitAttributevalue(this);
		}
	}

	public final AttributevalueContext attributevalue() throws RecognitionException {
		AttributevalueContext _localctx = new AttributevalueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attributevalue);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
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
				setState(183);
				expressionvalue();
				}
				break;
			case QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(184);
				qm();
				setState(185);
				stringvalue();
				setState(186);
				qm();
				}
				}
				break;
			case POUND:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(188);
				match(POUND);
				setState(189);
				numericvalue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionvalueContext extends ParserRuleContext {
		public ConceptreferenceContext conceptreference() {
			return getRuleContext(ConceptreferenceContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SCGParser.LEFT_PAREN, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public SubexpressionContext subexpression() {
			return getRuleContext(SubexpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SCGParser.RIGHT_PAREN, 0); }
		public ExpressionvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterExpressionvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitExpressionvalue(this);
		}
	}

	public final ExpressionvalueContext expressionvalue() throws RecognitionException {
		ExpressionvalueContext _localctx = new ExpressionvalueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressionvalue);
		try {
			setState(199);
			_errHandler.sync(this);
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
				setState(192);
				conceptreference();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(193);
				match(LEFT_PAREN);
				setState(194);
				ws();
				setState(195);
				subexpression();
				setState(196);
				ws();
				setState(197);
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

	@SuppressWarnings("CheckReturnValue")
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
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterStringvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitStringvalue(this);
		}
	}

	public final StringvalueContext stringvalue() throws RecognitionException {
		StringvalueContext _localctx = new StringvalueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stringvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(203);
				_errHandler.sync(this);
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
					setState(201);
					anynonescapedchar();
					}
					break;
				case BACKSLASH:
					{
					setState(202);
					escapedchar();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -66L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 34359738367L) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 2251799813685247L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumericvalueContext extends ParserRuleContext {
		public DecimalvalueContext decimalvalue() {
			return getRuleContext(DecimalvalueContext.class,0);
		}
		public IntegervalueContext integervalue() {
			return getRuleContext(IntegervalueContext.class,0);
		}
		public NumericvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterNumericvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitNumericvalue(this);
		}
	}

	public final NumericvalueContext numericvalue() throws RecognitionException {
		NumericvalueContext _localctx = new NumericvalueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numericvalue);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				decimalvalue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				integervalue();
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

	@SuppressWarnings("CheckReturnValue")
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
		public TerminalNode DASH() { return getToken(SCGParser.DASH, 0); }
		public TerminalNode PLUS() { return getToken(SCGParser.PLUS, 0); }
		public ZeroContext zero() {
			return getRuleContext(ZeroContext.class,0);
		}
		public IntegervalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integervalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterIntegervalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitIntegervalue(this);
		}
	}

	public final IntegervalueContext integervalue() throws RecognitionException {
		IntegervalueContext _localctx = new IntegervalueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_integervalue);
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case DASH:
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
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==DASH) {
					{
					setState(211);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==DASH) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(214);
				digitnonzero();
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1072693248L) != 0)) {
					{
					{
					setState(215);
					digit();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalvalueContext extends ParserRuleContext {
		public IntegervalueContext integervalue() {
			return getRuleContext(IntegervalueContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(SCGParser.PERIOD, 0); }
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
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterDecimalvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitDecimalvalue(this);
		}
	}

	public final DecimalvalueContext decimalvalue() throws RecognitionException {
		DecimalvalueContext _localctx = new DecimalvalueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_decimalvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			integervalue();
			setState(225);
			match(PERIOD);
			setState(227); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(226);
				digit();
				}
				}
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1072693248L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
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
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterSctid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitSctid(this);
		}
	}

	public final SctidContext sctid() throws RecognitionException {
		SctidContext _localctx = new SctidContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sctid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			digitnonzero();
			{
			setState(232);
			digit();
			}
			{
			setState(233);
			digit();
			}
			{
			setState(234);
			digit();
			}
			{
			setState(235);
			digit();
			}
			{
			setState(236);
			digit();
			}
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1072693248L) != 0)) {
					{
					setState(237);
					digit();
					}
				}

				}
				break;
			case 2:
				{
				{
				{
				setState(240);
				digit();
				}
				{
				setState(241);
				digit();
				}
				}
				}
				break;
			case 3:
				{
				{
				{
				setState(243);
				digit();
				}
				{
				setState(244);
				digit();
				}
				{
				setState(245);
				digit();
				}
				}
				}
				break;
			case 4:
				{
				{
				{
				setState(247);
				digit();
				}
				{
				setState(248);
				digit();
				}
				{
				setState(249);
				digit();
				}
				{
				setState(250);
				digit();
				}
				}
				}
				break;
			case 5:
				{
				{
				{
				setState(252);
				digit();
				}
				{
				setState(253);
				digit();
				}
				{
				setState(254);
				digit();
				}
				{
				setState(255);
				digit();
				}
				{
				setState(256);
				digit();
				}
				}
				}
				break;
			case 6:
				{
				{
				{
				setState(258);
				digit();
				}
				{
				setState(259);
				digit();
				}
				{
				setState(260);
				digit();
				}
				{
				setState(261);
				digit();
				}
				{
				setState(262);
				digit();
				}
				{
				setState(263);
				digit();
				}
				}
				}
				break;
			case 7:
				{
				{
				{
				setState(265);
				digit();
				}
				{
				setState(266);
				digit();
				}
				{
				setState(267);
				digit();
				}
				{
				setState(268);
				digit();
				}
				{
				setState(269);
				digit();
				}
				{
				setState(270);
				digit();
				}
				{
				setState(271);
				digit();
				}
				}
				}
				break;
			case 8:
				{
				{
				{
				setState(273);
				digit();
				}
				{
				setState(274);
				digit();
				}
				{
				setState(275);
				digit();
				}
				{
				setState(276);
				digit();
				}
				{
				setState(277);
				digit();
				}
				{
				setState(278);
				digit();
				}
				{
				setState(279);
				digit();
				}
				{
				setState(280);
				digit();
				}
				}
				}
				break;
			case 9:
				{
				{
				{
				setState(282);
				digit();
				}
				{
				setState(283);
				digit();
				}
				{
				setState(284);
				digit();
				}
				{
				setState(285);
				digit();
				}
				{
				setState(286);
				digit();
				}
				{
				setState(287);
				digit();
				}
				{
				setState(288);
				digit();
				}
				{
				setState(289);
				digit();
				}
				{
				setState(290);
				digit();
				}
				}
				}
				break;
			case 10:
				{
				{
				{
				setState(292);
				digit();
				}
				{
				setState(293);
				digit();
				}
				{
				setState(294);
				digit();
				}
				{
				setState(295);
				digit();
				}
				{
				setState(296);
				digit();
				}
				{
				setState(297);
				digit();
				}
				{
				setState(298);
				digit();
				}
				{
				setState(299);
				digit();
				}
				{
				setState(300);
				digit();
				}
				{
				setState(301);
				digit();
				}
				}
				}
				break;
			case 11:
				{
				{
				{
				setState(303);
				digit();
				}
				{
				setState(304);
				digit();
				}
				{
				setState(305);
				digit();
				}
				{
				setState(306);
				digit();
				}
				{
				setState(307);
				digit();
				}
				{
				setState(308);
				digit();
				}
				{
				setState(309);
				digit();
				}
				{
				setState(310);
				digit();
				}
				{
				setState(311);
				digit();
				}
				{
				setState(312);
				digit();
				}
				{
				setState(313);
				digit();
				}
				}
				}
				break;
			case 12:
				{
				{
				{
				setState(315);
				digit();
				}
				{
				setState(316);
				digit();
				}
				{
				setState(317);
				digit();
				}
				{
				setState(318);
				digit();
				}
				{
				setState(319);
				digit();
				}
				{
				setState(320);
				digit();
				}
				{
				setState(321);
				digit();
				}
				{
				setState(322);
				digit();
				}
				{
				setState(323);
				digit();
				}
				{
				setState(324);
				digit();
				}
				{
				setState(325);
				digit();
				}
				{
				setState(326);
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

	@SuppressWarnings("CheckReturnValue")
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
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitWs(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ws);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) {
				{
				setState(334);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SPACE:
					{
					setState(330);
					sp();
					}
					break;
				case TAB:
					{
					setState(331);
					htab();
					}
					break;
				case CR:
					{
					setState(332);
					cr();
					}
					break;
				case LF:
					{
					setState(333);
					lf();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SpContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(SCGParser.SPACE, 0); }
		public SpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterSp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitSp(this);
		}
	}

	public final SpContext sp() throws RecognitionException {
		SpContext _localctx = new SpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtabContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(SCGParser.TAB, 0); }
		public HtabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterHtab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitHtab(this);
		}
	}

	public final HtabContext htab() throws RecognitionException {
		HtabContext _localctx = new HtabContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_htab);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CrContext extends ParserRuleContext {
		public TerminalNode CR() { return getToken(SCGParser.CR, 0); }
		public CrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterCr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitCr(this);
		}
	}

	public final CrContext cr() throws RecognitionException {
		CrContext _localctx = new CrContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LfContext extends ParserRuleContext {
		public TerminalNode LF() { return getToken(SCGParser.LF, 0); }
		public LfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterLf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitLf(this);
		}
	}

	public final LfContext lf() throws RecognitionException {
		LfContext _localctx = new LfContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QmContext extends ParserRuleContext {
		public TerminalNode QUOTE() { return getToken(SCGParser.QUOTE, 0); }
		public QmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterQm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitQm(this);
		}
	}

	public final QmContext qm() throws RecognitionException {
		QmContext _localctx = new QmContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_qm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BsContext extends ParserRuleContext {
		public TerminalNode BACKSLASH() { return getToken(SCGParser.BACKSLASH, 0); }
		public BsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterBs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitBs(this);
		}
	}

	public final BsContext bs() throws RecognitionException {
		BsContext _localctx = new BsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DigitContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(SCGParser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(SCGParser.ONE, 0); }
		public TerminalNode TWO() { return getToken(SCGParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(SCGParser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(SCGParser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(SCGParser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(SCGParser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(SCGParser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(SCGParser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(SCGParser.NINE, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitDigit(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1072693248L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ZeroContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(SCGParser.ZERO, 0); }
		public ZeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterZero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitZero(this);
		}
	}

	public final ZeroContext zero() throws RecognitionException {
		ZeroContext _localctx = new ZeroContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_zero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DigitnonzeroContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(SCGParser.ONE, 0); }
		public TerminalNode TWO() { return getToken(SCGParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(SCGParser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(SCGParser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(SCGParser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(SCGParser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(SCGParser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(SCGParser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(SCGParser.NINE, 0); }
		public DigitnonzeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digitnonzero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterDigitnonzero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitDigitnonzero(this);
		}
	}

	public final DigitnonzeroContext digitnonzero() throws RecognitionException {
		DigitnonzeroContext _localctx = new DigitnonzeroContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_digitnonzero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1071644672L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NonwsnonpipeContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION() { return getToken(SCGParser.EXCLAMATION, 0); }
		public TerminalNode QUOTE() { return getToken(SCGParser.QUOTE, 0); }
		public TerminalNode POUND() { return getToken(SCGParser.POUND, 0); }
		public TerminalNode DOLLAR() { return getToken(SCGParser.DOLLAR, 0); }
		public TerminalNode PERCENT() { return getToken(SCGParser.PERCENT, 0); }
		public TerminalNode AMPERSAND() { return getToken(SCGParser.AMPERSAND, 0); }
		public TerminalNode APOSTROPHE() { return getToken(SCGParser.APOSTROPHE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SCGParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SCGParser.RIGHT_PAREN, 0); }
		public TerminalNode ASTERISK() { return getToken(SCGParser.ASTERISK, 0); }
		public TerminalNode PLUS() { return getToken(SCGParser.PLUS, 0); }
		public TerminalNode COMMA() { return getToken(SCGParser.COMMA, 0); }
		public TerminalNode DASH() { return getToken(SCGParser.DASH, 0); }
		public TerminalNode PERIOD() { return getToken(SCGParser.PERIOD, 0); }
		public TerminalNode SLASH() { return getToken(SCGParser.SLASH, 0); }
		public TerminalNode ZERO() { return getToken(SCGParser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(SCGParser.ONE, 0); }
		public TerminalNode TWO() { return getToken(SCGParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(SCGParser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(SCGParser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(SCGParser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(SCGParser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(SCGParser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(SCGParser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(SCGParser.NINE, 0); }
		public TerminalNode COLON() { return getToken(SCGParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(SCGParser.SEMICOLON, 0); }
		public TerminalNode LESS_THAN() { return getToken(SCGParser.LESS_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(SCGParser.EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SCGParser.GREATER_THAN, 0); }
		public TerminalNode QUESTION() { return getToken(SCGParser.QUESTION, 0); }
		public TerminalNode AT() { return getToken(SCGParser.AT, 0); }
		public TerminalNode CAP_A() { return getToken(SCGParser.CAP_A, 0); }
		public TerminalNode CAP_B() { return getToken(SCGParser.CAP_B, 0); }
		public TerminalNode CAP_C() { return getToken(SCGParser.CAP_C, 0); }
		public TerminalNode CAP_D() { return getToken(SCGParser.CAP_D, 0); }
		public TerminalNode CAP_E() { return getToken(SCGParser.CAP_E, 0); }
		public TerminalNode CAP_F() { return getToken(SCGParser.CAP_F, 0); }
		public TerminalNode CAP_G() { return getToken(SCGParser.CAP_G, 0); }
		public TerminalNode CAP_H() { return getToken(SCGParser.CAP_H, 0); }
		public TerminalNode CAP_I() { return getToken(SCGParser.CAP_I, 0); }
		public TerminalNode CAP_J() { return getToken(SCGParser.CAP_J, 0); }
		public TerminalNode CAP_K() { return getToken(SCGParser.CAP_K, 0); }
		public TerminalNode CAP_L() { return getToken(SCGParser.CAP_L, 0); }
		public TerminalNode CAP_M() { return getToken(SCGParser.CAP_M, 0); }
		public TerminalNode CAP_N() { return getToken(SCGParser.CAP_N, 0); }
		public TerminalNode CAP_O() { return getToken(SCGParser.CAP_O, 0); }
		public TerminalNode CAP_P() { return getToken(SCGParser.CAP_P, 0); }
		public TerminalNode CAP_Q() { return getToken(SCGParser.CAP_Q, 0); }
		public TerminalNode CAP_R() { return getToken(SCGParser.CAP_R, 0); }
		public TerminalNode CAP_S() { return getToken(SCGParser.CAP_S, 0); }
		public TerminalNode CAP_T() { return getToken(SCGParser.CAP_T, 0); }
		public TerminalNode CAP_U() { return getToken(SCGParser.CAP_U, 0); }
		public TerminalNode CAP_V() { return getToken(SCGParser.CAP_V, 0); }
		public TerminalNode CAP_W() { return getToken(SCGParser.CAP_W, 0); }
		public TerminalNode CAP_X() { return getToken(SCGParser.CAP_X, 0); }
		public TerminalNode CAP_Y() { return getToken(SCGParser.CAP_Y, 0); }
		public TerminalNode CAP_Z() { return getToken(SCGParser.CAP_Z, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(SCGParser.LEFT_BRACE, 0); }
		public TerminalNode BACKSLASH() { return getToken(SCGParser.BACKSLASH, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(SCGParser.RIGHT_BRACE, 0); }
		public TerminalNode CARAT() { return getToken(SCGParser.CARAT, 0); }
		public TerminalNode UNDERSCORE() { return getToken(SCGParser.UNDERSCORE, 0); }
		public TerminalNode ACCENT() { return getToken(SCGParser.ACCENT, 0); }
		public TerminalNode A() { return getToken(SCGParser.A, 0); }
		public TerminalNode B() { return getToken(SCGParser.B, 0); }
		public TerminalNode C() { return getToken(SCGParser.C, 0); }
		public TerminalNode D() { return getToken(SCGParser.D, 0); }
		public TerminalNode E() { return getToken(SCGParser.E, 0); }
		public TerminalNode F() { return getToken(SCGParser.F, 0); }
		public TerminalNode G() { return getToken(SCGParser.G, 0); }
		public TerminalNode H() { return getToken(SCGParser.H, 0); }
		public TerminalNode I() { return getToken(SCGParser.I, 0); }
		public TerminalNode J() { return getToken(SCGParser.J, 0); }
		public TerminalNode K() { return getToken(SCGParser.K, 0); }
		public TerminalNode L() { return getToken(SCGParser.L, 0); }
		public TerminalNode M() { return getToken(SCGParser.M, 0); }
		public TerminalNode N() { return getToken(SCGParser.N, 0); }
		public TerminalNode O() { return getToken(SCGParser.O, 0); }
		public TerminalNode P() { return getToken(SCGParser.P, 0); }
		public TerminalNode Q() { return getToken(SCGParser.Q, 0); }
		public TerminalNode R() { return getToken(SCGParser.R, 0); }
		public TerminalNode S() { return getToken(SCGParser.S, 0); }
		public TerminalNode T() { return getToken(SCGParser.T, 0); }
		public TerminalNode U() { return getToken(SCGParser.U, 0); }
		public TerminalNode V() { return getToken(SCGParser.V, 0); }
		public TerminalNode W() { return getToken(SCGParser.W, 0); }
		public TerminalNode X() { return getToken(SCGParser.X, 0); }
		public TerminalNode Y() { return getToken(SCGParser.Y, 0); }
		public TerminalNode Z() { return getToken(SCGParser.Z, 0); }
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(SCGParser.LEFT_CURLY_BRACE, 0); }
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(SCGParser.RIGHT_CURLY_BRACE, 0); }
		public TerminalNode TILDE() { return getToken(SCGParser.TILDE, 0); }
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
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterNonwsnonpipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitNonwsnonpipe(this);
		}
	}

	public final NonwsnonpipeContext nonwsnonpipe() throws RecognitionException {
		NonwsnonpipeContext _localctx = new NonwsnonpipeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_nonwsnonpipe);
		int _la;
		try {
			setState(362);
			_errHandler.sync(this);
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
				setState(357);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -32L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4294967295L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case RIGHT_CURLY_BRACE:
			case TILDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				_la = _input.LA(1);
				if ( !(_la==RIGHT_CURLY_BRACE || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
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
				setState(359);
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
				setState(360);
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
				setState(361);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnynonescapedcharContext extends ParserRuleContext {
		public HtabContext htab() {
			return getRuleContext(HtabContext.class,0);
		}
		public CrContext cr() {
			return getRuleContext(CrContext.class,0);
		}
		public LfContext lf() {
			return getRuleContext(LfContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(SCGParser.SPACE, 0); }
		public TerminalNode EXCLAMATION() { return getToken(SCGParser.EXCLAMATION, 0); }
		public TerminalNode POUND() { return getToken(SCGParser.POUND, 0); }
		public TerminalNode DOLLAR() { return getToken(SCGParser.DOLLAR, 0); }
		public TerminalNode PERCENT() { return getToken(SCGParser.PERCENT, 0); }
		public TerminalNode AMPERSAND() { return getToken(SCGParser.AMPERSAND, 0); }
		public TerminalNode APOSTROPHE() { return getToken(SCGParser.APOSTROPHE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SCGParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SCGParser.RIGHT_PAREN, 0); }
		public TerminalNode ASTERISK() { return getToken(SCGParser.ASTERISK, 0); }
		public TerminalNode PLUS() { return getToken(SCGParser.PLUS, 0); }
		public TerminalNode COMMA() { return getToken(SCGParser.COMMA, 0); }
		public TerminalNode DASH() { return getToken(SCGParser.DASH, 0); }
		public TerminalNode PERIOD() { return getToken(SCGParser.PERIOD, 0); }
		public TerminalNode SLASH() { return getToken(SCGParser.SLASH, 0); }
		public TerminalNode ZERO() { return getToken(SCGParser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(SCGParser.ONE, 0); }
		public TerminalNode TWO() { return getToken(SCGParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(SCGParser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(SCGParser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(SCGParser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(SCGParser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(SCGParser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(SCGParser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(SCGParser.NINE, 0); }
		public TerminalNode COLON() { return getToken(SCGParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(SCGParser.SEMICOLON, 0); }
		public TerminalNode LESS_THAN() { return getToken(SCGParser.LESS_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(SCGParser.EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SCGParser.GREATER_THAN, 0); }
		public TerminalNode QUESTION() { return getToken(SCGParser.QUESTION, 0); }
		public TerminalNode AT() { return getToken(SCGParser.AT, 0); }
		public TerminalNode CAP_A() { return getToken(SCGParser.CAP_A, 0); }
		public TerminalNode CAP_B() { return getToken(SCGParser.CAP_B, 0); }
		public TerminalNode CAP_C() { return getToken(SCGParser.CAP_C, 0); }
		public TerminalNode CAP_D() { return getToken(SCGParser.CAP_D, 0); }
		public TerminalNode CAP_E() { return getToken(SCGParser.CAP_E, 0); }
		public TerminalNode CAP_F() { return getToken(SCGParser.CAP_F, 0); }
		public TerminalNode CAP_G() { return getToken(SCGParser.CAP_G, 0); }
		public TerminalNode CAP_H() { return getToken(SCGParser.CAP_H, 0); }
		public TerminalNode CAP_I() { return getToken(SCGParser.CAP_I, 0); }
		public TerminalNode CAP_J() { return getToken(SCGParser.CAP_J, 0); }
		public TerminalNode CAP_K() { return getToken(SCGParser.CAP_K, 0); }
		public TerminalNode CAP_L() { return getToken(SCGParser.CAP_L, 0); }
		public TerminalNode CAP_M() { return getToken(SCGParser.CAP_M, 0); }
		public TerminalNode CAP_N() { return getToken(SCGParser.CAP_N, 0); }
		public TerminalNode CAP_O() { return getToken(SCGParser.CAP_O, 0); }
		public TerminalNode CAP_P() { return getToken(SCGParser.CAP_P, 0); }
		public TerminalNode CAP_Q() { return getToken(SCGParser.CAP_Q, 0); }
		public TerminalNode CAP_R() { return getToken(SCGParser.CAP_R, 0); }
		public TerminalNode CAP_S() { return getToken(SCGParser.CAP_S, 0); }
		public TerminalNode CAP_T() { return getToken(SCGParser.CAP_T, 0); }
		public TerminalNode CAP_U() { return getToken(SCGParser.CAP_U, 0); }
		public TerminalNode CAP_V() { return getToken(SCGParser.CAP_V, 0); }
		public TerminalNode CAP_W() { return getToken(SCGParser.CAP_W, 0); }
		public TerminalNode CAP_X() { return getToken(SCGParser.CAP_X, 0); }
		public TerminalNode CAP_Y() { return getToken(SCGParser.CAP_Y, 0); }
		public TerminalNode CAP_Z() { return getToken(SCGParser.CAP_Z, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(SCGParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(SCGParser.RIGHT_BRACE, 0); }
		public TerminalNode CARAT() { return getToken(SCGParser.CARAT, 0); }
		public TerminalNode UNDERSCORE() { return getToken(SCGParser.UNDERSCORE, 0); }
		public TerminalNode ACCENT() { return getToken(SCGParser.ACCENT, 0); }
		public TerminalNode A() { return getToken(SCGParser.A, 0); }
		public TerminalNode B() { return getToken(SCGParser.B, 0); }
		public TerminalNode C() { return getToken(SCGParser.C, 0); }
		public TerminalNode D() { return getToken(SCGParser.D, 0); }
		public TerminalNode E() { return getToken(SCGParser.E, 0); }
		public TerminalNode F() { return getToken(SCGParser.F, 0); }
		public TerminalNode G() { return getToken(SCGParser.G, 0); }
		public TerminalNode H() { return getToken(SCGParser.H, 0); }
		public TerminalNode I() { return getToken(SCGParser.I, 0); }
		public TerminalNode J() { return getToken(SCGParser.J, 0); }
		public TerminalNode K() { return getToken(SCGParser.K, 0); }
		public TerminalNode L() { return getToken(SCGParser.L, 0); }
		public TerminalNode M() { return getToken(SCGParser.M, 0); }
		public TerminalNode N() { return getToken(SCGParser.N, 0); }
		public TerminalNode O() { return getToken(SCGParser.O, 0); }
		public TerminalNode P() { return getToken(SCGParser.P, 0); }
		public TerminalNode Q() { return getToken(SCGParser.Q, 0); }
		public TerminalNode R() { return getToken(SCGParser.R, 0); }
		public TerminalNode S() { return getToken(SCGParser.S, 0); }
		public TerminalNode T() { return getToken(SCGParser.T, 0); }
		public TerminalNode U() { return getToken(SCGParser.U, 0); }
		public TerminalNode V() { return getToken(SCGParser.V, 0); }
		public TerminalNode W() { return getToken(SCGParser.W, 0); }
		public TerminalNode X() { return getToken(SCGParser.X, 0); }
		public TerminalNode Y() { return getToken(SCGParser.Y, 0); }
		public TerminalNode Z() { return getToken(SCGParser.Z, 0); }
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(SCGParser.LEFT_CURLY_BRACE, 0); }
		public TerminalNode PIPE() { return getToken(SCGParser.PIPE, 0); }
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(SCGParser.RIGHT_CURLY_BRACE, 0); }
		public TerminalNode TILDE() { return getToken(SCGParser.TILDE, 0); }
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
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterAnynonescapedchar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitAnynonescapedchar(this);
		}
	}

	public final AnynonescapedcharContext anynonescapedchar() throws RecognitionException {
		AnynonescapedcharContext _localctx = new AnynonescapedcharContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_anynonescapedchar);
		int _la;
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAB:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				htab();
				}
				break;
			case CR:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				cr();
				}
				break;
			case LF:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				lf();
				}
				break;
			case SPACE:
			case EXCLAMATION:
				enterOuterAlt(_localctx, 4);
				{
				setState(367);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==EXCLAMATION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
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
				enterOuterAlt(_localctx, 5);
				{
				setState(368);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -128L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
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
				setState(369);
				_la = _input.LA(1);
				if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 17179869183L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
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
				setState(370);
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
				setState(371);
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
				setState(372);
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

	@SuppressWarnings("CheckReturnValue")
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
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterEscapedchar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitEscapedchar(this);
		}
	}

	public final EscapedcharContext escapedchar() throws RecognitionException {
		EscapedcharContext _localctx = new EscapedcharContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_escapedchar);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(375);
				bs();
				setState(376);
				qm();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(378);
				bs();
				setState(379);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Utf8_2Context extends ParserRuleContext {
		public Utf8_tailContext utf8_tail() {
			return getRuleContext(Utf8_tailContext.class,0);
		}
		public TerminalNode U_00C2() { return getToken(SCGParser.U_00C2, 0); }
		public TerminalNode U_00C3() { return getToken(SCGParser.U_00C3, 0); }
		public TerminalNode U_00C4() { return getToken(SCGParser.U_00C4, 0); }
		public TerminalNode U_00C5() { return getToken(SCGParser.U_00C5, 0); }
		public TerminalNode U_00C6() { return getToken(SCGParser.U_00C6, 0); }
		public TerminalNode U_00C7() { return getToken(SCGParser.U_00C7, 0); }
		public TerminalNode U_00C8() { return getToken(SCGParser.U_00C8, 0); }
		public TerminalNode U_00C9() { return getToken(SCGParser.U_00C9, 0); }
		public TerminalNode U_00CA() { return getToken(SCGParser.U_00CA, 0); }
		public TerminalNode U_00CB() { return getToken(SCGParser.U_00CB, 0); }
		public TerminalNode U_00CC() { return getToken(SCGParser.U_00CC, 0); }
		public TerminalNode U_00CD() { return getToken(SCGParser.U_00CD, 0); }
		public TerminalNode U_00CE() { return getToken(SCGParser.U_00CE, 0); }
		public TerminalNode U_00CF() { return getToken(SCGParser.U_00CF, 0); }
		public TerminalNode U_00D0() { return getToken(SCGParser.U_00D0, 0); }
		public TerminalNode U_00D1() { return getToken(SCGParser.U_00D1, 0); }
		public TerminalNode U_00D2() { return getToken(SCGParser.U_00D2, 0); }
		public TerminalNode U_00D3() { return getToken(SCGParser.U_00D3, 0); }
		public TerminalNode U_00D4() { return getToken(SCGParser.U_00D4, 0); }
		public TerminalNode U_00D5() { return getToken(SCGParser.U_00D5, 0); }
		public TerminalNode U_00D6() { return getToken(SCGParser.U_00D6, 0); }
		public TerminalNode U_00D7() { return getToken(SCGParser.U_00D7, 0); }
		public TerminalNode U_00D8() { return getToken(SCGParser.U_00D8, 0); }
		public TerminalNode U_00D9() { return getToken(SCGParser.U_00D9, 0); }
		public TerminalNode U_00DA() { return getToken(SCGParser.U_00DA, 0); }
		public TerminalNode U_00DB() { return getToken(SCGParser.U_00DB, 0); }
		public TerminalNode U_00DC() { return getToken(SCGParser.U_00DC, 0); }
		public TerminalNode U_00DD() { return getToken(SCGParser.U_00DD, 0); }
		public TerminalNode U_00DE() { return getToken(SCGParser.U_00DE, 0); }
		public TerminalNode U_00DF() { return getToken(SCGParser.U_00DF, 0); }
		public Utf8_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utf8_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterUtf8_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitUtf8_2(this);
		}
	}

	public final Utf8_2Context utf8_2() throws RecognitionException {
		Utf8_2Context _localctx = new Utf8_2Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_utf8_2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_la = _input.LA(1);
			if ( !(((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 1073741823L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(384);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Utf8_3Context extends ParserRuleContext {
		public TerminalNode U_00E0() { return getToken(SCGParser.U_00E0, 0); }
		public List<Utf8_tailContext> utf8_tail() {
			return getRuleContexts(Utf8_tailContext.class);
		}
		public Utf8_tailContext utf8_tail(int i) {
			return getRuleContext(Utf8_tailContext.class,i);
		}
		public TerminalNode U_00A0() { return getToken(SCGParser.U_00A0, 0); }
		public TerminalNode U_00A1() { return getToken(SCGParser.U_00A1, 0); }
		public TerminalNode U_00A2() { return getToken(SCGParser.U_00A2, 0); }
		public TerminalNode U_00A3() { return getToken(SCGParser.U_00A3, 0); }
		public TerminalNode U_00A4() { return getToken(SCGParser.U_00A4, 0); }
		public TerminalNode U_00A5() { return getToken(SCGParser.U_00A5, 0); }
		public TerminalNode U_00A6() { return getToken(SCGParser.U_00A6, 0); }
		public TerminalNode U_00A7() { return getToken(SCGParser.U_00A7, 0); }
		public TerminalNode U_00A8() { return getToken(SCGParser.U_00A8, 0); }
		public TerminalNode U_00A9() { return getToken(SCGParser.U_00A9, 0); }
		public TerminalNode U_00AA() { return getToken(SCGParser.U_00AA, 0); }
		public TerminalNode U_00AB() { return getToken(SCGParser.U_00AB, 0); }
		public TerminalNode U_00AC() { return getToken(SCGParser.U_00AC, 0); }
		public TerminalNode U_00AD() { return getToken(SCGParser.U_00AD, 0); }
		public TerminalNode U_00AE() { return getToken(SCGParser.U_00AE, 0); }
		public TerminalNode U_00AF() { return getToken(SCGParser.U_00AF, 0); }
		public TerminalNode U_00B0() { return getToken(SCGParser.U_00B0, 0); }
		public TerminalNode U_00B1() { return getToken(SCGParser.U_00B1, 0); }
		public TerminalNode U_00B2() { return getToken(SCGParser.U_00B2, 0); }
		public TerminalNode U_00B3() { return getToken(SCGParser.U_00B3, 0); }
		public TerminalNode U_00B4() { return getToken(SCGParser.U_00B4, 0); }
		public TerminalNode U_00B5() { return getToken(SCGParser.U_00B5, 0); }
		public TerminalNode U_00B6() { return getToken(SCGParser.U_00B6, 0); }
		public TerminalNode U_00B7() { return getToken(SCGParser.U_00B7, 0); }
		public TerminalNode U_00B8() { return getToken(SCGParser.U_00B8, 0); }
		public TerminalNode U_00B9() { return getToken(SCGParser.U_00B9, 0); }
		public TerminalNode U_00BA() { return getToken(SCGParser.U_00BA, 0); }
		public TerminalNode U_00BB() { return getToken(SCGParser.U_00BB, 0); }
		public TerminalNode U_00BC() { return getToken(SCGParser.U_00BC, 0); }
		public TerminalNode U_00BD() { return getToken(SCGParser.U_00BD, 0); }
		public TerminalNode U_00BE() { return getToken(SCGParser.U_00BE, 0); }
		public TerminalNode U_00BF() { return getToken(SCGParser.U_00BF, 0); }
		public TerminalNode U_00E1() { return getToken(SCGParser.U_00E1, 0); }
		public TerminalNode U_00E2() { return getToken(SCGParser.U_00E2, 0); }
		public TerminalNode U_00E3() { return getToken(SCGParser.U_00E3, 0); }
		public TerminalNode U_00E4() { return getToken(SCGParser.U_00E4, 0); }
		public TerminalNode U_00E5() { return getToken(SCGParser.U_00E5, 0); }
		public TerminalNode U_00E6() { return getToken(SCGParser.U_00E6, 0); }
		public TerminalNode U_00E7() { return getToken(SCGParser.U_00E7, 0); }
		public TerminalNode U_00E8() { return getToken(SCGParser.U_00E8, 0); }
		public TerminalNode U_00E9() { return getToken(SCGParser.U_00E9, 0); }
		public TerminalNode U_00EA() { return getToken(SCGParser.U_00EA, 0); }
		public TerminalNode U_00EB() { return getToken(SCGParser.U_00EB, 0); }
		public TerminalNode U_00EC() { return getToken(SCGParser.U_00EC, 0); }
		public TerminalNode U_00ED() { return getToken(SCGParser.U_00ED, 0); }
		public TerminalNode U_0080() { return getToken(SCGParser.U_0080, 0); }
		public TerminalNode U_0081() { return getToken(SCGParser.U_0081, 0); }
		public TerminalNode U_0082() { return getToken(SCGParser.U_0082, 0); }
		public TerminalNode U_0083() { return getToken(SCGParser.U_0083, 0); }
		public TerminalNode U_0084() { return getToken(SCGParser.U_0084, 0); }
		public TerminalNode U_0085() { return getToken(SCGParser.U_0085, 0); }
		public TerminalNode U_0086() { return getToken(SCGParser.U_0086, 0); }
		public TerminalNode U_0087() { return getToken(SCGParser.U_0087, 0); }
		public TerminalNode U_0088() { return getToken(SCGParser.U_0088, 0); }
		public TerminalNode U_0089() { return getToken(SCGParser.U_0089, 0); }
		public TerminalNode U_008A() { return getToken(SCGParser.U_008A, 0); }
		public TerminalNode U_008B() { return getToken(SCGParser.U_008B, 0); }
		public TerminalNode U_008C() { return getToken(SCGParser.U_008C, 0); }
		public TerminalNode U_008D() { return getToken(SCGParser.U_008D, 0); }
		public TerminalNode U_008E() { return getToken(SCGParser.U_008E, 0); }
		public TerminalNode U_008F() { return getToken(SCGParser.U_008F, 0); }
		public TerminalNode U_0090() { return getToken(SCGParser.U_0090, 0); }
		public TerminalNode U_0091() { return getToken(SCGParser.U_0091, 0); }
		public TerminalNode U_0092() { return getToken(SCGParser.U_0092, 0); }
		public TerminalNode U_0093() { return getToken(SCGParser.U_0093, 0); }
		public TerminalNode U_0094() { return getToken(SCGParser.U_0094, 0); }
		public TerminalNode U_0095() { return getToken(SCGParser.U_0095, 0); }
		public TerminalNode U_0096() { return getToken(SCGParser.U_0096, 0); }
		public TerminalNode U_0097() { return getToken(SCGParser.U_0097, 0); }
		public TerminalNode U_0098() { return getToken(SCGParser.U_0098, 0); }
		public TerminalNode U_0099() { return getToken(SCGParser.U_0099, 0); }
		public TerminalNode U_009A() { return getToken(SCGParser.U_009A, 0); }
		public TerminalNode U_009B() { return getToken(SCGParser.U_009B, 0); }
		public TerminalNode U_009C() { return getToken(SCGParser.U_009C, 0); }
		public TerminalNode U_009D() { return getToken(SCGParser.U_009D, 0); }
		public TerminalNode U_009E() { return getToken(SCGParser.U_009E, 0); }
		public TerminalNode U_009F() { return getToken(SCGParser.U_009F, 0); }
		public TerminalNode U_00EE() { return getToken(SCGParser.U_00EE, 0); }
		public TerminalNode U_00EF() { return getToken(SCGParser.U_00EF, 0); }
		public Utf8_3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utf8_3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterUtf8_3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitUtf8_3(this);
		}
	}

	public final Utf8_3Context utf8_3() throws RecognitionException {
		Utf8_3Context _localctx = new Utf8_3Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_utf8_3);
		int _la;
		try {
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case U_00E0:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(386);
				match(U_00E0);
				setState(387);
				_la = _input.LA(1);
				if ( !(((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 4294967295L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(388);
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
				setState(389);
				_la = _input.LA(1);
				if ( !(((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & 4095L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(390);
				utf8_tail();
				}
				{
				setState(391);
				utf8_tail();
				}
				}
				}
				break;
			case U_00ED:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(393);
				match(U_00ED);
				setState(394);
				_la = _input.LA(1);
				if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 4294967295L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(395);
				utf8_tail();
				}
				}
				break;
			case U_00EE:
			case U_00EF:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(396);
				_la = _input.LA(1);
				if ( !(_la==U_00EE || _la==U_00EF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(397);
				utf8_tail();
				}
				{
				setState(398);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Utf8_4Context extends ParserRuleContext {
		public TerminalNode U_00F0() { return getToken(SCGParser.U_00F0, 0); }
		public TerminalNode U_0090() { return getToken(SCGParser.U_0090, 0); }
		public TerminalNode U_0091() { return getToken(SCGParser.U_0091, 0); }
		public TerminalNode U_0092() { return getToken(SCGParser.U_0092, 0); }
		public TerminalNode U_0093() { return getToken(SCGParser.U_0093, 0); }
		public TerminalNode U_0094() { return getToken(SCGParser.U_0094, 0); }
		public TerminalNode U_0095() { return getToken(SCGParser.U_0095, 0); }
		public TerminalNode U_0096() { return getToken(SCGParser.U_0096, 0); }
		public TerminalNode U_0097() { return getToken(SCGParser.U_0097, 0); }
		public TerminalNode U_0098() { return getToken(SCGParser.U_0098, 0); }
		public TerminalNode U_0099() { return getToken(SCGParser.U_0099, 0); }
		public TerminalNode U_009A() { return getToken(SCGParser.U_009A, 0); }
		public TerminalNode U_009B() { return getToken(SCGParser.U_009B, 0); }
		public TerminalNode U_009C() { return getToken(SCGParser.U_009C, 0); }
		public TerminalNode U_009D() { return getToken(SCGParser.U_009D, 0); }
		public TerminalNode U_009E() { return getToken(SCGParser.U_009E, 0); }
		public TerminalNode U_009F() { return getToken(SCGParser.U_009F, 0); }
		public TerminalNode U_00A0() { return getToken(SCGParser.U_00A0, 0); }
		public TerminalNode U_00A1() { return getToken(SCGParser.U_00A1, 0); }
		public TerminalNode U_00A2() { return getToken(SCGParser.U_00A2, 0); }
		public TerminalNode U_00A3() { return getToken(SCGParser.U_00A3, 0); }
		public TerminalNode U_00A4() { return getToken(SCGParser.U_00A4, 0); }
		public TerminalNode U_00A5() { return getToken(SCGParser.U_00A5, 0); }
		public TerminalNode U_00A6() { return getToken(SCGParser.U_00A6, 0); }
		public TerminalNode U_00A7() { return getToken(SCGParser.U_00A7, 0); }
		public TerminalNode U_00A8() { return getToken(SCGParser.U_00A8, 0); }
		public TerminalNode U_00A9() { return getToken(SCGParser.U_00A9, 0); }
		public TerminalNode U_00AA() { return getToken(SCGParser.U_00AA, 0); }
		public TerminalNode U_00AB() { return getToken(SCGParser.U_00AB, 0); }
		public TerminalNode U_00AC() { return getToken(SCGParser.U_00AC, 0); }
		public TerminalNode U_00AD() { return getToken(SCGParser.U_00AD, 0); }
		public TerminalNode U_00AE() { return getToken(SCGParser.U_00AE, 0); }
		public TerminalNode U_00AF() { return getToken(SCGParser.U_00AF, 0); }
		public TerminalNode U_00B0() { return getToken(SCGParser.U_00B0, 0); }
		public TerminalNode U_00B1() { return getToken(SCGParser.U_00B1, 0); }
		public TerminalNode U_00B2() { return getToken(SCGParser.U_00B2, 0); }
		public TerminalNode U_00B3() { return getToken(SCGParser.U_00B3, 0); }
		public TerminalNode U_00B4() { return getToken(SCGParser.U_00B4, 0); }
		public TerminalNode U_00B5() { return getToken(SCGParser.U_00B5, 0); }
		public TerminalNode U_00B6() { return getToken(SCGParser.U_00B6, 0); }
		public TerminalNode U_00B7() { return getToken(SCGParser.U_00B7, 0); }
		public TerminalNode U_00B8() { return getToken(SCGParser.U_00B8, 0); }
		public TerminalNode U_00B9() { return getToken(SCGParser.U_00B9, 0); }
		public TerminalNode U_00BA() { return getToken(SCGParser.U_00BA, 0); }
		public TerminalNode U_00BB() { return getToken(SCGParser.U_00BB, 0); }
		public TerminalNode U_00BC() { return getToken(SCGParser.U_00BC, 0); }
		public TerminalNode U_00BD() { return getToken(SCGParser.U_00BD, 0); }
		public TerminalNode U_00BE() { return getToken(SCGParser.U_00BE, 0); }
		public TerminalNode U_00BF() { return getToken(SCGParser.U_00BF, 0); }
		public List<Utf8_tailContext> utf8_tail() {
			return getRuleContexts(Utf8_tailContext.class);
		}
		public Utf8_tailContext utf8_tail(int i) {
			return getRuleContext(Utf8_tailContext.class,i);
		}
		public TerminalNode U_00F1() { return getToken(SCGParser.U_00F1, 0); }
		public TerminalNode U_00F2() { return getToken(SCGParser.U_00F2, 0); }
		public TerminalNode U_00F3() { return getToken(SCGParser.U_00F3, 0); }
		public TerminalNode U_00F4() { return getToken(SCGParser.U_00F4, 0); }
		public TerminalNode U_0080() { return getToken(SCGParser.U_0080, 0); }
		public TerminalNode U_0081() { return getToken(SCGParser.U_0081, 0); }
		public TerminalNode U_0082() { return getToken(SCGParser.U_0082, 0); }
		public TerminalNode U_0083() { return getToken(SCGParser.U_0083, 0); }
		public TerminalNode U_0084() { return getToken(SCGParser.U_0084, 0); }
		public TerminalNode U_0085() { return getToken(SCGParser.U_0085, 0); }
		public TerminalNode U_0086() { return getToken(SCGParser.U_0086, 0); }
		public TerminalNode U_0087() { return getToken(SCGParser.U_0087, 0); }
		public TerminalNode U_0088() { return getToken(SCGParser.U_0088, 0); }
		public TerminalNode U_0089() { return getToken(SCGParser.U_0089, 0); }
		public TerminalNode U_008A() { return getToken(SCGParser.U_008A, 0); }
		public TerminalNode U_008B() { return getToken(SCGParser.U_008B, 0); }
		public TerminalNode U_008C() { return getToken(SCGParser.U_008C, 0); }
		public TerminalNode U_008D() { return getToken(SCGParser.U_008D, 0); }
		public TerminalNode U_008E() { return getToken(SCGParser.U_008E, 0); }
		public TerminalNode U_008F() { return getToken(SCGParser.U_008F, 0); }
		public Utf8_4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utf8_4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterUtf8_4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitUtf8_4(this);
		}
	}

	public final Utf8_4Context utf8_4() throws RecognitionException {
		Utf8_4Context _localctx = new Utf8_4Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_utf8_4);
		int _la;
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case U_00F0:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(402);
				match(U_00F0);
				setState(403);
				_la = _input.LA(1);
				if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 281474976710655L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(404);
				utf8_tail();
				}
				{
				setState(405);
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
				setState(407);
				_la = _input.LA(1);
				if ( !(((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(408);
				utf8_tail();
				}
				{
				setState(409);
				utf8_tail();
				}
				{
				setState(410);
				utf8_tail();
				}
				}
				}
				break;
			case U_00F4:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(412);
				match(U_00F4);
				setState(413);
				_la = _input.LA(1);
				if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 65535L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(414);
				utf8_tail();
				}
				{
				setState(415);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Utf8_tailContext extends ParserRuleContext {
		public TerminalNode U_0080() { return getToken(SCGParser.U_0080, 0); }
		public TerminalNode U_0081() { return getToken(SCGParser.U_0081, 0); }
		public TerminalNode U_0082() { return getToken(SCGParser.U_0082, 0); }
		public TerminalNode U_0083() { return getToken(SCGParser.U_0083, 0); }
		public TerminalNode U_0084() { return getToken(SCGParser.U_0084, 0); }
		public TerminalNode U_0085() { return getToken(SCGParser.U_0085, 0); }
		public TerminalNode U_0086() { return getToken(SCGParser.U_0086, 0); }
		public TerminalNode U_0087() { return getToken(SCGParser.U_0087, 0); }
		public TerminalNode U_0088() { return getToken(SCGParser.U_0088, 0); }
		public TerminalNode U_0089() { return getToken(SCGParser.U_0089, 0); }
		public TerminalNode U_008A() { return getToken(SCGParser.U_008A, 0); }
		public TerminalNode U_008B() { return getToken(SCGParser.U_008B, 0); }
		public TerminalNode U_008C() { return getToken(SCGParser.U_008C, 0); }
		public TerminalNode U_008D() { return getToken(SCGParser.U_008D, 0); }
		public TerminalNode U_008E() { return getToken(SCGParser.U_008E, 0); }
		public TerminalNode U_008F() { return getToken(SCGParser.U_008F, 0); }
		public TerminalNode U_0090() { return getToken(SCGParser.U_0090, 0); }
		public TerminalNode U_0091() { return getToken(SCGParser.U_0091, 0); }
		public TerminalNode U_0092() { return getToken(SCGParser.U_0092, 0); }
		public TerminalNode U_0093() { return getToken(SCGParser.U_0093, 0); }
		public TerminalNode U_0094() { return getToken(SCGParser.U_0094, 0); }
		public TerminalNode U_0095() { return getToken(SCGParser.U_0095, 0); }
		public TerminalNode U_0096() { return getToken(SCGParser.U_0096, 0); }
		public TerminalNode U_0097() { return getToken(SCGParser.U_0097, 0); }
		public TerminalNode U_0098() { return getToken(SCGParser.U_0098, 0); }
		public TerminalNode U_0099() { return getToken(SCGParser.U_0099, 0); }
		public TerminalNode U_009A() { return getToken(SCGParser.U_009A, 0); }
		public TerminalNode U_009B() { return getToken(SCGParser.U_009B, 0); }
		public TerminalNode U_009C() { return getToken(SCGParser.U_009C, 0); }
		public TerminalNode U_009D() { return getToken(SCGParser.U_009D, 0); }
		public TerminalNode U_009E() { return getToken(SCGParser.U_009E, 0); }
		public TerminalNode U_009F() { return getToken(SCGParser.U_009F, 0); }
		public TerminalNode U_00A0() { return getToken(SCGParser.U_00A0, 0); }
		public TerminalNode U_00A1() { return getToken(SCGParser.U_00A1, 0); }
		public TerminalNode U_00A2() { return getToken(SCGParser.U_00A2, 0); }
		public TerminalNode U_00A3() { return getToken(SCGParser.U_00A3, 0); }
		public TerminalNode U_00A4() { return getToken(SCGParser.U_00A4, 0); }
		public TerminalNode U_00A5() { return getToken(SCGParser.U_00A5, 0); }
		public TerminalNode U_00A6() { return getToken(SCGParser.U_00A6, 0); }
		public TerminalNode U_00A7() { return getToken(SCGParser.U_00A7, 0); }
		public TerminalNode U_00A8() { return getToken(SCGParser.U_00A8, 0); }
		public TerminalNode U_00A9() { return getToken(SCGParser.U_00A9, 0); }
		public TerminalNode U_00AA() { return getToken(SCGParser.U_00AA, 0); }
		public TerminalNode U_00AB() { return getToken(SCGParser.U_00AB, 0); }
		public TerminalNode U_00AC() { return getToken(SCGParser.U_00AC, 0); }
		public TerminalNode U_00AD() { return getToken(SCGParser.U_00AD, 0); }
		public TerminalNode U_00AE() { return getToken(SCGParser.U_00AE, 0); }
		public TerminalNode U_00AF() { return getToken(SCGParser.U_00AF, 0); }
		public TerminalNode U_00B0() { return getToken(SCGParser.U_00B0, 0); }
		public TerminalNode U_00B1() { return getToken(SCGParser.U_00B1, 0); }
		public TerminalNode U_00B2() { return getToken(SCGParser.U_00B2, 0); }
		public TerminalNode U_00B3() { return getToken(SCGParser.U_00B3, 0); }
		public TerminalNode U_00B4() { return getToken(SCGParser.U_00B4, 0); }
		public TerminalNode U_00B5() { return getToken(SCGParser.U_00B5, 0); }
		public TerminalNode U_00B6() { return getToken(SCGParser.U_00B6, 0); }
		public TerminalNode U_00B7() { return getToken(SCGParser.U_00B7, 0); }
		public TerminalNode U_00B8() { return getToken(SCGParser.U_00B8, 0); }
		public TerminalNode U_00B9() { return getToken(SCGParser.U_00B9, 0); }
		public TerminalNode U_00BA() { return getToken(SCGParser.U_00BA, 0); }
		public TerminalNode U_00BB() { return getToken(SCGParser.U_00BB, 0); }
		public TerminalNode U_00BC() { return getToken(SCGParser.U_00BC, 0); }
		public TerminalNode U_00BD() { return getToken(SCGParser.U_00BD, 0); }
		public TerminalNode U_00BE() { return getToken(SCGParser.U_00BE, 0); }
		public TerminalNode U_00BF() { return getToken(SCGParser.U_00BF, 0); }
		public Utf8_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utf8_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).enterUtf8_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SCGListener ) ((SCGListener)listener).exitUtf8_tail(this);
		}
	}

	public final Utf8_tailContext utf8_tail() throws RecognitionException {
		Utf8_tailContext _localctx = new Utf8_tailContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_utf8_tail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & -1L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		"\u0004\u0001\u00d5\u01a6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000Q\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001]\b\u0001\u0001\u0002\u0001\u0002\u0003"+
		"\u0002a\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005q\b\u0005\n\u0005"+
		"\f\u0005t\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006~\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0005\b\u0084\b\b\n\b\f\b\u0087\t\b"+
		"\u0001\b\u0005\b\u008a\b\b\n\b\f\b\u008d\t\b\u0001\t\u0001\t\u0003\t\u0091"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u0096\b\t\u0001\t\u0001\t\u0005\t"+
		"\u009a\b\t\n\t\f\t\u009d\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00ab\b\u000b\n\u000b\f\u000b\u00ae\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00bf\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00c8\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0004\u0010\u00cc\b\u0010\u000b\u0010\f\u0010\u00cd\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00d2\b\u0011\u0001\u0012\u0003\u0012\u00d5\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00d9\b\u0012\n\u0012\f\u0012\u00dc"+
		"\t\u0012\u0001\u0012\u0003\u0012\u00df\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0004\u0013\u00e4\b\u0013\u000b\u0013\f\u0013\u00e5\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00ef\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0149\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u014f\b\u0015\n\u0015\f\u0015\u0152\t\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u016b\b\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u0176\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u017e\b!\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0191\b#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u01a2\b$\u0001%\u0001%\u0001%\u0000\u0000"+
		"&\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJ\u0000\u0011\u0002\u0000\u000f\u000f"+
		"\u0011\u0011\u0001\u0000\u0014\u001d\u0001\u0000\u0015\u001d\u0001\u0000"+
		"\u0005_\u0001\u0000ab\u0001\u0000\u0004\u0005\u0001\u0000\u0007?\u0001"+
		"\u0000Ab\u0001\u0000\u00a3\u00c0\u0001\u0000\u0083\u00a2\u0001\u0000\u00c2"+
		"\u00cd\u0001\u0000c\u0082\u0001\u0000\u00cf\u00d0\u0001\u0000s\u00a2\u0001"+
		"\u0000\u00d2\u00d4\u0001\u0000cr\u0001\u0000c\u00a2\u01b6\u0000L\u0001"+
		"\u0000\u0000\u0000\u0002V\u0001\u0000\u0000\u0000\u0004`\u0001\u0000\u0000"+
		"\u0000\u0006b\u0001\u0000\u0000\u0000\bf\u0001\u0000\u0000\u0000\nj\u0001"+
		"\u0000\u0000\u0000\fu\u0001\u0000\u0000\u0000\u000e\u007f\u0001\u0000"+
		"\u0000\u0000\u0010\u0081\u0001\u0000\u0000\u0000\u0012\u0090\u0001\u0000"+
		"\u0000\u0000\u0014\u009e\u0001\u0000\u0000\u0000\u0016\u00a4\u0001\u0000"+
		"\u0000\u0000\u0018\u00af\u0001\u0000\u0000\u0000\u001a\u00b5\u0001\u0000"+
		"\u0000\u0000\u001c\u00be\u0001\u0000\u0000\u0000\u001e\u00c7\u0001\u0000"+
		"\u0000\u0000 \u00cb\u0001\u0000\u0000\u0000\"\u00d1\u0001\u0000\u0000"+
		"\u0000$\u00de\u0001\u0000\u0000\u0000&\u00e0\u0001\u0000\u0000\u0000("+
		"\u00e7\u0001\u0000\u0000\u0000*\u0150\u0001\u0000\u0000\u0000,\u0153\u0001"+
		"\u0000\u0000\u0000.\u0155\u0001\u0000\u0000\u00000\u0157\u0001\u0000\u0000"+
		"\u00002\u0159\u0001\u0000\u0000\u00004\u015b\u0001\u0000\u0000\u00006"+
		"\u015d\u0001\u0000\u0000\u00008\u015f\u0001\u0000\u0000\u0000:\u0161\u0001"+
		"\u0000\u0000\u0000<\u0163\u0001\u0000\u0000\u0000>\u016a\u0001\u0000\u0000"+
		"\u0000@\u0175\u0001\u0000\u0000\u0000B\u017d\u0001\u0000\u0000\u0000D"+
		"\u017f\u0001\u0000\u0000\u0000F\u0190\u0001\u0000\u0000\u0000H\u01a1\u0001"+
		"\u0000\u0000\u0000J\u01a3\u0001\u0000\u0000\u0000LP\u0003*\u0015\u0000"+
		"MN\u0003\u0004\u0002\u0000NO\u0003*\u0015\u0000OQ\u0001\u0000\u0000\u0000"+
		"PM\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RS\u0003\u0002\u0001\u0000ST\u0003*\u0015\u0000TU\u0005\u0000\u0000"+
		"\u0001U\u0001\u0001\u0000\u0000\u0000V\\\u0003\n\u0005\u0000WX\u0003*"+
		"\u0015\u0000XY\u0005\u001e\u0000\u0000YZ\u0003*\u0015\u0000Z[\u0003\u0012"+
		"\t\u0000[]\u0001\u0000\u0000\u0000\\W\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]\u0003\u0001\u0000\u0000\u0000^a\u0003\u0006\u0003"+
		"\u0000_a\u0003\b\u0004\u0000`^\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000"+
		"\u0000a\u0005\u0001\u0000\u0000\u0000bc\u0005!\u0000\u0000cd\u0005!\u0000"+
		"\u0000de\u0005!\u0000\u0000e\u0007\u0001\u0000\u0000\u0000fg\u0005 \u0000"+
		"\u0000gh\u0005 \u0000\u0000hi\u0005 \u0000\u0000i\t\u0001\u0000\u0000"+
		"\u0000jr\u0003\f\u0006\u0000kl\u0003*\u0015\u0000lm\u0005\u000f\u0000"+
		"\u0000mn\u0003*\u0015\u0000no\u0003\f\u0006\u0000oq\u0001\u0000\u0000"+
		"\u0000pk\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000s\u000b\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000u}\u0003\u000e\u0007\u0000vw\u0003*\u0015\u0000"+
		"wx\u0005`\u0000\u0000xy\u0003*\u0015\u0000yz\u0003\u0010\b\u0000z{\u0003"+
		"*\u0015\u0000{|\u0005`\u0000\u0000|~\u0001\u0000\u0000\u0000}v\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\r\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0003(\u0014\u0000\u0080\u000f\u0001\u0000\u0000\u0000\u0081\u008b"+
		"\u0003>\u001f\u0000\u0082\u0084\u0003,\u0016\u0000\u0083\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008a\u0003>\u001f"+
		"\u0000\u0089\u0085\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u0011\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008e\u0091\u0003\u0016\u000b\u0000\u008f\u0091\u0003\u0014\n\u0000"+
		"\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u009b\u0001\u0000\u0000\u0000\u0092\u0095\u0003*\u0015\u0000\u0093"+
		"\u0094\u0005\u0010\u0000\u0000\u0094\u0096\u0003*\u0015\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0003\u0014\n\u0000\u0098\u009a\u0001"+
		"\u0000\u0000\u0000\u0099\u0092\u0001\u0000\u0000\u0000\u009a\u009d\u0001"+
		"\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c\u0013\u0001\u0000\u0000\u0000\u009d\u009b\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0005_\u0000\u0000\u009f\u00a0\u0003*\u0015"+
		"\u0000\u00a0\u00a1\u0003\u0016\u000b\u0000\u00a1\u00a2\u0003*\u0015\u0000"+
		"\u00a2\u00a3\u0005a\u0000\u0000\u00a3\u0015\u0001\u0000\u0000\u0000\u00a4"+
		"\u00ac\u0003\u0018\f\u0000\u00a5\u00a6\u0003*\u0015\u0000\u00a6\u00a7"+
		"\u0005\u0010\u0000\u0000\u00a7\u00a8\u0003*\u0015\u0000\u00a8\u00a9\u0003"+
		"\u0018\f\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a5\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u0017\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0\u0003\u001a"+
		"\r\u0000\u00b0\u00b1\u0003*\u0015\u0000\u00b1\u00b2\u0005!\u0000\u0000"+
		"\u00b2\u00b3\u0003*\u0015\u0000\u00b3\u00b4\u0003\u001c\u000e\u0000\u00b4"+
		"\u0019\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003\f\u0006\u0000\u00b6\u001b"+
		"\u0001\u0000\u0000\u0000\u00b7\u00bf\u0003\u001e\u000f\u0000\u00b8\u00b9"+
		"\u00034\u001a\u0000\u00b9\u00ba\u0003 \u0010\u0000\u00ba\u00bb\u00034"+
		"\u001a\u0000\u00bb\u00bf\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0007"+
		"\u0000\u0000\u00bd\u00bf\u0003\"\u0011\u0000\u00be\u00b7\u0001\u0000\u0000"+
		"\u0000\u00be\u00b8\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bf\u001d\u0001\u0000\u0000\u0000\u00c0\u00c8\u0003\f\u0006\u0000"+
		"\u00c1\u00c2\u0005\f\u0000\u0000\u00c2\u00c3\u0003*\u0015\u0000\u00c3"+
		"\u00c4\u0003\u0002\u0001\u0000\u00c4\u00c5\u0003*\u0015\u0000\u00c5\u00c6"+
		"\u0005\r\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c1\u0001\u0000\u0000\u0000\u00c8\u001f\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cc\u0003@ \u0000\u00ca\u00cc\u0003B!\u0000"+
		"\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce!\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d2\u0003&\u0013\u0000\u00d0\u00d2\u0003$\u0012\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2#\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d5\u0007\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00da\u0003<\u001e\u0000\u00d7\u00d9\u00038\u001c\u0000"+
		"\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000"+
		"\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000"+
		"\u00db\u00df\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000"+
		"\u00dd\u00df\u0003:\u001d\u0000\u00de\u00d4\u0001\u0000\u0000\u0000\u00de"+
		"\u00dd\u0001\u0000\u0000\u0000\u00df%\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0003$\u0012\u0000\u00e1\u00e3\u0005\u0012\u0000\u0000\u00e2\u00e4\u0003"+
		"8\u001c\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6\'\u0001\u0000\u0000\u0000\u00e7\u00e8\u0003<\u001e"+
		"\u0000\u00e8\u00e9\u00038\u001c\u0000\u00e9\u00ea\u00038\u001c\u0000\u00ea"+
		"\u00eb\u00038\u001c\u0000\u00eb\u00ec\u00038\u001c\u0000\u00ec\u0148\u0003"+
		"8\u001c\u0000\u00ed\u00ef\u00038\u001c\u0000\u00ee\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u0149\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u00038\u001c\u0000\u00f1\u00f2\u00038\u001c\u0000\u00f2"+
		"\u0149\u0001\u0000\u0000\u0000\u00f3\u00f4\u00038\u001c\u0000\u00f4\u00f5"+
		"\u00038\u001c\u0000\u00f5\u00f6\u00038\u001c\u0000\u00f6\u0149\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\u00038\u001c\u0000\u00f8\u00f9\u00038\u001c\u0000"+
		"\u00f9\u00fa\u00038\u001c\u0000\u00fa\u00fb\u00038\u001c\u0000\u00fb\u0149"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u00038\u001c\u0000\u00fd\u00fe\u0003"+
		"8\u001c\u0000\u00fe\u00ff\u00038\u001c\u0000\u00ff\u0100\u00038\u001c"+
		"\u0000\u0100\u0101\u00038\u001c\u0000\u0101\u0149\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u00038\u001c\u0000\u0103\u0104\u00038\u001c\u0000\u0104\u0105"+
		"\u00038\u001c\u0000\u0105\u0106\u00038\u001c\u0000\u0106\u0107\u00038"+
		"\u001c\u0000\u0107\u0108\u00038\u001c\u0000\u0108\u0149\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u00038\u001c\u0000\u010a\u010b\u00038\u001c\u0000\u010b"+
		"\u010c\u00038\u001c\u0000\u010c\u010d\u00038\u001c\u0000\u010d\u010e\u0003"+
		"8\u001c\u0000\u010e\u010f\u00038\u001c\u0000\u010f\u0110\u00038\u001c"+
		"\u0000\u0110\u0149\u0001\u0000\u0000\u0000\u0111\u0112\u00038\u001c\u0000"+
		"\u0112\u0113\u00038\u001c\u0000\u0113\u0114\u00038\u001c\u0000\u0114\u0115"+
		"\u00038\u001c\u0000\u0115\u0116\u00038\u001c\u0000\u0116\u0117\u00038"+
		"\u001c\u0000\u0117\u0118\u00038\u001c\u0000\u0118\u0119\u00038\u001c\u0000"+
		"\u0119\u0149\u0001\u0000\u0000\u0000\u011a\u011b\u00038\u001c\u0000\u011b"+
		"\u011c\u00038\u001c\u0000\u011c\u011d\u00038\u001c\u0000\u011d\u011e\u0003"+
		"8\u001c\u0000\u011e\u011f\u00038\u001c\u0000\u011f\u0120\u00038\u001c"+
		"\u0000\u0120\u0121\u00038\u001c\u0000\u0121\u0122\u00038\u001c\u0000\u0122"+
		"\u0123\u00038\u001c\u0000\u0123\u0149\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u00038\u001c\u0000\u0125\u0126\u00038\u001c\u0000\u0126\u0127\u00038"+
		"\u001c\u0000\u0127\u0128\u00038\u001c\u0000\u0128\u0129\u00038\u001c\u0000"+
		"\u0129\u012a\u00038\u001c\u0000\u012a\u012b\u00038\u001c\u0000\u012b\u012c"+
		"\u00038\u001c\u0000\u012c\u012d\u00038\u001c\u0000\u012d\u012e\u00038"+
		"\u001c\u0000\u012e\u0149\u0001\u0000\u0000\u0000\u012f\u0130\u00038\u001c"+
		"\u0000\u0130\u0131\u00038\u001c\u0000\u0131\u0132\u00038\u001c\u0000\u0132"+
		"\u0133\u00038\u001c\u0000\u0133\u0134\u00038\u001c\u0000\u0134\u0135\u0003"+
		"8\u001c\u0000\u0135\u0136\u00038\u001c\u0000\u0136\u0137\u00038\u001c"+
		"\u0000\u0137\u0138\u00038\u001c\u0000\u0138\u0139\u00038\u001c\u0000\u0139"+
		"\u013a\u00038\u001c\u0000\u013a\u0149\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u00038\u001c\u0000\u013c\u013d\u00038\u001c\u0000\u013d\u013e\u00038"+
		"\u001c\u0000\u013e\u013f\u00038\u001c\u0000\u013f\u0140\u00038\u001c\u0000"+
		"\u0140\u0141\u00038\u001c\u0000\u0141\u0142\u00038\u001c\u0000\u0142\u0143"+
		"\u00038\u001c\u0000\u0143\u0144\u00038\u001c\u0000\u0144\u0145\u00038"+
		"\u001c\u0000\u0145\u0146\u00038\u001c\u0000\u0146\u0147\u00038\u001c\u0000"+
		"\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u00ee\u0001\u0000\u0000\u0000"+
		"\u0148\u00f0\u0001\u0000\u0000\u0000\u0148\u00f3\u0001\u0000\u0000\u0000"+
		"\u0148\u00f7\u0001\u0000\u0000\u0000\u0148\u00fc\u0001\u0000\u0000\u0000"+
		"\u0148\u0102\u0001\u0000\u0000\u0000\u0148\u0109\u0001\u0000\u0000\u0000"+
		"\u0148\u0111\u0001\u0000\u0000\u0000\u0148\u011a\u0001\u0000\u0000\u0000"+
		"\u0148\u0124\u0001\u0000\u0000\u0000\u0148\u012f\u0001\u0000\u0000\u0000"+
		"\u0148\u013b\u0001\u0000\u0000\u0000\u0149)\u0001\u0000\u0000\u0000\u014a"+
		"\u014f\u0003,\u0016\u0000\u014b\u014f\u0003.\u0017\u0000\u014c\u014f\u0003"+
		"0\u0018\u0000\u014d\u014f\u00032\u0019\u0000\u014e\u014a\u0001\u0000\u0000"+
		"\u0000\u014e\u014b\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000"+
		"\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000"+
		"\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000"+
		"\u0000\u0151+\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0005\u0004\u0000\u0000\u0154-\u0001\u0000\u0000\u0000\u0155"+
		"\u0156\u0005\u0001\u0000\u0000\u0156/\u0001\u0000\u0000\u0000\u0157\u0158"+
		"\u0005\u0003\u0000\u0000\u01581\u0001\u0000\u0000\u0000\u0159\u015a\u0005"+
		"\u0002\u0000\u0000\u015a3\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u0006"+
		"\u0000\u0000\u015c5\u0001\u0000\u0000\u0000\u015d\u015e\u0005@\u0000\u0000"+
		"\u015e7\u0001\u0000\u0000\u0000\u015f\u0160\u0007\u0001\u0000\u0000\u0160"+
		"9\u0001\u0000\u0000\u0000\u0161\u0162\u0005\u0014\u0000\u0000\u0162;\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0007\u0002\u0000\u0000\u0164=\u0001\u0000"+
		"\u0000\u0000\u0165\u016b\u0007\u0003\u0000\u0000\u0166\u016b\u0007\u0004"+
		"\u0000\u0000\u0167\u016b\u0003D\"\u0000\u0168\u016b\u0003F#\u0000\u0169"+
		"\u016b\u0003H$\u0000\u016a\u0165\u0001\u0000\u0000\u0000\u016a\u0166\u0001"+
		"\u0000\u0000\u0000\u016a\u0167\u0001\u0000\u0000\u0000\u016a\u0168\u0001"+
		"\u0000\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b?\u0001\u0000"+
		"\u0000\u0000\u016c\u0176\u0003.\u0017\u0000\u016d\u0176\u00030\u0018\u0000"+
		"\u016e\u0176\u00032\u0019\u0000\u016f\u0176\u0007\u0005\u0000\u0000\u0170"+
		"\u0176\u0007\u0006\u0000\u0000\u0171\u0176\u0007\u0007\u0000\u0000\u0172"+
		"\u0176\u0003D\"\u0000\u0173\u0176\u0003F#\u0000\u0174\u0176\u0003H$\u0000"+
		"\u0175\u016c\u0001\u0000\u0000\u0000\u0175\u016d\u0001\u0000\u0000\u0000"+
		"\u0175\u016e\u0001\u0000\u0000\u0000\u0175\u016f\u0001\u0000\u0000\u0000"+
		"\u0175\u0170\u0001\u0000\u0000\u0000\u0175\u0171\u0001\u0000\u0000\u0000"+
		"\u0175\u0172\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000"+
		"\u0175\u0174\u0001\u0000\u0000\u0000\u0176A\u0001\u0000\u0000\u0000\u0177"+
		"\u0178\u00036\u001b\u0000\u0178\u0179\u00034\u001a\u0000\u0179\u017e\u0001"+
		"\u0000\u0000\u0000\u017a\u017b\u00036\u001b\u0000\u017b\u017c\u00036\u001b"+
		"\u0000\u017c\u017e\u0001\u0000\u0000\u0000\u017d\u0177\u0001\u0000\u0000"+
		"\u0000\u017d\u017a\u0001\u0000\u0000\u0000\u017eC\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0007\b\u0000\u0000\u0180\u0181\u0003J%\u0000\u0181E\u0001"+
		"\u0000\u0000\u0000\u0182\u0183\u0005\u00c1\u0000\u0000\u0183\u0184\u0007"+
		"\t\u0000\u0000\u0184\u0191\u0003J%\u0000\u0185\u0186\u0007\n\u0000\u0000"+
		"\u0186\u0187\u0003J%\u0000\u0187\u0188\u0003J%\u0000\u0188\u0191\u0001"+
		"\u0000\u0000\u0000\u0189\u018a\u0005\u00ce\u0000\u0000\u018a\u018b\u0007"+
		"\u000b\u0000\u0000\u018b\u0191\u0003J%\u0000\u018c\u018d\u0007\f\u0000"+
		"\u0000\u018d\u018e\u0003J%\u0000\u018e\u018f\u0003J%\u0000\u018f\u0191"+
		"\u0001\u0000\u0000\u0000\u0190\u0182\u0001\u0000\u0000\u0000\u0190\u0185"+
		"\u0001\u0000\u0000\u0000\u0190\u0189\u0001\u0000\u0000\u0000\u0190\u018c"+
		"\u0001\u0000\u0000\u0000\u0191G\u0001\u0000\u0000\u0000\u0192\u0193\u0005"+
		"\u00d1\u0000\u0000\u0193\u0194\u0007\r\u0000\u0000\u0194\u0195\u0003J"+
		"%\u0000\u0195\u0196\u0003J%\u0000\u0196\u01a2\u0001\u0000\u0000\u0000"+
		"\u0197\u0198\u0007\u000e\u0000\u0000\u0198\u0199\u0003J%\u0000\u0199\u019a"+
		"\u0003J%\u0000\u019a\u019b\u0003J%\u0000\u019b\u01a2\u0001\u0000\u0000"+
		"\u0000\u019c\u019d\u0005\u00d5\u0000\u0000\u019d\u019e\u0007\u000f\u0000"+
		"\u0000\u019e\u019f\u0003J%\u0000\u019f\u01a0\u0003J%\u0000\u01a0\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a1\u0192\u0001\u0000\u0000\u0000\u01a1\u0197"+
		"\u0001\u0000\u0000\u0000\u01a1\u019c\u0001\u0000\u0000\u0000\u01a2I\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a4\u0007\u0010\u0000\u0000\u01a4K\u0001\u0000"+
		"\u0000\u0000\u001dP\\`r}\u0085\u008b\u0090\u0095\u009b\u00ac\u00be\u00c7"+
		"\u00cb\u00cd\u00d1\u00d4\u00da\u00de\u00e5\u00ee\u0148\u014e\u0150\u016a"+
		"\u0175\u017d\u0190\u01a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}