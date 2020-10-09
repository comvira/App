package LectuteFive.TaskTwoComputer;

public class Processor {

    private String clockFrequency;
    private int numCore;
    private int memorySize;
    private String name;
    private String manufacture;


    public Processor(String clockFrequency, int numCore, int memorySize, String name, String manufacture) {
        this.clockFrequency = clockFrequency;
        this.numCore = numCore;
        this.memorySize = memorySize;
        this.name = name;
        this.manufacture = manufacture;
    }

    public String getClockFrequency() {
        return clockFrequency;
    }

    public int getNumCore() {
        return numCore;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public String getName() {
        return name;
    }

    public String getManufacture() {
        return manufacture;
    }
}
