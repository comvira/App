package LectuteFive.TaskTwoComputer;

public class CoolingContext {
    private StrategyCooling strategyCooling;
    public CoolingContext(StrategyCooling strategyCooling) {
        this.strategyCooling = strategyCooling;
    }

    public void setStrategyCooling() {
        strategyCooling.cooling();
    }

    public String cooling() {
        return strategyCooling.cooling();
    }
}
