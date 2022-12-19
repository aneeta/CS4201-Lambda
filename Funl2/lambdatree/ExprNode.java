package lambdatree;

public interface ExprNode {

    public String toString();

    public boolean canReduce();

    public ExpressionNode reduce(ExpressionNode sub);

}
