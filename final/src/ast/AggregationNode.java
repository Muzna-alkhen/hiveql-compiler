package ast;

public class AggregationNode extends Node
{
    public String function = "" ;
    public IdentNode column = new IdentNode()   ;
    public Boolean isStar = false;
    public AggregationNode(String name, Boolean isLexer, Node father) {
        super(name, isLexer, father);

    }

    public AggregationNode()
    {
    }

    public AggregationNode(String name, Boolean isLexer, Node father, IdentNode column,String function) {
        super(name, isLexer, father);
        this.column = column;
        this.function=function;
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
        System.out.println(this.function);
        if (this.isStar)
        {
            for (int i=0; i<space+1;i++)
            {System.out.print("  |");}
            System.out.println("*");
        }
        else
        {column.print(space+1);}
    }
}
