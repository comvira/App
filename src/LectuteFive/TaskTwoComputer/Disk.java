package LectuteFive.TaskTwoComputer;

public class Disk {
    private String manufacture;
    private int memorySize;
    private String typeDisk;
    private int formFactor;


    public Disk(String manufacture, int memorySize, String typeDisk, int formFactor) {
        this.manufacture = manufacture;
        this.memorySize = memorySize;
        this.typeDisk = typeDisk;
        this.formFactor = formFactor;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public String getTypeDisk() {
        return typeDisk;
    }

    public int getFormFactor() {
        return formFactor;
    }
}
