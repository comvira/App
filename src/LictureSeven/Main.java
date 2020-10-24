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
        Path p = Paths.get("C:", separatorChar +"temp", "bank", "Account.txt");
        Path parent = p.getParent();

        // тут проверяем наличие дирректории и если нет создаём
        File file = new File(parent.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
