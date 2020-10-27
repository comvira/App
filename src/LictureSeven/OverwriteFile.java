package LictureSeven;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.io.File.separatorChar;

public class OverwriteFile {
    public static void save(ArrayList<String> arr){
        Path p = Paths.get("C:", separatorChar + "temp", "bank", "Account.txt");
        File file = new File(p.toString());
        try(PrintWriter writer = new PrintWriter(file, "UTF-8")){
            for (int i = 0; i < arr.size(); i++) {
                writer.println(arr.get(i));
               // writer.write(arr.get(i));
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
