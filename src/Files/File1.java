package Files;

import java.io.File;

public class File1 {
    public static void main(String[] args) {
        File file = new File("C:\\Data\\test.txt");
        if (file.exists()) {
            System.out.println(file.getName() + " файл найден");
        }
        else {
            System.out.println("not file");
        }
    }
}
