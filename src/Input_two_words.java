import java.util.Scanner;

public class Input_two_words {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int diff = s1.compareTo(s2);
        if (diff < 0) {
            System.out.println(s1);
        } else if (diff > 0) {
            System.out.println(s2);
        }
    }
}
