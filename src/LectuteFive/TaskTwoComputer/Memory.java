package LectuteFive.TaskTwoComputer;

public class Memory implements NewComputer{
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

    public void createComputer() {
        System.out.println(manufacture);
        System.out.println(memorySize);
        System.out.println(frequency);
        System.out.println(memoryType);
    }
}
