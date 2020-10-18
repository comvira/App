package LectureSix.gen.generic;

public class Pair<Z, O> {
    private final Z val1;
    private final O val2;

    public Pair(Z val1, O val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public Z getVal1() {
        return val1;
    }

    public O getVal2() {
        return val2;
    }
}
