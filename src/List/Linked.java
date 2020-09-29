package List;

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> c = new LinkedList<String>();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.remove(1);
        c.remove("Green");
        System.out.println(c);
    }
}

