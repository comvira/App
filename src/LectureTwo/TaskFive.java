package LectureTwo;
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = in.nextInt(); //2147483647;
        int n;
        for (int i = 0; i < 2; i++) {
            n = in.nextInt();
            if (n < min) {
                min = n;
            }
        }
        System.out.println(min);
    }
}
