package LectureTwo;
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = (int) 1e9;
        int n;
        for (int i = 0; i < 3; i++) {
            n = in.nextInt();
            if (n < min) {
                min = n;
            }
        }
        System.out.println(min);
    }
}
