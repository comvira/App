package LectureTwo;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s;
        if (n == 0){
            s= "\"нулевое число\"";

        } else {
            if (n > 0) {
                s = "\"положительное ";
            } else {
                s = "\"отрицательное ";
            }
            if (n % 2 == 0) {
                s += "четное число\"";
            } else {
                s += "нечетное число\"";
            }
        }
        System.out.println(s);

    }
}
