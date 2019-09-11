package ast;

public class Node {
    public String name ="";
    public  Boolean isLexer = false ;
    public  Node father ;
    public FromNode from;
    public  Node()
  {}

    public  Node(String name , Boolean isLexer , Node father )
    {
        this.name = name;
        this.father= father;
        this.isLexer = isLexer;
    }
    public void print (int space)
    {}

}
