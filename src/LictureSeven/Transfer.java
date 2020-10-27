package LictureSeven;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.io.File.separatorChar;

public class Transfer implements Operation {
    @Override
    public void create() {
        String str;
        String acc = String.valueOf(Main.account);
        String rec = String.valueOf(Main.recipient);
        double sum = Main.summa;
        ArrayList<String> arrAcc = new ArrayList(); // account
        ArrayList<String> arrRec = new ArrayList(); // account получателя
        Path p = Paths.get("C:", separatorChar + "temp", "bank", "Account.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(p.toString()))) {

            while ((str = reader.readLine()) != null) {
                String[] arr = str.split(";");

                if (arr[0].equals(acc)) {
                    if (Double.parseDouble(arr[2]) >= sum) {
                        arr[2] = String.valueOf(Double.parseDouble(arr[2]) - sum);
                        arrAcc.add(0,arr[0] + ";" + arr[1] + ";" + arr[2]);
                        System.out.println(arr[0] + " остаток после перевода: " + arr[2]);
                        //System.out.println(arr[2]);
                    } else {
                        System.out.println("Не достаточно средств.");
                        return;
                    }
                } else {
                    arrAcc.add(0,arr[0] + ";" + arr[1] + ";" + arr[2]);
                }
            }
            //запись в файл:
            OverwriteFile.save(arrAcc);


            try (BufferedReader readerOut = new BufferedReader
                    (new FileReader(p.toString()))) {
                while ((str = readerOut.readLine()) != null) {
                    String[] arrOut = str.split(";");


                    if (arrOut[0].equals(rec)) {
                        arrOut[2] = String.valueOf(Double.parseDouble(arrOut[2]) + sum);
                        arrRec.add(0,arrOut[0] + ";" + arrOut[1] + ";" + arrOut[2]);
                        System.out.println(arrOut[0] + " приход: " + (Double.parseDouble(arrOut[2]) + sum));
                    } else {
                        arrRec.add(0,arrOut[0] + ";" + arrOut[1] + ";" + arrOut[2]);
                    }
                }
                //запись в файл:
                OverwriteFile.save(arrRec);
                readerOut.close();
                } catch (IOException exOut) {
                System.out.println(exOut);
            }
            reader.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
