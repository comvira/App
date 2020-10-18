package LectureSix.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        //вариант 1
/*        Iterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) { //пока есть элементы
            String val = iterator.next();
            System.out.println(val);
        }*/

        //вариант 2
        for (String val : list) {
            System.out.println(val);
        }

        //вариант 3
        System.out.println(list);

        //add in list
        list.add(2,"15");
        System.out.println(list);

        //remove in list item
        list.remove("2");
        System.out.println(list);

        //remove in list index
        list.remove(1);
        System.out.println(list);
    }
}
