package codeGeneration;
import org.stringtemplate.v4.ST;

import java.io.File;
public class ShuffleController
{

    String destenationPath ;
    public static void generateShufflers()
    {
        File mapperFolder = new File("E:\\compiler\\generated code\\mappers");
        int number = mapperFolder.listFiles().length;
        for (int i = 0; i < number; i++) {
           generateShuffler("E:\\\\compiler\\\\mapperOutput\\\\"+i+".csv","E:\\\\compiler\\\\shufflerOutput\\\\"+i+".csv",i);

        }

    }
    public  static  void generateShuffler(String inputFile , String outputFile, int fileName)
    {
        String s1 = FileScanner.readFileAsString("C:\\\\Users\\\\muzna\\\\Desktop\\\\4th\\\\compiler\\\\final\\\\final\\\\src\\\\codeGeneration\\\\templates\\\\shuffler.st");
        ST mainTemplate = new ST(s1);
        mainTemplate.add("inputFile",inputFile);
        mainTemplate.add("outputFile",outputFile);
        FileScanner.writeFileAsString(mainTemplate.render(), "E:\\\\compiler\\\\generated code\\\\shufflers\\\\" + fileName + ".py");

    }
}
