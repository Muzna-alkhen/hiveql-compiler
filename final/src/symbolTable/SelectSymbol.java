package symbolTable;
public class SelectSymbol extends Symbol
{
Symbol father;
    public SelectSymbol(Scope father)
    {
        this.father=father;
    }
}
