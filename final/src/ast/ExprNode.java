package ast;
import java.util.ArrayList;
import java.util.Stack;
public class ExprNode extends Node {
    public String operator = "";
    public ExprNode leftExpr ;
    public ExprNode rightExpr ;
    public IdentNode leftOperand = new IdentNode();
    public IdentNode rightOperand = new IdentNode();
    public AggregationNode aggregation = new AggregationNode();
    public String conditionPython;
    public ExprNode(String name, Boolean isLexer, Node father) {
        super(name, isLexer, father);
        this.leftOperand = new IdentNode();
        this.rightOperand = new IdentNode();
    }
    public ExprNode() {
    }
    public ExprNode(String name, Boolean isLexer, Node father,
                    ExprNode leftCondition, ExprNode rightCondition,
                    IdentNode leftOprand, IdentNode rightOprand, AggregationNode aggregation, String operator) {
        super(name, isLexer, father);
        this.leftExpr = leftCondition;
        this.rightExpr = rightCondition;
        this.leftOperand = leftOprand;
        this.rightOperand = rightOprand;
        this.aggregation = aggregation;
        this.operator = operator;
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
        if ((this.leftExpr != null) && (this.rightExpr != null) ) //if recursive
        {
            this.leftExpr.print(space + 1);
            this.rightExpr.print(space + 1);

        } else //not recursive
        {
            this.aggregation.print(space+1);
            this.rightOperand.print(space+1);
        }
    }
    public static int Prec(String operation) {
        switch (operation) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;
        }
        return -1;
    }
    // The main method that converts given infix expression
    // to postfix expression.
    public static ArrayList<String> convertToPostfix(ArrayList<String> expression) {
        ArrayList<String> postfixString = new ArrayList<>();
        Stack<String> stack = new Stack<String>();
        for (int index = 0; index < expression.size(); ++index) {
            String value = expression.get(index);
            if (value.equals("(")) {
                stack.push("("); // Code Added
            } else if (value.equals(")")) {
                String oper = stack.peek();
                while (!(oper.equals("(")) && !(stack.isEmpty())) {
                    postfixString.add(oper);
                    stack.pop();
                    if (!stack.isEmpty()) // Code Added
                        oper = stack.peek(); // Code Added
                }
                stack.pop(); // Code Added
            } else if (value.equals("+") || value.equals("-") || isOperator(value)) {
                if (stack.isEmpty()) {
                    stack.push(value);
                } else {
                    String oper = stack.peek();
                    while (!(stack.isEmpty() || oper.equals("(") || oper.equals("("))) {
                        oper = stack.pop(); // Code Updated
                        postfixString.add(oper);
                    }
                    stack.push(value);
                }
            } else if (value.equals("*") || value.equals("/") || isOperator(value)) {
                if (stack.isEmpty()) {
                    stack.push(value);
                } else {
                    String oper = stack.peek();
                    // while condition updated
                    while (!oper.equals("(") && !oper.equals("+") && !oper.equals("-") && !stack.isEmpty() && (!isOperator(value))) {
                        oper = stack.pop(); // Code Updated
                        postfixString.add(oper);
                    }
                    stack.push(value);
                }
            } else {
                postfixString.add(value);
            }
        }
        while (!stack.isEmpty()) {
            String oper = stack.peek();
            if (!oper.equals("(")) {
                stack.pop();
                postfixString.add(oper);
            }
        }
        return postfixString;
    }
    public static boolean isOperator(String value) {
        if ((value.equals("+")) || (value.equals("-"))
                || value.equals("*") || value.equals("/")
                || value.equals("%") || value.equals("=") || value.equals("!=") || value.equals("<>") || value.equals(">") || value.equals("<")
                || value.equals(">=") || value.equals("<=") || value.equals("!<") || value.equals("!>")
                || value.equals("or") || value.equals("OR") || value.equals("and") || value.equals("AND")
                || value.equals("is") || value.equals("IS") || value.equals("is not") || value.equals("IS NOT")
                || value.equals("like") || value.equals("LIKE")) {
            return true;
        }
        return false;
    }
public static ExprNode constructTree(ArrayList<String> postfix) {
        Stack<ExprNode> st = new Stack();
        ExprNode t, t1, t2;

        // Traverse through every character of
        // input expression
        for (int i = 0; i < postfix.size(); i++) {
          String s = postfix.get(i);
            // If operand, simply push into stack
            if (!isOperator(s)) {
                t = new ExprNode(s,true,null);
                st.push(t);
            } else // operator
            {
                t = new ExprNode(s,true,null);

                // Pop two top nodes
                // Store top
                t1 = st.pop();
                t2 = st.pop();
                //  make them children
               t.rightExpr=t1;
               t.leftExpr=t2;
                //System.out.println(t1.name + "" + t2.name);
                // Add this subexpression to stack
                st.push(t);
            }
        }
        //  only element will be root of expression
        // tree
        t = st.peek();
        st.pop();
        return t;
    }
}
