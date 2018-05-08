// Generated from LabeledExpr.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LabeledExprListener extends ParseTreeListener {
	void enterTsks(LabeledExprParser.TsksContext ctx);
	void exitTsks(LabeledExprParser.TsksContext ctx);

	void enterCall_function(LabeledExprParser.Call_functionContext ctx);
	void exitCall_function(LabeledExprParser.Call_functionContext ctx);

	void enterFunction_id(LabeledExprParser.Function_idContext ctx);
	void exitFunction_id(LabeledExprParser.Function_idContext ctx);

	void enterCreatesVars1(LabeledExprParser.CreatesVars1Context ctx);
	void exitCreatesVars1(LabeledExprParser.CreatesVars1Context ctx);

	void enterEndParallelStruct(LabeledExprParser.EndParallelStructContext ctx);
	void exitEndParallelStruct(LabeledExprParser.EndParallelStructContext ctx);

	void enterCndExpr(LabeledExprParser.CndExprContext ctx);
	void exitCndExpr(LabeledExprParser.CndExprContext ctx);

	void enterCall_a_function(LabeledExprParser.Call_a_functionContext ctx);
	void exitCall_a_function(LabeledExprParser.Call_a_functionContext ctx);

	void enterFinteger(LabeledExprParser.FintegerContext ctx);
	void exitFinteger(LabeledExprParser.FintegerContext ctx);

	void enterMulDiv(LabeledExprParser.MulDivContext ctx);
	void exitMulDiv(LabeledExprParser.MulDivContext ctx);

	void enterReturnfromfunction(LabeledExprParser.ReturnfromfunctionContext ctx);
	void exitReturnfromfunction(LabeledExprParser.ReturnfromfunctionContext ctx);

	void enterCriticalSection(LabeledExprParser.CriticalSectionContext ctx);
	void exitCriticalSection(LabeledExprParser.CriticalSectionContext ctx);

	void enterWritemain(LabeledExprParser.WritemainContext ctx);
	void exitWritemain(LabeledExprParser.WritemainContext ctx);

	void enterAnotherParallelStruct(LabeledExprParser.AnotherParallelStructContext ctx);
	void exitAnotherParallelStruct(LabeledExprParser.AnotherParallelStructContext ctx);

	void enterCreateMain(LabeledExprParser.CreateMainContext ctx);
	void exitCreateMain(LabeledExprParser.CreateMainContext ctx);

	void enterAsignParallel(LabeledExprParser.AsignParallelContext ctx);
	void exitAsignParallel(LabeledExprParser.AsignParallelContext ctx);

	void enterAssignInt(LabeledExprParser.AssignIntContext ctx);
	void exitAssignInt(LabeledExprParser.AssignIntContext ctx);

	void enterAssignStm(LabeledExprParser.AssignStmContext ctx);
	void exitAssignStm(LabeledExprParser.AssignStmContext ctx);

	void enterDummyreturn(LabeledExprParser.DummyreturnContext ctx);
	void exitDummyreturn(LabeledExprParser.DummyreturnContext ctx);

	void enterDummywhile(LabeledExprParser.DummywhileContext ctx);
	void exitDummywhile(LabeledExprParser.DummywhileContext ctx);

	void enterParallelo(LabeledExprParser.ParalleloContext ctx);
	void exitParallelo(LabeledExprParser.ParalleloContext ctx);

	void enterCriticalSectionWithParams(LabeledExprParser.CriticalSectionWithParamsContext ctx);
	void exitCriticalSectionWithParams(LabeledExprParser.CriticalSectionWithParamsContext ctx);

	void enterWhileExpr(LabeledExprParser.WhileExprContext ctx);
	void exitWhileExpr(LabeledExprParser.WhileExprContext ctx);

	void enterPrintStrExpr(LabeledExprParser.PrintStrExprContext ctx);
	void exitPrintStrExpr(LabeledExprParser.PrintStrExprContext ctx);

	void enterInt(LabeledExprParser.IntContext ctx);
	void exitInt(LabeledExprParser.IntContext ctx);

	void enterAddSub(LabeledExprParser.AddSubContext ctx);
	void exitAddSub(LabeledExprParser.AddSubContext ctx);

	void enterParens(LabeledExprParser.ParensContext ctx);
	void exitParens(LabeledExprParser.ParensContext ctx);

	void enterThreadArray(LabeledExprParser.ThreadArrayContext ctx);
	void exitThreadArray(LabeledExprParser.ThreadArrayContext ctx);

	void enterPrintExpr(LabeledExprParser.PrintExprContext ctx);
	void exitPrintExpr(LabeledExprParser.PrintExprContext ctx);

	void enterFvoid(LabeledExprParser.FvoidContext ctx);
	void exitFvoid(LabeledExprParser.FvoidContext ctx);

	void enterNewTask(LabeledExprParser.NewTaskContext ctx);
	void exitNewTask(LabeledExprParser.NewTaskContext ctx);

	void enterIfStat(LabeledExprParser.IfStatContext ctx);
	void exitIfStat(LabeledExprParser.IfStatContext ctx);

	void enterSharedParams(LabeledExprParser.SharedParamsContext ctx);
	void exitSharedParams(LabeledExprParser.SharedParamsContext ctx);

	void enterFuncCall(LabeledExprParser.FuncCallContext ctx);
	void exitFuncCall(LabeledExprParser.FuncCallContext ctx);

	void enterParallleloRuntime(LabeledExprParser.ParallleloRuntimeContext ctx);
	void exitParallleloRuntime(LabeledExprParser.ParallleloRuntimeContext ctx);

	void enterPrintlnExpr(LabeledExprParser.PrintlnExprContext ctx);
	void exitPrintlnExpr(LabeledExprParser.PrintlnExprContext ctx);

	void enterFchar(LabeledExprParser.FcharContext ctx);
	void exitFchar(LabeledExprParser.FcharContext ctx);

	void enterParametersType(LabeledExprParser.ParametersTypeContext ctx);
	void exitParametersType(LabeledExprParser.ParametersTypeContext ctx);

	void enterJustcreatefunction(LabeledExprParser.JustcreatefunctionContext ctx);
	void exitJustcreatefunction(LabeledExprParser.JustcreatefunctionContext ctx);

	void enterStatInCritical(LabeledExprParser.StatInCriticalContext ctx);
	void exitStatInCritical(LabeledExprParser.StatInCriticalContext ctx);

	void enterObject(LabeledExprParser.ObjectContext ctx);
	void exitObject(LabeledExprParser.ObjectContext ctx);

	void enterId(LabeledExprParser.IdContext ctx);
	void exitId(LabeledExprParser.IdContext ctx);

	void enterProg(LabeledExprParser.ProgContext ctx);
	void exitProg(LabeledExprParser.ProgContext ctx);

	void enterCreatefunction(LabeledExprParser.CreatefunctionContext ctx);
	void exitCreatefunction(LabeledExprParser.CreatefunctionContext ctx);

	void enterFparams(LabeledExprParser.FparamsContext ctx);
	void exitFparams(LabeledExprParser.FparamsContext ctx);

	void enterPrintStm(LabeledExprParser.PrintStmContext ctx);
	void exitPrintStm(LabeledExprParser.PrintStmContext ctx);

	void enterFstring(LabeledExprParser.FstringContext ctx);
	void exitFstring(LabeledExprParser.FstringContext ctx);

	void enterBlank(LabeledExprParser.BlankContext ctx);
	void exitBlank(LabeledExprParser.BlankContext ctx);

	void enterAssignStr(LabeledExprParser.AssignStrContext ctx);
	void exitAssignStr(LabeledExprParser.AssignStrContext ctx);

	void enterParams(LabeledExprParser.ParamsContext ctx);
	void exitParams(LabeledExprParser.ParamsContext ctx);

	void enterSVars(LabeledExprParser.SVarsContext ctx);
	void exitSVars(LabeledExprParser.SVarsContext ctx);

	void enterWhileStat(LabeledExprParser.WhileStatContext ctx);
	void exitWhileStat(LabeledExprParser.WhileStatContext ctx);

	void enterPrintlnStrExpr(LabeledExprParser.PrintlnStrExprContext ctx);
	void exitPrintlnStrExpr(LabeledExprParser.PrintlnStrExprContext ctx);

	void enterCriticalStatements(LabeledExprParser.CriticalStatementsContext ctx);
	void exitCriticalStatements(LabeledExprParser.CriticalStatementsContext ctx);
}