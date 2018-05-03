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
		T__23=1, T__22=2, T__21=3, T__20=4, T__19=5, T__18=6, T__17=7, T__16=8, 
		T__15=9, T__14=10, T__13=11, T__12=12, T__11=13, T__10=14, T__9=15, T__8=16, 
		T__7=17, T__6=18, T__5=19, T__4=20, T__3=21, T__2=22, T__1=23, T__0=24, 
		MUL=25, DIV=26, ADD=27, SUB=28, EQC=29, NEQ=30, ID=31, INT=32, STR=33, 
		NEWLINE=34, WS=35, COMMENT=36, LINE_COMMENT=37;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "','", "'['", "':'", "'('", "'if'", "'parallelo.run'", 
		"'int'", "'main()'", "'shared'", "'void'", "'@}'", "'{'", "'}'", "'char'", 
		"')'", "'print'", "'return'", "'='", "'{@'", "'string'", "'task'", "'println'", 
		"'critical'", "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "ID", "INT", 
		"STR", "NEWLINE", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_par = 2, RULE_main = 3, RULE_assignStat = 4, 
		RULE_printStat = 5, RULE_function = 6, RULE_returnstatement = 7, RULE_sVars = 8, 
		RULE_expr = 9, RULE_newparallel = 10, RULE_endParallel = 11, RULE_sharedValues = 12, 
		RULE_statinCritcal = 13, RULE_object = 14, RULE_threadArray = 15, RULE_tasks = 16, 
		RULE_critaicalStat = 17, RULE_critSec = 18, RULE_critSecParams = 19, RULE_params = 20, 
		RULE_fparams = 21, RULE_function_call = 22, RULE_parametersType = 23, 
		RULE_condExpr = 24, RULE_function_id = 25, RULE_fvoid = 26, RULE_fchar = 27, 
		RULE_fstring = 28, RULE_finteger = 29;
	public static final String[] ruleNames = {
		"prog", "stat", "par", "main", "assignStat", "printStat", "function", 
		"returnstatement", "sVars", "expr", "newparallel", "endParallel", "sharedValues", 
		"statinCritcal", "object", "threadArray", "tasks", "critaicalStat", "critSec", 
		"critSecParams", "params", "fparams", "function_call", "parametersType", 
		"condExpr", "function_id", "fvoid", "fchar", "fstring", "finteger"
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
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60); stat();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 15) | (1L << 17) | (1L << 18) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << ID) | (1L << NEWLINE))) != 0) );
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
	public static class TsksContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public TasksContext tasks() {
			return getRuleContext(TasksContext.class,0);
		}
		public TsksContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTsks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTsks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTsks(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DummyreturnContext extends StatContext {
		public ReturnstatementContext returnstatement() {
			return getRuleContext(ReturnstatementContext.class,0);
		}
		public DummyreturnContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterDummyreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitDummyreturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitDummyreturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParalleloContext extends StatContext {
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public ParalleloContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterParallelo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitParallelo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitParallelo(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
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
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new CreateMainContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65); main();
				}
				break;

			case 2:
				_localctx = new JustcreatefunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66); function();
				setState(67); match(NEWLINE);
				}
				break;

			case 3:
				_localctx = new Call_a_functionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(69); function_call();
				setState(70); match(NEWLINE);
				}
				break;

			case 4:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(72); match(6);
				setState(73); condExpr();
				setState(74); match(4);
				setState(75); match(NEWLINE);
				setState(76); expr(0);
				}
				break;

			case 5:
				_localctx = new PrintStmContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(78); printStat();
				}
				break;

			case 6:
				_localctx = new CreatesVars1Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(79); sVars();
				}
				break;

			case 7:
				_localctx = new AssignStmContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(80); assignStat();
				}
				break;

			case 8:
				_localctx = new AsignParallelContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(81); newparallel();
				setState(82); match(NEWLINE);
				}
				break;

			case 9:
				_localctx = new ParalleloContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(84); par();
				setState(85); match(NEWLINE);
				}
				break;

			case 10:
				_localctx = new TsksContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(87); tasks();
				setState(88); match(NEWLINE);
				}
				break;

			case 11:
				_localctx = new DummyreturnContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(90); returnstatement();
				}
				break;

			case 12:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(91); match(NEWLINE);
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

	public static class ParContext extends ParserRuleContext {
		public ParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_par; }
	 
		public ParContext() { }
		public void copyFrom(ParContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParallleloRuntimeContext extends ParContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParallleloRuntimeContext(ParContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterParallleloRuntime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitParallleloRuntime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitParallleloRuntime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParContext par() throws RecognitionException {
		ParContext _localctx = new ParContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_par);
		try {
			_localctx = new ParallleloRuntimeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(7);
			setState(95); match(5);
			setState(96); params(0);
			setState(97); match(16);
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
		enterRule(_localctx, 6, RULE_main);
		int _la;
		try {
			int _alt;
			_localctx = new WritemainContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(9);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(100); match(NEWLINE);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106); match(13);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(107); match(NEWLINE);
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(114); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(113); stat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(116); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(118); match(NEWLINE);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124); match(14);
			setState(126); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(125); match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(128); 
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
		enterRule(_localctx, 8, RULE_assignStat);
		int _la;
		try {
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new AssignIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				_la = _input.LA(1);
				if (_la==8) {
					{
					setState(130); match(8);
					}
				}

				setState(133); match(ID);
				setState(134); match(19);
				setState(135); expr(0);
				setState(136); match(NEWLINE);
				}
				break;

			case 2:
				_localctx = new AssignStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				_la = _input.LA(1);
				if (_la==21) {
					{
					setState(138); match(21);
					}
				}

				setState(141); match(ID);
				setState(142); match(19);
				setState(143); match(STR);
				setState(144); match(NEWLINE);
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
		enterRule(_localctx, 10, RULE_printStat);
		try {
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147); match(17);
				setState(148); match(5);
				setState(149); expr(0);
				setState(150); match(16);
				setState(151); match(NEWLINE);
				}
				break;

			case 2:
				_localctx = new PrintlnExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153); match(23);
				setState(154); match(5);
				setState(155); expr(0);
				setState(156); match(16);
				setState(157); match(NEWLINE);
				}
				break;

			case 3:
				_localctx = new PrintStrExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159); match(17);
				setState(160); match(5);
				setState(161); match(STR);
				setState(162); match(16);
				setState(163); match(NEWLINE);
				}
				break;

			case 4:
				_localctx = new PrintlnStrExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(164); match(23);
				setState(165); match(5);
				setState(166); match(STR);
				setState(167); match(16);
				setState(168); match(NEWLINE);
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
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			int _alt;
			_localctx = new CreatefunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(171); parametersType();
			setState(172); match(ID);
			setState(173); match(5);
			setState(174); fparams(0);
			setState(175); match(16);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(176); match(NEWLINE);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182); match(13);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(183); match(NEWLINE);
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(189); stat();
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(195); match(NEWLINE);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201); match(14);
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
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
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
		enterRule(_localctx, 14, RULE_returnstatement);
		try {
			_localctx = new ReturnfromfunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(203); match(18);
			setState(204); match(ID);
			setState(205); match(NEWLINE);
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
		enterRule(_localctx, 16, RULE_sVars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(8);
			setState(208); match(ID);
			setState(209); match(NEWLINE);
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
	public static class FuncCallContext extends ExprContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FuncCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitFuncCall(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(212); match(INT);
				}
				break;

			case 2:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213); match(ID);
				}
				break;

			case 3:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214); function_call();
				}
				break;

			case 4:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215); match(5);
				setState(216); expr(0);
				setState(217); match(16);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(227);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(221);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(222);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(223); expr(7);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(225);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(226); expr(6);
						}
						break;
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 20, RULE_newparallel);
		int _la;
		try {
			int _alt;
			_localctx = new AnotherParallelStructContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(232); match(20);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(233); match(NEWLINE);
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239); sharedValues();
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(240); match(NEWLINE);
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(247); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(246); tasks();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(249); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(251); match(NEWLINE);
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257); endParallel();
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
		enterRule(_localctx, 22, RULE_endParallel);
		try {
			_localctx = new EndParallelStructContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(259); match(12);
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
		enterRule(_localctx, 24, RULE_sharedValues);
		int _la;
		try {
			_localctx = new SharedParamsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(261); match(10);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(262); match(NEWLINE);
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268); match(13);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(269); match(NEWLINE);
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275); params(0);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(276); match(NEWLINE);
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282); match(14);
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

	public static class StatinCritcalContext extends ParserRuleContext {
		public StatinCritcalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statinCritcal; }
	 
		public StatinCritcalContext() { }
		public void copyFrom(StatinCritcalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatInCriticalContext extends StatinCritcalContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatInCriticalContext(StatinCritcalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterStatInCritical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitStatInCritical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitStatInCritical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatinCritcalContext statinCritcal() throws RecognitionException {
		StatinCritcalContext _localctx = new StatinCritcalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statinCritcal);
		int _la;
		try {
			_localctx = new StatInCriticalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 15) | (1L << 17) | (1L << 18) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(284); stat();
				}
				}
				setState(289);
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
		enterRule(_localctx, 28, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); match(ID);
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
		enterRule(_localctx, 30, RULE_threadArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292); object();
			setState(293); match(3);
			setState(294); match(INT);
			setState(295); match(1);
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
		public CritaicalStatContext critaicalStat(int i) {
			return getRuleContext(CritaicalStatContext.class,i);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<CritaicalStatContext> critaicalStat() {
			return getRuleContexts(CritaicalStatContext.class);
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
		enterRule(_localctx, 32, RULE_tasks);
		int _la;
		try {
			int _alt;
			_localctx = new NewTaskContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(297); match(NEWLINE);
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303); match(22);
			setState(304); match(ID);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(305); match(NEWLINE);
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311); match(13);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(312); match(NEWLINE);
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(318); stat();
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
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
			setState(330); match(24);
			setState(331); match(5);
			setState(332); params(0);
			setState(333); match(16);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(334); match(NEWLINE);
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340); match(13);
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(341); match(NEWLINE);
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(348); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(347); critaicalStat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(350); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(352); match(NEWLINE);
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358); match(14);
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(359); stat();
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(365); match(NEWLINE);
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371); match(14);
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

	public static class CritaicalStatContext extends ParserRuleContext {
		public CritaicalStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_critaicalStat; }
	 
		public CritaicalStatContext() { }
		public void copyFrom(CritaicalStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CriticalStatementsContext extends CritaicalStatContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public CriticalStatementsContext(CritaicalStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterCriticalStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitCriticalStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitCriticalStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CritaicalStatContext critaicalStat() throws RecognitionException {
		CritaicalStatContext _localctx = new CritaicalStatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_critaicalStat);
		try {
			_localctx = new CriticalStatementsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(373); stat();
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
		enterRule(_localctx, 36, RULE_critSec);
		int _la;
		try {
			int _alt;
			_localctx = new CriticalSectionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(375); match(NEWLINE);
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(381); match(24);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(382); match(NEWLINE);
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(388); match(13);
			setState(392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(389); match(NEWLINE);
					}
					} 
				}
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(395); stat();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(396); match(NEWLINE);
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402); match(14);
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
		enterRule(_localctx, 38, RULE_critSecParams);
		try {
			_localctx = new CriticalSectionWithParamsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
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
		int _startState = 40;
		enterRecursionRule(_localctx, RULE_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(407); match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(414);
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
					setState(409);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(410); match(2);
					setState(411); match(ID);
					}
					} 
				}
				setState(416);
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
		int _startState = 42;
		enterRecursionRule(_localctx, RULE_fparams);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(418); parametersType();
			setState(419); match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(428);
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
					setState(421);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(422); match(2);
					setState(423); parametersType();
					setState(424); match(ID);
					}
					} 
				}
				setState(430);
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
		public Function_idContext function_id() {
			return getRuleContext(Function_idContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
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
		enterRule(_localctx, 44, RULE_function_call);
		try {
			_localctx = new Call_functionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(431); function_id();
			setState(432); match(5);
			setState(433); params(0);
			setState(434); match(16);
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
		enterRule(_localctx, 46, RULE_parametersType);
		try {
			setState(440);
			switch (_input.LA(1)) {
			case 11:
				enterOuterAlt(_localctx, 1);
				{
				setState(436); fvoid();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 2);
				{
				setState(437); finteger();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 3);
				{
				setState(438); fchar();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 4);
				{
				setState(439); fstring();
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
		enterRule(_localctx, 48, RULE_condExpr);
		int _la;
		try {
			_localctx = new CndExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(442); expr(0);
			setState(443);
			((CndExprContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==EQC || _la==NEQ) ) {
				((CndExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(444); expr(0);
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

	public static class Function_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public Function_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterFunction_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitFunction_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitFunction_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_idContext function_id() throws RecognitionException {
		Function_idContext _localctx = new Function_idContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446); match(ID);
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
		enterRule(_localctx, 52, RULE_fvoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448); match(11);
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
		enterRule(_localctx, 54, RULE_fchar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450); match(15);
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
		enterRule(_localctx, 56, RULE_fstring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452); match(21);
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
		enterRule(_localctx, 58, RULE_finteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454); match(8);
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
		case 9: return expr_sempred((ExprContext)_localctx, predIndex);

		case 20: return params_sempred((ParamsContext)_localctx, predIndex);

		case 21: return fparams_sempred((FparamsContext)_localctx, predIndex);
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
		case 0: return 6 >= _localctx._p;

		case 1: return 5 >= _localctx._p;
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
		"\2\3\'\u01cb\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\3\2\6\2@\n\2\r\2\16\2A\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3_\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5h\n\5\f\5\16\5k\13\5\3\5\3"+
		"\5\7\5o\n\5\f\5\16\5r\13\5\3\5\6\5u\n\5\r\5\16\5v\3\5\7\5z\n\5\f\5\16"+
		"\5}\13\5\3\5\3\5\6\5\u0081\n\5\r\5\16\5\u0082\3\6\5\6\u0086\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u008e\n\6\3\6\3\6\3\6\3\6\5\6\u0094\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00ac\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b4\n\b\f\b\16"+
		"\b\u00b7\13\b\3\b\3\b\7\b\u00bb\n\b\f\b\16\b\u00be\13\b\3\b\7\b\u00c1"+
		"\n\b\f\b\16\b\u00c4\13\b\3\b\7\b\u00c7\n\b\f\b\16\b\u00ca\13\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00de\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00e6\n\13\f\13"+
		"\16\13\u00e9\13\13\3\f\3\f\7\f\u00ed\n\f\f\f\16\f\u00f0\13\f\3\f\3\f\7"+
		"\f\u00f4\n\f\f\f\16\f\u00f7\13\f\3\f\6\f\u00fa\n\f\r\f\16\f\u00fb\3\f"+
		"\7\f\u00ff\n\f\f\f\16\f\u0102\13\f\3\f\3\f\3\r\3\r\3\16\3\16\7\16\u010a"+
		"\n\16\f\16\16\16\u010d\13\16\3\16\3\16\7\16\u0111\n\16\f\16\16\16\u0114"+
		"\13\16\3\16\3\16\7\16\u0118\n\16\f\16\16\16\u011b\13\16\3\16\3\16\3\17"+
		"\7\17\u0120\n\17\f\17\16\17\u0123\13\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\7\22\u012d\n\22\f\22\16\22\u0130\13\22\3\22\3\22\3\22\7\22"+
		"\u0135\n\22\f\22\16\22\u0138\13\22\3\22\3\22\7\22\u013c\n\22\f\22\16\22"+
		"\u013f\13\22\3\22\7\22\u0142\n\22\f\22\16\22\u0145\13\22\3\22\7\22\u0148"+
		"\n\22\f\22\16\22\u014b\13\22\3\22\3\22\3\22\3\22\3\22\7\22\u0152\n\22"+
		"\f\22\16\22\u0155\13\22\3\22\3\22\7\22\u0159\n\22\f\22\16\22\u015c\13"+
		"\22\3\22\6\22\u015f\n\22\r\22\16\22\u0160\3\22\7\22\u0164\n\22\f\22\16"+
		"\22\u0167\13\22\3\22\3\22\7\22\u016b\n\22\f\22\16\22\u016e\13\22\3\22"+
		"\7\22\u0171\n\22\f\22\16\22\u0174\13\22\3\22\3\22\3\23\3\23\3\24\7\24"+
		"\u017b\n\24\f\24\16\24\u017e\13\24\3\24\3\24\7\24\u0182\n\24\f\24\16\24"+
		"\u0185\13\24\3\24\3\24\7\24\u0189\n\24\f\24\16\24\u018c\13\24\3\24\3\24"+
		"\7\24\u0190\n\24\f\24\16\24\u0193\13\24\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u019f\n\26\f\26\16\26\u01a2\13\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01ad\n\27\f\27\16\27\u01b0\13"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u01bb\n\31\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37"+
		"\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\5"+
		"\3\33\34\3\35\36\3\37 \u01e8\2?\3\2\2\2\4^\3\2\2\2\6`\3\2\2\2\be\3\2\2"+
		"\2\n\u0093\3\2\2\2\f\u00ab\3\2\2\2\16\u00ad\3\2\2\2\20\u00cd\3\2\2\2\22"+
		"\u00d1\3\2\2\2\24\u00dd\3\2\2\2\26\u00ea\3\2\2\2\30\u0105\3\2\2\2\32\u0107"+
		"\3\2\2\2\34\u0121\3\2\2\2\36\u0124\3\2\2\2 \u0126\3\2\2\2\"\u012e\3\2"+
		"\2\2$\u0177\3\2\2\2&\u017c\3\2\2\2(\u0196\3\2\2\2*\u0198\3\2\2\2,\u01a3"+
		"\3\2\2\2.\u01b1\3\2\2\2\60\u01ba\3\2\2\2\62\u01bc\3\2\2\2\64\u01c0\3\2"+
		"\2\2\66\u01c2\3\2\2\28\u01c4\3\2\2\2:\u01c6\3\2\2\2<\u01c8\3\2\2\2>@\5"+
		"\4\3\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2C_\5\b\5\2DE"+
		"\5\16\b\2EF\7$\2\2F_\3\2\2\2GH\5.\30\2HI\7$\2\2I_\3\2\2\2JK\7\b\2\2KL"+
		"\5\62\32\2LM\7\6\2\2MN\7$\2\2NO\5\24\13\2O_\3\2\2\2P_\5\f\7\2Q_\5\22\n"+
		"\2R_\5\n\6\2ST\5\26\f\2TU\7$\2\2U_\3\2\2\2VW\5\6\4\2WX\7$\2\2X_\3\2\2"+
		"\2YZ\5\"\22\2Z[\7$\2\2[_\3\2\2\2\\_\5\20\t\2]_\7$\2\2^C\3\2\2\2^D\3\2"+
		"\2\2^G\3\2\2\2^J\3\2\2\2^P\3\2\2\2^Q\3\2\2\2^R\3\2\2\2^S\3\2\2\2^V\3\2"+
		"\2\2^Y\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\5\3\2\2\2`a\7\t\2\2ab\7\7\2\2bc\5"+
		"*\26\2cd\7\22\2\2d\7\3\2\2\2ei\7\13\2\2fh\7$\2\2gf\3\2\2\2hk\3\2\2\2i"+
		"g\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lp\7\17\2\2mo\7$\2\2nm\3\2\2\2"+
		"or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2su\5\4\3\2ts\3\2\2\2"+
		"uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w{\3\2\2\2xz\7$\2\2yx\3\2\2\2z}\3\2\2\2"+
		"{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\u0080\7\20\2\2\177\u0081\7$"+
		"\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\t\3\2\2\2\u0084\u0086\7\n\2\2\u0085\u0084\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7!\2\2\u0088\u0089\7\25"+
		"\2\2\u0089\u008a\5\24\13\2\u008a\u008b\7$\2\2\u008b\u0094\3\2\2\2\u008c"+
		"\u008e\7\27\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3"+
		"\2\2\2\u008f\u0090\7!\2\2\u0090\u0091\7\25\2\2\u0091\u0092\7#\2\2\u0092"+
		"\u0094\7$\2\2\u0093\u0085\3\2\2\2\u0093\u008d\3\2\2\2\u0094\13\3\2\2\2"+
		"\u0095\u0096\7\23\2\2\u0096\u0097\7\7\2\2\u0097\u0098\5\24\13\2\u0098"+
		"\u0099\7\22\2\2\u0099\u009a\7$\2\2\u009a\u00ac\3\2\2\2\u009b\u009c\7\31"+
		"\2\2\u009c\u009d\7\7\2\2\u009d\u009e\5\24\13\2\u009e\u009f\7\22\2\2\u009f"+
		"\u00a0\7$\2\2\u00a0\u00ac\3\2\2\2\u00a1\u00a2\7\23\2\2\u00a2\u00a3\7\7"+
		"\2\2\u00a3\u00a4\7#\2\2\u00a4\u00a5\7\22\2\2\u00a5\u00ac\7$\2\2\u00a6"+
		"\u00a7\7\31\2\2\u00a7\u00a8\7\7\2\2\u00a8\u00a9\7#\2\2\u00a9\u00aa\7\22"+
		"\2\2\u00aa\u00ac\7$\2\2\u00ab\u0095\3\2\2\2\u00ab\u009b\3\2\2\2\u00ab"+
		"\u00a1\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ac\r\3\2\2\2\u00ad\u00ae\5\60\31"+
		"\2\u00ae\u00af\7!\2\2\u00af\u00b0\7\7\2\2\u00b0\u00b1\5,\27\2\u00b1\u00b5"+
		"\7\22\2\2\u00b2\u00b4\7$\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b8\u00bc\7\17\2\2\u00b9\u00bb\7$\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c2\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\5\4\3\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c8\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\7$\2\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7\20\2\2\u00cc\17\3\2\2\2\u00cd\u00ce"+
		"\7\24\2\2\u00ce\u00cf\7!\2\2\u00cf\u00d0\7$\2\2\u00d0\21\3\2\2\2\u00d1"+
		"\u00d2\7\n\2\2\u00d2\u00d3\7!\2\2\u00d3\u00d4\7$\2\2\u00d4\23\3\2\2\2"+
		"\u00d5\u00d6\b\13\1\2\u00d6\u00de\7\"\2\2\u00d7\u00de\7!\2\2\u00d8\u00de"+
		"\5.\30\2\u00d9\u00da\7\7\2\2\u00da\u00db\5\24\13\2\u00db\u00dc\7\22\2"+
		"\2\u00dc\u00de\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00d7\3\2\2\2\u00dd\u00d8"+
		"\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de\u00e7\3\2\2\2\u00df\u00e0\6\13\2\3"+
		"\u00e0\u00e1\t\2\2\2\u00e1\u00e6\5\24\13\2\u00e2\u00e3\6\13\3\3\u00e3"+
		"\u00e4\t\3\2\2\u00e4\u00e6\5\24\13\2\u00e5\u00df\3\2\2\2\u00e5\u00e2\3"+
		"\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\25\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ee\7\26\2\2\u00eb\u00ed\7$\2"+
		"\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f5\5\32\16\2"+
		"\u00f2\u00f4\7$\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00fa\5\"\22\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3"+
		"\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0100\3\2\2\2\u00fd\u00ff\7$\2\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\5\30\r\2\u0104"+
		"\27\3\2\2\2\u0105\u0106\7\16\2\2\u0106\31\3\2\2\2\u0107\u010b\7\f\2\2"+
		"\u0108\u010a\7$\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u0112\7\17\2\2\u010f\u0111\7$\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0119\5*\26\2\u0116\u0118\7$\2\2\u0117\u0116\3\2"+
		"\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\20\2\2\u011d\33\3\2\2"+
		"\2\u011e\u0120\5\4\3\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\35\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0125\7!\2\2\u0125\37\3\2\2\2\u0126\u0127\5\36\20\2\u0127\u0128\7\5\2"+
		"\2\u0128\u0129\7\"\2\2\u0129\u012a\7\3\2\2\u012a!\3\2\2\2\u012b\u012d"+
		"\7$\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7\30"+
		"\2\2\u0132\u0136\7!\2\2\u0133\u0135\7$\2\2\u0134\u0133\3\2\2\2\u0135\u0138"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u013d\7\17\2\2\u013a\u013c\7$\2\2\u013b\u013a\3\2"+
		"\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0143\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0142\5\4\3\2\u0141\u0140\3\2"+
		"\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0149\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0148\7$\2\2\u0147\u0146\3\2"+
		"\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\7\32\2\2\u014d\u014e\7"+
		"\7\2\2\u014e\u014f\5*\26\2\u014f\u0153\7\22\2\2\u0150\u0152\7$\2\2\u0151"+
		"\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u015a\7\17\2\2\u0157"+
		"\u0159\7$\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015d"+
		"\u015f\5$\23\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\u0165\3\2\2\2\u0162\u0164\7$\2\2\u0163"+
		"\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016c\7\20\2\2\u0169"+
		"\u016b\5\4\3\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2"+
		"\2\2\u016c\u016d\3\2\2\2\u016d\u0172\3\2\2\2\u016e\u016c\3\2\2\2\u016f"+
		"\u0171\7$\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175"+
		"\u0176\7\20\2\2\u0176#\3\2\2\2\u0177\u0178\5\4\3\2\u0178%\3\2\2\2\u0179"+
		"\u017b\7$\2\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f"+
		"\u0183\7\32\2\2\u0180\u0182\7$\2\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2"+
		"\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0186\u018a\7\17\2\2\u0187\u0189\7$\2\2\u0188\u0187\3\2"+
		"\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u0191\5\4\3\2\u018e\u0190\7$"+
		"\2\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\7\20"+
		"\2\2\u0195\'\3\2\2\2\u0196\u0197\3\2\2\2\u0197)\3\2\2\2\u0198\u0199\b"+
		"\26\1\2\u0199\u019a\7!\2\2\u019a\u01a0\3\2\2\2\u019b\u019c\6\26\4\3\u019c"+
		"\u019d\7\4\2\2\u019d\u019f\7!\2\2\u019e\u019b\3\2\2\2\u019f\u01a2\3\2"+
		"\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1+\3\2\2\2\u01a2\u01a0"+
		"\3\2\2\2\u01a3\u01a4\b\27\1\2\u01a4\u01a5\5\60\31\2\u01a5\u01a6\7!\2\2"+
		"\u01a6\u01ae\3\2\2\2\u01a7\u01a8\6\27\5\3\u01a8\u01a9\7\4\2\2\u01a9\u01aa"+
		"\5\60\31\2\u01aa\u01ab\7!\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01a7\3\2\2\2"+
		"\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af-\3"+
		"\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\5\64\33\2\u01b2\u01b3\7\7\2\2\u01b3"+
		"\u01b4\5*\26\2\u01b4\u01b5\7\22\2\2\u01b5/\3\2\2\2\u01b6\u01bb\5\66\34"+
		"\2\u01b7\u01bb\5<\37\2\u01b8\u01bb\58\35\2\u01b9\u01bb\5:\36\2\u01ba\u01b6"+
		"\3\2\2\2\u01ba\u01b7\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb"+
		"\61\3\2\2\2\u01bc\u01bd\5\24\13\2\u01bd\u01be\t\4\2\2\u01be\u01bf\5\24"+
		"\13\2\u01bf\63\3\2\2\2\u01c0\u01c1\7!\2\2\u01c1\65\3\2\2\2\u01c2\u01c3"+
		"\7\r\2\2\u01c3\67\3\2\2\2\u01c4\u01c5\7\21\2\2\u01c59\3\2\2\2\u01c6\u01c7"+
		"\7\27\2\2\u01c7;\3\2\2\2\u01c8\u01c9\7\n\2\2\u01c9=\3\2\2\2.A^ipv{\u0082"+
		"\u0085\u008d\u0093\u00ab\u00b5\u00bc\u00c2\u00c8\u00dd\u00e5\u00e7\u00ee"+
		"\u00f5\u00fb\u0100\u010b\u0112\u0119\u0121\u012e\u0136\u013d\u0143\u0149"+
		"\u0153\u015a\u0160\u0165\u016c\u0172\u017c\u0183\u018a\u0191\u01a0\u01ae"+
		"\u01ba";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}