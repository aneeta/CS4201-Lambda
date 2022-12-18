package lambdatree;

public class LambdaTree {

    private ExpressionNode root;
    private ExpressionNode currentNode;

    public LambdaTree() {
        this.root = null;
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
        // TODO
    }

    