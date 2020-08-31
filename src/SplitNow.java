import java.util.*;

public class SplitNow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String [] str = s.split(" ");
        for (int i = 0; i < str.length; i++){
            if (i == 0) {
                System.out.println(str[i] + ":");
            } else {
                if (i > 1) System.out.println(str[1]+str[i].replace(",",""));
            }
        }
    }
}