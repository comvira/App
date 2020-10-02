package LectuteFive.Strategy;

public class Context {
    private Strategy strategy;

    public Context() {
     }
     public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
     }

     public void sort(int[] arr) {
        strategy.sortIntArray(arr);
     }
}
