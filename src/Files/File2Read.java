package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File2Read {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Data\\test.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("not file");
        }
    }
}
