package ast;
import java.util.ArrayList;
public class SelectListNode extends Node {
    public ArrayList<Node> columns = new ArrayList<>();
    public SelectListNode() {
    }
    public SelectListNode(String name, Boolean isLexer, Node father) {
        super(name, isLexer, father);
    }
    public SelectListNode(String name, Boolean isLexer, Node father,
                          ArrayList<Node> columns
    ) {
        super(name, isLexer, father);
        this.columns = columns;
    }
    public void addColumn(Node ident) {
        this.columns.add((IdentNode) ident);
    }
    public void addAggregation(Node aggregation) {
        this.columns.add((AggregationNode) aggregation);
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
        int listNum = (this.columns.size());
        for (int i = 0; i < listNum; i++) {
            Node temp = this.columns.get(i);
            if (temp instanceof IdentNode) {
                IdentNode temp1 = (IdentNode) temp;
                temp1.print(space + 1);
            } else {
                if (temp instanceof AggregationNode) {
                    AggregationNode temp2 = (AggregationNode) temp;
                    temp2.print(space + 1);
                }
            }
        }
    }

    public ArrayList<Node> extractAggregation() {
        ArrayList<Node> temp = new ArrayList<>();
        for (Node element : this.columns) {
            if (element instanceof AggregationNode) {
                temp.add(element);
            }
        }
        return temp;
    }
}
