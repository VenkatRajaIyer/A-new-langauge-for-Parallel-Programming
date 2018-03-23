// Generated from LabeledExpr.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LabeledExprVisitor<T> extends ParseTreeVisitor<T> {
	T visitPrintlnExpr(LabeledExprParser.PrintlnExprContext ctx);

	T visitFchar(LabeledExprParser.FcharContext ctx);

	T visitParametersType(LabeledExprParser.ParametersTypeContext ctx);

	T visitJustcreatefunction(LabeledExprParser.JustcreatefunctionContext ctx);

	T visitCreatesVars1(LabeledExprParser.CreatesVars1Context ctx);

	T visitEndParallelStruct(LabeledExprParser.EndParallelStructContext ctx);

	T visitCndExpr(LabeledExprParser.CndExprContext ctx);

	T visitObject(LabeledExprParser.ObjectContext ctx);

	T visitFinteger(LabeledExprParser.FintegerContext ctx);

	T visitMulDiv(LabeledExprParser.MulDivContext ctx);

	T visitId(LabeledExprParser.IdContext ctx);

	T visitProg(LabeledExprParser.ProgContext ctx);

	T visitReturnfromfunction(LabeledExprParser.ReturnfromfunctionContext ctx);

	T visitCriticalSection(LabeledExprParser.CriticalSectionContext ctx);

	T visitCreatefunction(LabeledExprParser.CreatefunctionContext ctx);

	T visitFparams(LabeledExprParser.FparamsContext ctx);

	T visitAnotherParallelStruct(LabeledExprParser.AnotherParallelStructContext ctx);

	T visitPrintStm(LabeledExprParser.PrintStmContext ctx);

	T visitFstring(LabeledExprParser.FstringContext ctx);

	T visitAsignParallel(LabeledExprParser.AsignParallelContext ctx);

	T visitAssignInt(LabeledExprParser.AssignIntContext ctx);

	T visitAssignStm(LabeledExprParser.AssignStmContext ctx);

	T visitCriticalSectionWithParams(LabeledExprParser.CriticalSectionWithParamsContext ctx);

	T visitBlank(LabeledExprParser.BlankContext ctx);

	T visitPrintStrExpr(LabeledExprParser.PrintStrExprContext ctx);

	T visitInt(LabeledExprParser.IntContext ctx);

	T visitAssignStr(LabeledExprParser.AssignStrContext ctx);

	T visitAddSub(LabeledExprParser.AddSubContext ctx);

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
}