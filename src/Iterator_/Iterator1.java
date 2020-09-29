package Iterator_;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterator1 {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<String>();
        a.add("Cat");
        a.add("Fox");
        a.add("Dog");
        a.add("Rabbit");
        Iterator<String> it = a.iterator();
        String v = it.next();
        System.out.println(v);
    }
}
