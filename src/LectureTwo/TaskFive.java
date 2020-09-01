package LectureTwo;

import java.util.Arrays;
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        //тут мне показалось что, возможно к решению этой
        //задачи можно так. возможно не прав и можно проще
        Scanner in = new Scanner(System.in);
        int[] n = new int[3];
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
        }
        Arrays.sort(n);
        System.out.println(n[0]);
    }
}
