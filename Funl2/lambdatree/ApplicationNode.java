package lambdatree;

public class ApplicationNode extends ExpressionNode {

    @Override
    public String toString() {
        return "(" + left.toString() + ") " + right.toString();
    }

}
