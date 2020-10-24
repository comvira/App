package FilesSchool;

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


    }
}
