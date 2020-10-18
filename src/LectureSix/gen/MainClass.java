package LectureSix.gen;


import LectureSix.gen.obj.Pair;

public class MainClass {
    public static void main(String[] args) {
        PairSupplier supplier = new PairSupplier();
        Pair<Integer, String> intStringPair = supplier.getIntStringPair();

        Pair<String, String> strStringPair =  new Pair<>("a","b");
        use(strStringPair.getVal1());
        use(strStringPair.getVal2());

        Integer integerVal = intStringPair.getVal1();
        String stringVal = intStringPair.getVal2();

        intStringPair = null;

        use(integerVal);
        use(stringVal);
    }

/*    private static <T> void use(T val) {
        System.out.println(val);
    }*/

    private static <O> void use(O val) {
        System.out.println(val);
    }

    /*private static <O extends Number> void use(O val) {//для проверки на этапе компиляции
        System.out.println(val);
    }*/
}

class PairSupplier {
    public Pair getIntPair() {
        Pair pairInt = new Pair(10, 20);
        return pairInt;
    }

    public Pair getStringPair() {
        Pair pairString = new Pair("A", "B");
        return pairString;
    }

/*    public PairIntString getIntStringPair() {
        PairIntString stringValue = new PairIntString(10, "A");
        return stringValue;
    }*/

    public Pair<Integer, String> getIntStringPair() {
        Pair<Integer, String> stringValue = new Pair(10, "A");
        return stringValue;
    }
}
