package LectuteFive.TaskTwoComputer;

public class CoolingContext {
    private StrategyCooling strategyCooling;
    public CoolingContext(StrategyCooling strategyCooling) {
        this.strategyCooling = strategyCooling;
    }

    public String cooling() {
        return strategyCooling.cooling();
    }
}
