package lambdatree;

public class ApplicationNode extends ExpressionNode {

    ExpressionNode left;
    ExpressionNode right;

    public AbstractionNode(ExpressionNode left, ExpressionNode right) {
        this.left = left;
        this.right = right;
    }

}
