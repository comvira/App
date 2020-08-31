import java.util.*;


public class Words_a_through_h {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String [] str = s.split(" ");
        char n;
        String a = "a";
        String A = "A";
        String h = "h";
        String H = "H";
        for (int i = 0; i < str.length; i++){
            n =  str[i].charAt(0);
            if ((n>= a.charAt(0) && n<=h.charAt(0) ||
                    (n>=A.charAt(0) && n<=H.charAt(0)))) {
                System.out.println(str[i]);
            }
        }
    }
}
