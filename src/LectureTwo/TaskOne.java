package LectureTwo;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //возможно не самое лучшее решение, но мне показалось
        //что для решения данной задачи - оптимально
        //возможно - не прав
        String s = in.nextLine();
        System.out.println(s.charAt(s.length()-1));
    }
}
