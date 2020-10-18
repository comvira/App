package LectureSix.gen.generic_interface;

import LectureSix.gen.generic_interface.Pair;

public class PairString implements Pair <String, String> {
    private final String val1;
    private final String val2;

    public PairString(String val1, String val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    @Override
    public String getVal1() {
        return val1;
    }

    @Override
    public String getVal2() {
        return val2;
    }
}