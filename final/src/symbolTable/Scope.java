package symbolTable;

import java.util.ArrayList;
public class Scope extends Symbol
{
    public ArrayList<Symbol> symbols ;
   public Scope father ;

    public Scope(Scope father)
    {
        this.symbols = new ArrayList<>();
        this.father=father;
    }

    @Override
    public String toString()
    {
        int num = this.symbols.size();
        String s ="";
        for (int i=0; i<num ; i++)
        {
            s+= "|"+this.symbols.get(i).name+"|";
        }
        return s ;
    }
    public void print (int k)
    {

        int num = this.symbols.size();

        for (int i =0; i<num; i++)
        {
            Symbol temp = this.symbols.get(i);
            for(int j=0;j<k;j++)
                System.out.print(" |");
            System.out.println(temp.name);
            if (temp instanceof FunctionSymbol)
            {   for(int j=0;j<k+1;j++)
                System.out.print(" parameters:");
                FunctionSymbol temp2 =(FunctionSymbol)temp;
                System.out.println(temp2.parameters.toString());
                temp2.scope.print(k+1);
            }
            if (temp instanceof  Scope)
            {
                Scope temp2 =(Scope)temp;
                temp2.print(k+1);
            }

        }


    }
}
