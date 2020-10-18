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

        Iterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) { //пока есть элементы
            String val = iterator.next();
            System.out.println(val);
        }
    }
}
