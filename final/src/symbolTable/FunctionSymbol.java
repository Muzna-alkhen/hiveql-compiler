package symbolTable;

import datatype.Column;

import java.util.ArrayList;

public class FunctionSymbol extends Symbol {
    public ArrayList<Column> parameters;
    public Boolean isVoid ;
    public String return_type;
    public  Scope scope ;
    public  FunctionSymbol ()
    {
        this.parameters = new ArrayList<Column>();
        this.scope = new Scope(null);
    }


}

