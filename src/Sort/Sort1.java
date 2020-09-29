package Sort;

import java.util.ArrayList;
import java.util.Collections;

public class Sort1 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Cat");
        a.add("Tiger");
        a.add("Snake");
        a.add("Dog");
        Collections.sort(a);
        System.out.println(a);
    }
}
