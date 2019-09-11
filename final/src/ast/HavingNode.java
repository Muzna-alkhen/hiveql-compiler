package ast;
public class HavingNode extends Node {
    public ExprNode condition = new ExprNode();
    public HavingNode() {
    }
    public HavingNode(String name, Boolean isLexer, Node father, ExprNode condition) {
        super(name, isLexer, father);
        this.condition = condition;
    }
    public HavingNode(String name, Boolean isLexer, Node father) {
        super(name, isLexer, father);
    }
    @Override
    public String toString() {
        return super.toString();
    }
    public void print(int space) {
        for (int i = 0; i < space; i++) {
            System.out.print("  |");
        }
        System.out.println(this.name);
        this.condition.print(space + 1);
    }
}
