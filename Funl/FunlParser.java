// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FunlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, APPLY=2, MAIN=3, WHERE=4, TRUE=5, FALSE=6, NIL=7, RPAREN=8, LPAREN=9, 
		RBRACE=10, LBRACE=11, IF=12, THEN=13, ELSE=14, COMMA=15, EQ=16, EQUALS=17, 
		HEAD=18, TAIL=19, NULL=20, NOT=21, MINUS=22, AND=23, OR=24, NEQ=25, LT=26, 
		GT=27, LTE=28, GTE=29, PLUS=30, DIV=31, MUL=32, CONS=33, IDENT=34, NUMERAL=35, 
		LETTER=36;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_decls = 2, RULE_where = 3, RULE_args = 4, 
		RULE_expr = 5, RULE_unop = 6, RULE_binop = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "decls", "where", "args", "expr", "unop", "binop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'apply'", "'main'", "'where'", "'true'", "'false'", "'nil'", 
			"')'", "'('", "'}'", "'{'", "'if'", "'then'", "'else'", "','", "'=='", 
			"'='", "'hd'", "'tl'", "'null'", "'not'", "'-'", "'and'", "'or'", "'<>'", 
			"'<'", "'>'", "'<='", "'>='", "'+'", "'/'", "'*'", "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "APPLY", "MAIN", "WHERE", "TRUE", "FALSE", "NIL", "RPAREN", 
			"LPAREN", "RBRACE", "LBRACE", "IF", "THEN", "ELSE", "COMMA", "EQ", "EQUALS", 
			"HEAD", "TAIL", "NULL", "NOT", "MINUS", "AND", "OR", "NEQ", "LT", "GT", 
			"LTE", "GTE", "PLUS", "DIV", "MUL", "CONS", "IDENT", "NUMERAL", "LETTER"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<DeclsContext> decls() {
			return getRuleContexts(DeclsContext.class);
		}
		public DeclsContext decls(int i) {
			return getRuleContext(DeclsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			main();
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(17);
				decls();
				}
				}
				setState(22);
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
	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(FunlParser.MAIN, 0); }
		public TerminalNode EQUALS() { return getToken(FunlParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(MAIN);
			setState(24);
			match(EQUALS);
			setState(25);
			expr(0);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(26);
				where();
				}
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
	public static class DeclsContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(FunlParser.IDENT, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(FunlParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitDecls(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(IDENT);
			setState(30);
			args();
			setState(31);
			match(EQUALS);
			setState(32);
			expr(0);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(33);
				where();
				}
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
	public static class WhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(FunlParser.WHERE, 0); }
		public TerminalNode LBRACE() { return getToken(FunlParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FunlParser.RBRACE, 0); }
		public List<DeclsContext> decls() {
			return getRuleContexts(DeclsContext.class);
		}
		public DeclsContext decls(int i) {
			return getRuleContext(DeclsContext.class,i);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitWhere(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(WHERE);
			setState(37);
			match(LBRACE);
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				decls();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			setState(43);
			match(RBRACE);
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
	public static class ArgsContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(FunlParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FunlParser.IDENT, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(45);
				match(IDENT);
				}
				}
				setState(50);
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode APPLY() { return getToken(FunlParser.APPLY, 0); }
		public TerminalNode LPAREN() { return getToken(FunlParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(FunlParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(FunlParser.RPAREN, 0); }
		public TerminalNode NIL() { return getToken(FunlParser.NIL, 0); }
		public TerminalNode IDENT() { return getToken(FunlParser.IDENT, 0); }
		public TerminalNode NUMERAL() { return getToken(FunlParser.NUMERAL, 0); }
		public TerminalNode TRUE() { return getToken(FunlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FunlParser.FALSE, 0); }
		public UnopContext unop() {
			return getRuleContext(UnopContext.class,0);
		}
		public TerminalNode IF() { return getToken(FunlParser.IF, 0); }
		public TerminalNode THEN() { return getToken(FunlParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(FunlParser.ELSE, 0); }
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APPLY:
				{
				setState(52);
				match(APPLY);
				setState(53);
				match(LPAREN);
				setState(54);
				expr(0);
				setState(55);
				match(COMMA);
				setState(56);
				expr(0);
				setState(57);
				match(RPAREN);
				}
				break;
			case NIL:
				{
				setState(59);
				match(NIL);
				}
				break;
			case IDENT:
				{
				setState(60);
				match(IDENT);
				}
				break;
			case NUMERAL:
				{
				setState(61);
				match(NUMERAL);
				}
				break;
			case TRUE:
				{
				setState(62);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(63);
				match(FALSE);
				}
				break;
			case HEAD:
			case TAIL:
			case NULL:
			case NOT:
			case MINUS:
				{
				setState(64);
				unop();
				setState(65);
				expr(3);
				}
				break;
			case IF:
				{
				setState(67);
				match(IF);
				setState(68);
				expr(0);
				setState(69);
				match(THEN);
				setState(70);
				expr(0);
				setState(71);
				match(ELSE);
				setState(72);
				expr(2);
				}
				break;
			case LPAREN:
				{
				setState(74);
				match(LPAREN);
				setState(75);
				expr(0);
				setState(76);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(80);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(81);
					binop();
					setState(82);
					expr(5);
					}
					} 
				}
				setState(88);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnopContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(FunlParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(FunlParser.MINUS, 0); }
		public TerminalNode HEAD() { return getToken(FunlParser.HEAD, 0); }
		public TerminalNode TAIL() { return getToken(FunlParser.TAIL, 0); }
		public TerminalNode NULL() { return getToken(FunlParser.NULL, 0); }
		public UnopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterUnop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitUnop(this);
		}
	}

	public final UnopContext unop() throws RecognitionException {
		UnopContext _localctx = new UnopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8126464L) != 0) ) {
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
	public static class BinopContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(FunlParser.AND, 0); }
		public TerminalNode OR() { return getToken(FunlParser.OR, 0); }
		public TerminalNode EQ() { return getToken(FunlParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(FunlParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(FunlParser.LT, 0); }
		public TerminalNode LTE() { return getToken(FunlParser.LTE, 0); }
		public TerminalNode GT() { return getToken(FunlParser.GT, 0); }
		public TerminalNode GTE() { return getToken(FunlParser.GTE, 0); }
		public TerminalNode PLUS() { return getToken(FunlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunlParser.MINUS, 0); }
		public TerminalNode DIV() { return getToken(FunlParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(FunlParser.MUL, 0); }
		public TerminalNode CONS() { return getToken(FunlParser.CONS, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunlListener ) ((FunlListener)listener).exitBinop(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 17175740416L) != 0) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001$^\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\u0013\b\u0000\n\u0000\f\u0000\u0016\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001c\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002#\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003(\b\u0003\u000b"+
		"\u0003\f\u0003)\u0001\u0003\u0001\u0003\u0001\u0004\u0005\u0004/\b\u0004"+
		"\n\u0004\f\u00042\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"O\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"U\b\u0005\n\u0005\f\u0005X\t\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0000\u0001\n\b\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0000\u0002\u0001\u0000\u0012\u0016\u0002\u0000\u0010\u0010\u0016"+
		"!c\u0000\u0010\u0001\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000"+
		"\u0004\u001d\u0001\u0000\u0000\u0000\u0006$\u0001\u0000\u0000\u0000\b"+
		"0\u0001\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000\fY\u0001\u0000\u0000"+
		"\u0000\u000e[\u0001\u0000\u0000\u0000\u0010\u0014\u0003\u0002\u0001\u0000"+
		"\u0011\u0013\u0003\u0004\u0002\u0000\u0012\u0011\u0001\u0000\u0000\u0000"+
		"\u0013\u0016\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000"+
		"\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0001\u0001\u0000\u0000\u0000"+
		"\u0016\u0014\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0003\u0000\u0000"+
		"\u0018\u0019\u0005\u0011\u0000\u0000\u0019\u001b\u0003\n\u0005\u0000\u001a"+
		"\u001c\u0003\u0006\u0003\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0001\u0000\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0005\"\u0000\u0000\u001e\u001f\u0003\b\u0004\u0000\u001f \u0005"+
		"\u0011\u0000\u0000 \"\u0003\n\u0005\u0000!#\u0003\u0006\u0003\u0000\""+
		"!\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\u0005\u0001\u0000"+
		"\u0000\u0000$%\u0005\u0004\u0000\u0000%\'\u0005\u000b\u0000\u0000&(\u0003"+
		"\u0004\u0002\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000"+
		")\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+,\u0005\n\u0000\u0000,\u0007\u0001\u0000\u0000\u0000-/\u0005\""+
		"\u0000\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u00001\t\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000034\u0006\u0005\uffff\uffff\u000045\u0005\u0002"+
		"\u0000\u000056\u0005\t\u0000\u000067\u0003\n\u0005\u000078\u0005\u000f"+
		"\u0000\u000089\u0003\n\u0005\u00009:\u0005\b\u0000\u0000:O\u0001\u0000"+
		"\u0000\u0000;O\u0005\u0007\u0000\u0000<O\u0005\"\u0000\u0000=O\u0005#"+
		"\u0000\u0000>O\u0005\u0005\u0000\u0000?O\u0005\u0006\u0000\u0000@A\u0003"+
		"\f\u0006\u0000AB\u0003\n\u0005\u0003BO\u0001\u0000\u0000\u0000CD\u0005"+
		"\f\u0000\u0000DE\u0003\n\u0005\u0000EF\u0005\r\u0000\u0000FG\u0003\n\u0005"+
		"\u0000GH\u0005\u000e\u0000\u0000HI\u0003\n\u0005\u0002IO\u0001\u0000\u0000"+
		"\u0000JK\u0005\t\u0000\u0000KL\u0003\n\u0005\u0000LM\u0005\b\u0000\u0000"+
		"MO\u0001\u0000\u0000\u0000N3\u0001\u0000\u0000\u0000N;\u0001\u0000\u0000"+
		"\u0000N<\u0001\u0000\u0000\u0000N=\u0001\u0000\u0000\u0000N>\u0001\u0000"+
		"\u0000\u0000N?\u0001\u0000\u0000\u0000N@\u0001\u0000\u0000\u0000NC\u0001"+
		"\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000OV\u0001\u0000\u0000\u0000"+
		"PQ\n\u0004\u0000\u0000QR\u0003\u000e\u0007\u0000RS\u0003\n\u0005\u0005"+
		"SU\u0001\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\u000b\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0007\u0000\u0000\u0000"+
		"Z\r\u0001\u0000\u0000\u0000[\\\u0007\u0001\u0000\u0000\\\u000f\u0001\u0000"+
		"\u0000\u0000\u0007\u0014\u001b\")0NV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}