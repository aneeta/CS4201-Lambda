// Generated from Funl.g by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FunlParser.ExprContext ctx);
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