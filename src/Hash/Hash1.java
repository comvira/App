package Hash;

import java.util.HashMap;

public class Hash1 {
    public static void main(String[] args) {
        HashMap<String, Integer> p = new HashMap<String, Integer>();
        p.put("A", 1);
        p.put("B", 2);
        p.put("C", 3);
        System.out.println(p.get("B")); // тут работает по первому параметру
        // по второму типа 2 нет!
    }
}
