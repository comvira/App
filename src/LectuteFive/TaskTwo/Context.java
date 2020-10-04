package LectuteFive.TaskTwo;

public class Context {
    private Strategy strategy;

    public Context() {
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void createComp(CompType arr) {
        strategy.createStringArray(arr);
    }
}
