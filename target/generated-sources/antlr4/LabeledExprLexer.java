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
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, MUL=6, DIV=7, ADD=8, SUB=9, EQC=10, 
		NEQ=11, ID=12, INT=13, NEWLINE=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "':'", "'('", "'if'", "'='", "'*'", "'/'", "'+'", "'-'", "'=='", 
		"'!='", "ID", "INT", "NEWLINE", "WS"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "MUL", "DIV", "ADD", "SUB", "EQC", 
		"NEQ", "ID", "INT", "NEWLINE", "WS"
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
		case 14: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\21P\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\6\r<\n\r\r\r\16\r=\3\16\6\16A\n"+
		"\16\r\16\16\16B\3\17\5\17F\n\17\3\17\3\17\3\20\6\20K\n\20\r\20\16\20L"+
		"\3\20\3\20\2\21\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23"+
		"\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\2\3\2\5\4C\\c|\3\62"+
		";\4\13\13\"\"S\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3"+
		"\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13*\3\2\2\2\r,\3\2\2\2\17.\3"+
		"\2\2\2\21\60\3\2\2\2\23\62\3\2\2\2\25\64\3\2\2\2\27\67\3\2\2\2\31;\3\2"+
		"\2\2\33@\3\2\2\2\35E\3\2\2\2\37J\3\2\2\2!\"\7+\2\2\"\4\3\2\2\2#$\7<\2"+
		"\2$\6\3\2\2\2%&\7*\2\2&\b\3\2\2\2\'(\7k\2\2()\7h\2\2)\n\3\2\2\2*+\7?\2"+
		"\2+\f\3\2\2\2,-\7,\2\2-\16\3\2\2\2./\7\61\2\2/\20\3\2\2\2\60\61\7-\2\2"+
		"\61\22\3\2\2\2\62\63\7/\2\2\63\24\3\2\2\2\64\65\7?\2\2\65\66\7?\2\2\66"+
		"\26\3\2\2\2\678\7#\2\289\7?\2\29\30\3\2\2\2:<\t\2\2\2;:\3\2\2\2<=\3\2"+
		"\2\2=;\3\2\2\2=>\3\2\2\2>\32\3\2\2\2?A\t\3\2\2@?\3\2\2\2AB\3\2\2\2B@\3"+
		"\2\2\2BC\3\2\2\2C\34\3\2\2\2DF\7\17\2\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2"+
		"GH\7\f\2\2H\36\3\2\2\2IK\t\4\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2"+
		"\2MN\3\2\2\2NO\b\20\2\2O \3\2\2\2\7\2=BEL";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}