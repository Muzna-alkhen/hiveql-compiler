package ast;

public class WhereNode extends Node
{
    public ExprNode condition = new ExprNode();
    //public SelectStmtNode subSelect = new SelectStmtNode();

    public WhereNode() {
    }

    public WhereNode(String name, Boolean isLexer, Node father) {
        super(name, isLexer, father);
    }

    public WhereNode(String name, Boolean isLexer, Node father, ExprNode condition) {
        super(name, isLexer, father);
        this.condition = condition;
    }


    public void print (int space)
    {
        for (int i = 0; i < space; i++) {
            System.out.print("  |");
        }
        System.out.println(this.name);
        condition.print(space+1);
    }
}
