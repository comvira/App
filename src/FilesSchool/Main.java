package FilesSchool;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path p = Paths.get("/home", "afila", "test.txt");
        Path parent = p.getParent(); //путь /home/yyy
        Path file = p.getFileName(); //путь myProg.properties
        Path root = p.getRoot(); //путь /

        System.out.println(p);
        System.out.println(parent);
        System.out.println(file);
        System.out.println(root);

        Charset charset = Charset.forName("UTF-8");

        try(BufferedReader reader = new BufferedReader(new FileReader(p.toString()))){
            String str = reader.readLine();
            System.out.println(str);
        } catch(IOException ex){
            ex.printStackTrace();
        }

        System.exit(0);

        try (InputStream in = new FileInputStream(p.toString())) {
            int x = -1;

            while ((x = in.read()) != -1) {
                System.out.println((char) x);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        byte[] bytes = new byte[0];
        try {
            bytes = Files.readAllBytes(p);
            String content = new String(bytes, charset);
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
                System.out.println(e);
        }

    }
}
