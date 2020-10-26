package LictureSeven;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.io.File.separatorChar;

public class Deposit implements Operation{
    @Override
    public void create() {
        Path p = Paths.get("C:", separatorChar + "temp", "bank", "Account.txt");
        try(BufferedReader reader = new BufferedReader(new FileReader(p.toString()))){
            String str;
            String account = String.valueOf(Main.account);
            double sum = 0.0;
            while((str = reader.readLine()) != null){
                String[] arr = str.split(";");

                if (arr[0].equals(account)) {
                    System.out.println(Double.parseDouble(arr[2]) + Main.summa);
                }
            }

        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}