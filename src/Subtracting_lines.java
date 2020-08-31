import java.util.Scanner;

public class Subtracting_lines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] in = scanner.nextLine().split(" ");
        StringBuilder postfix = new StringBuilder();
        for (int i = 0; i < in[1].length(); i++) {
            char c = in[1].charAt(i);
            if (in[0].indexOf(c) != -1)
                in[0] = in[0].replaceFirst("" + c, "");
            else
                postfix.append(c);
        }
        in[0] += postfix;
        System.out.println(in[0]);
    }
}
