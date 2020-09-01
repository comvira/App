package LectureTwo;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            n = 10;
        } else {
            if (n > 0) {
                n += 1;
            } else {
                n -= 2;
            }
        }
        System.out.println(n);
    }
}
