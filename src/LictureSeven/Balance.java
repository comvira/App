package LictureSeven;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.io.File.separatorChar;

public class Balance implements Operation{
    @Override
    public void create(int account) {
        Path p = Paths.get("C:", separatorChar + "temp", "bank", "Account.txt");
        try(BufferedReader reader = new BufferedReader(new FileReader(p.toString()))){
            String str;
            String acc = String.valueOf(account);
            while((str = reader.readLine()) != null){
                String[] arr = str.split(";");

                if (arr[0].equals(acc)) {
                    System.out.println(arr[2]);
                }
            }

        } catch (IOException ex){
            ex.printStackTrace();
        }
        System.out.println("Balance");
    }
}
