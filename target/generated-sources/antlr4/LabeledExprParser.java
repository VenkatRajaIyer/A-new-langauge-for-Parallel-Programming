// Generated from LabeledExpr.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__21=1, T__20=2, T__19=3, T__18=4, T__17=5, T__16=6, T__15=7, T__14=8, 
		T__13=9, T__12=10, T__11=11, T__10=12, T__9=13, T__8=14, T__7=15, T__6=16, 
		T__5=17, T__4=18, T__3=19, T__2=20, T__1=21, T__0=22, MUL=23, DIV=24, 
		ADD=25, SUB=26, EQC=27, NEQ=28, ID=29, INT=30, STR=31, NEWLINE=32, WS=33, 
		COMMENT=34, LINE_COMMENT=35;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "','", "'['", "':'", "'('", "'if'", "'int'", "'shared'", 
		"'void'", "'@}'", "'{'", "'}'", "'char'", "')'", "'print'", "'='", "'return'", 
		"'{@'", "'string'", "'task'", "'println'", "'critical'", "'*'", "'/'", 
		"'+'", "'-'", "'=='", "'!='", "ID", "INT", "STR", "NEWLINE", "WS", "COMMENT", 
		"LINE_COMMENT"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_assignStat = 2, RULE_printStat = 3, 
		RULE_function = 4, RULE_returnstatement = 5, RULE_sVars = 6, RULE_expr = 7, 
		RULE_newparallel = 8, RULE_endParallel = 9, RULE_sharedValues = 10, RULE_object = 11, 
		RULE_threadArray = 12, RULE_tasks = 13, RULE_critSec = 14, RULE_critSecParams = 15, 
		RULE_params = 16, RULE_fparams = 17, RULE_parametersType = 18, RULE_condExpr = 19, 
		RULE_fvoid = 20, RULE_fchar = 21, RULE_fstring = 22, RULE_finteger = 23;
	public static final String[] ruleNames = {
		"prog", "stat", "assignStat", "printStat", "function", "returnstatement", 
		"sVars", "expr", "newparallel", "endParallel", "sharedValues", "object", 
		"threadArray", "tasks", "critSec", "critSecParams", "params", "fparams", 
		"parametersType", "condExpr", "fvoid", "fchar", "fstring", "finteger"
	};

	@Override
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public LabeledExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48); stat();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 9) | (1L << 13) | (1L << 15) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << ID) | (1L << NEWLINE))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterBlank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitBlank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JustcreatefunctionContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public JustcreatefunctionContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterJustcreatefunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitJustcreatefunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitJustcreatefunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreatesVars1Context extends StatContext {
		public SVarsContext sVars() {
			return getRuleContext(SVarsContext.class,0);
		}
		public CreatesVars1Context(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterCreatesVars1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitCreatesVars1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitCreatesVars1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public CondExprContext condExpr() {
			return getRuleContext(CondExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStmContext extends StatContext {
		public PrintStatContext printStat() {
			return getRuleContext(PrintStatContext.class,0);
		}
		public PrintStmContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterPrintStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitPrintStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPrintStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsignParallelContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public NewparallelContext newparallel() {
			return getRuleContext(NewparallelContext.class,0);
		}
		public AsignParallelContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAsignParallel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAsignParallel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAsignParallel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStmContext extends StatContext {
		public AssignStatContext assignStat() {
			return getRuleContext(AssignStatContext.class,0);
		}
		public AssignStmContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAssignStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAssignStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAssignStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new JustcreatefunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53); function();
				setState(54); match(NEWLINE);
				}
				break;

			case 2:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56); match(6);
				setState(57); condExpr();
				setState(58); match(4);
				setState(59); match(NEWLINE);
				setState(60); expr(0);
				}
				break;

			case 3:
				_localctx = new PrintStmContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(62); printStat();
				}
				break;

			case 4:
				_localctx = new CreatesVars1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(63); sVars();
				}
				break;

			case 5:
				_localctx = new AssignStmContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(64); assignStat();
				}
				break;

			case 6:
				_localctx = new AsignParallelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(65); newparallel();
				setState(66); match(NEWLINE);
				}
				break;

			case 7:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(68); match(NEWLINE);
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

	public static class AssignStatContext extends ParserRuleContext {
		public AssignStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStat; }
	 
		public AssignStatContext() { }
		public void copyFrom(AssignStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignStrContext extends AssignStatContext {
		public TerminalNode STR() { return getToken(LabeledExprParser.STR, 0); }
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public AssignStrContext(AssignStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAssignStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAssignStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAssignStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignIntContext extends AssignStatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignIntContext(AssignStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAssignInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAssignInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAssignInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatContext assignStat() throws RecognitionException {
		AssignStatContext _localctx = new AssignStatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignStat);
		int _la;
		try {
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new AssignIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				_la = _input.LA(1);
				if (_la==7) {
					{
					setState(71); match(7);
					}
				}

				setState(74); match(ID);
				setState(75); match(16);
				setState(76); expr(0);
				setState(77); match(NEWLINE);
				}
				break;

			case 2:
				_localctx = new AssignStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				_la = _input.LA(1);
				if (_la==19) {
					{
					setState(79); match(19);
					}
				}

				setState(82); match(ID);
				setState(83); match(16);
				setState(84); match(STR);
				setState(85); match(NEWLINE);
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

	public static class PrintStatContext extends ParserRuleContext {
		public PrintStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStat; }
	 
		public PrintStatContext() { }
		public void copyFrom(PrintStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintlnExprContext extends PrintStatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintlnExprContext(PrintStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterPrintlnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitPrintlnExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPrintlnExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends PrintStatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintExprContext(PrintStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitPrintExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintlnStrExprContext extends PrintStatContext {
		public TerminalNode STR() { return getToken(LabeledExprParser.STR, 0); }
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public PrintlnStrExprContext(PrintStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterPrintlnStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitPrintlnStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPrintlnStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStrExprContext extends PrintStatContext {
		public TerminalNode STR() { return getToken(LabeledExprParser.STR, 0); }
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public PrintStrExprContext(PrintStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterPrintStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitPrintStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPrintStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatContext printStat() throws RecognitionException {
		PrintStatContext _localctx = new PrintStatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printStat);
		try {
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88); match(15);
				setState(89); match(5);
				setState(90); expr(0);
				setState(91); match(14);
				setState(92); match(NEWLINE);
				}
				break;

			case 2:
				_localctx = new PrintlnExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94); match(21);
				setState(95); match(5);
				setState(96); expr(0);
				setState(97); match(14);
				setState(98); match(NEWLINE);
				}
				break;

			case 3:
				_localctx = new PrintStrExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(100); match(15);
				setState(101); match(5);
				setState(102); match(STR);
				setState(103); match(14);
				setState(104); match(NEWLINE);
				}
				break;

			case 4:
				_localctx = new PrintlnStrExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(105); match(21);
				setState(106); match(5);
				setState(107); match(STR);
				setState(108); match(14);
				setState(109); match(NEWLINE);
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreatefunctionContext extends FunctionContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ParametersTypeContext parametersType() {
			return getRuleContext(ParametersTypeContext.class,0);
		}
		public ReturnstatementContext returnstatement() {
			return getRuleContext(ReturnstatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public FparamsContext fparams() {
			return getRuleContext(FparamsContext.class,0);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public CreatefunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterCreatefunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitCreatefunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitCreatefunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			int _alt;
			_localctx = new CreatefunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(112); parametersType();
			setState(113); match(ID);
			setState(114); match(5);
			setState(115); fparams(0);
			setState(116); match(14);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(117); match(NEWLINE);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123); match(11);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(124); match(NEWLINE);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(130); stat();
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(136); match(NEWLINE);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142); returnstatement();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(143); match(NEWLINE);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149); match(12);
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

	public static class ReturnstatementContext extends ParserRuleContext {
		public ReturnstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstatement; }
	 
		public ReturnstatementContext() { }
		public void copyFrom(ReturnstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnfromfunctionContext extends ReturnstatementContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public ReturnfromfunctionContext(ReturnstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterReturnfromfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitReturnfromfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitReturnfromfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstatementContext returnstatement() throws RecognitionException {
		ReturnstatementContext _localctx = new ReturnstatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnstatement);
		try {
			_localctx = new ReturnfromfunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(17);
			setState(152); match(ID);
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

	public static class SVarsContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public SVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SVarsContext sVars() throws RecognitionException {
		SVarsContext _localctx = new SVarsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sVars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(7);
			setState(155); match(ID);
			setState(156); match(NEWLINE);
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

	public static class ExprContext extends ParserRuleContext {
		public int _p;
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(159); match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160); match(ID);
				}
				break;
			case 5:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161); match(5);
				setState(162); expr(0);
				setState(163); match(14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(173);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(168);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(169); expr(6);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(171);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(172); expr(5);
						}
						break;
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class NewparallelContext extends ParserRuleContext {
		public NewparallelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newparallel; }
	 
		public NewparallelContext() { }
		public void copyFrom(NewparallelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnotherParallelStructContext extends NewparallelContext {
		public EndParallelContext endParallel() {
			return getRuleContext(EndParallelContext.class,0);
		}
		public TasksContext tasks(int i) {
			return getRuleContext(TasksContext.class,i);
		}
		public SharedValuesContext sharedValues() {
			return getRuleContext(SharedValuesContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public List<TasksContext> tasks() {
			return getRuleContexts(TasksContext.class);
		}
		public AnotherParallelStructContext(NewparallelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAnotherParallelStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAnotherParallelStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAnotherParallelStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewparallelContext newparallel() throws RecognitionException {
		NewparallelContext _localctx = new NewparallelContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_newparallel);
		int _la;
		try {
			int _alt;
			_localctx = new AnotherParallelStructContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(18);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(179); match(NEWLINE);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185); sharedValues();
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(186); match(NEWLINE);
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(193); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(192); tasks();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(195); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(197); match(NEWLINE);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203); endParallel();
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

	public static class EndParallelContext extends ParserRuleContext {
		public EndParallelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endParallel; }
	 
		public EndParallelContext() { }
		public void copyFrom(EndParallelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EndParallelStructContext extends EndParallelContext {
		public EndParallelStructContext(EndParallelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterEndParallelStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitEndParallelStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitEndParallelStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndParallelContext endParallel() throws RecognitionException {
		EndParallelContext _localctx = new EndParallelContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_endParallel);
		try {
			_localctx = new EndParallelStructContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(10);
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

	public static class SharedValuesContext extends ParserRuleContext {
		public SharedValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sharedValues; }
	 
		public SharedValuesContext() { }
		public void copyFrom(SharedValuesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SharedParamsContext extends SharedValuesContext {
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public SharedParamsContext(SharedValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSharedParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSharedParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSharedParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SharedValuesContext sharedValues() throws RecognitionException {
		SharedValuesContext _localctx = new SharedValuesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sharedValues);
		int _la;
		try {
			_localctx = new SharedParamsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(8);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(208); match(NEWLINE);
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214); match(11);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(215); match(NEWLINE);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221); params(0);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(222); match(NEWLINE);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228); match(12);
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

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); match(ID);
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

	public static class ThreadArrayContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ThreadArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_threadArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterThreadArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitThreadArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitThreadArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThreadArrayContext threadArray() throws RecognitionException {
		ThreadArrayContext _localctx = new ThreadArrayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_threadArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); object();
			setState(233); match(3);
			setState(234); match(INT);
			setState(235); match(1);
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

	public static class TasksContext extends ParserRuleContext {
		public TasksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tasks; }
	 
		public TasksContext() { }
		public void copyFrom(TasksContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewTaskContext extends TasksContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public CritSecParamsContext critSecParams() {
			return getRuleContext(CritSecParamsContext.class,0);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public NewTaskContext(TasksContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterNewTask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitNewTask(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitNewTask(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TasksContext tasks() throws RecognitionException {
		TasksContext _localctx = new TasksContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tasks);
		int _la;
		try {
			int _alt;
			_localctx = new NewTaskContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(237); match(NEWLINE);
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243); match(20);
			setState(244); match(ID);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(245); match(NEWLINE);
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251); match(11);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(252); match(NEWLINE);
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(258); stat();
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(264); critSecParams();
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(265); stat();
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(271); match(NEWLINE);
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277); match(12);
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

	public static class CritSecContext extends ParserRuleContext {
		public CritSecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_critSec; }
	 
		public CritSecContext() { }
		public void copyFrom(CritSecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CriticalSectionContext extends CritSecContext {
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public CriticalSectionContext(CritSecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterCriticalSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitCriticalSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitCriticalSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CritSecContext critSec() throws RecognitionException {
		CritSecContext _localctx = new CritSecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_critSec);
		int _la;
		try {
			int _alt;
			_localctx = new CriticalSectionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(279); match(NEWLINE);
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285); match(22);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(286); match(NEWLINE);
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292); match(11);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(293); match(NEWLINE);
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(299); stat();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(300); match(NEWLINE);
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306); match(12);
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

	public static class CritSecParamsContext extends ParserRuleContext {
		public CritSecParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_critSecParams; }
	 
		public CritSecParamsContext() { }
		public void copyFrom(CritSecParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CriticalSectionWithParamsContext extends CritSecParamsContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public CriticalSectionWithParamsContext(CritSecParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterCriticalSectionWithParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitCriticalSectionWithParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitCriticalSectionWithParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CritSecParamsContext critSecParams() throws RecognitionException {
		CritSecParamsContext _localctx = new CritSecParamsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_critSecParams);
		int _la;
		try {
			int _alt;
			_localctx = new CriticalSectionWithParamsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(308); match(NEWLINE);
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314); match(22);
			setState(315); match(5);
			setState(316); params(0);
			setState(317); match(14);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(318); match(NEWLINE);
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324); match(11);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(325); match(NEWLINE);
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(332); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(331); stat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(334); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(336); match(NEWLINE);
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342); match(12);
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

	public static class ParamsContext extends ParserRuleContext {
		public int _p;
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamsContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParamsContext _localctx = new ParamsContext(_ctx, _parentState, _p);
		ParamsContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, RULE_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(345); match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParamsContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_params);
					setState(347);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(348); match(2);
					setState(349); match(ID);
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class FparamsContext extends ParserRuleContext {
		public int _p;
		public ParametersTypeContext parametersType() {
			return getRuleContext(ParametersTypeContext.class,0);
		}
		public FparamsContext fparams() {
			return getRuleContext(FparamsContext.class,0);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public FparamsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FparamsContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_fparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterFparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitFparams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitFparams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FparamsContext fparams(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FparamsContext _localctx = new FparamsContext(_ctx, _parentState, _p);
		FparamsContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, RULE_fparams);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(356); parametersType();
			setState(357); match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FparamsContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_fparams);
					setState(359);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(360); match(2);
					setState(361); parametersType();
					setState(362); match(ID);
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class ParametersTypeContext extends ParserRuleContext {
		public FcharContext fchar() {
			return getRuleContext(FcharContext.class,0);
		}
		public FvoidContext fvoid() {
			return getRuleContext(FvoidContext.class,0);
		}
		public FstringContext fstring() {
			return getRuleContext(FstringContext.class,0);
		}
		public FintegerContext finteger() {
			return getRuleContext(FintegerContext.class,0);
		}
		public ParametersTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterParametersType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitParametersType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitParametersType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersTypeContext parametersType() throws RecognitionException {
		ParametersTypeContext _localctx = new ParametersTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parametersType);
		try {
			setState(373);
			switch (_input.LA(1)) {
			case 9:
				enterOuterAlt(_localctx, 1);
				{
				setState(369); fvoid();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(370); finteger();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 3);
				{
				setState(371); fchar();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 4);
				{
				setState(372); fstring();
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

	public static class CondExprContext extends ParserRuleContext {
		public CondExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condExpr; }
	 
		public CondExprContext() { }
		public void copyFrom(CondExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CndExprContext extends CondExprContext {
		public Token op;
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public CndExprContext(CondExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterCndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitCndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitCndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondExprContext condExpr() throws RecognitionException {
		CondExprContext _localctx = new CondExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condExpr);
		int _la;
		try {
			_localctx = new CndExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(375); expr(0);
			setState(376);
			((CndExprContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==EQC || _la==NEQ) ) {
				((CndExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(377); expr(0);
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

	public static class FvoidContext extends ParserRuleContext {
		public FvoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fvoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterFvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitFvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitFvoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FvoidContext fvoid() throws RecognitionException {
		FvoidContext _localctx = new FvoidContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fvoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); match(9);
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

	public static class FcharContext extends ParserRuleContext {
		public FcharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fchar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterFchar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitFchar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitFchar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FcharContext fchar() throws RecognitionException {
		FcharContext _localctx = new FcharContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fchar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381); match(13);
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

	public static class FstringContext extends ParserRuleContext {
		public FstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterFstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitFstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitFstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FstringContext fstring() throws RecognitionException {
		FstringContext _localctx = new FstringContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fstring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383); match(19);
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

	public static class FintegerContext extends ParserRuleContext {
		public FintegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterFinteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitFinteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitFinteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FintegerContext finteger() throws RecognitionException {
		FintegerContext _localctx = new FintegerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_finteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); match(7);
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
		case 7: return expr_sempred((ExprContext)_localctx, predIndex);

		case 16: return params_sempred((ParamsContext)_localctx, predIndex);

		case 17: return fparams_sempred((FparamsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean fparams_sempred(FparamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 5 >= _localctx._p;

		case 1: return 4 >= _localctx._p;
		}
		return true;
	}
	private boolean params_sempred(ParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3%\u0186\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\3\2\6\2\64\n\2\r\2\16\2\65\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3H\n\3\3\4\5\4K\n\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4S\n\4\3\4\3\4\3\4\3\4\5\4Y\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5q\n\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6y\n\6\f\6\16\6|\13\6\3\6\3\6\7\6"+
		"\u0080\n\6\f\6\16\6\u0083\13\6\3\6\7\6\u0086\n\6\f\6\16\6\u0089\13\6\3"+
		"\6\7\6\u008c\n\6\f\6\16\6\u008f\13\6\3\6\3\6\7\6\u0093\n\6\f\6\16\6\u0096"+
		"\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00a8\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00b0\n\t\f\t\16\t\u00b3\13"+
		"\t\3\n\3\n\7\n\u00b7\n\n\f\n\16\n\u00ba\13\n\3\n\3\n\7\n\u00be\n\n\f\n"+
		"\16\n\u00c1\13\n\3\n\6\n\u00c4\n\n\r\n\16\n\u00c5\3\n\7\n\u00c9\n\n\f"+
		"\n\16\n\u00cc\13\n\3\n\3\n\3\13\3\13\3\f\3\f\7\f\u00d4\n\f\f\f\16\f\u00d7"+
		"\13\f\3\f\3\f\7\f\u00db\n\f\f\f\16\f\u00de\13\f\3\f\3\f\7\f\u00e2\n\f"+
		"\f\f\16\f\u00e5\13\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\7\17"+
		"\u00f1\n\17\f\17\16\17\u00f4\13\17\3\17\3\17\3\17\7\17\u00f9\n\17\f\17"+
		"\16\17\u00fc\13\17\3\17\3\17\7\17\u0100\n\17\f\17\16\17\u0103\13\17\3"+
		"\17\7\17\u0106\n\17\f\17\16\17\u0109\13\17\3\17\3\17\7\17\u010d\n\17\f"+
		"\17\16\17\u0110\13\17\3\17\7\17\u0113\n\17\f\17\16\17\u0116\13\17\3\17"+
		"\3\17\3\20\7\20\u011b\n\20\f\20\16\20\u011e\13\20\3\20\3\20\7\20\u0122"+
		"\n\20\f\20\16\20\u0125\13\20\3\20\3\20\7\20\u0129\n\20\f\20\16\20\u012c"+
		"\13\20\3\20\3\20\7\20\u0130\n\20\f\20\16\20\u0133\13\20\3\20\3\20\3\21"+
		"\7\21\u0138\n\21\f\21\16\21\u013b\13\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u0142\n\21\f\21\16\21\u0145\13\21\3\21\3\21\7\21\u0149\n\21\f\21\16\21"+
		"\u014c\13\21\3\21\6\21\u014f\n\21\r\21\16\21\u0150\3\21\7\21\u0154\n\21"+
		"\f\21\16\21\u0157\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0161"+
		"\n\22\f\22\16\22\u0164\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\7\23\u016f\n\23\f\23\16\23\u0172\13\23\3\24\3\24\3\24\3\24\5\24\u0178"+
		"\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31"+
		"\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\5\3\31\32\3"+
		"\33\34\3\35\36\u019e\2\63\3\2\2\2\4G\3\2\2\2\6X\3\2\2\2\bp\3\2\2\2\nr"+
		"\3\2\2\2\f\u0099\3\2\2\2\16\u009c\3\2\2\2\20\u00a7\3\2\2\2\22\u00b4\3"+
		"\2\2\2\24\u00cf\3\2\2\2\26\u00d1\3\2\2\2\30\u00e8\3\2\2\2\32\u00ea\3\2"+
		"\2\2\34\u00f2\3\2\2\2\36\u011c\3\2\2\2 \u0139\3\2\2\2\"\u015a\3\2\2\2"+
		"$\u0165\3\2\2\2&\u0177\3\2\2\2(\u0179\3\2\2\2*\u017d\3\2\2\2,\u017f\3"+
		"\2\2\2.\u0181\3\2\2\2\60\u0183\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\64"+
		"\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\3\3\2\2\2\678\5\n\6\289\7\""+
		"\2\29H\3\2\2\2:;\7\b\2\2;<\5(\25\2<=\7\6\2\2=>\7\"\2\2>?\5\20\t\2?H\3"+
		"\2\2\2@H\5\b\5\2AH\5\16\b\2BH\5\6\4\2CD\5\22\n\2DE\7\"\2\2EH\3\2\2\2F"+
		"H\7\"\2\2G\67\3\2\2\2G:\3\2\2\2G@\3\2\2\2GA\3\2\2\2GB\3\2\2\2GC\3\2\2"+
		"\2GF\3\2\2\2H\5\3\2\2\2IK\7\t\2\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\37"+
		"\2\2MN\7\22\2\2NO\5\20\t\2OP\7\"\2\2PY\3\2\2\2QS\7\25\2\2RQ\3\2\2\2RS"+
		"\3\2\2\2ST\3\2\2\2TU\7\37\2\2UV\7\22\2\2VW\7!\2\2WY\7\"\2\2XJ\3\2\2\2"+
		"XR\3\2\2\2Y\7\3\2\2\2Z[\7\21\2\2[\\\7\7\2\2\\]\5\20\t\2]^\7\20\2\2^_\7"+
		"\"\2\2_q\3\2\2\2`a\7\27\2\2ab\7\7\2\2bc\5\20\t\2cd\7\20\2\2de\7\"\2\2"+
		"eq\3\2\2\2fg\7\21\2\2gh\7\7\2\2hi\7!\2\2ij\7\20\2\2jq\7\"\2\2kl\7\27\2"+
		"\2lm\7\7\2\2mn\7!\2\2no\7\20\2\2oq\7\"\2\2pZ\3\2\2\2p`\3\2\2\2pf\3\2\2"+
		"\2pk\3\2\2\2q\t\3\2\2\2rs\5&\24\2st\7\37\2\2tu\7\7\2\2uv\5$\23\2vz\7\20"+
		"\2\2wy\7\"\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2"+
		"\2\2}\u0081\7\r\2\2~\u0080\7\"\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0087\3\2\2\2\u0083\u0081\3\2\2"+
		"\2\u0084\u0086\5\4\3\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008d\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008c\7\"\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0094\5\f\7\2\u0091\u0093\7\"\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u0098\7\16\2\2\u0098\13\3\2\2\2\u0099\u009a\7\23"+
		"\2\2\u009a\u009b\7\37\2\2\u009b\r\3\2\2\2\u009c\u009d\7\t\2\2\u009d\u009e"+
		"\7\37\2\2\u009e\u009f\7\"\2\2\u009f\17\3\2\2\2\u00a0\u00a1\b\t\1\2\u00a1"+
		"\u00a8\7 \2\2\u00a2\u00a8\7\37\2\2\u00a3\u00a4\7\7\2\2\u00a4\u00a5\5\20"+
		"\t\2\u00a5\u00a6\7\20\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7"+
		"\u00a2\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8\u00b1\3\2\2\2\u00a9\u00aa\6\t"+
		"\2\3\u00aa\u00ab\t\2\2\2\u00ab\u00b0\5\20\t\2\u00ac\u00ad\6\t\3\3\u00ad"+
		"\u00ae\t\3\2\2\u00ae\u00b0\5\20\t\2\u00af\u00a9\3\2\2\2\u00af\u00ac\3"+
		"\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\21\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b8\7\24\2\2\u00b5\u00b7\7\"\2"+
		"\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bf\5\26\f\2"+
		"\u00bc\u00be\7\"\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c4\5\34\17\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00ca\3\2\2\2\u00c7\u00c9\7\"\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\5\24\13\2\u00ce"+
		"\23\3\2\2\2\u00cf\u00d0\7\f\2\2\u00d0\25\3\2\2\2\u00d1\u00d5\7\n\2\2\u00d2"+
		"\u00d4\7\"\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00dc\7\r\2\2\u00d9\u00db\7\"\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e3\5\"\22\2\u00e0\u00e2\7\"\2\2\u00e1\u00e0\3"+
		"\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7\16\2\2\u00e7\27\3\2\2"+
		"\2\u00e8\u00e9\7\37\2\2\u00e9\31\3\2\2\2\u00ea\u00eb\5\30\r\2\u00eb\u00ec"+
		"\7\5\2\2\u00ec\u00ed\7 \2\2\u00ed\u00ee\7\3\2\2\u00ee\33\3\2\2\2\u00ef"+
		"\u00f1\7\"\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00f6\7\26\2\2\u00f6\u00fa\7\37\2\2\u00f7\u00f9\7\"\2\2\u00f8\u00f7\3"+
		"\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0101\7\r\2\2\u00fe\u0100\7\""+
		"\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0107\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0106\5\4"+
		"\3\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010e\5 "+
		"\21\2\u010b\u010d\5\4\3\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0114\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0111\u0113\7\"\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0117\u0118\7\16\2\2\u0118\35\3\2\2\2\u0119\u011b\7\"\2\2\u011a\u0119"+
		"\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0123\7\30\2\2\u0120\u0122\7"+
		"\"\2\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u012a\7\r"+
		"\2\2\u0127\u0129\7\"\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012d\u0131\5\4\3\2\u012e\u0130\7\"\2\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7\16\2\2\u0135\37\3\2\2\2\u0136\u0138"+
		"\7\"\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7\30"+
		"\2\2\u013d\u013e\7\7\2\2\u013e\u013f\5\"\22\2\u013f\u0143\7\20\2\2\u0140"+
		"\u0142\7\"\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u014a\7\r\2\2\u0147\u0149\7\"\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2"+
		"\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014e\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014d\u014f\5\4\3\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0155\3\2\2\2\u0152"+
		"\u0154\7\"\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"\u0159\7\16\2\2\u0159!\3\2\2\2\u015a\u015b\b\22\1\2\u015b\u015c\7\37\2"+
		"\2\u015c\u0162\3\2\2\2\u015d\u015e\6\22\4\3\u015e\u015f\7\4\2\2\u015f"+
		"\u0161\7\37\2\2\u0160\u015d\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3"+
		"\2\2\2\u0162\u0163\3\2\2\2\u0163#\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166"+
		"\b\23\1\2\u0166\u0167\5&\24\2\u0167\u0168\7\37\2\2\u0168\u0170\3\2\2\2"+
		"\u0169\u016a\6\23\5\3\u016a\u016b\7\4\2\2\u016b\u016c\5&\24\2\u016c\u016d"+
		"\7\37\2\2\u016d\u016f\3\2\2\2\u016e\u0169\3\2\2\2\u016f\u0172\3\2\2\2"+
		"\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171%\3\2\2\2\u0172\u0170\3"+
		"\2\2\2\u0173\u0178\5*\26\2\u0174\u0178\5\60\31\2\u0175\u0178\5,\27\2\u0176"+
		"\u0178\5.\30\2\u0177\u0173\3\2\2\2\u0177\u0174\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0177\u0176\3\2\2\2\u0178\'\3\2\2\2\u0179\u017a\5\20\t\2\u017a\u017b"+
		"\t\4\2\2\u017b\u017c\5\20\t\2\u017c)\3\2\2\2\u017d\u017e\7\13\2\2\u017e"+
		"+\3\2\2\2\u017f\u0180\7\17\2\2\u0180-\3\2\2\2\u0181\u0182\7\25\2\2\u0182"+
		"/\3\2\2\2\u0183\u0184\7\t\2\2\u0184\61\3\2\2\2)\65GJRXpz\u0081\u0087\u008d"+
		"\u0094\u00a7\u00af\u00b1\u00b8\u00bf\u00c5\u00ca\u00d5\u00dc\u00e3\u00f2"+
		"\u00fa\u0101\u0107\u010e\u0114\u011c\u0123\u012a\u0131\u0139\u0143\u014a"+
		"\u0150\u0155\u0162\u0170\u0177";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}