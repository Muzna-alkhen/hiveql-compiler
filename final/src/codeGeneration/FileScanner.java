package codeGeneration;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
public class FileScanner {
    public static String readFileAsString(String fileName) {
        String text = "";
        try {
            text = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
    public static void writeFileAsString(String s, String path) {
        try (PrintStream out = new PrintStream(new FileOutputStream(path))) {
            out.print(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<File> getFiles(String path) {

        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        ArrayList<File> list = new ArrayList<>();
        for (File element:
             listOfFiles) {
            list.add(element);


        }

        return  list;
    }
}
