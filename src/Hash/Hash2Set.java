package Hash;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hash2Set {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<String>();
        s.add("A");
        s.add("B");
        s.add("C");
        //new LinkedHashSet(s);// тут непонятка пока
        System.out.println(s);
        System.out.println(s.size());
    }
}
