package LectureTwo;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            System.out.println(n + 1);
        } else {
            System.out.println(n);
        }
    }
}
