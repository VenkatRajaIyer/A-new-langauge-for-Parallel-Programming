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
		RULE_object = 13, RULE_threadArray = 14, RULE_tasks = 15, RULE_critaicalStat = 16, 
		RULE_params = 17, RULE_fparams = 18, RULE_function_call = 19, RULE_parametersType = 20, 
		RULE_condExpr = 21, RULE_function_id = 22, RULE_fvoid = 23, RULE_fchar = 24, 
		RULE_fstring = 25, RULE_finteger = 26;
	public static final String[] ruleNames = {
		"prog", "stat", "par", "main", "assignStat", "printStat", "function", 
		"returnstatement", "sVars", "expr", "newparallel", "endParallel", "sharedValues", 
		"object", "threadArray", "tasks", "critaicalStat", "params", "fparams", 
		"function_call", "parametersType", "condExpr", "function_id", "fvoid", 
		"fchar", "fstring", "finteger"
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
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54); stat();
				}
				}
				setState(57); 
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
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new CreateMainContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59); main();
				}
				break;

			case 2:
				_localctx = new JustcreatefunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60); function();
				setState(61); match(NEWLINE);
				}
				break;

			case 3:
				_localctx = new Call_a_functionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63); function_call();
				setState(64); match(NEWLINE);
				}
				break;

			case 4:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(66); match(6);
				setState(67); condExpr();
				setState(68); match(4);
				setState(69); match(NEWLINE);
				setState(70); expr(0);
				}
				break;

			case 5:
				_localctx = new PrintStmContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(72); printStat();
				}
				break;

			case 6:
				_localctx = new CreatesVars1Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(73); sVars();
				}
				break;

			case 7:
				_localctx = new AssignStmContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(74); assignStat();
				}
				break;

			case 8:
				_localctx = new AsignParallelContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(75); newparallel();
				setState(76); match(NEWLINE);
				}
				break;

			case 9:
				_localctx = new ParalleloContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(78); par();
				setState(79); match(NEWLINE);
				}
				break;

			case 10:
				_localctx = new TsksContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(81); tasks();
				setState(82); match(NEWLINE);
				}
				break;

			case 11:
				_localctx = new DummyreturnContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(84); returnstatement();
				}
				break;

			case 12:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
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
			setState(88); match(7);
			setState(89); match(5);
			setState(90); params(0);
			setState(91); match(16);
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
			setState(93); match(9);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(94); match(NEWLINE);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100); match(13);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(101); match(NEWLINE);
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(108); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(107); stat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(110); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(112); match(NEWLINE);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118); match(14);
			setState(120); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(119); match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(122); 
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
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new AssignIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				_la = _input.LA(1);
				if (_la==8) {
					{
					setState(124); match(8);
					}
				}

				setState(127); match(ID);
				setState(128); match(19);
				setState(129); expr(0);
				setState(130); match(NEWLINE);
				}
				break;

			case 2:
				_localctx = new AssignStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				_la = _input.LA(1);
				if (_la==21) {
					{
					setState(132); match(21);
					}
				}

				setState(135); match(ID);
				setState(136); match(19);
				setState(137); match(STR);
				setState(138); match(NEWLINE);
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
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141); match(17);
				setState(142); match(5);
				setState(143); expr(0);
				setState(144); match(16);
				setState(145); match(NEWLINE);
				}
				break;

			case 2:
				_localctx = new PrintlnExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147); match(23);
				setState(148); match(5);
				setState(149); expr(0);
				setState(150); match(16);
				setState(151); match(NEWLINE);
				}
				break;

			case 3:
				_localctx = new PrintStrExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(153); match(17);
				setState(154); match(5);
				setState(155); match(STR);
				setState(156); match(16);
				setState(157); match(NEWLINE);
				}
				break;

			case 4:
				_localctx = new PrintlnStrExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(158); match(23);
				setState(159); match(5);
				setState(160); match(STR);
				setState(161); match(16);
				setState(162); match(NEWLINE);
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
			setState(165); parametersType();
			setState(166); match(ID);
			setState(167); match(5);
			setState(168); fparams(0);
			setState(169); match(16);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(170); match(NEWLINE);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176); match(13);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(177); match(NEWLINE);
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(183); stat();
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(189); match(NEWLINE);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195); match(14);
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
			setState(197); match(18);
			setState(198); match(ID);
			setState(199); match(NEWLINE);
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
			setState(201); match(8);
			setState(202); match(ID);
			setState(203); match(NEWLINE);
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
			setState(213);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(206); match(INT);
				}
				break;

			case 2:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207); match(ID);
				}
				break;

			case 3:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208); function_call();
				}
				break;

			case 4:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209); match(5);
				setState(210); expr(0);
				setState(211); match(16);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(221);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(216);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(217); expr(7);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(219);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(220); expr(6);
						}
						break;
					}
					} 
				}
				setState(225);
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
			setState(226); match(20);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(227); match(NEWLINE);
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233); sharedValues();
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(234); match(NEWLINE);
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(241); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(240); tasks();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(243); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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
			setState(251); endParallel();
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
			setState(253); match(12);
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
			setState(255); match(10);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(256); match(NEWLINE);
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262); match(13);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(263); match(NEWLINE);
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269); params(0);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(270); match(NEWLINE);
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276); match(14);
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
		enterRule(_localctx, 26, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); match(ID);
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
		enterRule(_localctx, 28, RULE_threadArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); object();
			setState(281); match(3);
			setState(282); match(INT);
			setState(283); match(1);
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
		enterRule(_localctx, 30, RULE_tasks);
		int _la;
		try {
			int _alt;
			_localctx = new NewTaskContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(285); match(NEWLINE);
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291); match(22);
			setState(292); match(ID);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(293); match(NEWLINE);
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299); match(13);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(300); match(NEWLINE);
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(306); stat();
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(312); match(NEWLINE);
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318); match(24);
			setState(319); match(5);
			setState(320); params(0);
			setState(321); match(16);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(322); match(NEWLINE);
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328); match(13);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(329); match(NEWLINE);
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(336); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(335); critaicalStat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(338); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(340); match(NEWLINE);
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346); match(14);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(347); stat();
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(353); match(NEWLINE);
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359); match(14);
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
		enterRule(_localctx, 32, RULE_critaicalStat);
		try {
			_localctx = new CriticalStatementsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(361); stat();
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
			setState(364); match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(371);
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
					setState(366);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(367); match(2);
					setState(368); match(ID);
					}
					} 
				}
				setState(373);
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
		int _startState = 36;
		enterRecursionRule(_localctx, RULE_fparams);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(375); parametersType();
			setState(376); match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(385);
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
					setState(378);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(379); match(2);
					setState(380); parametersType();
					setState(381); match(ID);
					}
					} 
				}
				setState(387);
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
		enterRule(_localctx, 38, RULE_function_call);
		try {
			_localctx = new Call_functionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(388); function_id();
			setState(389); match(5);
			setState(390); params(0);
			setState(391); match(16);
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
			setState(397);
			switch (_input.LA(1)) {
			case 11:
				enterOuterAlt(_localctx, 1);
				{
				setState(393); fvoid();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 2);
				{
				setState(394); finteger();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 3);
				{
				setState(395); fchar();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 4);
				{
				setState(396); fstring();
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
			setState(399); expr(0);
			setState(400);
			((CndExprContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==EQC || _la==NEQ) ) {
				((CndExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(401); expr(0);
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
		enterRule(_localctx, 44, RULE_function_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403); match(ID);
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
		enterRule(_localctx, 46, RULE_fvoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405); match(11);
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
		enterRule(_localctx, 48, RULE_fchar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407); match(15);
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
		enterRule(_localctx, 50, RULE_fstring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); match(21);
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
		enterRule(_localctx, 52, RULE_finteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411); match(8);
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
		"\2\3\'\u01a0\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\6\2:\n\2\r\2\16"+
		"\2;\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Y\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\7\5b\n\5\f\5\16\5e\13\5\3\5\3\5\7\5i\n\5\f\5\16\5l\13\5\3\5"+
		"\6\5o\n\5\r\5\16\5p\3\5\7\5t\n\5\f\5\16\5w\13\5\3\5\3\5\6\5{\n\5\r\5\16"+
		"\5|\3\6\5\6\u0080\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0088\n\6\3\6\3\6\3"+
		"\6\3\6\5\6\u008e\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a6\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\7\b\u00ae\n\b\f\b\16\b\u00b1\13\b\3\b\3\b\7\b\u00b5\n\b\f\b\16"+
		"\b\u00b8\13\b\3\b\7\b\u00bb\n\b\f\b\16\b\u00be\13\b\3\b\7\b\u00c1\n\b"+
		"\f\b\16\b\u00c4\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d8\n\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u00e0\n\13\f\13\16\13\u00e3\13\13\3\f\3\f\7\f\u00e7\n\f\f\f"+
		"\16\f\u00ea\13\f\3\f\3\f\7\f\u00ee\n\f\f\f\16\f\u00f1\13\f\3\f\6\f\u00f4"+
		"\n\f\r\f\16\f\u00f5\3\f\7\f\u00f9\n\f\f\f\16\f\u00fc\13\f\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\7\16\u0104\n\16\f\16\16\16\u0107\13\16\3\16\3\16\7\16\u010b"+
		"\n\16\f\16\16\16\u010e\13\16\3\16\3\16\7\16\u0112\n\16\f\16\16\16\u0115"+
		"\13\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\7\21\u0121\n"+
		"\21\f\21\16\21\u0124\13\21\3\21\3\21\3\21\7\21\u0129\n\21\f\21\16\21\u012c"+
		"\13\21\3\21\3\21\7\21\u0130\n\21\f\21\16\21\u0133\13\21\3\21\7\21\u0136"+
		"\n\21\f\21\16\21\u0139\13\21\3\21\7\21\u013c\n\21\f\21\16\21\u013f\13"+
		"\21\3\21\3\21\3\21\3\21\3\21\7\21\u0146\n\21\f\21\16\21\u0149\13\21\3"+
		"\21\3\21\7\21\u014d\n\21\f\21\16\21\u0150\13\21\3\21\6\21\u0153\n\21\r"+
		"\21\16\21\u0154\3\21\7\21\u0158\n\21\f\21\16\21\u015b\13\21\3\21\3\21"+
		"\7\21\u015f\n\21\f\21\16\21\u0162\13\21\3\21\7\21\u0165\n\21\f\21\16\21"+
		"\u0168\13\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0174"+
		"\n\23\f\23\16\23\u0177\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\7\24\u0182\n\24\f\24\16\24\u0185\13\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\5\26\u0190\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\2\35\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\5\3\33\34\3\35\36\3\37 \u01bb\2"+
		"9\3\2\2\2\4X\3\2\2\2\6Z\3\2\2\2\b_\3\2\2\2\n\u008d\3\2\2\2\f\u00a5\3\2"+
		"\2\2\16\u00a7\3\2\2\2\20\u00c7\3\2\2\2\22\u00cb\3\2\2\2\24\u00d7\3\2\2"+
		"\2\26\u00e4\3\2\2\2\30\u00ff\3\2\2\2\32\u0101\3\2\2\2\34\u0118\3\2\2\2"+
		"\36\u011a\3\2\2\2 \u0122\3\2\2\2\"\u016b\3\2\2\2$\u016d\3\2\2\2&\u0178"+
		"\3\2\2\2(\u0186\3\2\2\2*\u018f\3\2\2\2,\u0191\3\2\2\2.\u0195\3\2\2\2\60"+
		"\u0197\3\2\2\2\62\u0199\3\2\2\2\64\u019b\3\2\2\2\66\u019d\3\2\2\28:\5"+
		"\4\3\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\3\3\2\2\2=Y\5\b\5\2>?"+
		"\5\16\b\2?@\7$\2\2@Y\3\2\2\2AB\5(\25\2BC\7$\2\2CY\3\2\2\2DE\7\b\2\2EF"+
		"\5,\27\2FG\7\6\2\2GH\7$\2\2HI\5\24\13\2IY\3\2\2\2JY\5\f\7\2KY\5\22\n\2"+
		"LY\5\n\6\2MN\5\26\f\2NO\7$\2\2OY\3\2\2\2PQ\5\6\4\2QR\7$\2\2RY\3\2\2\2"+
		"ST\5 \21\2TU\7$\2\2UY\3\2\2\2VY\5\20\t\2WY\7$\2\2X=\3\2\2\2X>\3\2\2\2"+
		"XA\3\2\2\2XD\3\2\2\2XJ\3\2\2\2XK\3\2\2\2XL\3\2\2\2XM\3\2\2\2XP\3\2\2\2"+
		"XS\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\5\3\2\2\2Z[\7\t\2\2[\\\7\7\2\2\\]\5$\23"+
		"\2]^\7\22\2\2^\7\3\2\2\2_c\7\13\2\2`b\7$\2\2a`\3\2\2\2be\3\2\2\2ca\3\2"+
		"\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fj\7\17\2\2gi\7$\2\2hg\3\2\2\2il\3\2"+
		"\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2mo\5\4\3\2nm\3\2\2\2op\3\2"+
		"\2\2pn\3\2\2\2pq\3\2\2\2qu\3\2\2\2rt\7$\2\2sr\3\2\2\2tw\3\2\2\2us\3\2"+
		"\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xz\7\20\2\2y{\7$\2\2zy\3\2\2\2{|\3\2"+
		"\2\2|z\3\2\2\2|}\3\2\2\2}\t\3\2\2\2~\u0080\7\n\2\2\177~\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7!\2\2\u0082\u0083\7\25\2\2\u0083"+
		"\u0084\5\24\13\2\u0084\u0085\7$\2\2\u0085\u008e\3\2\2\2\u0086\u0088\7"+
		"\27\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\7!\2\2\u008a\u008b\7\25\2\2\u008b\u008c\7#\2\2\u008c\u008e\7$\2"+
		"\2\u008d\177\3\2\2\2\u008d\u0087\3\2\2\2\u008e\13\3\2\2\2\u008f\u0090"+
		"\7\23\2\2\u0090\u0091\7\7\2\2\u0091\u0092\5\24\13\2\u0092\u0093\7\22\2"+
		"\2\u0093\u0094\7$\2\2\u0094\u00a6\3\2\2\2\u0095\u0096\7\31\2\2\u0096\u0097"+
		"\7\7\2\2\u0097\u0098\5\24\13\2\u0098\u0099\7\22\2\2\u0099\u009a\7$\2\2"+
		"\u009a\u00a6\3\2\2\2\u009b\u009c\7\23\2\2\u009c\u009d\7\7\2\2\u009d\u009e"+
		"\7#\2\2\u009e\u009f\7\22\2\2\u009f\u00a6\7$\2\2\u00a0\u00a1\7\31\2\2\u00a1"+
		"\u00a2\7\7\2\2\u00a2\u00a3\7#\2\2\u00a3\u00a4\7\22\2\2\u00a4\u00a6\7$"+
		"\2\2\u00a5\u008f\3\2\2\2\u00a5\u0095\3\2\2\2\u00a5\u009b\3\2\2\2\u00a5"+
		"\u00a0\3\2\2\2\u00a6\r\3\2\2\2\u00a7\u00a8\5*\26\2\u00a8\u00a9\7!\2\2"+
		"\u00a9\u00aa\7\7\2\2\u00aa\u00ab\5&\24\2\u00ab\u00af\7\22\2\2\u00ac\u00ae"+
		"\7$\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b6\7\17"+
		"\2\2\u00b3\u00b5\7$\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bc\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b9\u00bb\5\4\3\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c2\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00bf\u00c1\7$\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\u00c6\7\20\2\2\u00c6\17\3\2\2\2\u00c7\u00c8\7\24\2\2\u00c8"+
		"\u00c9\7!\2\2\u00c9\u00ca\7$\2\2\u00ca\21\3\2\2\2\u00cb\u00cc\7\n\2\2"+
		"\u00cc\u00cd\7!\2\2\u00cd\u00ce\7$\2\2\u00ce\23\3\2\2\2\u00cf\u00d0\b"+
		"\13\1\2\u00d0\u00d8\7\"\2\2\u00d1\u00d8\7!\2\2\u00d2\u00d8\5(\25\2\u00d3"+
		"\u00d4\7\7\2\2\u00d4\u00d5\5\24\13\2\u00d5\u00d6\7\22\2\2\u00d6\u00d8"+
		"\3\2\2\2\u00d7\u00cf\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d7"+
		"\u00d3\3\2\2\2\u00d8\u00e1\3\2\2\2\u00d9\u00da\6\13\2\3\u00da\u00db\t"+
		"\2\2\2\u00db\u00e0\5\24\13\2\u00dc\u00dd\6\13\3\3\u00dd\u00de\t\3\2\2"+
		"\u00de\u00e0\5\24\13\2\u00df\u00d9\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0\u00e3"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\25\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e8\7\26\2\2\u00e5\u00e7\7$\2\2\u00e6\u00e5\3\2"+
		"\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ef\5\32\16\2\u00ec\u00ee\7"+
		"$\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f4\5 "+
		"\21\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f9\7$\2\2\u00f8\u00f7\3\2"+
		"\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\5\30\r\2\u00fe\27\3\2\2"+
		"\2\u00ff\u0100\7\16\2\2\u0100\31\3\2\2\2\u0101\u0105\7\f\2\2\u0102\u0104"+
		"\7$\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010c\7\17"+
		"\2\2\u0109\u010b\7$\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010f\u0113\5$\23\2\u0110\u0112\7$\2\2\u0111\u0110\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\20\2\2\u0117\33\3\2\2\2\u0118\u0119"+
		"\7!\2\2\u0119\35\3\2\2\2\u011a\u011b\5\34\17\2\u011b\u011c\7\5\2\2\u011c"+
		"\u011d\7\"\2\2\u011d\u011e\7\3\2\2\u011e\37\3\2\2\2\u011f\u0121\7$\2\2"+
		"\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7\30\2\2"+
		"\u0126\u012a\7!\2\2\u0127\u0129\7$\2\2\u0128\u0127\3\2\2\2\u0129\u012c"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012d\u0131\7\17\2\2\u012e\u0130\7$\2\2\u012f\u012e\3\2"+
		"\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0137\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0136\5\4\3\2\u0135\u0134\3\2"+
		"\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013d\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013c\7$\2\2\u013b\u013a\3\2"+
		"\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\7\32\2\2\u0141\u0142\7"+
		"\7\2\2\u0142\u0143\5$\23\2\u0143\u0147\7\22\2\2\u0144\u0146\7$\2\2\u0145"+
		"\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014e\7\17\2\2\u014b"+
		"\u014d\7$\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0151"+
		"\u0153\5\"\22\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152\3"+
		"\2\2\2\u0154\u0155\3\2\2\2\u0155\u0159\3\2\2\2\u0156\u0158\7$\2\2\u0157"+
		"\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u0160\7\20\2\2\u015d"+
		"\u015f\5\4\3\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\u0166\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0165\7$\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016a\7\20\2\2\u016a!\3\2\2\2\u016b\u016c\5\4\3\2\u016c#\3\2\2\2\u016d"+
		"\u016e\b\23\1\2\u016e\u016f\7!\2\2\u016f\u0175\3\2\2\2\u0170\u0171\6\23"+
		"\4\3\u0171\u0172\7\4\2\2\u0172\u0174\7!\2\2\u0173\u0170\3\2\2\2\u0174"+
		"\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176%\3\2\2\2"+
		"\u0177\u0175\3\2\2\2\u0178\u0179\b\24\1\2\u0179\u017a\5*\26\2\u017a\u017b"+
		"\7!\2\2\u017b\u0183\3\2\2\2\u017c\u017d\6\24\5\3\u017d\u017e\7\4\2\2\u017e"+
		"\u017f\5*\26\2\u017f\u0180\7!\2\2\u0180\u0182\3\2\2\2\u0181\u017c\3\2"+
		"\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\'\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\5.\30\2\u0187\u0188\7\7\2\2"+
		"\u0188\u0189\5$\23\2\u0189\u018a\7\22\2\2\u018a)\3\2\2\2\u018b\u0190\5"+
		"\60\31\2\u018c\u0190\5\66\34\2\u018d\u0190\5\62\32\2\u018e\u0190\5\64"+
		"\33\2\u018f\u018b\3\2\2\2\u018f\u018c\3\2\2\2\u018f\u018d\3\2\2\2\u018f"+
		"\u018e\3\2\2\2\u0190+\3\2\2\2\u0191\u0192\5\24\13\2\u0192\u0193\t\4\2"+
		"\2\u0193\u0194\5\24\13\2\u0194-\3\2\2\2\u0195\u0196\7!\2\2\u0196/\3\2"+
		"\2\2\u0197\u0198\7\r\2\2\u0198\61\3\2\2\2\u0199\u019a\7\21\2\2\u019a\63"+
		"\3\2\2\2\u019b\u019c\7\27\2\2\u019c\65\3\2\2\2\u019d\u019e\7\n\2\2\u019e"+
		"\67\3\2\2\2);Xcjpu|\177\u0087\u008d\u00a5\u00af\u00b6\u00bc\u00c2\u00d7"+
		"\u00df\u00e1\u00e8\u00ef\u00f5\u00fa\u0105\u010c\u0113\u0122\u012a\u0131"+
		"\u0137\u013d\u0147\u014e\u0154\u0159\u0160\u0166\u0175\u0183\u018f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}