package LectuteFive.TaskTwoComputer;

public class Processor {

    private String clockFrequency;
    private int numCore;
    private int memorySize;
    private String name;
    private String manufacture;

    public String getClockFrequency() {
        return clockFrequency;
    }

    public void setClockFrequency(String clockFrequency) {
        this.clockFrequency = clockFrequency;
    }

    public int getNumCore() {
        return numCore;
    }

    public void setNumCore(int numCore) {
        this.numCore = numCore;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
}
