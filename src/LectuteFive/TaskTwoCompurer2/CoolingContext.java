package LectuteFive.TaskTwoCompurer2;

public class CoolingContext {
    private StrategyCooling strategyCooling;
    public CoolingContext(StrategyCooling strategyCooling) {
        this.strategyCooling = strategyCooling;
    }

    public String cooling() {
        return strategyCooling.cooling();
    }
}
