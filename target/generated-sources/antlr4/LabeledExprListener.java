// Generated from LabeledExpr.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LabeledExprListener extends ParseTreeListener {
	void enterMethods(LabeledExprParser.MethodsContext ctx);
	void exitMethods(LabeledExprParser.MethodsContext ctx);

	void enterPrintlnExpr(LabeledExprParser.PrintlnExprContext ctx);
	void exitPrintlnExpr(LabeledExprParser.PrintlnExprContext ctx);

	void enterEndParallelStruct(LabeledExprParser.EndParallelStructContext ctx);
	void exitEndParallelStruct(LabeledExprParser.EndParallelStructContext ctx);

	void enterCndExpr(LabeledExprParser.CndExprContext ctx);
	void exitCndExpr(LabeledExprParser.CndExprContext ctx);

	void enterObject(LabeledExprParser.ObjectContext ctx);
	void exitObject(LabeledExprParser.ObjectContext ctx);

	void enterMulDiv(LabeledExprParser.MulDivContext ctx);
	void exitMulDiv(LabeledExprParser.MulDivContext ctx);

	void enterNewParallelStruct(LabeledExprParser.NewParallelStructContext ctx);
	void exitNewParallelStruct(LabeledExprParser.NewParallelStructContext ctx);

	void enterId(LabeledExprParser.IdContext ctx);
	void exitId(LabeledExprParser.IdContext ctx);

	void enterProg(LabeledExprParser.ProgContext ctx);
	void exitProg(LabeledExprParser.ProgContext ctx);

	void enterCriticalSection(LabeledExprParser.CriticalSectionContext ctx);
	void exitCriticalSection(LabeledExprParser.CriticalSectionContext ctx);

	void enterPAsynch(LabeledExprParser.PAsynchContext ctx);
	void exitPAsynch(LabeledExprParser.PAsynchContext ctx);

	void enterAnotherParallelStruct(LabeledExprParser.AnotherParallelStructContext ctx);
	void exitAnotherParallelStruct(LabeledExprParser.AnotherParallelStructContext ctx);

	void enterSharedObjects(LabeledExprParser.SharedObjectsContext ctx);
	void exitSharedObjects(LabeledExprParser.SharedObjectsContext ctx);

	void enterPrintStm(LabeledExprParser.PrintStmContext ctx);
	void exitPrintStm(LabeledExprParser.PrintStmContext ctx);

	void enterSClassName(LabeledExprParser.SClassNameContext ctx);
	void exitSClassName(LabeledExprParser.SClassNameContext ctx);

	void enterAsignParallel(LabeledExprParser.AsignParallelContext ctx);
	void exitAsignParallel(LabeledExprParser.AsignParallelContext ctx);

	void enterAssignInt(LabeledExprParser.AssignIntContext ctx);
	void exitAssignInt(LabeledExprParser.AssignIntContext ctx);

	void enterAssignStm(LabeledExprParser.AssignStmContext ctx);
	void exitAssignStm(LabeledExprParser.AssignStmContext ctx);

	void enterConstructor(LabeledExprParser.ConstructorContext ctx);
	void exitConstructor(LabeledExprParser.ConstructorContext ctx);

	void enterCriticalSectionWithParams(LabeledExprParser.CriticalSectionWithParamsContext ctx);
	void exitCriticalSectionWithParams(LabeledExprParser.CriticalSectionWithParamsContext ctx);

	void enterBlank(LabeledExprParser.BlankContext ctx);
	void exitBlank(LabeledExprParser.BlankContext ctx);

	void enterPrintStrExpr(LabeledExprParser.PrintStrExprContext ctx);
	void exitPrintStrExpr(LabeledExprParser.PrintStrExprContext ctx);

	void enterPclassDef(LabeledExprParser.PclassDefContext ctx);
	void exitPclassDef(LabeledExprParser.PclassDefContext ctx);

	void enterInt(LabeledExprParser.IntContext ctx);
	void exitInt(LabeledExprParser.IntContext ctx);

	void enterAddSub(LabeledExprParser.AddSubContext ctx);
	void exitAddSub(LabeledExprParser.AddSubContext ctx);

	void enterAssignStr(LabeledExprParser.AssignStrContext ctx);
	void exitAssignStr(LabeledExprParser.AssignStrContext ctx);

	void enterParens(LabeledExprParser.ParensContext ctx);
	void exitParens(LabeledExprParser.ParensContext ctx);

	void enterList(LabeledExprParser.ListContext ctx);
	void exitList(LabeledExprParser.ListContext ctx);

	void enterParams(LabeledExprParser.ParamsContext ctx);
	void exitParams(LabeledExprParser.ParamsContext ctx);

	void enterSClassDef(LabeledExprParser.SClassDefContext ctx);
	void exitSClassDef(LabeledExprParser.SClassDefContext ctx);

	void enterSVars(LabeledExprParser.SVarsContext ctx);
	void exitSVars(LabeledExprParser.SVarsContext ctx);

	void enterThreadArray(LabeledExprParser.ThreadArrayContext ctx);
	void exitThreadArray(LabeledExprParser.ThreadArrayContext ctx);

	void enterPClassMethods(LabeledExprParser.PClassMethodsContext ctx);
	void exitPClassMethods(LabeledExprParser.PClassMethodsContext ctx);

	void enterPrintExpr(LabeledExprParser.PrintExprContext ctx);
	void exitPrintExpr(LabeledExprParser.PrintExprContext ctx);

	void enterNewTask(LabeledExprParser.NewTaskContext ctx);
	void exitNewTask(LabeledExprParser.NewTaskContext ctx);

	void enterPrintlnStrExpr(LabeledExprParser.PrintlnStrExprContext ctx);
	void exitPrintlnStrExpr(LabeledExprParser.PrintlnStrExprContext ctx);

	void enterSharedParams(LabeledExprParser.SharedParamsContext ctx);
	void exitSharedParams(LabeledExprParser.SharedParamsContext ctx);

	void enterIfStat(LabeledExprParser.IfStatContext ctx);
	void exitIfStat(LabeledExprParser.IfStatContext ctx);

	void enterSObjectName(LabeledExprParser.SObjectNameContext ctx);
	void exitSObjectName(LabeledExprParser.SObjectNameContext ctx);

	void enterPstat(LabeledExprParser.PstatContext ctx);
	void exitPstat(LabeledExprParser.PstatContext ctx);

	void enterPCritic(LabeledExprParser.PCriticContext ctx);
	void exitPCritic(LabeledExprParser.PCriticContext ctx);
}