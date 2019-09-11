package ast;

public class SelectStmtNode extends Node
{
    public SelectListNode selectList = new SelectListNode() ;
    public FromNode from = new FromNode();
    public  WhereNode where = new WhereNode() ;
    public GroupByNode groupBy = new GroupByNode() ;
    public HavingNode having = new HavingNode() ;

    public SelectStmtNode() {
    }

    public SelectStmtNode(String name, Boolean isLexer, Node father) {
        super(name, isLexer, father);
    }

    public SelectStmtNode(String name, Boolean isLexer, Node father, SelectListNode selectList,
                          FromNode _from, WhereNode where,
                          GroupByNode groupBy, HavingNode having) {
        super(name, isLexer, father);
        this.selectList = selectList;
        this.from = _from;
        this.where = where;
        this.groupBy = groupBy;
        this.having = having;
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
        Boolean ok =true ;


            if(!this.selectList.name.equals(""))
                this.selectList.print(space+1);
            if(!this.from.name.equals(""))
             this.from.print(space+1);
            if (!this.where.name.equals(""))
                this.where.print(space+1);
            if (!this.groupBy.name.equals(""))
                this.groupBy.print(space+1);
            if (!this.having.name.equals(""))
                this.having.print(space+1);



    }
}
