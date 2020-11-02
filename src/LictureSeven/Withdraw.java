package LictureSeven;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.io.File.separatorChar;

public class Withdraw implements Operation {
    @Override
    public void create() {
        Path p = Paths.get("C:", separatorChar + "temp", "bank", "Account.txt");

        String str;
        String account = String.valueOf(Main.account);
        double sum = Main.summa;
        ArrayList<String> arrAcc = new ArrayList();

        try (BufferedReader reader = new BufferedReader(new FileReader(p.toString()))) {

            while ((str = reader.readLine()) != null) {
                String[] arr = str.split(";");

                if (arr[0].equals(account)) {
                    if (Double.parseDouble(arr[2]) >= sum) {
                        arr[2] = String.valueOf(Double.parseDouble(arr[2]) - sum);
                        arrAcc.add(0,arr[0] + ";" + arr[1] + ";" + arr[2]);
                        System.out.println(arr[0] + " остаток после вывода: " + arr[2]);
                    } else {
                        System.out.println("Не достаточно средств.");
                        return;
                    }
                } else {
                    arrAcc.add(0,arr[0] + ";" + arr[1] + ";" + arr[2]);
                }
            }

            OverwriteFile.save(arrAcc);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
