// Generated from LabeledExpr.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LabeledExprVisitor<T> extends ParseTreeVisitor<T> {
	T visitParallleloRuntime(LabeledExprParser.ParallleloRuntimeContext ctx);

	T visitTsks(LabeledExprParser.TsksContext ctx);

	T visitPrintlnExpr(LabeledExprParser.PrintlnExprContext ctx);

	T visitFchar(LabeledExprParser.FcharContext ctx);

	T visitParametersType(LabeledExprParser.ParametersTypeContext ctx);

	T visitCall_function(LabeledExprParser.Call_functionContext ctx);

	T visitFunction_id(LabeledExprParser.Function_idContext ctx);

	T visitJustcreatefunction(LabeledExprParser.JustcreatefunctionContext ctx);

	T visitCreatesVars1(LabeledExprParser.CreatesVars1Context ctx);

	T visitEndParallelStruct(LabeledExprParser.EndParallelStructContext ctx);

	T visitCndExpr(LabeledExprParser.CndExprContext ctx);

	T visitObject(LabeledExprParser.ObjectContext ctx);

	T visitCall_a_function(LabeledExprParser.Call_a_functionContext ctx);

	T visitFinteger(LabeledExprParser.FintegerContext ctx);

	T visitMulDiv(LabeledExprParser.MulDivContext ctx);

	T visitId(LabeledExprParser.IdContext ctx);

	T visitProg(LabeledExprParser.ProgContext ctx);

	T visitReturnfromfunction(LabeledExprParser.ReturnfromfunctionContext ctx);

	T visitCreatefunction(LabeledExprParser.CreatefunctionContext ctx);

	T visitWritemain(LabeledExprParser.WritemainContext ctx);

	T visitFparams(LabeledExprParser.FparamsContext ctx);

	T visitAnotherParallelStruct(LabeledExprParser.AnotherParallelStructContext ctx);

	T visitCreateMain(LabeledExprParser.CreateMainContext ctx);

	T visitPrintStm(LabeledExprParser.PrintStmContext ctx);

	T visitFstring(LabeledExprParser.FstringContext ctx);

	T visitAsignParallel(LabeledExprParser.AsignParallelContext ctx);

	T visitAssignStm(LabeledExprParser.AssignStmContext ctx);

	T visitAssignInt(LabeledExprParser.AssignIntContext ctx);

	T visitDummyreturn(LabeledExprParser.DummyreturnContext ctx);

	T visitParallelo(LabeledExprParser.ParalleloContext ctx);

	T visitBlank(LabeledExprParser.BlankContext ctx);

	T visitPrintStrExpr(LabeledExprParser.PrintStrExprContext ctx);

	T visitInt(LabeledExprParser.IntContext ctx);

	T visitAddSub(LabeledExprParser.AddSubContext ctx);

	T visitAssignStr(LabeledExprParser.AssignStrContext ctx);

	T visitParens(LabeledExprParser.ParensContext ctx);

	T visitParams(LabeledExprParser.ParamsContext ctx);

	T visitSVars(LabeledExprParser.SVarsContext ctx);

	T visitThreadArray(LabeledExprParser.ThreadArrayContext ctx);

	T visitPrintExpr(LabeledExprParser.PrintExprContext ctx);

	T visitFvoid(LabeledExprParser.FvoidContext ctx);

	T visitNewTask(LabeledExprParser.NewTaskContext ctx);

	T visitPrintlnStrExpr(LabeledExprParser.PrintlnStrExprContext ctx);

	T visitSharedParams(LabeledExprParser.SharedParamsContext ctx);

	T visitIfStat(LabeledExprParser.IfStatContext ctx);

	T visitCriticalStatements(LabeledExprParser.CriticalStatementsContext ctx);

	T visitFuncCall(LabeledExprParser.FuncCallContext ctx);
}