package lambdatree;

public class ExpressionNode {

    // base node
    // can contain abstractions, individual variables, ints, or operations on them

    ExpressionNode left;
    ExpressionNode right;
    ExpressionNode parent;

    public ExpressionNode getLeft() {
        return this.left;
    }

    public ExpressionNode getParent() {
        return this.parent;
    }

    public void setParent(ExpressionNode parent) {
        this.parent = parent;
    }

    public void setLeft(ExpressionNode left) {
        this.left = left;
    }

    public ExpressionNode getRight() {
        return this.right;
    }

    public void setRight(ExpressionNode right) {
        this.right = right;
    }

    public String toString() {
        return left.toString() + " " + right.toString();
    }
}
