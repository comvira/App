package Files;

import java.util.Formatter;

public class File3Create {
    public static void main(String[] args) {
        try {
            Formatter file = new Formatter("C:\\Data\\test.txt");
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }
}
