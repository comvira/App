package LictureSeven;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.io.File.separatorChar;

public class Withdraw implements Operation {
    @Override
    public void create() {
        Path p = Paths.get("C:", separatorChar + "temp", "bank", "Account.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(p.toString()))) {
            String str;
            String acc = String.valueOf(Main.account);
            double sum = Main.summa;
            while ((str = reader.readLine()) != null) {
                String[] arr = str.split(";");

                if (arr[0].equals(acc)) {
                    if (Double.parseDouble(arr[2]) >= sum) {
                        System.out.println(sum);
                        System.out.println(Double.parseDouble(arr[2]) - sum);
                    } else {
                        System.out.println("Не достаточно средств.");
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
