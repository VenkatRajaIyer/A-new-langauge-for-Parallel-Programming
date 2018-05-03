// Generated from LabeledExpr.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class LabeledExprBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements LabeledExprVisitor<T> {
	@Override public T visitTsks(LabeledExprParser.TsksContext ctx) { return visitChildren(ctx); }

	@Override public T visitCall_function(LabeledExprParser.Call_functionContext ctx) { return visitChildren(ctx); }

	@Override public T visitFunction_id(LabeledExprParser.Function_idContext ctx) { return visitChildren(ctx); }

	@Override public T visitCreatesVars1(LabeledExprParser.CreatesVars1Context ctx) { return visitChildren(ctx); }

	@Override public T visitEndParallelStruct(LabeledExprParser.EndParallelStructContext ctx) { return visitChildren(ctx); }

	@Override public T visitCndExpr(LabeledExprParser.CndExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitCall_a_function(LabeledExprParser.Call_a_functionContext ctx) { return visitChildren(ctx); }

	@Override public T visitFinteger(LabeledExprParser.FintegerContext ctx) { return visitChildren(ctx); }

	@Override public T visitMulDiv(LabeledExprParser.MulDivContext ctx) { return visitChildren(ctx); }

	@Override public T visitReturnfromfunction(LabeledExprParser.ReturnfromfunctionContext ctx) { return visitChildren(ctx); }

	@Override public T visitCriticalSection(LabeledExprParser.CriticalSectionContext ctx) { return visitChildren(ctx); }

	@Override public T visitWritemain(LabeledExprParser.WritemainContext ctx) { return visitChildren(ctx); }

	@Override public T visitAnotherParallelStruct(LabeledExprParser.AnotherParallelStructContext ctx) { return visitChildren(ctx); }

	@Override public T visitCreateMain(LabeledExprParser.CreateMainContext ctx) { return visitChildren(ctx); }

	@Override public T visitAsignParallel(LabeledExprParser.AsignParallelContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssignInt(LabeledExprParser.AssignIntContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssignStm(LabeledExprParser.AssignStmContext ctx) { return visitChildren(ctx); }

	@Override public T visitDummyreturn(LabeledExprParser.DummyreturnContext ctx) { return visitChildren(ctx); }

	@Override public T visitDummywhile(LabeledExprParser.DummywhileContext ctx) { return visitChildren(ctx); }

	@Override public T visitParallelo(LabeledExprParser.ParalleloContext ctx) { return visitChildren(ctx); }

	@Override public T visitCriticalSectionWithParams(LabeledExprParser.CriticalSectionWithParamsContext ctx) { return visitChildren(ctx); }

	@Override public T visitWhileExpr(LabeledExprParser.WhileExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrintStrExpr(LabeledExprParser.PrintStrExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitInt(LabeledExprParser.IntContext ctx) { return visitChildren(ctx); }

	@Override public T visitAddSub(LabeledExprParser.AddSubContext ctx) { return visitChildren(ctx); }

	@Override public T visitParens(LabeledExprParser.ParensContext ctx) { return visitChildren(ctx); }

	@Override public T visitThreadArray(LabeledExprParser.ThreadArrayContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrintExpr(LabeledExprParser.PrintExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitFvoid(LabeledExprParser.FvoidContext ctx) { return visitChildren(ctx); }

	@Override public T visitNewTask(LabeledExprParser.NewTaskContext ctx) { return visitChildren(ctx); }

	@Override public T visitIfStat(LabeledExprParser.IfStatContext ctx) { return visitChildren(ctx); }

	@Override public T visitSharedParams(LabeledExprParser.SharedParamsContext ctx) { return visitChildren(ctx); }

	@Override public T visitFuncCall(LabeledExprParser.FuncCallContext ctx) { return visitChildren(ctx); }

	@Override public T visitParallleloRuntime(LabeledExprParser.ParallleloRuntimeContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrintlnExpr(LabeledExprParser.PrintlnExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitFchar(LabeledExprParser.FcharContext ctx) { return visitChildren(ctx); }

	@Override public T visitParametersType(LabeledExprParser.ParametersTypeContext ctx) { return visitChildren(ctx); }

	@Override public T visitJustcreatefunction(LabeledExprParser.JustcreatefunctionContext ctx) { return visitChildren(ctx); }

	@Override public T visitStatInCritical(LabeledExprParser.StatInCriticalContext ctx) { return visitChildren(ctx); }

	@Override public T visitObject(LabeledExprParser.ObjectContext ctx) { return visitChildren(ctx); }

	@Override public T visitId(LabeledExprParser.IdContext ctx) { return visitChildren(ctx); }

	@Override public T visitProg(LabeledExprParser.ProgContext ctx) { return visitChildren(ctx); }

	@Override public T visitCreatefunction(LabeledExprParser.CreatefunctionContext ctx) { return visitChildren(ctx); }

	@Override public T visitFparams(LabeledExprParser.FparamsContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrintStm(LabeledExprParser.PrintStmContext ctx) { return visitChildren(ctx); }

	@Override public T visitFstring(LabeledExprParser.FstringContext ctx) { return visitChildren(ctx); }

	@Override public T visitBlank(LabeledExprParser.BlankContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssignStr(LabeledExprParser.AssignStrContext ctx) { return visitChildren(ctx); }

	@Override public T visitParams(LabeledExprParser.ParamsContext ctx) { return visitChildren(ctx); }

	@Override public T visitSVars(LabeledExprParser.SVarsContext ctx) { return visitChildren(ctx); }

	@Override public T visitWhileStat(LabeledExprParser.WhileStatContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrintlnStrExpr(LabeledExprParser.PrintlnStrExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitCriticalStatements(LabeledExprParser.CriticalStatementsContext ctx) { return visitChildren(ctx); }
}