package Sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortInt {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(3);
        n.add(55);
        n.add(1);
        n.add(44);
        Collections.sort(n);
        System.out.println(n);
    }
}