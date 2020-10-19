package LectureSix.TaskOne;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String str;
        ArrayList list = new ArrayList();
        for (int i = 0; i <= 20; i++) {
            str = Integer.toString(i);
            list.add(str);
        }

        System.out.println(list.size());

        list.remove("3");
        list.remove(1);

        System.out.println(list.size());

        System.out.println(list);

        LinkedList lst = new LinkedList();

        for (int i = list.size()-1; i >= 0; i--) {
            lst.add(list.get(i));
        }

        System.out.println(lst);

        lst.clear();

        System.out.println(lst);
    }
}
