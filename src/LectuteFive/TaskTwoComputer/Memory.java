package LectuteFive.TaskTwoComputer;

public class Memory {
    private String manufacture;
    private int memorySize;
    private int frequency;
    private String memoryType;

    public Memory(String manufacture, int memorySize, int frequency, String memoryType) {
        this.manufacture = manufacture;
        this.memorySize = memorySize;
        this.frequency = frequency;
        this.memoryType = memoryType;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public int getFrequency() {
        return frequency;
    }

    public String getMemoryType() {
        return memoryType;
    }
}
