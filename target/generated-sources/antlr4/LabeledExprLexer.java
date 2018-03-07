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
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, MUL=24, 
		DIV=25, ADD=26, SUB=27, EQC=28, NEQ=29, ID=30, INT=31, STR=32, NEWLINE=33, 
		WS=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "','", "'['", "':'", "'('", "'if'", "'int'", "'shared'", "'@}'", 
		"'{'", "'constructor'", "'}'", "'parallel'", "'NULL'", "')'", "'print'", 
		"'='", "'{@'", "'string'", "'class'", "'println'", "'task'", "'critical'", 
		"'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "ID", "INT", "STR", "NEWLINE", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", 
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "MUL", "DIV", "ADD", "SUB", 
		"EQC", "NEQ", "ID", "INT", "STR", "NEWLINE", "WS"
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
		case 33: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4$\u00dd\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\6\37\u00c0\n\37\r\37\16\37\u00c1"+
		"\3 \6 \u00c5\n \r \16 \u00c6\3!\3!\7!\u00cb\n!\f!\16!\u00ce\13!\3!\3!"+
		"\3\"\5\"\u00d3\n\"\3\"\3\"\3#\6#\u00d8\n#\r#\16#\u00d9\3#\3#\3\u00cc$"+
		"\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27"+
		"\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27"+
		"\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\""+
		"\1C#\1E$\2\3\2\5\5C\\aac|\3\62;\4\13\13\"\"\u00e1\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5I\3\2\2\2\7K\3\2\2"+
		"\2\tM\3\2\2\2\13O\3\2\2\2\rQ\3\2\2\2\17T\3\2\2\2\21X\3\2\2\2\23_\3\2\2"+
		"\2\25b\3\2\2\2\27d\3\2\2\2\31p\3\2\2\2\33r\3\2\2\2\35{\3\2\2\2\37\u0080"+
		"\3\2\2\2!\u0082\3\2\2\2#\u0088\3\2\2\2%\u008a\3\2\2\2\'\u008d\3\2\2\2"+
		")\u0094\3\2\2\2+\u009a\3\2\2\2-\u00a2\3\2\2\2/\u00a7\3\2\2\2\61\u00b0"+
		"\3\2\2\2\63\u00b2\3\2\2\2\65\u00b4\3\2\2\2\67\u00b6\3\2\2\29\u00b8\3\2"+
		"\2\2;\u00bb\3\2\2\2=\u00bf\3\2\2\2?\u00c4\3\2\2\2A\u00c8\3\2\2\2C\u00d2"+
		"\3\2\2\2E\u00d7\3\2\2\2GH\7_\2\2H\4\3\2\2\2IJ\7.\2\2J\6\3\2\2\2KL\7]\2"+
		"\2L\b\3\2\2\2MN\7<\2\2N\n\3\2\2\2OP\7*\2\2P\f\3\2\2\2QR\7k\2\2RS\7h\2"+
		"\2S\16\3\2\2\2TU\7k\2\2UV\7p\2\2VW\7v\2\2W\20\3\2\2\2XY\7u\2\2YZ\7j\2"+
		"\2Z[\7c\2\2[\\\7t\2\2\\]\7g\2\2]^\7f\2\2^\22\3\2\2\2_`\7B\2\2`a\7\177"+
		"\2\2a\24\3\2\2\2bc\7}\2\2c\26\3\2\2\2de\7e\2\2ef\7q\2\2fg\7p\2\2gh\7u"+
		"\2\2hi\7v\2\2ij\7t\2\2jk\7w\2\2kl\7e\2\2lm\7v\2\2mn\7q\2\2no\7t\2\2o\30"+
		"\3\2\2\2pq\7\177\2\2q\32\3\2\2\2rs\7r\2\2st\7c\2\2tu\7t\2\2uv\7c\2\2v"+
		"w\7n\2\2wx\7n\2\2xy\7g\2\2yz\7n\2\2z\34\3\2\2\2{|\7P\2\2|}\7W\2\2}~\7"+
		"N\2\2~\177\7N\2\2\177\36\3\2\2\2\u0080\u0081\7+\2\2\u0081 \3\2\2\2\u0082"+
		"\u0083\7r\2\2\u0083\u0084\7t\2\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2"+
		"\u0086\u0087\7v\2\2\u0087\"\3\2\2\2\u0088\u0089\7?\2\2\u0089$\3\2\2\2"+
		"\u008a\u008b\7}\2\2\u008b\u008c\7B\2\2\u008c&\3\2\2\2\u008d\u008e\7u\2"+
		"\2\u008e\u008f\7v\2\2\u008f\u0090\7t\2\2\u0090\u0091\7k\2\2\u0091\u0092"+
		"\7p\2\2\u0092\u0093\7i\2\2\u0093(\3\2\2\2\u0094\u0095\7e\2\2\u0095\u0096"+
		"\7n\2\2\u0096\u0097\7c\2\2\u0097\u0098\7u\2\2\u0098\u0099\7u\2\2\u0099"+
		"*\3\2\2\2\u009a\u009b\7r\2\2\u009b\u009c\7t\2\2\u009c\u009d\7k\2\2\u009d"+
		"\u009e\7p\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7p\2\2"+
		"\u00a1,\3\2\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7u\2"+
		"\2\u00a5\u00a6\7m\2\2\u00a6.\3\2\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7"+
		"t\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad"+
		"\7e\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7n\2\2\u00af\60\3\2\2\2\u00b0\u00b1"+
		"\7,\2\2\u00b1\62\3\2\2\2\u00b2\u00b3\7\61\2\2\u00b3\64\3\2\2\2\u00b4\u00b5"+
		"\7-\2\2\u00b5\66\3\2\2\2\u00b6\u00b7\7/\2\2\u00b78\3\2\2\2\u00b8\u00b9"+
		"\7?\2\2\u00b9\u00ba\7?\2\2\u00ba:\3\2\2\2\u00bb\u00bc\7#\2\2\u00bc\u00bd"+
		"\7?\2\2\u00bd<\3\2\2\2\u00be\u00c0\t\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2>\3\2\2\2\u00c3"+
		"\u00c5\t\3\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7@\3\2\2\2\u00c8\u00cc\7$\2\2\u00c9\u00cb"+
		"\13\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00cd\3\2\2\2"+
		"\u00cc\u00ca\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0"+
		"\7$\2\2\u00d0B\3\2\2\2\u00d1\u00d3\7\17\2\2\u00d2\u00d1\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\f\2\2\u00d5D\3\2\2\2"+
		"\u00d6\u00d8\t\4\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\b#\2\2\u00dc"+
		"F\3\2\2\2\b\2\u00c1\u00c6\u00cc\u00d2\u00d9";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}