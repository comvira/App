package List;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.remove("Blue");
        colors.remove(2);
        System.out.println(colors);
    }
}
