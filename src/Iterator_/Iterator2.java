package Iterator_;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterator2 {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<String>();
        a.add("Fox");
        a.add("Cat");
        a.add("Dog");
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            String v = it.next();
            System.out.println(v);
        }
    }
}
