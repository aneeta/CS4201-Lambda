package lambdatree;

public class AbstractionNode extends ExpressionNode {

    // public AbstractionNode() {
    // this.left = null;
    // this.right = null;
    // }

    // public AbstractionNode(VarNode left, ExpressionNode right) {
    // this.left = left;
    // this.right = right;
    // }

    public ExpressionNode getLeft() {
        return this.left;
    }

    public void setLeft(VarNode left) {
        this.left = left;
    }

    public ExpressionNode getRight() {
        return this.right;
    }

    public void setRight(ExpressionNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "λ" + left.toString() + ". " + right.toString();
    }

}
