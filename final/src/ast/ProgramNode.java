package ast;

import java.util.ArrayList;

public class ProgramNode extends Node
{
    public ArrayList<Node> nodes = new ArrayList<>() ;

    public ProgramNode (String name , Boolean isLexer , Node father)
    {
        super(name,isLexer,father);

    }
    public ProgramNode()
    {}

    public ProgramNode(String name, Boolean isLexer, Node father, ArrayList<Node> nodes) {
        super(name, isLexer, father);
        this.nodes = nodes;
    }
    public void addSelect (SelectStmtNode select )
    {
        this.nodes.add(select);


    }

    @Override
    public String toString() {



        return super.toString();
    }


    public void print (int space)
    {


       int nodesNum = this.nodes.size();

       System.out.println("ABSTRACT SYNTAX TREE:");
        for (int i=0; i<space;i++)
        {System.out.print("  |");}
        System.out.println(this.name);
       for (int i=0 ; i <nodesNum ; i++)
       {
           Node currentNode = this.nodes.get(i);
           if(currentNode instanceof SelectStmtNode)
           {
               SelectStmtNode select = (SelectStmtNode) currentNode;
               select.print(space+1);
           }


       }

    }

}
