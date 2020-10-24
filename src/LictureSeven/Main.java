package LictureSeven;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.io.File.separatorChar;

public class Main {
    public static void main(String[] args) {
        /** у меня windows 10 пока, надеюсь если получится на Linux попробую
        перейти - диск внешний купил, Ubuntu поставил,
        но пока руки до неё не доходят - времяни нет :( работы хватает
        */
        Path p = Paths.get("C:", "/temp", "bank", "Account.txt");
        Path parent = p.getParent();

        File file = new File(parent.toString());
        if (!file.exists()) {
            if (file.mkdirs()) {
                System.out.println("Directory is created!");
            } else {
                System.out.println("Failed to create directory!");
            }
        }

/*        System.out.println(parent.getParent());
        if (!File.exists(parent.getParent())) {
            new File("C:/"  + parent.getParent()).mkdir();
        }
        if (! File.exists(p.getParent())) {
            new File("C:" + separatorChar + p.getParent()).mkdir();
        }*/
    }
}
