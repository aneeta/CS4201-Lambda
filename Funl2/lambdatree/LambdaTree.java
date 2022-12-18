package lambdatree;

public class LambdaTree {

    private ExpressionNode root;
    private ExpressionNode prevNode;
    private ExpressionNode currentNode;

    public LambdaTree() {
        this.root = null;
        this.prevNode = null;
        this.currentNode = null;
    }

    public ExpressionNode getRoot() {
        return this.root;
    }

    public void setRoot(ExpressionNode root) {
        this.root = root;
    }

    public ExpressionNode getParent(ExpressionNode node) {
        // TODO improve, hella clunky
        while()
        if (node == null) {
            return null;
        }
        if ()

    }

    public ExpressionNode getCurrentNode() {
        return this.currentNode;
    }

    public void setCurrentNode(ExpressionNode currentNode) {
        this.currentNode = currentNode;
    }

    public void print() {
        // TODO
        System.out.println(root.toString());
    }

    public void add(ExpressionNode node) {
        // adding to current node
        // add to left and if full then add to right
        if (currentNode.left == null) {
            currentNode.setLeft(node);
        } else if (currentNode.right == null) {
            currentNode.setRight(node);
        } else {
            // throw new Exception("Node full!");
            System.out.println("Node full!");
        }
    }

    public ExpressionNode getPrevNode() {
        return this.prevNode;
    }

    public void setPrevNode(ExpressionNode prevNode) {
        this.prevNode = prevNode;
    }
}
