package LectureSix.gen.obj;

public class Pair<T, V> {
    private final T val1;
    private final V val2;

    public Pair(T val1, V val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public T getVal1() {
        return val1;
    }

    public V getVal2() {
        return val2;
    }
}
