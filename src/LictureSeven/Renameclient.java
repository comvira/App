package LictureSeven;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.io.File.separatorChar;

public class Renameclient implements Operation{
    @Override
    public void create() {
        Path p = Paths.get("C:", separatorChar + "temp", "bank", "Account.txt");
        try(BufferedReader reader = new BufferedReader(new FileReader(p.toString()))){
            String str;
            String account = String.valueOf(Main.account);
            String holder = Main.holder;
            while((str = reader.readLine()) != null){
                String[] arr = str.split(";");

                if (arr[0].equals(account)) {
                    System.out.println((arr[1]) + " изменение имени на " + holder);
                }
            }

        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}