package datatype;
import start.Launch;

import java.io.*;
import java.util.ArrayList;
// this class presents the structure of list of data types in the program
// EXAMPLE : Data type X holds the following data types (int + A + ....)
public  class DataTypes implements Serializable {
    public  ArrayList<DataType> MainDataTypesARRAY = new ArrayList<DataType>();

    public boolean isExist(String name)  //check if a data type is pre-define in the program
    {
        for (int i = 0; i < this.MainDataTypesARRAY.size(); i++) {
            if (this.MainDataTypesARRAY.get(i).name.equals(name)) {

                return true;

            }

        }
        return false;
    }

    public int getSize() {
        return this.MainDataTypesARRAY.size();
    }

    public void set(DataType temp) {

        this.MainDataTypesARRAY.add(temp);

    }

    public String get(String name) //recursive function to get a specific data type as a string
    {
        DataType temp = this.search(name);
        if (temp != null) {
            String tempName = temp.name;
            ArrayList<Column> list = temp.columns;
            String s = "[";
            for (int i = 0; i < list.size(); i++) {
                Column tempColumn = list.get(i);
                if ((tempColumn.type == "Int") || (tempColumn.type == "Real") || (tempColumn.type == "Bool") || (tempColumn.type == "String")) {

                    s += tempColumn.toString();


                } else {
                    s += "{\"name\":\"" + tempColumn.name + '"' + ',' + '"' + "type:" + '"' + tempColumn.type + '"' + ", \"details\":" + this.get(tempColumn.type);
                }

            }
            return s + "]";
        } else {
            return "TYPE NOT FOUND";
        }


    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.MainDataTypesARRAY.size(); i++) {
            s = s + this.MainDataTypesARRAY.get(i).name + "  ";
            s=s+this.MainDataTypesARRAY.get(i).delimiter+" "+this.MainDataTypesARRAY.get(i).location+"\n" ;
        }
        return s;
    }

    public DataType search(String name) {
        for (int i = 0; i < this.MainDataTypesARRAY.size(); i++) {
            if (this.MainDataTypesARRAY.get(i).name.equals(name)) {
                return this.MainDataTypesARRAY.get(i);
            }
        }
        return null;
    }



    public String flat(String name) // get a specific data type as a string with details
    {
        DataType temp = this.search(name);
        if (temp != null) {
            ArrayList<Column> list = temp.columns;
            String s = "[";
            for (int i = 0; i < list.size(); i++) {
                Column tempColumn = list.get(i);
                if ((tempColumn.type == "Int") || (tempColumn.type == "Real") || (tempColumn.type == "Bool") || (tempColumn.type == "String")) {

                    s += tempColumn.toString()+",";
                }
                else
                {
                    DataType d = Launch.main_data_types.search(tempColumn.type);
                    s += dfs(d , tempColumn.name);
                }

            }
            return s + "]";
        } else {
            return "TYPE NOT FOUND";
        }


    }

    public String dfs(DataType dt, String input) //recursive function to get the "_" form for the flat function
    {
        String full = "";
        ArrayList<Column> l = dt.columns;
        for (int i = 0; i < l.size(); i++) {
            Column tu = l.get(i);
            if ((tu.type == "Int") || (tu.type == "Real") || (tu.type == "Bool") || (tu.type == "String"))
            {
                full += "{\"name\":\""+input+"_"+tu.name+"\",\"type\":\""+tu.type+"\"},";
            }
            else
            {
                DataType t = Launch.main_data_types.search(tu.type);
                String ss = input+"_"+tu.name;
                full += dfs(t,ss);

            }

        }
        return full;
    }
    public void writeDataTypes() // write the data types object on a binary file
             throws IOException
    {
        File file = new File("datatypes.bin");
        FileOutputStream fos = new FileOutputStream(file,false);
        ObjectOutputStream out = new ObjectOutputStream(fos);

        out.writeObject(this);
        out.close();

    }
    public void readDataTypes() // read a binary file that holds the data types object
             throws IOException, ClassNotFoundException {
        File file = new File("datatypes.bin");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
       Launch.main_data_types = (DataTypes) ois.readObject();

        ois.close();




    }
}