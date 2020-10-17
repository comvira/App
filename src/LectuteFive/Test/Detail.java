package LectuteFive.Test;

public abstract class Detail implements Computer{
    private String clockFrequency;
    private int numCore;
    private int memorySize;
    private String name;
    private String manufacture;
    private int frequency;
    private String memoryType;
    private boolean cooling; //охлаждение(активное или пассивное)
    private String typeDisk;
    private int formFactor;

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

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public boolean isCooling() {
        return cooling;
    }

    public void setCooling(boolean cooling) {
        this.cooling = cooling;
    }

    public String getTypeDisk() {
        return typeDisk;
    }

    public void setTypeDisk(String typeDisk) {
        this.typeDisk = typeDisk;
    }

    public int getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(int formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public void createComputer() {
    }
}
