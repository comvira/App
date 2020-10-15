package LectuteFive.TaskTwoCompurer2;

import LectuteFive.TaskTwoComputer.StrategyCooling;

public class CoolingContext {
    private LectuteFive.TaskTwoComputer.StrategyCooling strategyCooling;
    public CoolingContext(StrategyCooling strategyCooling) {
        this.strategyCooling = strategyCooling;
    }

    public String cooling() {
        return strategyCooling.cooling();
    }
}
