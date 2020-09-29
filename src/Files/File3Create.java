package Files;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class File3Create {
    public static void main(String[] args) {
        try {
            Formatter file = new Formatter("C:\\Data\\test.txt");
            file.format("%s %s", "test1", "2 \r \n");
            file.format("%s %s", "test2", "8");
            file.close();
            File f = new File("C:\\Data\\test.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }
}
