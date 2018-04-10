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
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, MUL=24, 
		DIV=25, ADD=26, SUB=27, EQC=28, NEQ=29, ID=30, INT=31, STR=32, NEWLINE=33, 
		WS=34, COMMENT=35, LINE_COMMENT=36;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "','", "'['", "':'", "'('", "'if'", "'int'", "'main()'", 
		"'shared'", "'void'", "'@}'", "'{'", "'}'", "'char'", "')'", "'print'", 
		"'return'", "'='", "'{@'", "'string'", "'task'", "'println'", "'critical'", 
		"'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "ID", "INT", "STR", "NEWLINE", 
		"WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_main = 2, RULE_assignStat = 3, RULE_printStat = 4, 
		RULE_function = 5, RULE_returnstatement = 6, RULE_sVars = 7, RULE_expr = 8, 
		RULE_newparallel = 9, RULE_endParallel = 10, RULE_sharedValues = 11, RULE_object = 12, 
		RULE_threadArray = 13, RULE_tasks = 14, RULE_critSec = 15, RULE_critSecParams = 16, 
		RULE_params = 17, RULE_fparams = 18, RULE_function_call = 19, RULE_parametersType = 20, 
		RULE_condExpr = 21, RULE_fvoid = 22, RULE_fchar = 23, RULE_fstring = 24, 
		RULE_finteger = 25;
	public static final String[] ruleNames = {
		"prog", "stat", "main", "assignStat", "printStat", "function", "returnstatement", 
		"sVars", "expr", "newparallel", "endParallel", "sharedValues", "object", 
		"threadArray", "tasks", "critSec", "critSecParams", "params", "fparams", 
		"function_call", "parametersType", "condExpr", "fvoid", "fchar", "fstring", 
		"finteger"
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
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52); stat();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 8) | (1L << 10) | (1L << 14) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 22) | (1L << ID) | (1L << NEWLINE))) != 0) );
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
	public static class CreateMainContext extends StatContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public CreateMainContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterCreateMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitCreateMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitCreateMain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Call_a_functionContext extends StatContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Call_a_functionContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterCall_a_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitCall_a_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitCall_a_function(this);
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
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new CreateMainContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57); main();
				}
				break;

			case 2:
				_localctx = new JustcreatefunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58); function();
				setState(59); match(NEWLINE);
				}
				break;

			case 3:
				_localctx = new Call_a_functionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61); function_call();
				}
				break;

			case 4:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(62); match(6);
				setState(63); condExpr();
				setState(64); match(4);
				setState(65); match(NEWLINE);
				setState(66); expr(0);
				}
				break;

			case 5:
				_localctx = new PrintStmContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(68); printStat();
				}
				break;

			case 6:
				_localctx = new CreatesVars1Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(69); sVars();
				}
				break;

			case 7:
				_localctx = new AssignStmContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(70); assignStat();
				}
				break;

			case 8:
				_localctx = new AsignParallelContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(71); newparallel();
				setState(72); match(NEWLINE);
				}
				break;

			case 9:
				_localctx = new CreateMainContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(74); main();
				}
				break;

			case 10:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(75); match(NEWLINE);
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

	public static class MainContext extends ParserRuleContext {
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	 
		public MainContext() { }
		public void copyFrom(MainContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WritemainContext extends MainContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public WritemainContext(MainContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterWritemain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitWritemain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitWritemain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		int _la;
		try {
			int _alt;
			_localctx = new WritemainContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(8);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(79); match(NEWLINE);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85); match(12);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(86); match(NEWLINE);
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(93); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(92); stat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(95); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(97); match(NEWLINE);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103); match(13);
			setState(105); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(104); match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(107); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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
		enterRule(_localctx, 6, RULE_assignStat);
		int _la;
		try {
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new AssignIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				_la = _input.LA(1);
				if (_la==7) {
					{
					setState(109); match(7);
					}
				}

				setState(112); match(ID);
				setState(113); match(18);
				setState(114); expr(0);
				setState(115); match(NEWLINE);
				}
				break;

			case 2:
				_localctx = new AssignStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				_la = _input.LA(1);
				if (_la==20) {
					{
					setState(117); match(20);
					}
				}

				setState(120); match(ID);
				setState(121); match(18);
				setState(122); match(STR);
				setState(123); match(NEWLINE);
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
		enterRule(_localctx, 8, RULE_printStat);
		try {
			setState(148);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126); match(16);
				setState(127); match(5);
				setState(128); expr(0);
				setState(129); match(15);
				setState(130); match(NEWLINE);
				}
				break;

			case 2:
				_localctx = new PrintlnExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132); match(22);
				setState(133); match(5);
				setState(134); expr(0);
				setState(135); match(15);
				setState(136); match(NEWLINE);
				}
				break;

			case 3:
				_localctx = new PrintStrExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(138); match(16);
				setState(139); match(5);
				setState(140); match(STR);
				setState(141); match(15);
				setState(142); match(NEWLINE);
				}
				break;

			case 4:
				_localctx = new PrintlnStrExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(143); match(22);
				setState(144); match(5);
				setState(145); match(STR);
				setState(146); match(15);
				setState(147); match(NEWLINE);
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
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			int _alt;
			_localctx = new CreatefunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(150); parametersType();
			setState(151); match(ID);
			setState(152); match(5);
			setState(153); fparams(0);
			setState(154); match(15);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(155); match(NEWLINE);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161); match(12);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(162); match(NEWLINE);
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(168); stat();
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(174); match(NEWLINE);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180); returnstatement();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(181); match(NEWLINE);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187); match(13);
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
		enterRule(_localctx, 12, RULE_returnstatement);
		try {
			_localctx = new ReturnfromfunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(189); match(17);
			setState(190); match(ID);
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
		enterRule(_localctx, 14, RULE_sVars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); match(7);
			setState(193); match(ID);
			setState(194); match(NEWLINE);
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
		int _startState = 16;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(197); match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198); match(ID);
				}
				break;
			case 5:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199); match(5);
				setState(200); expr(0);
				setState(201); match(15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(205);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(206);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(207); expr(6);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(208);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(209);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(210); expr(5);
						}
						break;
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 18, RULE_newparallel);
		int _la;
		try {
			int _alt;
			_localctx = new AnotherParallelStructContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(216); match(19);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(217); match(NEWLINE);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223); sharedValues();
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(224); match(NEWLINE);
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(231); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(230); tasks();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(233); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(235); match(NEWLINE);
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241); endParallel();
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
		enterRule(_localctx, 20, RULE_endParallel);
		try {
			_localctx = new EndParallelStructContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(11);
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
		enterRule(_localctx, 22, RULE_sharedValues);
		int _la;
		try {
			_localctx = new SharedParamsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(245); match(9);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(246); match(NEWLINE);
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252); match(12);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(253); match(NEWLINE);
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259); params(0);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(260); match(NEWLINE);
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266); match(13);
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
		enterRule(_localctx, 24, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); match(ID);
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
		enterRule(_localctx, 26, RULE_threadArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); object();
			setState(271); match(3);
			setState(272); match(INT);
			setState(273); match(1);
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
		enterRule(_localctx, 28, RULE_tasks);
		int _la;
		try {
			int _alt;
			_localctx = new NewTaskContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(275); match(NEWLINE);
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281); match(21);
			setState(282); match(ID);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(283); match(NEWLINE);
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289); match(12);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(290); match(NEWLINE);
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(296); stat();
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(302); critSecParams();
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(303); stat();
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(309); match(NEWLINE);
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315); match(13);
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
		enterRule(_localctx, 30, RULE_critSec);
		int _la;
		try {
			int _alt;
			_localctx = new CriticalSectionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(317); match(NEWLINE);
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323); match(23);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(324); match(NEWLINE);
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330); match(12);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(331); match(NEWLINE);
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(337); stat();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(338); match(NEWLINE);
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344); match(13);
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
		enterRule(_localctx, 32, RULE_critSecParams);
		int _la;
		try {
			int _alt;
			_localctx = new CriticalSectionWithParamsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(346); match(NEWLINE);
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352); match(23);
			setState(353); match(5);
			setState(354); params(0);
			setState(355); match(15);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(356); match(NEWLINE);
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362); match(12);
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(363); match(NEWLINE);
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(370); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(369); stat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(372); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(374); match(NEWLINE);
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380); match(13);
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
		int _startState = 34;
		enterRecursionRule(_localctx, RULE_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(383); match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParamsContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_params);
					setState(385);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(386); match(2);
					setState(387); match(ID);
					}
					} 
				}
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		int _startState = 36;
		enterRecursionRule(_localctx, RULE_fparams);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(394); parametersType();
			setState(395); match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FparamsContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_fparams);
					setState(397);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(398); match(2);
					setState(399); parametersType();
					setState(400); match(ID);
					}
					} 
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	public static class Function_callContext extends ParserRuleContext {
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	 
		public Function_callContext() { }
		public void copyFrom(Function_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Call_functionContext extends Function_callContext {
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public Call_functionContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterCall_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitCall_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitCall_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_call);
		int _la;
		try {
			int _alt;
			_localctx = new Call_functionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(407); match(ID);
			setState(408); match(5);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(409); params(0);
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415); match(15);
			setState(417); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(416); match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(419); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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
		enterRule(_localctx, 40, RULE_parametersType);
		try {
			setState(425);
			switch (_input.LA(1)) {
			case 10:
				enterOuterAlt(_localctx, 1);
				{
				setState(421); fvoid();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(422); finteger();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 3);
				{
				setState(423); fchar();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 4);
				{
				setState(424); fstring();
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
		enterRule(_localctx, 42, RULE_condExpr);
		int _la;
		try {
			_localctx = new CndExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(427); expr(0);
			setState(428);
			((CndExprContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==EQC || _la==NEQ) ) {
				((CndExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(429); expr(0);
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
		enterRule(_localctx, 44, RULE_fvoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431); match(10);
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
		enterRule(_localctx, 46, RULE_fchar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433); match(14);
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
		enterRule(_localctx, 48, RULE_fstring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); match(20);
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
		enterRule(_localctx, 50, RULE_finteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); match(7);
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
		case 8: return expr_sempred((ExprContext)_localctx, predIndex);

		case 17: return params_sempred((ParamsContext)_localctx, predIndex);

		case 18: return fparams_sempred((FparamsContext)_localctx, predIndex);
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
		"\2\3&\u01ba\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\6\28\n\2\r\2\16\29\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3O\n\3\3\4\3\4\7\4S\n\4\f\4\16\4V\13\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13"+
		"\4\3\4\6\4`\n\4\r\4\16\4a\3\4\7\4e\n\4\f\4\16\4h\13\4\3\4\3\4\6\4l\n\4"+
		"\r\4\16\4m\3\5\5\5q\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5y\n\5\3\5\3\5\3\5\3"+
		"\5\5\5\177\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0097\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\7\7\u009f\n\7\f\7\16\7\u00a2\13\7\3\7\3\7\7\7\u00a6\n\7\f\7\16\7\u00a9"+
		"\13\7\3\7\7\7\u00ac\n\7\f\7\16\7\u00af\13\7\3\7\7\7\u00b2\n\7\f\7\16\7"+
		"\u00b5\13\7\3\7\3\7\7\7\u00b9\n\7\f\7\16\7\u00bc\13\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ce\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u00d6\n\n\f\n\16\n\u00d9\13\n\3\13\3\13\7\13\u00dd"+
		"\n\13\f\13\16\13\u00e0\13\13\3\13\3\13\7\13\u00e4\n\13\f\13\16\13\u00e7"+
		"\13\13\3\13\6\13\u00ea\n\13\r\13\16\13\u00eb\3\13\7\13\u00ef\n\13\f\13"+
		"\16\13\u00f2\13\13\3\13\3\13\3\f\3\f\3\r\3\r\7\r\u00fa\n\r\f\r\16\r\u00fd"+
		"\13\r\3\r\3\r\7\r\u0101\n\r\f\r\16\r\u0104\13\r\3\r\3\r\7\r\u0108\n\r"+
		"\f\r\16\r\u010b\13\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\7"+
		"\20\u0117\n\20\f\20\16\20\u011a\13\20\3\20\3\20\3\20\7\20\u011f\n\20\f"+
		"\20\16\20\u0122\13\20\3\20\3\20\7\20\u0126\n\20\f\20\16\20\u0129\13\20"+
		"\3\20\7\20\u012c\n\20\f\20\16\20\u012f\13\20\3\20\3\20\7\20\u0133\n\20"+
		"\f\20\16\20\u0136\13\20\3\20\7\20\u0139\n\20\f\20\16\20\u013c\13\20\3"+
		"\20\3\20\3\21\7\21\u0141\n\21\f\21\16\21\u0144\13\21\3\21\3\21\7\21\u0148"+
		"\n\21\f\21\16\21\u014b\13\21\3\21\3\21\7\21\u014f\n\21\f\21\16\21\u0152"+
		"\13\21\3\21\3\21\7\21\u0156\n\21\f\21\16\21\u0159\13\21\3\21\3\21\3\22"+
		"\7\22\u015e\n\22\f\22\16\22\u0161\13\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u0168\n\22\f\22\16\22\u016b\13\22\3\22\3\22\7\22\u016f\n\22\f\22\16\22"+
		"\u0172\13\22\3\22\6\22\u0175\n\22\r\22\16\22\u0176\3\22\7\22\u017a\n\22"+
		"\f\22\16\22\u017d\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0187"+
		"\n\23\f\23\16\23\u018a\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\7\24\u0195\n\24\f\24\16\24\u0198\13\24\3\25\3\25\3\25\7\25\u019d\n"+
		"\25\f\25\16\25\u01a0\13\25\3\25\3\25\6\25\u01a4\n\25\r\25\16\25\u01a5"+
		"\3\26\3\26\3\26\3\26\5\26\u01ac\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\2\5\3\32\33\3\34\35\3\36\37\u01da\2\67\3\2\2\2\4"+
		"N\3\2\2\2\6P\3\2\2\2\b~\3\2\2\2\n\u0096\3\2\2\2\f\u0098\3\2\2\2\16\u00bf"+
		"\3\2\2\2\20\u00c2\3\2\2\2\22\u00cd\3\2\2\2\24\u00da\3\2\2\2\26\u00f5\3"+
		"\2\2\2\30\u00f7\3\2\2\2\32\u010e\3\2\2\2\34\u0110\3\2\2\2\36\u0118\3\2"+
		"\2\2 \u0142\3\2\2\2\"\u015f\3\2\2\2$\u0180\3\2\2\2&\u018b\3\2\2\2(\u0199"+
		"\3\2\2\2*\u01ab\3\2\2\2,\u01ad\3\2\2\2.\u01b1\3\2\2\2\60\u01b3\3\2\2\2"+
		"\62\u01b5\3\2\2\2\64\u01b7\3\2\2\2\668\5\4\3\2\67\66\3\2\2\289\3\2\2\2"+
		"9\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;O\5\6\4\2<=\5\f\7\2=>\7#\2\2>O\3\2\2"+
		"\2?O\5(\25\2@A\7\b\2\2AB\5,\27\2BC\7\6\2\2CD\7#\2\2DE\5\22\n\2EO\3\2\2"+
		"\2FO\5\n\6\2GO\5\20\t\2HO\5\b\5\2IJ\5\24\13\2JK\7#\2\2KO\3\2\2\2LO\5\6"+
		"\4\2MO\7#\2\2N;\3\2\2\2N<\3\2\2\2N?\3\2\2\2N@\3\2\2\2NF\3\2\2\2NG\3\2"+
		"\2\2NH\3\2\2\2NI\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\5\3\2\2\2PT\7\n\2\2QS\7"+
		"#\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2W[\7"+
		"\16\2\2XZ\7#\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2]"+
		"[\3\2\2\2^`\5\4\3\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bf\3\2\2\2"+
		"ce\7#\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2"+
		"ik\7\17\2\2jl\7#\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\7\3\2\2"+
		"\2oq\7\t\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7 \2\2st\7\24\2\2tu\5\22"+
		"\n\2uv\7#\2\2v\177\3\2\2\2wy\7\26\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{"+
		"\7 \2\2{|\7\24\2\2|}\7\"\2\2}\177\7#\2\2~p\3\2\2\2~x\3\2\2\2\177\t\3\2"+
		"\2\2\u0080\u0081\7\22\2\2\u0081\u0082\7\7\2\2\u0082\u0083\5\22\n\2\u0083"+
		"\u0084\7\21\2\2\u0084\u0085\7#\2\2\u0085\u0097\3\2\2\2\u0086\u0087\7\30"+
		"\2\2\u0087\u0088\7\7\2\2\u0088\u0089\5\22\n\2\u0089\u008a\7\21\2\2\u008a"+
		"\u008b\7#\2\2\u008b\u0097\3\2\2\2\u008c\u008d\7\22\2\2\u008d\u008e\7\7"+
		"\2\2\u008e\u008f\7\"\2\2\u008f\u0090\7\21\2\2\u0090\u0097\7#\2\2\u0091"+
		"\u0092\7\30\2\2\u0092\u0093\7\7\2\2\u0093\u0094\7\"\2\2\u0094\u0095\7"+
		"\21\2\2\u0095\u0097\7#\2\2\u0096\u0080\3\2\2\2\u0096\u0086\3\2\2\2\u0096"+
		"\u008c\3\2\2\2\u0096\u0091\3\2\2\2\u0097\13\3\2\2\2\u0098\u0099\5*\26"+
		"\2\u0099\u009a\7 \2\2\u009a\u009b\7\7\2\2\u009b\u009c\5&\24\2\u009c\u00a0"+
		"\7\21\2\2\u009d\u009f\7#\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a7\7\16\2\2\u00a4\u00a6\7#\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ad\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\5\4\3\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b3\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2\7#\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00ba\5\16\b\2\u00b7\u00b9\7#\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\17\2\2\u00be"+
		"\r\3\2\2\2\u00bf\u00c0\7\23\2\2\u00c0\u00c1\7 \2\2\u00c1\17\3\2\2\2\u00c2"+
		"\u00c3\7\t\2\2\u00c3\u00c4\7 \2\2\u00c4\u00c5\7#\2\2\u00c5\21\3\2\2\2"+
		"\u00c6\u00c7\b\n\1\2\u00c7\u00ce\7!\2\2\u00c8\u00ce\7 \2\2\u00c9\u00ca"+
		"\7\7\2\2\u00ca\u00cb\5\22\n\2\u00cb\u00cc\7\21\2\2\u00cc\u00ce\3\2\2\2"+
		"\u00cd\u00c6\3\2\2\2\u00cd\u00c8\3\2\2\2\u00cd\u00c9\3\2\2\2\u00ce\u00d7"+
		"\3\2\2\2\u00cf\u00d0\6\n\2\3\u00d0\u00d1\t\2\2\2\u00d1\u00d6\5\22\n\2"+
		"\u00d2\u00d3\6\n\3\3\u00d3\u00d4\t\3\2\2\u00d4\u00d6\5\22\n\2\u00d5\u00cf"+
		"\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\23\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00de\7\25\2"+
		"\2\u00db\u00dd\7#\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e5\5\30\r\2\u00e2\u00e4\7#\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00ea\5\36\20\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3"+
		"\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f0\3\2\2\2\u00ed"+
		"\u00ef\7#\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f4\5\26\f\2\u00f4\25\3\2\2\2\u00f5\u00f6\7\r\2\2\u00f6\27\3\2\2\2"+
		"\u00f7\u00fb\7\13\2\2\u00f8\u00fa\7#\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u0102\7\16\2\2\u00ff\u0101\7#\2\2\u0100\u00ff\3\2"+
		"\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0109\5$\23\2\u0106\u0108\7#"+
		"\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7\17"+
		"\2\2\u010d\31\3\2\2\2\u010e\u010f\7 \2\2\u010f\33\3\2\2\2\u0110\u0111"+
		"\5\32\16\2\u0111\u0112\7\5\2\2\u0112\u0113\7!\2\2\u0113\u0114\7\3\2\2"+
		"\u0114\35\3\2\2\2\u0115\u0117\7#\2\2\u0116\u0115\3\2\2\2\u0117\u011a\3"+
		"\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u011c\7\27\2\2\u011c\u0120\7 \2\2\u011d\u011f\7#"+
		"\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0127\7\16"+
		"\2\2\u0124\u0126\7#\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012d\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u012a\u012c\5\4\3\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u0130\u0134\5\"\22\2\u0131\u0133\5\4\3\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u013a\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0137\u0139\7#\2\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7\17\2\2\u013e\37\3\2\2\2\u013f\u0141"+
		"\7#\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0149\7\31"+
		"\2\2\u0146\u0148\7#\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014c\u0150\7\16\2\2\u014d\u014f\7#\2\2\u014e\u014d\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\u0157\5\4\3\2\u0154\u0156\7#\2\2\u0155"+
		"\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7\17\2\2\u015b"+
		"!\3\2\2\2\u015c\u015e\7#\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0162\u0163\7\31\2\2\u0163\u0164\7\7\2\2\u0164\u0165\5$\23\2\u0165"+
		"\u0169\7\21\2\2\u0166\u0168\7#\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2"+
		"\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016c\u0170\7\16\2\2\u016d\u016f\7#\2\2\u016e\u016d\3\2"+
		"\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0175\5\4\3\2\u0174\u0173\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u017b\3\2\2\2\u0178\u017a\7#\2\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2"+
		"\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017e\u017f\7\17\2\2\u017f#\3\2\2\2\u0180\u0181\b\23\1"+
		"\2\u0181\u0182\7 \2\2\u0182\u0188\3\2\2\2\u0183\u0184\6\23\4\3\u0184\u0185"+
		"\7\4\2\2\u0185\u0187\7 \2\2\u0186\u0183\3\2\2\2\u0187\u018a\3\2\2\2\u0188"+
		"\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189%\3\2\2\2\u018a\u0188\3\2\2\2"+
		"\u018b\u018c\b\24\1\2\u018c\u018d\5*\26\2\u018d\u018e\7 \2\2\u018e\u0196"+
		"\3\2\2\2\u018f\u0190\6\24\5\3\u0190\u0191\7\4\2\2\u0191\u0192\5*\26\2"+
		"\u0192\u0193\7 \2\2\u0193\u0195\3\2\2\2\u0194\u018f\3\2\2\2\u0195\u0198"+
		"\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\'\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0199\u019a\7 \2\2\u019a\u019e\7\7\2\2\u019b\u019d\5$\23"+
		"\2\u019c\u019b\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f"+
		"\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a3\7\21\2\2"+
		"\u01a2\u01a4\7#\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a3"+
		"\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6)\3\2\2\2\u01a7\u01ac\5.\30\2\u01a8"+
		"\u01ac\5\64\33\2\u01a9\u01ac\5\60\31\2\u01aa\u01ac\5\62\32\2\u01ab\u01a7"+
		"\3\2\2\2\u01ab\u01a8\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac"+
		"+\3\2\2\2\u01ad\u01ae\5\22\n\2\u01ae\u01af\t\4\2\2\u01af\u01b0\5\22\n"+
		"\2\u01b0-\3\2\2\2\u01b1\u01b2\7\f\2\2\u01b2/\3\2\2\2\u01b3\u01b4\7\20"+
		"\2\2\u01b4\61\3\2\2\2\u01b5\u01b6\7\26\2\2\u01b6\63\3\2\2\2\u01b7\u01b8"+
		"\7\t\2\2\u01b8\65\3\2\2\2\609NT[afmpx~\u0096\u00a0\u00a7\u00ad\u00b3\u00ba"+
		"\u00cd\u00d5\u00d7\u00de\u00e5\u00eb\u00f0\u00fb\u0102\u0109\u0118\u0120"+
		"\u0127\u012d\u0134\u013a\u0142\u0149\u0150\u0157\u015f\u0169\u0170\u0176"+
		"\u017b\u0188\u0196\u019e\u01a5\u01ab";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}