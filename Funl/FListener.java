
// Generated from Funl.g by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import lambdatree.*;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunlParser}.
 */
public class FListener extends FunlBaseListener {

	FunlParser parser;
	LambdaTree lambdaTree;
	Map<String, LambdaTree> abstractionsMap;

	public void printError(String error) {
		System.err.println(error);
		System.exit(-1);
	}

	public FListener(FunlParser parse) {
		this.parser = parser;
		this.abstractionsMap = new HashMap<>();
		this.lambdaTree = new LambdaTree();
	}

	/**
	 * Enter a parse tree produced by {@link FunlParser#program}.
	 * 
	 * @param ctx the parse tree
	 */
	@Override
	public void enterProgram(FunlParser.ProgramContext ctx) {
		System.out.println("in program");
	}

	/**
	 * Exit a parse tree produced by {@link FunlParser#program}.
	 * 
	 * @param ctx the parse tree
	 */
	@Override
	public void exitProgram(FunlParser.ProgramContext ctx) {
		System.out.println("exit program");
		// be careful about functions defined recursively
	}

	/**
	 * Enter a parse tree produced by {@link FunlParser#main}.
	 * 
	 * @param ctx the parse tree
	 */
	@Override
	public void enterMain(FunlParser.MainContext ctx) {
		System.out.println("in main");

	}

	/**
	 * Exit a parse tree produced by {@link FunlParser#main}.
	 * 
	 * @param ctx the parse tree
	 */
	@Override
	public void exitMain(FunlParser.MainContext ctx) {
		System.out.println("exit main");
	}

	/**
	 * Enter a parse tree produced by {@link FunlParser#decls}.
	 * 
	 * @param ctx the parse tree
	 */
	@Override
	public void enterDecls(FunlParser.DeclsContext ctx) {
		System.out.println("in declaration");
		// build a sub-tree for the declaration and store it
		AbstractionNode node = new AbstractionNode();

	}

	/**
	 * Exit a parse tree produced by {@link FunlParser#decls}.
	 * 
	 * @param ctx the parse tree
	 */
	@Override
	public void exitDecls(FunlParser.DeclsContext ctx) {

	}

	/**
	 * Enter a parse tree produced by {@link FunlParser#where}.
	 * 
	 * @param ctx the parse tree
	 */
	@Override
	public void enterWhere(FunlParser.WhereContext ctx) {

	}

	/**
	 * Exit a parse tree produced by {@link FunlParser#where}.
	 * 
	 * @param ctx the parse tree
	 */
	@Override
	public void exitWhere(FunlParser.WhereContext ctx) {

	}

	/**
	 * Enter a parse tree produced by {@link FunlParser#args}.
	 * 
	 * @param ctx the parse tree
	 */
	@Override
	public void enterArgs(FunlParser.ArgsContext ctx) {
		System.out.println("in args");
		// if a function has only one arg, then it can
		// be represented directly by the AbstactionNode
		// else the expression will contan next abstraction node
		AbstractionNode node = new AbstractionNode();

		String varName = ctx.getChild(0).toString();
		// set first argument
		node.setLeft(new VarNode(varName));

		// if multiple args, branch down
		for (int i = 1; i < ctx.children.size(); i++) {
			AbstractionNode nextArg = new AbstractionNode();
			String nextVarName = ctx.getChild(i).toString();
			nextArg.setLeft(new VarNode(nextVarName));
			node.setRight(nextArg);
			// repoint
			node = nextArg;
		}

	}

	/**
	 * Exit a parse tree produced by {@link FunlParser#args}.
	 * 
	 * @param ctx the parse tree
	 */
	@Override
	public void exitArgs(FunlParser.ArgsContext ctx) {
		System.out.println("exit args");

	}

	/**
	 * Enter a parse tree produced by {@link FunlParser#expr}.
	 * 
	 * @param ctx the parse tree
	 */
	@Override
	public void enterExpr(FunlParser.ExprContext ctx) {
		System.out.println("in expr");

		if (ctx.getChild(0).toString().equals("apply")) {
			// if expression has an application, make an application node
			ApplicationNode appNode = new ApplicationNode();
			lambdaTree.setCurrentNode(appNode);
		} else if (ctx.children.size() == 1) {
			// if the expression is a terminal, add it to the next node up

			// is the terminal an int or a var?

		}

	}

	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @Override
	 *           public void exitExpr(FunlParser.ExprContext ctx) {
	 *           System.out.println("exit expr");

	}

	/**
	 * Enter a parse tree produced by {@link FunlParser#unop}.
	 
	 * @param ctx the parse tree
	 */
	@Override
	public void enterUnop(FunlParser.UnopContext ctx) {
	 * System.out.println("in unop");

	}

	/**
	 * Exit a parse tree produced by {@link FunlParser#unop}.
	 * 
	 * @param ctx the parse tree
	 */
	@Override
	public void exitUnop(FunlParser.UnopContext ctx) {

	}

	/**
	 * Enter a parse tree produced by {@link FunlParser#binop}.
	 * 
	 * @param ctx the parse tree
	 */
	@Override
	public void enterBinop(FunlParser.BinopContext ctx) {
	 * 
	 * BinOpNode node = new BinOpNode();

	}

	/**
	 * Exit a parse tree produced by {@link FunlParser#binop}.
	 * 
	 * @param ctx the parse tree
	 */
	@Override
	public void exitBinop(FunlParser.BinopContext ctx) {

	}
}
