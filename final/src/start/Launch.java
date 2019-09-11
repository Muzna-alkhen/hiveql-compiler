package start;
import ast.*;
import datatype.Column;
import datatype.DataType;
import datatype.DataTypes;
import executor.ExecuotorController;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.HQLLexer;
import parser.HQLParser;
import parser.MyErrorListener;
import parser.MyVisitor;
import symbolTable.Scope;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
public class Launch implements Serializable {
    public static DataTypes main_data_types = new DataTypes();
    public static Scope main_scope = new Scope(null);
    public static Scope temp_scope = new Scope(null);
    public static Node temp_ast = new Node();
    public static ProgramNode main_ast = new ProgramNode("program", false, null, new ArrayList<>());
    public static File file = new File("input.txt");
    public static byte[] encoded;
    static {
        try {
            encoded = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String input =  new String(encoded, Charset.forName("UTF-8"));
    public static HQLLexer lexer = new HQLLexer(new ANTLRInputStream(input));
    public static CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    public static HQLParser parser = new HQLParser(tokenStream);
    public static MyErrorListener mel = new MyErrorListener();
    public static ParseTree tree = parser.program();
    public static MyVisitor mv = new MyVisitor();
    public Launch() throws IOException {
    }
    public static void main(String[] args) {
        try {
            main_data_types.writeDataTypes();
            main_data_types.readDataTypes();
            temp_scope = main_scope;
            temp_ast = main_ast;
            parser.removeErrorListeners(); // remove ConsoleErrorListener
            parser.addErrorListener(mel); // add ours
            mv.visit(tree);
        //    System.out.println("SYMBOL TABLE:");
        //    main_scope.print(1);
        //  System.out.println("-----------------------------------------");
             main_ast.print(1);
        //     System.out.println("MAIN AST POINTER IS : " + Launch.temp_ast.name);
            System.out.println(main_data_types);
            generatePythonCode();
            ExecuotorController.execute();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void init() {
        //set simple data types
        DataType d1 = new DataType("Int", "", "");
        DataType d2 = new DataType("Real", "", "");
        DataType d3 = new DataType("Bool", "", "");
        DataType d4 = new DataType("String", "", "");
        d1.columns = new ArrayList<>();
        d2.columns = new ArrayList<>();
        d3.columns = new ArrayList<>();
        d4.columns = new ArrayList<>();
        //student table
        Column id = new Column("id", "Int",0);
        Column name = new Column("name", "String",1);
        Column age = new Column("age", "Int",2);
        Column address = new Column("address", "String",3);
        DataType student = new DataType("Student", ",", "E:\\\\compiler\\\\data\\\\Student");
        student.addColumn(id);
        student.addColumn(name);
        student.addColumn(age);
        student.addColumn(address);
        //marks table
        Column subjectName = new Column("subjectName", "String",0);
        Column studentId = new Column("studentId", "Int",1);
        Column value = new Column("value","Real",2);
        DataType marks = new DataType("Marks", "|", "E:\\\\compiler\\\\data\\\\Marks");
        marks.addColumn(subjectName);
        marks.addColumn(studentId);
        marks.addColumn(value);
        Launch.main_data_types.set(d1);
        Launch.main_data_types.set(d2);
        Launch.main_data_types.set(d3);
        Launch.main_data_types.set(d4);
        Launch.main_data_types.set(student);
        Launch.main_data_types.set(marks);

    }

    public static void generatePythonCode() throws IOException {
        codeGeneration.MapperController.generateMappers();
        codeGeneration.ShuffleController.generateShufflers();
        codeGeneration.ReducerController.generateReducers();

    }
}