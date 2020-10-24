package FilesSchool;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import static java.io.File.*;

public class Saver {
    public static void main(String[] args) {
        System.out.println(separatorChar);// win - \ Unix - /
        System.out.println(pathSeparatorChar);// win - ; Unix - :
        System.out.println(pathSeparator);
        try(PrintWriter writer = new PrintWriter(new FileWriter("C:/Temp/afilatov/test.txt"))){
            writer.println("test тест");
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
