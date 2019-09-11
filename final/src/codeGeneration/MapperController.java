package codeGeneration;
import ast.*;
import datatype.Column;
import datatype.DataType;
import org.stringtemplate.v4.ST;
import start.Launch;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class MapperController {
    public static ArrayList<Node> aggregationList = new ArrayList<>();
    public static SelectListNode selectList;
    public static void generateMappers() throws IOException {
        if (Launch.temp_ast instanceof SelectStmtNode) {
            SelectStmtNode select = (SelectStmtNode) Launch.temp_ast;

            if (select.from.isJoin) // join exists
            {
                JoinNode join = select.from.joinList.get(0);
                String name = select.from.table.table.name + "_"+join.leftTable.table.name;
                // the columns of new data type
                String folderPath = "E:\\compiler\\data\\"+name;
                String filePath = folderPath+"\\0.csv";
                new File(folderPath).mkdirs();
                File file = new File(filePath);
                file.createNewFile();
                String location = "E:\\compiler\\data\\"+name;
                String delim = "\t";
                DataType joinDataType = new DataType();
                joinDataType.name=name;
                joinDataType.location=location;
                joinDataType.delimiter=delim;

            }
            aggregationList = select.selectList.extractAggregation();
            if (aggregationList.size() != 0) { //agg
                if (select.groupBy.columns.size() != 0) // with group by
                {
                    ArrayList<Integer> groupIndecies = DataType.getIndeies(select.groupBy.columns);
                    Set<String> hash_Set = new HashSet<>();
                    for (int i = 0; i < aggregationList.size(); i++) {
                        Node temp = aggregationList.get(i);
                        AggregationNode agg = (AggregationNode) temp;
                        DataType table = agg.column.table;
                        String condition = select.where.condition.conditionPython;
                        if (!hash_Set.contains(((AggregationNode) temp).column.column.name)) {
                            hash_Set.add(((AggregationNode) temp).column.column.name);
                            if (agg.isStar == true) {
                                generateMapperKeyValueWithGroup("E:\\\\compiler\\\\mapperOutput\\\\" + i + ".csv", table, condition, -1, i, groupIndecies);
                            } else {
                                generateMapperKeyValueWithGroup("E:\\\\compiler\\\\mapperOutput\\\\" + i + ".csv", table, condition, agg.column.column.order, i, groupIndecies);
                            }
                        }
                    }
                } else // agg no group by
                {
                    Set<String> hash_Set = new HashSet<>();
                    for (int i = 0; i < aggregationList.size(); i++) {
                        Node temp = aggregationList.get(i);
                        AggregationNode agg = (AggregationNode) temp;
                        DataType table = agg.column.table;
                        String condition = select.where.condition.conditionPython;
                        if (!hash_Set.contains(((AggregationNode) temp).column.column.name)) {
                            hash_Set.add(((AggregationNode) temp).column.column.name);
                            if (agg.isStar == true) {
                                generateMapperKeyValueNoGroup("E:\\\\compiler\\\\mapperOutput\\\\" + i + ".csv", table, condition, -1, i);
                            } else {
                                generateMapperKeyValueNoGroup("E:\\\\compiler\\\\mapperOutput\\\\" + i + ".csv", table, condition, agg.column.column.order, i);
                            }
                        }
                    }
                }
            } //no agg
            else {
                selectList = select.selectList;
                String condition = select.where.condition.conditionPython;
                generateMapperEmmit(select.from.table.table, condition, selectList);
            }
        }
    }
    public static void generateMapperKeyValueNoGroup(String outputPath, DataType table, String whereCondition, int orderIndex, int fileName) {
        String s1 = FileScanner.readFileAsString("C:\\Users\\muzna\\Desktop\\4th\\compiler\\final\\final\\src\\codeGeneration\\templates\\mapper_key_value_no_group.st");
        ST mainTemplate = new ST(s1);
        //dynamic cast
        String all = "";
        for (int i = 0; i < table.getSize(); i++) {
            ST fieldTemplate = new ST("<name>=<cast_type>(line[<index>])");
            Column column = table.columns.get(i);
            fieldTemplate.add("name", column.name);
            String type = "";
            if (column.type.equals("Int")) {
                type = "int";
            }
            if (column.type.equals("Real")) {
                type = "float";
            }
            if (column.type.equals("Bool")) {
                type = "int";
            }
            if (column.type.equals("String")) {
                type = "str";
            }
            fieldTemplate.add("cast_type", type);
            fieldTemplate.add("index", i);
            all = all + fieldTemplate.render();
            if (i != table.getSize() - 1) {
                all = all + "\n";
            }
        }
        //adding place holders
        mainTemplate.add("location", table.location);
        mainTemplate.add("outputPath", outputPath);
        mainTemplate.add("delimiter", table.delimiter);
        mainTemplate.add("field_define", all);
        if (whereCondition == null ) {
            mainTemplate.add("whereCondition", "True");
        } else {
            mainTemplate.add("whereCondition", whereCondition);
        }
        if (orderIndex == -1) {
            mainTemplate.add("valueStar", "value = '1'");
            mainTemplate.add("value", "");
            mainTemplate.add("nullCondition","outputFile.write(\"%s\\t%s\\n\"%(key,value))");
        } else {
            mainTemplate.add("valueStar", "");
            mainTemplate.add("value", "value=line[" + orderIndex + "]");
            mainTemplate.add("nullCondition","if(value!='null'):\n" +
                    "\toutputFile.write(\"%s\\t%s\\n\"%(key,value))");
        }
        FileScanner.writeFileAsString(mainTemplate.render(), "E:\\\\compiler\\\\generated code\\\\mappers\\\\" + fileName + ".py");
    }
    public static void generateMapperKeyValueWithGroup(String outputPath, DataType table, String whereCondition, int orderIndex, int fileName, ArrayList<Integer> keyIndex) {
        String s1 = FileScanner.readFileAsString("C:\\Users\\muzna\\Desktop\\4th\\compiler\\final\\final\\src\\codeGeneration\\templates\\mapper_key_value_group.st");
        ST mainTemplate = new ST(s1);
        //dynamic cast
        String all = "";
        for (int i = 0; i < table.getSize(); i++) {
            ST fieldTemplate = new ST("<name>=<cast_type>(line[<index>])");
            Column column = table.columns.get(i);
            fieldTemplate.add("name", column.name);
            String type = "";
            if (column.type.equals("Int")) {
                type = "int";
            }
            if (column.type.equals("Real")) {
                type = "float";
            }
            if (column.type.equals("Bool")) {
                type = "int";
            }
            if (column.type.equals("String")) {
                type = "str";
            }
            fieldTemplate.add("cast_type", type);
            fieldTemplate.add("index", i);
            all = all + fieldTemplate.render();
            if (i != table.getSize() - 1) {
                all = all + "\n";
            }
        }
        //dynamic keys
        String all2 = "";
        ST fieldTemplate1 = new ST("key=line[<first_group_by_element>]\n");
        fieldTemplate1.add("first_group_by_element", keyIndex.get(0));
        all2 += fieldTemplate1.render();
        for (int i = 1; i < keyIndex.size(); i++) {
            ST fieldTemplate2 = new ST("key+='_'+line[<group_by_list>]");
            fieldTemplate2.add("group_by_list", keyIndex.get(i));
            all2 = all2 + fieldTemplate2.render();
            if (i != keyIndex.size() - 1) {
                all2 = all2 + "\n";
            }
        }
        //adding place holders
        mainTemplate.add("location", table.location);
        mainTemplate.add("outputPath", outputPath);
        mainTemplate.add("delimiter", table.delimiter);
        mainTemplate.add("field_define", all);
        if (whereCondition == null ) {
            mainTemplate.add("whereCondition", "True");
        } else {
            mainTemplate.add("whereCondition", whereCondition);
        }
        if (orderIndex == -1) {
            mainTemplate.add("valueStar", "value = '1'");
            mainTemplate.add("value", "");
            mainTemplate.add("nullCondition","outputFile.write(\"%s\\t%s\\n\"%(key,value))");

        } else {
            mainTemplate.add("valueStar", "");
            mainTemplate.add("value", "value=line[" + orderIndex + "]");
            mainTemplate.add("nullCondition","if(value!='null'):\n" +
                    "\toutputFile.write(\"%s\\t%s\\n\"%(key,value))");
        }
        mainTemplate.add("keys", all2);
        FileScanner.writeFileAsString(mainTemplate.render(), "E:\\\\compiler\\\\generated code\\\\mappers\\\\" + fileName + ".py");
    }
    public static void generateMapperEmmit(DataType table, String whereCondition, SelectListNode selectList) {
        String s1 = FileScanner.readFileAsString("C:\\Users\\muzna\\Desktop\\4th\\compiler\\final\\final\\src\\codeGeneration\\templates\\mapper_emmit.st");
        ST mainTemplate = new ST(s1);
        //dynamic cast
        String all = "";
        for (int i = 0; i < table.getSize(); i++) {
            ST fieldTemplate = new ST("<name>=<cast_type>(line[<index>])");
            Column column = table.columns.get(i);
            fieldTemplate.add("name", column.name);
            String type = "";
            if (column.type.equals("Int")) {
                type = "int";
            }
            if (column.type.equals("Real")) {
                type = "float";
            }
            if (column.type.equals("Bool")) {
                type = "int";
            }
            if (column.type.equals("String")) {
                type = "str";
            }
            fieldTemplate.add("cast_type", type);
            fieldTemplate.add("index", i);
            all = all + fieldTemplate.render();
            if (i != table.getSize() - 1) {
                all = all + "\n";
            }
        }
        //dynamic writer
        String writer = "";
        for (int i = 0; i < selectList.columns.size(); i++) {
            ST writerTemplate = new ST("outputFile.write(\"%s\"%str(line[<index>]))\n");
            IdentNode ident = (IdentNode) selectList.columns.get(i);
            Column col = ident.column;

                int index = col.order;
                writerTemplate.add("index", index);

            if (i != 0) {
                writer += "outputFile.write(\"\\t\")\n";
            }
            writer += writerTemplate.render();
            if (i == selectList.columns.size() - 1) {
                writer += "outputFile.write(\"\\n\")\n";
            }
        }
        //adding place holders
        mainTemplate.add("location", table.location);
        mainTemplate.add("delimiter", table.delimiter);
        mainTemplate.add("field_list", all);
        mainTemplate.add("writer", writer);
        if (whereCondition == null) {
            mainTemplate.add("condition", "True");
        } else {
            mainTemplate.add("condition", whereCondition);
        }
        FileScanner.writeFileAsString(mainTemplate.render(), "E:\\\\compiler\\\\generated code\\\\mappers\\\\emmitMapper.py");
    }
 // public static generateJoinMapper (String outputPath , String firstTablePath , String secoundTablePath ,)
}
