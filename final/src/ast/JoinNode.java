package ast;
public class JoinNode extends Node {
    public IdentNode leftTable = new IdentNode();
    public ExprNode on = new ExprNode();
    public String type = "";
    public JoinNode() {
    }
    public JoinNode(String name, Boolean isLexer, Node father) {
        super(name, isLexer, father);
    }
    public JoinNode(String name, Boolean isLexer, Node father,
                    IdentNode leftTable, ExprNode on, String type) {
        super(name, isLexer, father);
        this.leftTable = leftTable;
        this.on = on;
        this.type = type;
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
        for (int i = 0; i < space + 1; i++) {
            System.out.print("  |");
        }
        System.out.println(this.type);
        this.leftTable.print(space + 1);
        this.on.print(space + 1);
    }
}
