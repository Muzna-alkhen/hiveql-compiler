package ast;
import java.util.ArrayList;
public class FromNode extends Node
{
    public ArrayList <JoinNode> joinList = new ArrayList<>() ;
    public IdentNode table = new IdentNode() ;
    public Boolean isJoin = false;

    public FromNode(String name, Boolean isLexer, Node father) {
        super(name, isLexer, father);
    }

    public FromNode() {
    }

    public FromNode(String name, Boolean isLexer, Node father, ArrayList <JoinNode> joinList, IdentNode table) {
        super(name, isLexer, father);
        this.joinList = joinList;
        this.table = table;
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
        for (int i=0; i<space+1;i++)
        {System.out.print("  |");}
        System.out.println(this.table.name);
        if(this.isJoin)
        {
           for (int i=0; i< this.joinList.size(); i++) {
               this.joinList.get(i).print(space + 1);
           }

        }

    }
    public void addJoin (JoinNode join)
    {
        this.joinList.add(join);
    }
}
