package LictureSeven;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.io.File.separatorChar;

public class Transfer implements Operation {
    @Override
    public void create() {
        String str;
        String acc = String.valueOf(Main.account);
        String rec = String.valueOf(Main.recipient);
        double sum = Main.summa;
        Path p = Paths.get("C:", separatorChar + "temp", "bank", "Account.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(p.toString()))) {

            while ((str = reader.readLine()) != null) {
                String[] arr = str.split(";");

                if (arr[0].equals(acc)) {
                    if (Double.parseDouble(arr[2]) >= sum) {
                        System.out.println(sum);
                        System.out.println(arr[0] + " остаток послк перевода: " + (Double.parseDouble(arr[2]) - sum));
                    } else {
                        System.out.println("Не достаточно средств.");
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(p.toString()))) {
            while ((str = reader.readLine()) != null) {
                String[] arrOut = str.split(";");

                if (arrOut[0].equals(rec)) {
                    System.out.println(arrOut[0] + " приход: " + (Double.parseDouble(arrOut[2]) + sum));
                }
            }
        } catch (IOException ex){
            System.out.println(ex);
        }
    }
}
