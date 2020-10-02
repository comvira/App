package LectuteFive.Factory;

import java.util.Scanner;

public class FactoryRun {
    public static void main(String[] args) {
        System.out.println("Какой магазин открываем?");
        Scanner sc = new Scanner(System.in);
        StoreType type = null;

        try {
            type = StoreType.valueOf(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Нет такого магазина");
            System.exit(0);
        }

        StoreFactory factory = null;
        switch (type) {
            case TC5:
                factory = new TC5Factory();
                break;
            case TCX:
                factory = new TCXFactory();
                break;
            default:
        }
        if (factory != null) {
            Store store = factory.createStore();
            store.open();
        }
    }
}
