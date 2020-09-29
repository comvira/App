package List;

import java.util.LinkedList;

public class Linked2 {
    public static void main(String[] args) {
        LinkedList<String> c = new LinkedList<String>();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Orange");

        for (String s: c) {
            System.out.println(s);
        }
    }
}
