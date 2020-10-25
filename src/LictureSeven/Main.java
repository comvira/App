package LictureSeven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

import static java.io.File.separatorChar;

public class Main {
    private static void InfoOperation(Boolean b) {
        if (b == true){
            System.out.println("Операция проведена.");
        } else {
            System.out.println("На счету не достаточно средств.");
        }
    }

    private static void InfoExit(){
        System.out.println("Для выхода введите 'exit'.");
    }

    public static void main(String[] args) {
        String typeOperation;
        String holder;
        int account = 0;
        double summa = 0.0;
        int recipient; // счёт получалеля

        /** у меня windows 10 пока, надеюсь если получится на Linux попробую
         перейти - диск внешний купил, Ubuntu поставил,
         но пока руки до неё не доходят - времяни нет :( работы хватает
         */
        Path p = Paths.get("C:", separatorChar + "temp", "bank", "Account.txt");
        Path parent = p.getParent();

        // тут проверяем наличие дирректории и если нет создаём
        File dir = new File(parent.toString());
        if (!dir.exists()) {
            dir.mkdirs();
        }

        File file = new File(p.toString());
        if (!file.exists()) {
            try {
                PrintWriter writer = new PrintWriter(file, "UTF-8");
                for (int i = 1; i <= 10; i++) {
                    writer.println(i + ";none;0.0000");
                }
                writer.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }

        String str;
        // String exit = "exit";
        Scanner in = new Scanner(System.in);
        String strarr;
        strarr = Arrays.toString(OperationType.values());
        System.out.println("Типы операций: " + strarr);
        InfoExit();

        while (in.hasNextLine()) {
            str = in.next();

            if(strarr.toLowerCase().contains(str.toLowerCase())) {
                System.out.println("Операция: " + str);
                        
                switch (str) {
                    case "WITHDRAW": typeOperation =str;
                        if (in.hasNextInt()){
                            account = in.nextInt();
                        }

                        if (in.hasNext()) {
                            try {
                                str = in.next();
                                str = str.replace(",", ".");

                                summa = -Double.parseDouble(str);
                            } catch (NumberFormatException e) {
                                System.err.println("Неверный формат суммы!");
                            }
                        }

                        System.out.println(typeOperation + " " + account + " " + summa);
                        summa = 0.0;
                        break;

                    case "BALANCE": typeOperation =str;

                        System.out.println(typeOperation);
                        break;

                    case "DEPOSIT": typeOperation =str;
                        if (in.hasNextInt()){
                            account = in.nextInt();
                        }

                        if (in.hasNext()) {
                            try {
                                str = in.next();
                                str = str.replace(",", ".");

                                summa = Double.parseDouble(str);
                            } catch (NumberFormatException e) {
                                System.err.println("Неверный формат суммы!");
                            }
                        }

                        System.out.println(typeOperation + " " + account + " " + summa);
                        summa = 0.0;
                        break;

                    case "TRANSFER": typeOperation =str;
                        if (in.hasNextInt()){
                            account = in.nextInt();
                        }

                        if (in.hasNextInt()){
                            recipient = in.nextInt();
                        }

                        if (in.hasNext()) {
                            try {
                                str = in.next();
                                str = str.replace(",", ".");

                                summa = Double.parseDouble(str);
                            } catch (NumberFormatException e) {
                                System.err.println("Неверный формат суммы!");
                            }
                        }

                        System.out.println(typeOperation + " " + account + " " + summa);
                        summa = 0.0;
                        break;

                    case "RENAMECLIENT": typeOperation =str;
                        if (in.hasNextInt()){
                            account = in.nextInt();
                        }

                        if (in.hasNext()){
                            holder = in.next();
                            System.out.println(typeOperation + " " + account + " " + holder);
                        }

                        break;
                }
            }

            if (str.equals("exit")) { // if (str.intern() == exit) {
                System.out.println("Работа завершена.");
                in.close();
                System.exit(0);
            }

            System.out.println(str);
        }
    }
}
