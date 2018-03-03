// Generated from LabeledExpr.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class LabeledExprBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements LabeledExprVisitor<T> {
	@Override public T visitMethods(LabeledExprParser.MethodsContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrintlnExpr(LabeledExprParser.PrintlnExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitCndExpr(LabeledExprParser.CndExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitSharedclassDef(LabeledExprParser.SharedclassDefContext ctx) { return visitChildren(ctx); }

	@Override public T visitObject(LabeledExprParser.ObjectContext ctx) { return visitChildren(ctx); }

	@Override public T visitParallelclass(LabeledExprParser.ParallelclassContext ctx) { return visitChildren(ctx); }

	@Override public T visitMulDiv(LabeledExprParser.MulDivContext ctx) { return visitChildren(ctx); }

	@Override public T visitNewParallelStruct(LabeledExprParser.NewParallelStructContext ctx) { return visitChildren(ctx); }

	@Override public T visitId(LabeledExprParser.IdContext ctx) { return visitChildren(ctx); }

	@Override public T visitProg(LabeledExprParser.ProgContext ctx) { return visitChildren(ctx); }

	@Override public T visitCriticalSection(LabeledExprParser.CriticalSectionContext ctx) { return visitChildren(ctx); }

	@Override public T visitPAsynch(LabeledExprParser.PAsynchContext ctx) { return visitChildren(ctx); }

	@Override public T visitSharedObjects(LabeledExprParser.SharedObjectsContext ctx) { return visitChildren(ctx); }

	@Override public T visitSClassName(LabeledExprParser.SClassNameContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssignInt(LabeledExprParser.AssignIntContext ctx) { return visitChildren(ctx); }

	@Override public T visitConstructor(LabeledExprParser.ConstructorContext ctx) { return visitChildren(ctx); }

	@Override public T visitBlank(LabeledExprParser.BlankContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrintStrExpr(LabeledExprParser.PrintStrExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitInt(LabeledExprParser.IntContext ctx) { return visitChildren(ctx); }

	@Override public T visitAddSub(LabeledExprParser.AddSubContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssignStr(LabeledExprParser.AssignStrContext ctx) { return visitChildren(ctx); }

	@Override public T visitParens(LabeledExprParser.ParensContext ctx) { return visitChildren(ctx); }

	@Override public T visitList(LabeledExprParser.ListContext ctx) { return visitChildren(ctx); }

	@Override public T visitSClassDef(LabeledExprParser.SClassDefContext ctx) { return visitChildren(ctx); }

	@Override public T visitSVars(LabeledExprParser.SVarsContext ctx) { return visitChildren(ctx); }

	@Override public T visitThreadArray(LabeledExprParser.ThreadArrayContext ctx) { return visitChildren(ctx); }

	@Override public T visitPClassMethods(LabeledExprParser.PClassMethodsContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrintExpr(LabeledExprParser.PrintExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitNewTask(LabeledExprParser.NewTaskContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrintlnStrExpr(LabeledExprParser.PrintlnStrExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitPclassName(LabeledExprParser.PclassNameContext ctx) { return visitChildren(ctx); }

	@Override public T visitIfStat(LabeledExprParser.IfStatContext ctx) { return visitChildren(ctx); }

	@Override public T visitSObjectName(LabeledExprParser.SObjectNameContext ctx) { return visitChildren(ctx); }

	@Override public T visitPstat(LabeledExprParser.PstatContext ctx) { return visitChildren(ctx); }

	@Override public T visitPCritic(LabeledExprParser.PCriticContext ctx) { return visitChildren(ctx); }
}