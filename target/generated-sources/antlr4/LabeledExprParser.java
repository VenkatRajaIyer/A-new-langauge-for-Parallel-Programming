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
		WS=34;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "','", "'['", "':'", "'('", "'if'", "'int'", "'shared'", 
		"'@}'", "'{'", "'constructor'", "'}'", "'parallel'", "'NULL'", "')'", 
		"'print'", "'='", "'{@'", "'string'", "'class'", "'println'", "'task'", 
		"'critical'", "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "ID", "INT", 
		"STR", "NEWLINE", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_pclassName = 2, RULE_pClassMethods = 3, 
		RULE_sharedObjects = 4, RULE_sObjectName = 5, RULE_pAsynch = 6, RULE_pCritic = 7, 
		RULE_sClassDef = 8, RULE_sClassName = 9, RULE_sVars = 10, RULE_constructor = 11, 
		RULE_list = 12, RULE_methods = 13, RULE_expr = 14, RULE_parallel = 15, 
		RULE_pstat = 16, RULE_object = 17, RULE_threadArray = 18, RULE_tasks = 19, 
		RULE_critSec = 20, RULE_condExpr = 21;
	public static final String[] ruleNames = {
		"prog", "stat", "pclassName", "pClassMethods", "sharedObjects", "sObjectName", 
		"pAsynch", "pCritic", "sClassDef", "sClassName", "sVars", "constructor", 
		"list", "methods", "expr", "parallel", "pstat", "object", "threadArray", 
		"tasks", "critSec", "condExpr"
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
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44); stat();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 8) | (1L << 13) | (1L << 16) | (1L << 19) | (1L << 21) | (1L << ID) | (1L << NEWLINE))) != 0) );
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
	public static class PrintlnExprContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintlnExprContext(StatContext ctx) { copyFrom(ctx); }
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
	public static class PrintExprContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintExprContext(StatContext ctx) { copyFrom(ctx); }
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
	public static class PrintlnStrExprContext extends StatContext {
		public TerminalNode STR() { return getToken(LabeledExprParser.STR, 0); }
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public PrintlnStrExprContext(StatContext ctx) { copyFrom(ctx); }
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
	public static class PrintStrExprContext extends StatContext {
		public TerminalNode STR() { return getToken(LabeledExprParser.STR, 0); }
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public PrintStrExprContext(StatContext ctx) { copyFrom(ctx); }
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
	public static class AssignStrContext extends StatContext {
		public TerminalNode STR() { return getToken(LabeledExprParser.STR, 0); }
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public AssignStrContext(StatContext ctx) { copyFrom(ctx); }
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
	public static class SharedclassDefContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public SClassDefContext sClassDef() {
			return getRuleContext(SClassDefContext.class,0);
		}
		public SharedclassDefContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSharedclassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSharedclassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSharedclassDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParallelclassContext extends StatContext {
		public PclassNameContext pclassName() {
			return getRuleContext(PclassNameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public ParallelclassContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterParallelclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitParallelclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitParallelclass(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignIntContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignIntContext(StatContext ctx) { copyFrom(ctx); }
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

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49); match(6);
				setState(50); condExpr();
				setState(51); match(4);
				setState(52); match(NEWLINE);
				setState(53); expr(0);
				}
				break;

			case 2:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55); match(16);
				setState(56); match(5);
				setState(57); expr(0);
				setState(58); match(15);
				setState(59); match(NEWLINE);
				}
				break;

			case 3:
				_localctx = new PrintlnExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61); match(21);
				setState(62); match(5);
				setState(63); expr(0);
				setState(64); match(15);
				setState(65); match(NEWLINE);
				}
				break;

			case 4:
				_localctx = new PrintStrExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(67); match(16);
				setState(68); match(5);
				setState(69); match(STR);
				setState(70); match(15);
				setState(71); match(NEWLINE);
				}
				break;

			case 5:
				_localctx = new PrintlnStrExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(72); match(21);
				setState(73); match(5);
				setState(74); match(STR);
				setState(75); match(15);
				setState(76); match(NEWLINE);
				}
				break;

			case 6:
				_localctx = new AssignIntContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				_la = _input.LA(1);
				if (_la==7) {
					{
					setState(77); match(7);
					}
				}

				setState(80); match(ID);
				setState(81); match(17);
				setState(82); expr(0);
				setState(83); match(NEWLINE);
				}
				break;

			case 7:
				_localctx = new AssignStrContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				_la = _input.LA(1);
				if (_la==19) {
					{
					setState(85); match(19);
					}
				}

				setState(88); match(ID);
				setState(89); match(17);
				setState(90); match(STR);
				setState(91); match(NEWLINE);
				}
				break;

			case 8:
				_localctx = new ParallelclassContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(92); pclassName();
				setState(93); match(NEWLINE);
				}
				break;

			case 9:
				_localctx = new SharedclassDefContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(95); sClassDef();
				setState(96); match(NEWLINE);
				}
				break;

			case 10:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(98); match(NEWLINE);
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

	public static class PclassNameContext extends ParserRuleContext {
		public PClassMethodsContext pClassMethods() {
			return getRuleContext(PClassMethodsContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public PclassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pclassName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterPclassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitPclassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPclassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PclassNameContext pclassName() throws RecognitionException {
		PclassNameContext _localctx = new PclassNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pclassName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(13);
			setState(102); match(20);
			setState(103); match(ID);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(104); match(NEWLINE);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110); match(10);
			setState(111); pClassMethods();
			setState(112); match(12);
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

	public static class PClassMethodsContext extends ParserRuleContext {
		public PAsynchContext pAsynch() {
			return getRuleContext(PAsynchContext.class,0);
		}
		public List<SharedObjectsContext> sharedObjects() {
			return getRuleContexts(SharedObjectsContext.class);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public SharedObjectsContext sharedObjects(int i) {
			return getRuleContext(SharedObjectsContext.class,i);
		}
		public PCriticContext pCritic() {
			return getRuleContext(PCriticContext.class,0);
		}
		public PClassMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pClassMethods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterPClassMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitPClassMethods(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPClassMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PClassMethodsContext pClassMethods() throws RecognitionException {
		PClassMethodsContext _localctx = new PClassMethodsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pClassMethods);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(114); match(NEWLINE);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120); sharedObjects();
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==8 );
			setState(126);
			_la = _input.LA(1);
			if (_la==11) {
				{
				setState(125); constructor();
				}
			}

			setState(128); pCritic();
			setState(130);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 8) | (1L << 13) | (1L << 16) | (1L << 19) | (1L << 21) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				setState(129); pAsynch();
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

	public static class SharedObjectsContext extends ParserRuleContext {
		public SObjectNameContext sObjectName() {
			return getRuleContext(SObjectNameContext.class,0);
		}
		public SharedObjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sharedObjects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSharedObjects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSharedObjects(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSharedObjects(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SharedObjectsContext sharedObjects() throws RecognitionException {
		SharedObjectsContext _localctx = new SharedObjectsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sharedObjects);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); sObjectName();
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

	public static class SObjectNameContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public SClassNameContext sClassName() {
			return getRuleContext(SClassNameContext.class,0);
		}
		public SObjectNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sObjectName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSObjectName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSObjectName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSObjectName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SObjectNameContext sObjectName() throws RecognitionException {
		SObjectNameContext _localctx = new SObjectNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sObjectName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); sClassName();
			setState(135); match(ID);
			setState(136); match(NEWLINE);
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

	public static class PAsynchContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public PAsynchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pAsynch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterPAsynch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitPAsynch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPAsynch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PAsynchContext pAsynch() throws RecognitionException {
		PAsynchContext _localctx = new PAsynchContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pAsynch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138); stat();
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 8) | (1L << 13) | (1L << 16) | (1L << 19) | (1L << 21) | (1L << ID) | (1L << NEWLINE))) != 0) );
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

	public static class PCriticContext extends ParserRuleContext {
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
		public PCriticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pCritic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterPCritic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitPCritic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPCritic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PCriticContext pCritic() throws RecognitionException {
		PCriticContext _localctx = new PCriticContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pCritic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(23);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(144); match(NEWLINE);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150); match(10);
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151); stat();
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 8) | (1L << 13) | (1L << 16) | (1L << 19) | (1L << 21) | (1L << ID) | (1L << NEWLINE))) != 0) );
			setState(156); match(12);
			setState(157); match(NEWLINE);
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

	public static class SClassDefContext extends ParserRuleContext {
		public SVarsContext sVars(int i) {
			return getRuleContext(SVarsContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public List<SVarsContext> sVars() {
			return getRuleContexts(SVarsContext.class);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public SClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sClassDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SClassDefContext sClassDef() throws RecognitionException {
		SClassDefContext _localctx = new SClassDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sClassDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(8);
			setState(160); match(20);
			setState(161); match(ID);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(162); match(NEWLINE);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168); match(10);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(169); match(NEWLINE);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175); sVars();
				}
				}
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==7 );
			setState(180); constructor();
			setState(181); match(12);
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

	public static class SClassNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public SClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sClassName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SClassNameContext sClassName() throws RecognitionException {
		SClassNameContext _localctx = new SClassNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sClassName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(8);
			setState(184); match(ID);
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
		enterRule(_localctx, 20, RULE_sVars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); match(7);
			setState(187); match(ID);
			setState(188); match(NEWLINE);
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

	public static class ConstructorContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); match(11);
			setState(191); match(5);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(192); list(0);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198); match(15);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(199); match(NEWLINE);
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205); match(10);
			setState(207); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(206); stat();
				}
				}
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 8) | (1L << 13) | (1L << 16) | (1L << 19) | (1L << 21) | (1L << ID) | (1L << NEWLINE))) != 0) );
			setState(211); match(12);
			setState(212); match(NEWLINE);
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

	public static class ListContext extends ParserRuleContext {
		public int _p;
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ListContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListContext _localctx = new ListContext(_ctx, _parentState, _p);
		ListContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(215); match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_list);
					setState(217);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(218); match(2);
					setState(219); match(ID);
					}
					} 
				}
				setState(224);
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

	public static class MethodsContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(LabeledExprParser.STR, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public MethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitMethods(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodsContext methods() throws RecognitionException {
		MethodsContext _localctx = new MethodsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methods);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(STR);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(226); match(NEWLINE);
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232); match(5);
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
			setState(239); match(15);
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
		int _startState = 28;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(242); match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243); match(ID);
				}
				break;
			case 5:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244); match(5);
				setState(245); expr(0);
				setState(246); match(15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(256);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(251);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(252); expr(6);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(254);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(255); expr(5);
						}
						break;
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class ParallelContext extends ParserRuleContext {
		public ParallelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallel; }
	 
		public ParallelContext() { }
		public void copyFrom(ParallelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewParallelStructContext extends ParallelContext {
		public TasksContext tasks(int i) {
			return getRuleContext(TasksContext.class,i);
		}
		public CritSecContext critSec() {
			return getRuleContext(CritSecContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public List<TasksContext> tasks() {
			return getRuleContexts(TasksContext.class);
		}
		public NewParallelStructContext(ParallelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterNewParallelStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitNewParallelStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitNewParallelStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParallelContext parallel() throws RecognitionException {
		ParallelContext _localctx = new ParallelContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parallel);
		int _la;
		try {
			int _alt;
			_localctx = new NewParallelStructContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(261); match(18);
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(262); match(NEWLINE);
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(269); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(268); tasks();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(271); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(273); match(NEWLINE);
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(279); critSec();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(280); match(NEWLINE);
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286); match(9);
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

	public static class PstatContext extends ParserRuleContext {
		public ThreadArrayContext threadArray() {
			return getRuleContext(ThreadArrayContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public PstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterPstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitPstat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PstatContext pstat() throws RecognitionException {
		PstatContext _localctx = new PstatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pstat);
		try {
			setState(302);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288); match(13);
				setState(289); match(5);
				setState(290); threadArray();
				setState(291); match(2);
				setState(292); object();
				setState(293); match(15);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295); match(13);
				setState(296); match(5);
				setState(297); threadArray();
				setState(298); match(2);
				setState(299); match(14);
				setState(300); match(15);
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
		enterRule(_localctx, 34, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); match(ID);
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
		enterRule(_localctx, 36, RULE_threadArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); object();
			setState(307); match(3);
			setState(308); match(INT);
			setState(309); match(1);
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
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
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
		enterRule(_localctx, 38, RULE_tasks);
		int _la;
		try {
			int _alt;
			_localctx = new NewTaskContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(311); match(NEWLINE);
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317); match(22);
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
			setState(324); match(10);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(331); stat();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(332); match(NEWLINE);
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338); match(12);
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
		enterRule(_localctx, 40, RULE_critSec);
		int _la;
		try {
			int _alt;
			_localctx = new CriticalSectionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
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
			setState(346); match(23);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(347); match(NEWLINE);
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353); match(10);
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(354); match(NEWLINE);
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(360); stat();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(361); match(NEWLINE);
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367); match(12);
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
			setState(369); expr(0);
			setState(370);
			((CndExprContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==EQC || _la==NEQ) ) {
				((CndExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(371); expr(0);
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
		case 12: return list_sempred((ListContext)_localctx, predIndex);

		case 14: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 5 >= _localctx._p;

		case 2: return 4 >= _localctx._p;
		}
		return true;
	}
	private boolean list_sempred(ListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3$\u0178\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\3\2\6\2\60\n\2\r\2\16\2\61\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3Q\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Y\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3f\n\3\3\4\3\4\3\4\3\4\7\4l\n\4\f\4\16\4o\13\4"+
		"\3\4\3\4\3\4\3\4\3\5\7\5v\n\5\f\5\16\5y\13\5\3\5\6\5|\n\5\r\5\16\5}\3"+
		"\5\5\5\u0081\n\5\3\5\3\5\5\5\u0085\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\6\b"+
		"\u008e\n\b\r\b\16\b\u008f\3\t\3\t\7\t\u0094\n\t\f\t\16\t\u0097\13\t\3"+
		"\t\3\t\6\t\u009b\n\t\r\t\16\t\u009c\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00a6"+
		"\n\n\f\n\16\n\u00a9\13\n\3\n\3\n\7\n\u00ad\n\n\f\n\16\n\u00b0\13\n\3\n"+
		"\6\n\u00b3\n\n\r\n\16\n\u00b4\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\7\r\u00c4\n\r\f\r\16\r\u00c7\13\r\3\r\3\r\7\r\u00cb\n\r"+
		"\f\r\16\r\u00ce\13\r\3\r\3\r\6\r\u00d2\n\r\r\r\16\r\u00d3\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00df\n\16\f\16\16\16\u00e2\13\16"+
		"\3\17\3\17\7\17\u00e6\n\17\f\17\16\17\u00e9\13\17\3\17\3\17\7\17\u00ed"+
		"\n\17\f\17\16\17\u00f0\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00fb\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0103\n\20\f\20"+
		"\16\20\u0106\13\20\3\21\3\21\7\21\u010a\n\21\f\21\16\21\u010d\13\21\3"+
		"\21\6\21\u0110\n\21\r\21\16\21\u0111\3\21\7\21\u0115\n\21\f\21\16\21\u0118"+
		"\13\21\3\21\3\21\7\21\u011c\n\21\f\21\16\21\u011f\13\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u0131\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\7\25\u013b\n\25\f"+
		"\25\16\25\u013e\13\25\3\25\3\25\7\25\u0142\n\25\f\25\16\25\u0145\13\25"+
		"\3\25\3\25\7\25\u0149\n\25\f\25\16\25\u014c\13\25\3\25\3\25\7\25\u0150"+
		"\n\25\f\25\16\25\u0153\13\25\3\25\3\25\3\26\7\26\u0158\n\26\f\26\16\26"+
		"\u015b\13\26\3\26\3\26\7\26\u015f\n\26\f\26\16\26\u0162\13\26\3\26\3\26"+
		"\7\26\u0166\n\26\f\26\16\26\u0169\13\26\3\26\3\26\7\26\u016d\n\26\f\26"+
		"\16\26\u0170\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\2\30\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,\2\5\3\32\33\3\34\35\3\36\37\u018f"+
		"\2/\3\2\2\2\4e\3\2\2\2\6g\3\2\2\2\bw\3\2\2\2\n\u0086\3\2\2\2\f\u0088\3"+
		"\2\2\2\16\u008d\3\2\2\2\20\u0091\3\2\2\2\22\u00a1\3\2\2\2\24\u00b9\3\2"+
		"\2\2\26\u00bc\3\2\2\2\30\u00c0\3\2\2\2\32\u00d8\3\2\2\2\34\u00e3\3\2\2"+
		"\2\36\u00fa\3\2\2\2 \u0107\3\2\2\2\"\u0130\3\2\2\2$\u0132\3\2\2\2&\u0134"+
		"\3\2\2\2(\u013c\3\2\2\2*\u0159\3\2\2\2,\u0173\3\2\2\2.\60\5\4\3\2/.\3"+
		"\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\64\7\b"+
		"\2\2\64\65\5,\27\2\65\66\7\6\2\2\66\67\7#\2\2\678\5\36\20\28f\3\2\2\2"+
		"9:\7\22\2\2:;\7\7\2\2;<\5\36\20\2<=\7\21\2\2=>\7#\2\2>f\3\2\2\2?@\7\27"+
		"\2\2@A\7\7\2\2AB\5\36\20\2BC\7\21\2\2CD\7#\2\2Df\3\2\2\2EF\7\22\2\2FG"+
		"\7\7\2\2GH\7\"\2\2HI\7\21\2\2If\7#\2\2JK\7\27\2\2KL\7\7\2\2LM\7\"\2\2"+
		"MN\7\21\2\2Nf\7#\2\2OQ\7\t\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7 \2\2"+
		"ST\7\23\2\2TU\5\36\20\2UV\7#\2\2Vf\3\2\2\2WY\7\25\2\2XW\3\2\2\2XY\3\2"+
		"\2\2YZ\3\2\2\2Z[\7 \2\2[\\\7\23\2\2\\]\7\"\2\2]f\7#\2\2^_\5\6\4\2_`\7"+
		"#\2\2`f\3\2\2\2ab\5\22\n\2bc\7#\2\2cf\3\2\2\2df\7#\2\2e\63\3\2\2\2e9\3"+
		"\2\2\2e?\3\2\2\2eE\3\2\2\2eJ\3\2\2\2eP\3\2\2\2eX\3\2\2\2e^\3\2\2\2ea\3"+
		"\2\2\2ed\3\2\2\2f\5\3\2\2\2gh\7\17\2\2hi\7\26\2\2im\7 \2\2jl\7#\2\2kj"+
		"\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\f\2\2q"+
		"r\5\b\5\2rs\7\16\2\2s\7\3\2\2\2tv\7#\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2"+
		"wx\3\2\2\2x{\3\2\2\2yw\3\2\2\2z|\5\n\6\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2"+
		"}~\3\2\2\2~\u0080\3\2\2\2\177\u0081\5\30\r\2\u0080\177\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\5\20\t\2\u0083\u0085\5\16\b\2"+
		"\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\t\3\2\2\2\u0086\u0087\5"+
		"\f\7\2\u0087\13\3\2\2\2\u0088\u0089\5\24\13\2\u0089\u008a\7 \2\2\u008a"+
		"\u008b\7#\2\2\u008b\r\3\2\2\2\u008c\u008e\5\4\3\2\u008d\u008c\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\17"+
		"\3\2\2\2\u0091\u0095\7\31\2\2\u0092\u0094\7#\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0098\u009a\7\f\2\2\u0099\u009b\5\4\3\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\16\2\2\u009f\u00a0\7#\2\2\u00a0"+
		"\21\3\2\2\2\u00a1\u00a2\7\n\2\2\u00a2\u00a3\7\26\2\2\u00a3\u00a7\7 \2"+
		"\2\u00a4\u00a6\7#\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ae\7\f\2\2\u00ab\u00ad\7#\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b3\5\26\f\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3"+
		"\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\5\30\r\2\u00b7\u00b8\7\16\2\2\u00b8\23\3\2\2\2\u00b9\u00ba\7\n"+
		"\2\2\u00ba\u00bb\7 \2\2\u00bb\25\3\2\2\2\u00bc\u00bd\7\t\2\2\u00bd\u00be"+
		"\7 \2\2\u00be\u00bf\7#\2\2\u00bf\27\3\2\2\2\u00c0\u00c1\7\r\2\2\u00c1"+
		"\u00c5\7\7\2\2\u00c2\u00c4\5\32\16\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3"+
		"\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00cc\7\21\2\2\u00c9\u00cb\7#\2\2\u00ca\u00c9\3\2"+
		"\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d1\7\f\2\2\u00d0\u00d2\5\4"+
		"\3\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\16\2\2\u00d6\u00d7\7"+
		"#\2\2\u00d7\31\3\2\2\2\u00d8\u00d9\b\16\1\2\u00d9\u00da\7 \2\2\u00da\u00e0"+
		"\3\2\2\2\u00db\u00dc\6\16\2\3\u00dc\u00dd\7\4\2\2\u00dd\u00df\7 \2\2\u00de"+
		"\u00db\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\33\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e7\7\"\2\2\u00e4\u00e6"+
		"\7#\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ee\7\7"+
		"\2\2\u00eb\u00ed\7#\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f1\u00f2\7\21\2\2\u00f2\35\3\2\2\2\u00f3\u00f4\b\20\1\2\u00f4"+
		"\u00fb\7!\2\2\u00f5\u00fb\7 \2\2\u00f6\u00f7\7\7\2\2\u00f7\u00f8\5\36"+
		"\20\2\u00f8\u00f9\7\21\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fa"+
		"\u00f5\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fb\u0104\3\2\2\2\u00fc\u00fd\6\20"+
		"\3\3\u00fd\u00fe\t\2\2\2\u00fe\u0103\5\36\20\2\u00ff\u0100\6\20\4\3\u0100"+
		"\u0101\t\3\2\2\u0101\u0103\5\36\20\2\u0102\u00fc\3\2\2\2\u0102\u00ff\3"+
		"\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\37\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u010b\7\24\2\2\u0108\u010a\7#\2"+
		"\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0110\5(\25\2\u010f"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0116\3\2\2\2\u0113\u0115\7#\2\2\u0114\u0113\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0119\u011d\5*\26\2\u011a\u011c\7#\2\2\u011b"+
		"\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7\13\2\2\u0121"+
		"!\3\2\2\2\u0122\u0123\7\17\2\2\u0123\u0124\7\7\2\2\u0124\u0125\5&\24\2"+
		"\u0125\u0126\7\4\2\2\u0126\u0127\5$\23\2\u0127\u0128\7\21\2\2\u0128\u0131"+
		"\3\2\2\2\u0129\u012a\7\17\2\2\u012a\u012b\7\7\2\2\u012b\u012c\5&\24\2"+
		"\u012c\u012d\7\4\2\2\u012d\u012e\7\20\2\2\u012e\u012f\7\21\2\2\u012f\u0131"+
		"\3\2\2\2\u0130\u0122\3\2\2\2\u0130\u0129\3\2\2\2\u0131#\3\2\2\2\u0132"+
		"\u0133\7 \2\2\u0133%\3\2\2\2\u0134\u0135\5$\23\2\u0135\u0136\7\5\2\2\u0136"+
		"\u0137\7!\2\2\u0137\u0138\7\3\2\2\u0138\'\3\2\2\2\u0139\u013b\7#\2\2\u013a"+
		"\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0143\7\30\2\2\u0140"+
		"\u0142\7#\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u014a\7\f\2\2\u0147\u0149\7#\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2"+
		"\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014d\u0151\5\4\3\2\u014e\u0150\7#\2\2\u014f\u014e\3\2"+
		"\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7\16\2\2\u0155)\3\2\2\2"+
		"\u0156\u0158\7#\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u0160\7\31\2\2\u015d\u015f\7#\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0163\u0167\7\f\2\2\u0164\u0166\7#\2\2\u0165\u0164\3\2"+
		"\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016e\5\4\3\2\u016b\u016d\7#"+
		"\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\7\16"+
		"\2\2\u0172+\3\2\2\2\u0173\u0174\5\36\20\2\u0174\u0175\t\4\2\2\u0175\u0176"+
		"\5\36\20\2\u0176-\3\2\2\2\'\61PXemw}\u0080\u0084\u008f\u0095\u009c\u00a7"+
		"\u00ae\u00b4\u00c5\u00cc\u00d3\u00e0\u00e7\u00ee\u00fa\u0102\u0104\u010b"+
		"\u0111\u0116\u011d\u0130\u013c\u0143\u014a\u0151\u0159\u0160\u0167\u016e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}