package LectuteFive.TaskTwoComputer2;

public class Processor implements Computer {
    private String clockFrequency;
    private int numCore;
    private int memorySize;
    private String name;
    private String manufacture;

    public Processor(String clockFrequency, int numCore, int memorySize,
                     String name, String manufacture) {
        this.clockFrequency = clockFrequency;
        this.numCore = numCore;
        this.memorySize = memorySize;
        this.name = name;
        this.manufacture = manufacture;
    }

    public void createComputer() {
        System.out.println("Частота: "+clockFrequency);
        System.out.println("Кол-во ядер: "+numCore);
        System.out.println("Размер памяти: "+memorySize);
        System.out.println("Наименование: "+name);
        System.out.println("Производитель: "+manufacture);
    }
}
