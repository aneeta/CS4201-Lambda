package lambdatree;

public class AbstractionNode extends ExpressionNode {

    ExpressionNode left;
    ExpressionNode right;

    public AbstractionNode() {
        this.left = null;
        this.right = null;
    }

    public AbstractionNode(ExpressionNode left, ExpressionNode right) {
        this.left = left;
        this.right = right;
    }

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


}

   
