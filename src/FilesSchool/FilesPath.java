package FilesSchool;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesPath {
    public static void main(String[] args) {
        Path p = Paths.get("C:/Temp", "afilatov", "test.txt");
        Path parent = p.getParent(); //путь /home/yyy
        Path file = p.getFileName(); //путь myProg.properties
        Path root = p.getRoot(); //путь /

        System.out.println(p);
        System.out.println(parent);
        System.out.println(parent.getParent());
        System.out.println(parent.getParent().getParent());
        System.out.println(file);
        System.out.println(root);

        try(BufferedReader reader = new BufferedReader(new FileReader(p.toString()))){
            String str;
            while((str = reader.readLine()) != null){
                System.out.println(str);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
