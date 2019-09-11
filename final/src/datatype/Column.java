package datatype;

import java.io.Serializable;

public class Column implements Serializable
{
    public String name ;
    public String type;
    public Integer order ;

    public Column()
    {

    }
    public Column(String name , String type,int order)
    {

        this.type = type;
        this.name = name;
        this.order = order;

    }

    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type)
    {
        this.type=type;
    }

    public String getName() {
        return name;
    }
    public String getType()
    {
        return type;
    }



    @Override
    public String toString() {
        String s = this.name +":"+this.type;
        return s;
    }

}
