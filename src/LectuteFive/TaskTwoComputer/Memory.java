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
        System.out.println("Производитель: "+manufacture);
        System.out.println("Объём памяти: "+memorySize);
        System.out.println("Частота: "+frequency);
        System.out.println("Тип памяти: "+memoryType);
    }
}
