package lambdatree;

public class VarNode extends ExpressionNode {
    String individualVar;

    public VarNode(String individualVar) {
        this.individualVar = individualVar;
    }
}
