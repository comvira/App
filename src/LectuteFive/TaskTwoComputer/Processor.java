package LectuteFive.TaskTwoComputer;

public class Processor implements NewComputer {
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

    public void createComputer() {
        System.out.println(clockFrequency);
        System.out.println(numCore);
        System.out.println(memorySize);
        System.out.println(name);
        System.out.println(manufacture);
    }
}
