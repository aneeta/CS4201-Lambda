// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunlParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FunlParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunlParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(FunlParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunlParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecls(FunlParser.DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunlParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(FunlParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunlParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(FunlParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code App}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(FunlParser.AppContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Nil}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(FunlParser.NilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnOp}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnOp(FunlParser.UnOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cond}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(FunlParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(FunlParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code True}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(FunlParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(FunlParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code False}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(FunlParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOp}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp(FunlParser.BinOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(FunlParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunlParser#unop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnop(FunlParser.UnopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunlParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(FunlParser.BinopContext ctx);
}