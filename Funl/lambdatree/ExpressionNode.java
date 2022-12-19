package lambdatree;

public abstract class ExpressionNode {

    // base node:
    // can contain abstractions, individual variables,
    // ints, or operations on them

    ExpressionNode left;
    ExpressionNode right;

    public ExpressionNode getLeft() {
        return this.left;
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

    public ExpressionNode reduce() {
        return this;
    }

    public boolean canReduce() {
        return false;
    }

    public ExpressionNode replace(String var, ExpressionNode replacement) {
        return this;
    }

    public abstract ExpressionNode deepcopy();

}
