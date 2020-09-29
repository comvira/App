package Iterator_;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator3 {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            n.add(i);
        }
        int x = 0;
        Iterator<Integer> it = n.iterator();
        while (it.hasNext()) {
            x+= it.next();
        }
        System.out.println(x);
    }
}
