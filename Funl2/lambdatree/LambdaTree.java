package lambdatree;

public class LambdaTree {

    private ExpressionNode root;
    private ExpressionNode currentNode;

    public LambdaTree() {
        this.root = null;
        this.currentNode = null;
    }

    public static AbstractionNode getTrueNode() {
        // TRUE = lambda a. lambda b. a
        AbstractionNode node = new AbstractionNode();
        node.setLeft(new VarNode("a"));
        node.setRight(new AbstractionNode());
        node.getRight().setLeft(new VarNode("b"));
        node.getRight().setRight(new VarNode("a"));
        return node;
    }

    public static AbstractionNode getFalseNode() {
        // FALSE = lambda a. lambda b. b
        AbstractionNode node = new AbstractionNode();
        node.setLeft(new VarNode("a"));
        node.setRight(new AbstractionNode());
        node.getRight().setLeft(new VarNode("b"));
        node.getRight().setRight(new VarNode("b"));
        return node;
    }

    public static AbstractionNode getAndNode() {
        // AND = lambda p. lambda q. p q FALSE
        AbstractionNode node = new AbstractionNode();

        // lambda p.
        node.setLeft(new VarNode("p"));
        node.setRight(new AbstractionNode());
        // lambda q.
        node.getRight().setLeft(new VarNode("q"));
        node.getRight().setRight(new ApplicationNode());
        // expr FALSE
        node.getRight().getRight().setLeft(new ApplicationNode());
        node.getRight().getRight().setRight(getFalseNode());
        // p q
        node.getRight().getRight().getLeft().setLeft(new VarNode("p"));
        node.getRight().getRight().getLeft().setRight(new VarNode("q"));

        return node;
    }

    public static AbstractionNode getOrNode() {
        // OR = lambda p. lambda q. p TRUE q
        AbstractionNode node = new AbstractionNode();

        // lambda p.
        node.setLeft(new VarNode("p"));
        node.setRight(new AbstractionNode());
        // lambda q.
        node.getRight().setLeft(new VarNode("q"));
        node.getRight().setRight(new ApplicationNode());
        // expr q
        node.getRight().getRight().setLeft(new ApplicationNode());
        node.getRight().getRight().setRight(new VarNode("q"));
        // p TRUE
        node.getRight().getRight().getLeft().setLeft(new VarNode("p"));
        node.getRight().getRight().getLeft().setRight(getTrueNode());

        return node;
    }

    public static AbstractionNode getNotNode() {
        // NOT = lambda p. lambda a. lambda b. p b a
        AbstractionNode node = new AbstractionNode();
        // lambda p.
        node.setLeft(new VarNode("p"));
        node.setRight(new AbstractionNode());
        // lambda a.
        node.getRight().setLeft(new VarNode("a"));
        node.getRight().setRight(new AbstractionNode());
        // lambda b.
        node.getRight().getRight().setLeft(new VarNode("b"));
        node.getRight().getRight().setRight(new ApplicationNode());
        // expr a
        node.getRight().getRight().getRight().setLeft(new ApplicationNode());
        node.getRight().getRight().getRight().setRight(new VarNode("a"));
        // p b
        node.getRight().getRight().getRight().getLeft().setLeft(new VarNode("p"));
        node.getRight().getRight().getRight().getLeft().setRight(new VarNode("b"));

        return node;
    }

    public static AbstractionNode getIfNode() {
        // IF = lambda p. lambda a. lambda b. p a b
        AbstractionNode node = new AbstractionNode();
        // lambda p.
        node.setLeft(new VarNode("p"));
        node.setRight(new AbstractionNode());
        // lambda a.
        node.getRight().setLeft(new VarNode("a"));
        node.getRight().setRight(new AbstractionNode());
        // lambda b.
        node.getRight().getRight().setLeft(new VarNode("b"));
        node.getRight().getRight().setRight(new ApplicationNode());
        // expr b
        node.getRight().getRight().getRight().setLeft(new ApplicationNode());
        node.getRight().getRight().getRight().setRight(new VarNode("b"));
        // p a
        node.getRight().getRight().getRight().getLeft().setLeft(new VarNode("p"));
        node.getRight().getRight().getRight().getLeft().setRight(new VarNode("a"));

        return node;
    }

    public static AbstractionNode getYCombinatorNode() {
        // Y = lambda f. (lambda x. f(x x))(lambda x. f(x x))
        AbstractionNode node = new AbstractionNode();
        // lambda f.
        node.setLeft(new VarNode("f"));
        node.setRight(new ApplicationNode());

        node.getRight().setLeft(new AbstractionNode());
        node.getRight().setRight(new AbstractionNode());
        // 1st lambda x. f(x x)
        node.getRight().getLeft().setLeft(new VarNode("x"));
        node.getRight().getLeft().setRight(new ApplicationNode());
        node.getRight().getLeft().getRight().setLeft(new VarNode("f"));
        node.getRight().getLeft().getRight().setRight(new ApplicationNode());
        node.getRight().getLeft().getRight().getRight().setLeft(new VarNode("x"));
        node.getRight().getLeft().getRight().getRight().setRight(new VarNode("x"));
        // 2nd lambda x. f(x x)
        node.getRight().getRight().setLeft(new VarNode("x"));
        node.getRight().getRight().setRight(new ApplicationNode());
        node.getRight().getRight().getRight().setLeft(new VarNode("f"));
        node.getRight().getRight().getRight().setRight(new ApplicationNode());
        node.getRight().getRight().getRight().getRight().setLeft(new VarNode("x"));
        node.getRight().getRight().getRight().getRight().setRight(new VarNode("x"));

        return node;
    }

    public ExpressionNode getRoot() {
        return this.root;
    }

    public void setRoot(ExpressionNode root) {
        this.root = root;
    }

    public ExpressionNode getCurrentNode() {
        return this.currentNode;
    }

    public void setCurrentNode(ExpressionNode currentNode) {
        this.currentNode = currentNode;
    }

    public void print() {
        System.out.println(root.toString());
    }
}
