package datatype;
import ast.IdentNode;

import java.io.Serializable;
import java.util.ArrayList;
//every single data type has a name + a list of columns to describe this data type
// EXAMPLE : Data type A consists of columns : (id int + string name )
public class DataType implements Serializable {
    public String name;
    public ArrayList<Column> columns = new ArrayList<Column>();
    public String location;
    public String delimiter;
    public DataType() {
    }
    public DataType(String name, String del, String loc) {
        this.name = name;
        this.delimiter = del;
        this.location = loc;
    }
    public void addColumn(Column temp) {
        this.columns.add(temp);
    }
    public Column search(String name) {
        for (int i = 0; i < this.columns.size(); i++) {
            if (this.columns.get(i).name == name) {
                return this.columns.get(i);
            }
        }
        return null;
    }
    public int getSize() {
        return this.columns.size();
    }
    public Column searchColumn(String name) {
        for (int i = 0; i < this.columns.size(); i++) {
            if (this.columns.get(i).name.equals(name)) {
                return this.columns.get(i);
            }
        }
        return null;
    }

    public static ArrayList<Integer> getIndeies(ArrayList<IdentNode> list) {
        ArrayList<Integer>  result = new ArrayList<>();
        for (IdentNode column : list) {
            Column col = column.column ;
            result.add(col.order);
        }
        return result;
    }
}