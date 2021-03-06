// Generated from LabeledExpr.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__21=1, T__20=2, T__19=3, T__18=4, T__17=5, T__16=6, T__15=7, T__14=8, 
		T__13=9, T__12=10, T__11=11, T__10=12, T__9=13, T__8=14, T__7=15, T__6=16, 
		T__5=17, T__4=18, T__3=19, T__2=20, T__1=21, T__0=22, MUL=23, DIV=24, 
		ADD=25, SUB=26, EQC=27, NEQ=28, ID=29, INT=30, STR=31, NEWLINE=32, WS=33, 
		COMMENT=34, LINE_COMMENT=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "','", "'['", "':'", "'('", "'if'", "'int'", "'shared'", "'void'", 
		"'@}'", "'{'", "'}'", "'char'", "')'", "'print'", "'='", "'return'", "'{@'", 
		"'string'", "'task'", "'println'", "'critical'", "'*'", "'/'", "'+'", 
		"'-'", "'=='", "'!='", "ID", "INT", "STR", "NEWLINE", "WS", "COMMENT", 
		"LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", 
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "MUL", "DIV", "ADD", "SUB", "EQC", 
		"NEQ", "ID", "INT", "STR", "NEWLINE", "WS", "COMMENT", "LINE_COMMENT"
	};


	public LabeledExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 32: WS_action((RuleContext)_localctx, actionIndex); break;

		case 33: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 34: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4%\u00e9\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\6\36\u00b3\n\36\r\36"+
		"\16\36\u00b4\3\37\6\37\u00b8\n\37\r\37\16\37\u00b9\3 \3 \7 \u00be\n \f"+
		" \16 \u00c1\13 \3 \3 \3!\5!\u00c6\n!\3!\3!\3\"\6\"\u00cb\n\"\r\"\16\""+
		"\u00cc\3\"\3\"\3#\3#\3#\3#\7#\u00d5\n#\f#\16#\u00d8\13#\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\7$\u00e3\n$\f$\16$\u00e6\13$\3$\3$\4\u00bf\u00d6%\3\3\1"+
		"\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31"+
		"\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30"+
		"\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\2"+
		"E$\3G%\4\3\2\6\5C\\aac|\3\62;\4\13\13\"\"\4\f\f\17\17\u00ef\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2"+
		"\2\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17V\3\2\2\2"+
		"\21Z\3\2\2\2\23a\3\2\2\2\25f\3\2\2\2\27i\3\2\2\2\31k\3\2\2\2\33m\3\2\2"+
		"\2\35r\3\2\2\2\37t\3\2\2\2!z\3\2\2\2#|\3\2\2\2%\u0083\3\2\2\2\'\u0086"+
		"\3\2\2\2)\u008d\3\2\2\2+\u0092\3\2\2\2-\u009a\3\2\2\2/\u00a3\3\2\2\2\61"+
		"\u00a5\3\2\2\2\63\u00a7\3\2\2\2\65\u00a9\3\2\2\2\67\u00ab\3\2\2\29\u00ae"+
		"\3\2\2\2;\u00b2\3\2\2\2=\u00b7\3\2\2\2?\u00bb\3\2\2\2A\u00c5\3\2\2\2C"+
		"\u00ca\3\2\2\2E\u00d0\3\2\2\2G\u00de\3\2\2\2IJ\7_\2\2J\4\3\2\2\2KL\7."+
		"\2\2L\6\3\2\2\2MN\7]\2\2N\b\3\2\2\2OP\7<\2\2P\n\3\2\2\2QR\7*\2\2R\f\3"+
		"\2\2\2ST\7k\2\2TU\7h\2\2U\16\3\2\2\2VW\7k\2\2WX\7p\2\2XY\7v\2\2Y\20\3"+
		"\2\2\2Z[\7u\2\2[\\\7j\2\2\\]\7c\2\2]^\7t\2\2^_\7g\2\2_`\7f\2\2`\22\3\2"+
		"\2\2ab\7x\2\2bc\7q\2\2cd\7k\2\2de\7f\2\2e\24\3\2\2\2fg\7B\2\2gh\7\177"+
		"\2\2h\26\3\2\2\2ij\7}\2\2j\30\3\2\2\2kl\7\177\2\2l\32\3\2\2\2mn\7e\2\2"+
		"no\7j\2\2op\7c\2\2pq\7t\2\2q\34\3\2\2\2rs\7+\2\2s\36\3\2\2\2tu\7r\2\2"+
		"uv\7t\2\2vw\7k\2\2wx\7p\2\2xy\7v\2\2y \3\2\2\2z{\7?\2\2{\"\3\2\2\2|}\7"+
		"t\2\2}~\7g\2\2~\177\7v\2\2\177\u0080\7w\2\2\u0080\u0081\7t\2\2\u0081\u0082"+
		"\7p\2\2\u0082$\3\2\2\2\u0083\u0084\7}\2\2\u0084\u0085\7B\2\2\u0085&\3"+
		"\2\2\2\u0086\u0087\7u\2\2\u0087\u0088\7v\2\2\u0088\u0089\7t\2\2\u0089"+
		"\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b\u008c\7i\2\2\u008c(\3\2\2\2\u008d"+
		"\u008e\7v\2\2\u008e\u008f\7c\2\2\u008f\u0090\7u\2\2\u0090\u0091\7m\2\2"+
		"\u0091*\3\2\2\2\u0092\u0093\7r\2\2\u0093\u0094\7t\2\2\u0094\u0095\7k\2"+
		"\2\u0095\u0096\7p\2\2\u0096\u0097\7v\2\2\u0097\u0098\7n\2\2\u0098\u0099"+
		"\7p\2\2\u0099,\3\2\2\2\u009a\u009b\7e\2\2\u009b\u009c\7t\2\2\u009c\u009d"+
		"\7k\2\2\u009d\u009e\7v\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7e\2\2\u00a0"+
		"\u00a1\7c\2\2\u00a1\u00a2\7n\2\2\u00a2.\3\2\2\2\u00a3\u00a4\7,\2\2\u00a4"+
		"\60\3\2\2\2\u00a5\u00a6\7\61\2\2\u00a6\62\3\2\2\2\u00a7\u00a8\7-\2\2\u00a8"+
		"\64\3\2\2\2\u00a9\u00aa\7/\2\2\u00aa\66\3\2\2\2\u00ab\u00ac\7?\2\2\u00ac"+
		"\u00ad\7?\2\2\u00ad8\3\2\2\2\u00ae\u00af\7#\2\2\u00af\u00b0\7?\2\2\u00b0"+
		":\3\2\2\2\u00b1\u00b3\t\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5<\3\2\2\2\u00b6\u00b8\t"+
		"\3\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba>\3\2\2\2\u00bb\u00bf\7$\2\2\u00bc\u00be\13\2\2\2"+
		"\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00c0\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7$\2\2\u00c3"+
		"@\3\2\2\2\u00c4\u00c6\7\17\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\f\2\2\u00c8B\3\2\2\2\u00c9\u00cb\t"+
		"\4\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b\"\2\2\u00cfD\3\2\2\2"+
		"\u00d0\u00d1\7\61\2\2\u00d1\u00d2\7,\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d5"+
		"\13\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d7\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da"+
		"\7,\2\2\u00da\u00db\7\61\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b#\3\2\u00dd"+
		"F\3\2\2\2\u00de\u00df\7\61\2\2\u00df\u00e0\7\61\2\2\u00e0\u00e4\3\2\2"+
		"\2\u00e1\u00e3\n\5\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00e8\b$\4\2\u00e8H\3\2\2\2\n\2\u00b4\u00b9\u00bf\u00c5\u00cc\u00d6\u00e4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}