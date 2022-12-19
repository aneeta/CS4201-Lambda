package lambdatree;

public class ConditionalNode extends ExpressionNode {
    ExpressionNode predicate;

    public ConditionalNode(ExpressionNode predicate) {
        this.predicate = predicate;
    }

    @Override
    public String toString() {
        return "(" + predicate.toString() + ") (" + left.toString() + ") (" + right.toString() + ")";
    }

    @Override
    public ExpressionNode replace(String var, ExpressionNode replacement) {
        // TODO
        return this;
    }

    @Override
    public ExpressionNode deepcopy() {
        // TODO
        return this;
    }
}
