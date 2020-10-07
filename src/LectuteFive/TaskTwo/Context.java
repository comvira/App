package LectuteFive.TaskTwo;

public class Context {

    private Strategy strategy;
    public Context() {
    }
    public void setStrategy(ComputerFacade strategy) {
        this.strategy = (Strategy) strategy;
    }
    public ComputerAssembler setStrategy;
    public void createComp(CompType arr) {
        strategy.createStringArray(arr);
    }
}
