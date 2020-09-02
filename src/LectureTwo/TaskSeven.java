package LectureTwo;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = 10;
        int n = in.nextInt();
        switch (n) {
            case 905:
                System.out.println("«Москва. Стоимость разговора: " + m * 4.15 + "»");
                break;
            case 194:
                System.out.println("«Ростов. Стоимость разговора: " + m * 1.98 + "»");
                break;
            case 491:
                System.out.println("«Краснодар. Стоимость разговора: " + m * 2.69 + "»");
                break;
            case 800:
                System.out.println("«Киров. Стоимость разговора: " + m * 5.00 + "»");
                break;
            default:
                System.out.println("«Город не найден»");
        }
    }
}
