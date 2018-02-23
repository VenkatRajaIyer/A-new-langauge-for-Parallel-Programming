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
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		MUL=10, DIV=11, ADD=12, SUB=13, EQC=14, NEQ=15, ID=16, INT=17, STR=18, 
		NEWLINE=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'('", "'print'", "':'", "'if'", "'int'", "'='", "'string'", "'println'", 
		"'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "ID", "INT", "STR", "NEWLINE", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"MUL", "DIV", "ADD", "SUB", "EQC", "NEQ", "ID", "INT", "STR", "NEWLINE", 
		"WS"
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
		case 19: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\26|\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\6\21_\n\21\r\21"+
		"\16\21`\3\22\6\22d\n\22\r\22\16\22e\3\23\3\23\7\23j\n\23\f\23\16\23m\13"+
		"\23\3\23\3\23\3\24\5\24r\n\24\3\24\3\24\3\25\6\25w\n\25\r\25\16\25x\3"+
		"\25\3\25\3k\26\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13"+
		"\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\2\3\2\5\4C\\c|\3\62;\4\13\13\"\"\u0080\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\65\3\2\2\2\13\67\3"+
		"\2\2\2\r:\3\2\2\2\17>\3\2\2\2\21@\3\2\2\2\23G\3\2\2\2\25O\3\2\2\2\27Q"+
		"\3\2\2\2\31S\3\2\2\2\33U\3\2\2\2\35W\3\2\2\2\37Z\3\2\2\2!^\3\2\2\2#c\3"+
		"\2\2\2%g\3\2\2\2\'q\3\2\2\2)v\3\2\2\2+,\7+\2\2,\4\3\2\2\2-.\7*\2\2.\6"+
		"\3\2\2\2/\60\7r\2\2\60\61\7t\2\2\61\62\7k\2\2\62\63\7p\2\2\63\64\7v\2"+
		"\2\64\b\3\2\2\2\65\66\7<\2\2\66\n\3\2\2\2\678\7k\2\289\7h\2\29\f\3\2\2"+
		"\2:;\7k\2\2;<\7p\2\2<=\7v\2\2=\16\3\2\2\2>?\7?\2\2?\20\3\2\2\2@A\7u\2"+
		"\2AB\7v\2\2BC\7t\2\2CD\7k\2\2DE\7p\2\2EF\7i\2\2F\22\3\2\2\2GH\7r\2\2H"+
		"I\7t\2\2IJ\7k\2\2JK\7p\2\2KL\7v\2\2LM\7n\2\2MN\7p\2\2N\24\3\2\2\2OP\7"+
		",\2\2P\26\3\2\2\2QR\7\61\2\2R\30\3\2\2\2ST\7-\2\2T\32\3\2\2\2UV\7/\2\2"+
		"V\34\3\2\2\2WX\7?\2\2XY\7?\2\2Y\36\3\2\2\2Z[\7#\2\2[\\\7?\2\2\\ \3\2\2"+
		"\2]_\t\2\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\"\3\2\2\2bd\t\3"+
		"\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f$\3\2\2\2gk\7$\2\2hj\13\2"+
		"\2\2ih\3\2\2\2jm\3\2\2\2kl\3\2\2\2ki\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7$"+
		"\2\2o&\3\2\2\2pr\7\17\2\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\f\2\2t(\3"+
		"\2\2\2uw\t\4\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\b"+
		"\25\2\2{*\3\2\2\2\b\2`ekqx";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}