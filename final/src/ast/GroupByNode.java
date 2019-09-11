package ast;
import java.util.ArrayList;
public class GroupByNode extends Node
{
    public ArrayList<IdentNode> columns = new ArrayList<>() ;

    public GroupByNode() {
    }

    public GroupByNode(String name, Boolean isLexer, Node father) {
        super(name, isLexer, father);
    }

    public GroupByNode(String name, Boolean isLexer, Node father, ArrayList<IdentNode> column) {
        super(name, isLexer, father);
        this.columns = column;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public void print (int space)
    {
        for (int i=0; i<space;i++)
        {System.out.print("  |");}
        System.out.println(this.name);
        for (int i =0 ; i<this.columns.size(); i++)
        {
            this.columns.get(i).print(space+1);
        }
    }
    public void addColumn (IdentNode column)
    {
        this.columns.add(column);
    }


}
