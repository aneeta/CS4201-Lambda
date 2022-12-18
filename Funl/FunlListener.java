// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunlParser}.
 */
public interface FunlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FunlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FunlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunlParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FunlParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FunlParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunlParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(FunlParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(FunlParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunlParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(FunlParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(FunlParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunlParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(FunlParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(FunlParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FunlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FunlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunlParser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(FunlParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(FunlParser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunlParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(FunlParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(FunlParser.BinopContext ctx);
}