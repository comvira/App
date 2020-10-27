package LictureSeven;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.io.File.separatorChar;

public class Renameclient implements Operation {
    @Override
    public void create() {
        Path p = Paths.get("C:", separatorChar + "temp", "bank", "Account.txt");

        String str;
        String account = String.valueOf(Main.account);
        String name = Main.holder;
        ArrayList<String> arrAcc = new ArrayList(); // account

        try (BufferedReader reader = new BufferedReader(new FileReader(p.toString()))) {

            while ((str = reader.readLine()) != null) {
                String[] arr = str.split(";");

                if (arr[0].equals(account)) {
                    arr[1] = name;
                    arrAcc.add(0, arr[0] + ";" + arr[1] + ";" + arr[2]);
                    System.out.println(arr[1] + " - это новое имя клиета по счёту: " + arr[0] + " установлено");
                } else {
                    arrAcc.add(0, arr[0] + ";" + arr[1] + ";" + arr[2]);
                }
            }
            //запись в файл:
            OverwriteFile.save(arrAcc);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}