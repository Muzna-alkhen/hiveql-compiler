package codeGeneration;
import ast.AggregationNode;
import ast.Node;
import ast.SelectStmtNode;
import org.stringtemplate.v4.ST;
import start.Launch;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
public class ReducerController {
    public static ArrayList<Node> aggregationList = new ArrayList<>();
    public static void generateReducers() throws IOException {
        if (Launch.temp_ast instanceof SelectStmtNode) {
            SelectStmtNode select = (SelectStmtNode) Launch.temp_ast;
            aggregationList = select.selectList.extractAggregation();
            HashMap<String, Integer> map = new HashMap<>();
            int j = 0;
            for (int i = 0; i < aggregationList.size(); i++) {
                Node temp = aggregationList.get(i);
                AggregationNode agg = (AggregationNode) temp;
                String funName = agg.function;
                if (!(map.containsKey(agg.column.column.name))) {
                    map.put(agg.column.column.name, j);
                    j++;
                }
                generateReducer("E:\\\\compiler\\\\shufflerOutput\\\\" + map.get(agg.column.column.name) + ".csv", "E:\\\\compiler\\\\reducerOutput\\\\" + i + ".csv", i, funName);
            }
        }
        String ss = FileScanner.readFileAsString("C:\\\\Users\\\\muzna\\\\Desktop\\\\4th\\\\compiler\\\\final\\\\final\\\\src\\\\codeGeneration\\\\templates\\\\gather.st");
        ST mainTemplate = new ST(ss);
        FileScanner.writeFileAsString(mainTemplate.render(),"E:\\\\compiler\\\\generated code\\\\reducers\\\\gather.py");
    }
    public static void generateReducer(String inputFile, String outputFile, int fileName, String funName) {
        String s1 = "";
        switch (funName) {
            case "sum":
                s1 = FileScanner.readFileAsString("C:\\\\Users\\\\muzna\\\\Desktop\\\\4th\\\\compiler\\\\final\\\\final\\\\src\\\\codeGeneration\\\\templates\\\\sum.st");
                break;
            case "avg":
                s1 = FileScanner.readFileAsString("C:\\\\Users\\\\muzna\\\\Desktop\\\\4th\\\\compiler\\\\final\\\\final\\\\src\\\\codeGeneration\\\\templates\\\\avg.st");
                break;
            case "count":
                s1 = FileScanner.readFileAsString("C:\\\\Users\\\\muzna\\\\Desktop\\\\4th\\\\compiler\\\\final\\\\final\\\\src\\\\codeGeneration\\\\templates\\\\count.st");
                break;
            case "min":
                s1 = FileScanner.readFileAsString("C:\\\\Users\\\\muzna\\\\Desktop\\\\4th\\\\compiler\\\\final\\\\final\\\\src\\\\codeGeneration\\\\templates\\\\min.st");
                break;
            case "max":
                s1 = FileScanner.readFileAsString("C:\\\\Users\\\\muzna\\\\Desktop\\\\4th\\\\compiler\\\\final\\\\final\\\\src\\\\codeGeneration\\\\templates\\\\max.st");
                break;
        }
        ST mainTemplate = new ST(s1);
        mainTemplate.add("inputFile", inputFile);
        mainTemplate.add("outputFile", outputFile);
        FileScanner.writeFileAsString(mainTemplate.render(), "E:\\\\compiler\\\\generated code\\\\reducers\\\\" + fileName + ".py");
    }

}
