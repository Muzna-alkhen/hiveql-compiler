package ast;

import datatype.Column;
import datatype.DataType;

public class IdentNode extends Node
{
    public  DataType table = new DataType() ;
    public  Column column = new Column();
    public String  fullName;



    public IdentNode() {
    }

    public IdentNode(String name, Boolean isLexer, Node father) {
        super(name, isLexer, father);
    }

    public IdentNode(String name, Boolean isLexer, Node father, DataType table, Column column) {
        super(name, isLexer, father);
        this.table = table;
        this.column = column;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public void print (int space)
    {
        for (int i=0; i<space;i++)
        {System.out.print("  |");}
         System.out.println(this.name );

    }
}
