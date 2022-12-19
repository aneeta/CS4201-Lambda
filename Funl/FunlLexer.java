// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FunlLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "APPLY", "MAIN", "WHERE", "TRUE", "FALSE", "NIL", "RPAREN", "LPAREN", 
			"RBRACE", "LBRACE", "IF", "THEN", "ELSE", "COMMA", "EQ", "EQUALS", "HEAD", 
			"TAIL", "NULL", "NOT", "MINUS", "AND", "OR", "NEQ", "LT", "GT", "LTE", 
			"GTE", "PLUS", "DIV", "MUL", "CONS", "IDENT", "NUMERAL", "LETTER"
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


	public FunlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Funl.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000$\u00ce\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0001\u0000\u0001\u0000\u0003\u0000L\b"+
		"\u0000\u0001\u0000\u0004\u0000O\b\u0000\u000b\u0000\f\u0000P\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0005!\u00c2\b!\n!\f!\u00c5\t!\u0001\"\u0004\"\u00c8\b\"\u000b"+
		"\"\f\"\u00c9\u0001#\u0003#\u00cd\b#\u0000\u0000$\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$\u0001\u0000\u0003\u0002\u0000"+
		"\t\t  \u0001\u000009\u0003\u0000AZ__az\u00d3\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
		"\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?"+
		"\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000"+
		"\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000"+
		"\u0001N\u0001\u0000\u0000\u0000\u0003T\u0001\u0000\u0000\u0000\u0005Z"+
		"\u0001\u0000\u0000\u0000\u0007_\u0001\u0000\u0000\u0000\te\u0001\u0000"+
		"\u0000\u0000\u000bj\u0001\u0000\u0000\u0000\rp\u0001\u0000\u0000\u0000"+
		"\u000ft\u0001\u0000\u0000\u0000\u0011v\u0001\u0000\u0000\u0000\u0013x"+
		"\u0001\u0000\u0000\u0000\u0015z\u0001\u0000\u0000\u0000\u0017|\u0001\u0000"+
		"\u0000\u0000\u0019\u007f\u0001\u0000\u0000\u0000\u001b\u0084\u0001\u0000"+
		"\u0000\u0000\u001d\u0089\u0001\u0000\u0000\u0000\u001f\u008b\u0001\u0000"+
		"\u0000\u0000!\u008e\u0001\u0000\u0000\u0000#\u0090\u0001\u0000\u0000\u0000"+
		"%\u0093\u0001\u0000\u0000\u0000\'\u0096\u0001\u0000\u0000\u0000)\u009b"+
		"\u0001\u0000\u0000\u0000+\u009f\u0001\u0000\u0000\u0000-\u00a1\u0001\u0000"+
		"\u0000\u0000/\u00a5\u0001\u0000\u0000\u00001\u00a8\u0001\u0000\u0000\u0000"+
		"3\u00ab\u0001\u0000\u0000\u00005\u00ad\u0001\u0000\u0000\u00007\u00af"+
		"\u0001\u0000\u0000\u00009\u00b2\u0001\u0000\u0000\u0000;\u00b5\u0001\u0000"+
		"\u0000\u0000=\u00b7\u0001\u0000\u0000\u0000?\u00b9\u0001\u0000\u0000\u0000"+
		"A\u00bb\u0001\u0000\u0000\u0000C\u00be\u0001\u0000\u0000\u0000E\u00c7"+
		"\u0001\u0000\u0000\u0000G\u00cc\u0001\u0000\u0000\u0000IO\u0007\u0000"+
		"\u0000\u0000JL\u0005\r\u0000\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0005\n\u0000\u0000NI\u0001\u0000"+
		"\u0000\u0000NK\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RS\u0006\u0000\u0000\u0000S\u0002\u0001\u0000\u0000\u0000TU\u0005a\u0000"+
		"\u0000UV\u0005p\u0000\u0000VW\u0005p\u0000\u0000WX\u0005l\u0000\u0000"+
		"XY\u0005y\u0000\u0000Y\u0004\u0001\u0000\u0000\u0000Z[\u0005m\u0000\u0000"+
		"[\\\u0005a\u0000\u0000\\]\u0005i\u0000\u0000]^\u0005n\u0000\u0000^\u0006"+
		"\u0001\u0000\u0000\u0000_`\u0005w\u0000\u0000`a\u0005h\u0000\u0000ab\u0005"+
		"e\u0000\u0000bc\u0005r\u0000\u0000cd\u0005e\u0000\u0000d\b\u0001\u0000"+
		"\u0000\u0000ef\u0005t\u0000\u0000fg\u0005r\u0000\u0000gh\u0005u\u0000"+
		"\u0000hi\u0005e\u0000\u0000i\n\u0001\u0000\u0000\u0000jk\u0005f\u0000"+
		"\u0000kl\u0005a\u0000\u0000lm\u0005l\u0000\u0000mn\u0005s\u0000\u0000"+
		"no\u0005e\u0000\u0000o\f\u0001\u0000\u0000\u0000pq\u0005n\u0000\u0000"+
		"qr\u0005i\u0000\u0000rs\u0005l\u0000\u0000s\u000e\u0001\u0000\u0000\u0000"+
		"tu\u0005)\u0000\u0000u\u0010\u0001\u0000\u0000\u0000vw\u0005(\u0000\u0000"+
		"w\u0012\u0001\u0000\u0000\u0000xy\u0005}\u0000\u0000y\u0014\u0001\u0000"+
		"\u0000\u0000z{\u0005{\u0000\u0000{\u0016\u0001\u0000\u0000\u0000|}\u0005"+
		"i\u0000\u0000}~\u0005f\u0000\u0000~\u0018\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005t\u0000\u0000\u0080\u0081\u0005h\u0000\u0000\u0081\u0082\u0005"+
		"e\u0000\u0000\u0082\u0083\u0005n\u0000\u0000\u0083\u001a\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005e\u0000\u0000\u0085\u0086\u0005l\u0000\u0000\u0086"+
		"\u0087\u0005s\u0000\u0000\u0087\u0088\u0005e\u0000\u0000\u0088\u001c\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005,\u0000\u0000\u008a\u001e\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005=\u0000\u0000\u008c\u008d\u0005=\u0000\u0000"+
		"\u008d \u0001\u0000\u0000\u0000\u008e\u008f\u0005=\u0000\u0000\u008f\""+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005h\u0000\u0000\u0091\u0092\u0005"+
		"d\u0000\u0000\u0092$\u0001\u0000\u0000\u0000\u0093\u0094\u0005t\u0000"+
		"\u0000\u0094\u0095\u0005l\u0000\u0000\u0095&\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005n\u0000\u0000\u0097\u0098\u0005u\u0000\u0000\u0098\u0099\u0005"+
		"l\u0000\u0000\u0099\u009a\u0005l\u0000\u0000\u009a(\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0005n\u0000\u0000\u009c\u009d\u0005o\u0000\u0000\u009d"+
		"\u009e\u0005t\u0000\u0000\u009e*\u0001\u0000\u0000\u0000\u009f\u00a0\u0005"+
		"-\u0000\u0000\u00a0,\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005a\u0000"+
		"\u0000\u00a2\u00a3\u0005n\u0000\u0000\u00a3\u00a4\u0005d\u0000\u0000\u00a4"+
		".\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005o\u0000\u0000\u00a6\u00a7\u0005"+
		"r\u0000\u0000\u00a70\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005<\u0000"+
		"\u0000\u00a9\u00aa\u0005>\u0000\u0000\u00aa2\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005<\u0000\u0000\u00ac4\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005"+
		">\u0000\u0000\u00ae6\u0001\u0000\u0000\u0000\u00af\u00b0\u0005<\u0000"+
		"\u0000\u00b0\u00b1\u0005=\u0000\u0000\u00b18\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0005>\u0000\u0000\u00b3\u00b4\u0005=\u0000\u0000\u00b4:\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005+\u0000\u0000\u00b6<\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0005/\u0000\u0000\u00b8>\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0005*\u0000\u0000\u00ba@\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		":\u0000\u0000\u00bc\u00bd\u0005:\u0000\u0000\u00bdB\u0001\u0000\u0000"+
		"\u0000\u00be\u00c3\u0003G#\u0000\u00bf\u00c2\u0003G#\u0000\u00c0\u00c2"+
		"\u0007\u0001\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4D\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c8\u0007"+
		"\u0001\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001"+
		"\u0000\u0000\u0000\u00caF\u0001\u0000\u0000\u0000\u00cb\u00cd\u0007\u0002"+
		"\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cdH\u0001\u0000\u0000"+
		"\u0000\b\u0000KNP\u00c1\u00c3\u00c9\u00cc\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}