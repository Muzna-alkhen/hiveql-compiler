package semanticChecks;
import ast.IdentNode;
import ast.Node;

import java.util.ArrayList;
public class SemanticChecksController
{
  public   Boolean undeclared_Variable (String variable)
    {return true;}
    public   Boolean unexisted_column_of_a_type (String variable)
    {return true;}
    public Boolean multiple_declarations (String variable)
    {return true;}
    public Boolean undeclared_type  (String variable)
    {return true;}
    public Boolean undeclared_method  (String variable)
    {return true;}
    public Boolean method_reutrn_type  (String variable)
    {return true;}
    public  Boolean wrong_method_arguments  (String variable)
    {return true;}
    public  Boolean conditional_stmt_bool  (String variable)
    {return true;}
    public static Boolean selectList_group_by  (ArrayList<Node> selectList, ArrayList<IdentNode> groupByList)
    {

      for (int i =0 ; i< selectList.size() ; i++)
      {
        Node temp1 = selectList.get(i);
        if ( temp1 instanceof IdentNode)
        {
          IdentNode temp2 = (IdentNode) temp1 ;
          Boolean isFound = false;
          for (int j = 0; j <groupByList.size() ; j++)
          {
            IdentNode temp3  = groupByList.get(j);
            if (  temp2.fullName.equals(temp3.fullName))
            {
              isFound = true;
              break;
            }

          }
          if (! isFound )
          {return  false;}

        }

      }
      return true;
    }
    public static  Boolean having_clause_aggregation  (String variable)
    {

      if (!(variable.contains("sum") || variable.contains("count") || variable.contains("avg") || variable.contains("max") ||variable.contains("min")) )
      {return true;}
      return false;
    }
    public static   Boolean groupBy_clause_aggregation  (String variable)
    {
        if (variable.contains("sum") || variable.contains("count") || variable.contains("avg") || variable.contains("max") ||variable.contains("min") )
        {return true;}
        return false;
    }

}
