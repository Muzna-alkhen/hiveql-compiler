package parser;
import ast.*;
import datatype.Column;
import datatype.DataType;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import semanticChecks.SemanticChecksController;
import start.Launch;
import symbolTable.FunctionSymbol;
import symbolTable.Scope;
import symbolTable.SelectSymbol;
import symbolTable.VariableSymbol;

import java.util.ArrayList;
import java.util.List;
public class MyVisitor extends HQLBaseVisitor<Object> {
    public boolean isFirst = true;
    @Override
    public Object visitCreate_table_stmt(HQLParser.Create_table_stmtContext ctx) {
        String tableName = ctx.table_name().getText();
        int n = ctx.create_table_definition().create_table_columns().create_table_columns_item().size();
        int index_last_char = ctx.delm().L_CHAR().toString().length() - 1;
        String s_delim = ctx.delm().L_CHAR().toString().substring(1, index_last_char);
        index_last_char = ctx.location().L_FILE().toString().length() - 1;
        String s_loc = ctx.location().L_FILE().toString().substring(1, index_last_char);
        DataType Dtemp = new DataType(tableName, s_delim, s_loc);
        for (int i = 0; i < n; i++) {
            Column Columntemp = new Column();
            String name = ctx.create_table_definition().create_table_columns().create_table_columns_item(i).column_name().getText();
            String type = ctx.create_table_definition().create_table_columns().create_table_columns_item(i).dtype().getText();
            Columntemp.name = name;
            Columntemp.type = type;
            Columntemp.order = i;
            Dtemp.addColumn(Columntemp);
        }
        Launch.main_data_types.set(Dtemp);
        return visitChildren(ctx);
    }
    @Override
    public Object visitCreate_function_stmt(HQLParser.Create_function_stmtContext ctx) {
        FunctionSymbol temp = new FunctionSymbol();
        temp.name = ctx.ident().getText();
        temp.type = "function";
        String s = ctx.dtype().getText();
        if (s.equals("void")) {
            temp.isVoid = true;
        } else {
            temp.isVoid = false;
            temp.return_type = ctx.dtype().getText();
        }
        String isParam = ctx.getChild(3).getText();
        if (isParam.equals(")")) {
            temp.parameters = null;
        } else {
            int num = ctx.fanc_param_elem().ident().size();
            temp.parameters = new ArrayList<Column>();
            for (int i = 0; i < num; i++) {
                Column u = new Column();
                u.type = ctx.fanc_param_elem().dtype(i).getText();
                u.name = ctx.fanc_param_elem().ident(i).getText();
                temp.parameters.add(u);
            }
        }
        Launch.temp_scope.symbols.add(temp);
        temp.scope.father = Launch.temp_scope;
        Launch.temp_scope = temp.scope;
        visitChildren(ctx);
        //exit rule
        Launch.temp_scope = Launch.temp_scope.father;
        return true;
    }
    @Override
    public Object visitScope(HQLParser.ScopeContext ctx) {
        Scope temp = new Scope(Launch.temp_scope);
        temp.type = "scope";
        temp.name = "new scope";
        Launch.temp_scope.symbols.add(temp);
        Launch.temp_scope = temp;
        visitChildren(ctx);
        //exit rule
        Launch.temp_scope = Launch.temp_scope.father;
        return true;
    }
    @Override
    public Object visitDeclare(HQLParser.DeclareContext ctx) {
        int num = ctx.ident().size();
        for (int i = 0; i < num; i++) {
            VariableSymbol temp = new VariableSymbol();
            temp.name = ctx.ident(i).getText();
            temp.name = ctx.ident(i).getText();
            temp.type = ctx.dtype().getText();
            temp.type = "variable";
            Launch.temp_scope.symbols.add(temp);
        }
        return visitChildren(ctx);
    }
    @Override
    public Object visitIf_in_func(HQLParser.If_in_funcContext ctx) {
        Scope temp = new Scope(Launch.temp_scope);
        temp.type = "scope";
        temp.name = "if scope";
        Launch.temp_scope.symbols.add(temp);
        Launch.temp_scope = temp;
        visitChildren(ctx);
        //exit rule
        Launch.temp_scope = Launch.temp_scope.father;
        return true;
    }
    @Override
    public Object visitFor_in_func(HQLParser.For_in_funcContext ctx) {
        Scope temp = new Scope(Launch.temp_scope);
        temp.type = "scope";
        temp.name = "for scope";
        Launch.temp_scope.symbols.add(temp);
        Launch.temp_scope = temp;
        visitChildren(ctx);
        //exit rule
        Launch.temp_scope = Launch.temp_scope.father;
        return true;
    }
    @Override
    public Object visitSelect_stmt(HQLParser.Select_stmtContext ctx) {
        SelectStmtNode select = new SelectStmtNode("select", true, Launch.temp_ast);
        if (Launch.temp_ast instanceof ProgramNode) {
            ProgramNode father = (ProgramNode) Launch.temp_ast;
            father.addSelect(select);
            Launch.temp_ast = select;
        }
        SelectSymbol selectSyombol = new SelectSymbol(Launch.temp_scope);
        selectSyombol.name = "select";
        selectSyombol.type = "";
        Launch.temp_scope.symbols.add(selectSyombol);
        return visitChildren(ctx);
    }
    @Override
    public Object visitSelect_list(HQLParser.Select_listContext ctx) {
        SelectListNode selectList = new SelectListNode("select List", false, Launch.temp_ast);
        if (Launch.temp_ast instanceof SelectStmtNode) {
            SelectStmtNode father = (SelectStmtNode) Launch.temp_ast;
            father.selectList = selectList;
            Launch.temp_ast = selectList;
        }
        visitChildren(ctx);
        Launch.temp_ast = Launch.temp_ast.father;
        return true;
    }
    @Override
    public Object visitIdent(HQLParser.IdentContext ctx) {
        if (Launch.temp_ast instanceof SelectListNode) {
            int numOfId = ctx.L_ID().size();
            String columnName = "", tableName = "";
            IdentNode ident = new IdentNode(ctx.getText(), true, Launch.temp_ast);
            if (numOfId == 1) {
                columnName = ctx.L_ID(0).toString();
                ident = new IdentNode(columnName, true, Launch.temp_ast);
                ident.table = null;
                ident.column = null;
                ident.fullName = columnName ;
            } else {
                if (numOfId == 2) {
                    tableName = ctx.L_ID(0).getText();
                    columnName = ctx.L_ID(1).getText();
                    DataType table = Launch.main_data_types.search(tableName);
                    Column column = table.searchColumn(columnName);
                    ident.column = column;
                    ident.table = table;
                    ident.fullName =(tableName+"_"+columnName);
                }
            }
            ((SelectListNode) Launch.temp_ast).addColumn(ident);
        } else {
            if (Launch.temp_ast instanceof AggregationNode) {
                int numOfId = ctx.L_ID().size();
                String columnName = "", tableName = "";
                IdentNode ident = new IdentNode(ctx.getText(), true, Launch.temp_ast);
                if (numOfId == 1) {
                    columnName = ctx.L_ID(0).toString();
                    tableName = "";
                    ident.table = null;
                    ident.column = null;
                    ident.fullName = columnName ;
                 if (Launch.temp_ast.father instanceof  HavingNode)
                                {
                                    HavingNode having = (HavingNode) Launch.temp_ast.father;
                                    SelectStmtNode select = (SelectStmtNode) having.father ;
                                    FromNode from = select.from;
                                    ident.table = from.table.table;
                                    Column col = ident.table.searchColumn(columnName);
                                    ident.column = col ;
                                }
                } else {
                    if (numOfId == 2) {
                        tableName = ctx.L_ID(0).getText();
                        columnName = ctx.L_ID(1).getText();
                        DataType table = Launch.main_data_types.search(tableName);
                        Column column = table.searchColumn(columnName);
                        ident.column = column;
                        ident.table = table;
                        ident.fullName =(tableName+"_"+columnName);
                    }
                }
                ((AggregationNode) Launch.temp_ast).column = ident;
            } else {
                if (Launch.temp_ast instanceof ExprNode) {
                    int numOfId = ctx.L_ID().size();
                    String columnName = "", tableName = "";
                    IdentNode ident = new IdentNode(ctx.getText(), true, Launch.temp_ast);
                    if (numOfId == 1) {
                        columnName = ctx.L_ID(0).toString();
                        tableName = "";
                        ident = new IdentNode(columnName, true, Launch.temp_ast);
                        ident.table = null;
                        ident.column = null;
                        ident.fullName = columnName ;
                    } else {
                        if (numOfId == 2) {
                            tableName = ctx.L_ID(0).getText();
                            columnName = ctx.L_ID(1).getText();
                            DataType table = Launch.main_data_types.search(tableName);
                            Column column = table.searchColumn(columnName);
                            ident.column = column;
                            ident.table = table;
                            ident.fullName =(tableName+"_"+columnName);
                        }
                    }
                    if (isFirst) {
                        ((ExprNode) Launch.temp_ast).leftOperand = ident;
                        isFirst = false;
                    } else {
                        ((ExprNode) Launch.temp_ast).rightOperand = ident;
                        isFirst = true;
                    }
                } else {
                    if (Launch.temp_ast instanceof GroupByNode) {
                        int numOfId = ctx.L_ID().size();
                        String columnName = "", tableName = "";
                        IdentNode ident = new IdentNode(ctx.getText(), true, Launch.temp_ast);
                        if (numOfId == 1) {
                            columnName = ctx.L_ID(0).toString();
                            tableName = "";
                            ident = new IdentNode(columnName, true, Launch.temp_ast);
                            SelectStmtNode select = (SelectStmtNode) Launch.temp_ast.father;
                            FromNode from = select.from;
                            ident.table = from.table.table;
                            Column col = ident.table.searchColumn(columnName);
                            ident.column = col;
                            ident.fullName = columnName ;
                        } else {
                            if (numOfId == 2) {
                                tableName = ctx.L_ID(0).getText();
                                columnName = ctx.L_ID(1).getText();
                                DataType table = Launch.main_data_types.search(tableName);
                                Column column = table.searchColumn(columnName);
                                ident.column = column;
                                ident.table = table;
                                ident.fullName =(tableName+"_"+columnName);
                            }
                        }
                        ((GroupByNode) Launch.temp_ast).addColumn(ident);
                    }
                }
            }
        }
        return visitChildren(ctx);
    }
    @Override
    public Object visitWhere_clause(HQLParser.Where_clauseContext ctx) {
        WhereNode where = new WhereNode("where", true, Launch.temp_ast);
        if (Launch.temp_ast instanceof SelectStmtNode) {
            ((SelectStmtNode) Launch.temp_ast).where = where;
            Token start = ctx.bool_expr().getStart();
            Token stop = ctx.bool_expr().getStop();
            List<Token> conditionTokens = Launch.tokenStream.getTokens(start.getTokenIndex(), stop.getTokenIndex());
            ArrayList<String> conditionStrings = new ArrayList<>();

            for (int i = 0; i < conditionTokens.size(); i++) {
                conditionStrings.add(conditionTokens.get(i).getText());
            }
            ArrayList<String> conditionPostfix = ast.ExprNode.convertToPostfix(conditionStrings);
            ExprNode condition = ast.ExprNode.constructTree(conditionPostfix);
            where.condition = condition;
            where.condition.conditionPython =convertToPython(conditionStrings);

        }
        visitChildren(ctx);
        return true;
    }
    @Override
    public Object visitExpr_agg_window_func(HQLParser.Expr_agg_window_funcContext ctx) {
        AggregationNode aggregation = new AggregationNode("aggregation Function", true, Launch.temp_ast);
        if (Launch.temp_ast instanceof SelectListNode) {
            List<ParseTree> children = ctx.children;
            aggregation.function = children.get(0).getText();
            if (ctx.getText().contains("*")) { aggregation.isStar = true; } else {aggregation.isStar =false;}
            ((SelectListNode) Launch.temp_ast).addAggregation(aggregation);
            Launch.temp_ast = aggregation;
            visitChildren(ctx);
            Launch.temp_ast = aggregation.father;
        } else {
            if (Launch.temp_ast instanceof HavingNode) {
                ((HavingNode) Launch.temp_ast).condition.aggregation = aggregation;
                List<ParseTree> children = ctx.children;
                aggregation.function = children.get(0).getText();
                if (ctx.getText().contains("*")) { aggregation.isStar = true;} else {aggregation.isStar =false;}
                Launch.temp_ast = aggregation;
                visitChildren(ctx);
                Launch.temp_ast = aggregation.father;
            }
        }
        return true;
    }
    @Override
    public Object visitFrom_clause(HQLParser.From_clauseContext ctx) {
        FromNode from = new FromNode("from", true, Launch.temp_ast);
        if (Launch.temp_ast instanceof SelectStmtNode) {
            SelectStmtNode select = (SelectStmtNode) Launch.temp_ast;
            select.from = from;
            String tableName = ctx.from_table_clause().from_table_name_clause().table_name().ident().getText();
            DataType table = Launch.main_data_types.search(tableName);
            IdentNode ident = new IdentNode(tableName, true, from);
            ident.table = table;
            ident.column = null;
            from.table = ident;
            int numberOfJoins = ctx.from_join_clause().size();
            if (numberOfJoins == 0) {
                from.isJoin = false;
                int selectListNum = select.selectList.columns.size();
                for (Node element : select.selectList.columns) {
                    if (element instanceof IdentNode) {
                        IdentNode temp = (IdentNode) element;
                        Column colll = table.searchColumn(temp.name);
                        temp.table = table;
                        temp.column =colll;
                    } else {
                        if (element instanceof AggregationNode) {
                            AggregationNode temp = (AggregationNode) element;
                            temp.column.table = table;
                            String  columnName = "";
                            Column col = new Column();
                            if ( temp.isStar)
                            {columnName = "*";
                            }
                            else {columnName = temp.column.name;
                            col = table.searchColumn(columnName);
                            }
                            temp.column.column = col;
                        }
                    }
                }
            } else {
                from.isJoin = true;
            }
        }
        Launch.temp_ast = from;
        visitChildren(ctx);
        Launch.temp_ast = Launch.temp_ast.father;
        return true;
    }
    @Override
    public Object visitFrom_join_clause(HQLParser.From_join_clauseContext ctx) {
        JoinNode join = new JoinNode("join", true, Launch.temp_ast);
        if (Launch.temp_ast instanceof FromNode) {
            ((FromNode) Launch.temp_ast).addJoin(join);
            String leftTableName = ctx.from_table_clause().from_table_name_clause().table_name().ident().getText();
            DataType leftTable = Launch.main_data_types.search(leftTableName);
            IdentNode ident = new IdentNode(leftTableName, true, join);
            ident.column = null;
            ident.table = leftTable;
            join.leftTable = ident;
            String joinType = ctx.from_join_type_clause().getText();
            switch (joinType) {
                case "join":
                    join.type = "type:inner";
                    break;
                case "innerjoin":
                    join.type = "type:inner";
                    break;
                case "fullouterjoin":
                    join.type = "type:full outer";
                    break;
                case "leftouterjoin":
                    join.type = "type:left outer";
                    break;
                case "rightouterjoin":
                    join.type = "type:right outer";
                    break;
                default:
                    break;
            }
            Token start = ctx.bool_expr().getStart();
            Token stop = ctx.bool_expr().getStop();
            List<Token> conditionTokens = Launch.tokenStream.getTokens(start.getTokenIndex(), stop.getTokenIndex());
            ArrayList<String> conditionStrings = new ArrayList<>();
            int j = 0;
            while (j < conditionTokens.size()) {
                String s = conditionTokens.get(j).getText();
                if (s.equals(".")) {
                    String next = conditionTokens.get(j + 1).getText();
                    String prev = conditionTokens.get(j - 1).getText();
                    conditionStrings.remove(conditionStrings.size() - 1);
                    conditionStrings.add(prev + "." + next);
                    j = j + 2;
                } else {
                    conditionStrings.add(s);
                    j++;
                }
            }
            ArrayList<String> conditionPostfix = ast.ExprNode.convertToPostfix(conditionStrings);
            ExprNode condition = ast.ExprNode.constructTree(conditionPostfix);
            join.on = condition;
        }
        // Launch.temp_ast = join;
        visitChildren(ctx);
        Launch.temp_ast = join.father;
        return true;
    }
    @Override
    public Object visitBool_expr_binary(HQLParser.Bool_expr_binaryContext ctx) {
        if (Launch.temp_ast instanceof JoinNode) {
            ExprNode condition = new ExprNode(ctx.bool_expr_binary_operator().getText(), true, Launch.temp_ast);
            ((JoinNode) Launch.temp_ast).on = condition;
            condition.operator = condition.name;
            Launch.temp_ast = condition;
        }
        visitChildren(ctx);
        return true;
    }
    @Override
    public Object visitGroup_by_clause(HQLParser.Group_by_clauseContext ctx) {
        if (semanticChecks.SemanticChecksController.groupBy_clause_aggregation(ctx.getText())) {
           System.out.println("semantic ERROR : Group By CAN NOT Contains aggregation Function");
            System.exit(0);
        } else {
            GroupByNode groupBy = new GroupByNode("group by", true, Launch.temp_ast);
            if (Launch.temp_ast instanceof SelectStmtNode) {
                ((SelectStmtNode) Launch.temp_ast).groupBy = groupBy;
                Launch.temp_ast = groupBy;
            }
            visitChildren(ctx);
            Launch.temp_ast = groupBy.father;
            SelectStmtNode select = (SelectStmtNode) Launch.temp_ast;
            SelectListNode selectList = select.selectList ;
           if(  !SemanticChecksController.selectList_group_by(selectList.columns , groupBy.columns) )
           {   System.out.println("semantic ERROR :Everything in select statement should be in grouping by clause");
               System.exit(0);}

        }

        return true;
    }
    @Override
    public Object visitHaving_clause(HQLParser.Having_clauseContext ctx) {
        if (SemanticChecksController.having_clause_aggregation(ctx.getText()))
        {
            System.out.println("semantic ERROR : HAVING MUST Contain aggregation Function");
            System.exit(0);

        }
        else {
            HavingNode having = new HavingNode("having", true, Launch.temp_ast);
            if (Launch.temp_ast instanceof SelectStmtNode) {
                ((SelectStmtNode) Launch.temp_ast).having = having;
                String operator = ctx.bool_expr().bool_expr_atom().bool_expr_binary().bool_expr_binary_operator().getText();
                String rightValue = ctx.bool_expr().bool_expr_atom().bool_expr_binary().expr(1).getText();
                ExprNode condition = new ExprNode(operator, true, having);
                IdentNode right = new IdentNode(rightValue, true, condition);
                condition.rightOperand = right;
                condition.operator = operator;
                having.condition = condition;
                Launch.temp_ast = having;
            }
            visitChildren(ctx);
            Launch.temp_ast = having.father;
        }
        return true;
    }
    public static String convertToPython (ArrayList <String> list )
    {    String all="",temp = "";
    // name like '%y'
    // re.match ('%y' , name)
    //re.match(list.get(3), list.get(1))
        if (list.contains("like"))
        {
            String s = list.get(3).replace("%","+");
            s =s.replace("_",".");
            all = "re.match("+s+",("+list.get(1)+"))";
        }
        else {
            for (int i = 0; i < list.size(); i++) {
                temp = list.get(i);
                if (temp.equals("=")) {
                    temp = "==";
                }
                if (temp.equals("<>")) {
                    temp = "!=";
                }
                if (i < list.size() - 1) {
                    if (temp.equals("is") && ((list.get(i + 1).equals("not")) || list.get(i + 1).equals("NOT"))) {
                        temp = "!=";
                    }
                }
                if (temp.equals("is")) {
                    temp = "=";
                }
                all = all + temp + " ";
            }
        }
        return all;
    }
}
