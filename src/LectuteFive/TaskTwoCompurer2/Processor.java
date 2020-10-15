package LectuteFive.TaskTwoCompurer2;

public class Processor extends Detail {
    private String clockFrequency;
    private int numCore;
    //private int memorySize;
    private String name;
    //private String manufacture;

    public Processor(String clockFrequency, int numCore, int memorySize,
                     String name, String manufacture) {
        this.clockFrequency = clockFrequency;
        this.numCore = numCore;
        super.memorySize = memorySize;
        this.name = name;
        super.manufacture = manufacture;
    }

    public void createComputer() {
        System.out.println("Частота: "+clockFrequency);
        System.out.println("Кол-во ядер: "+numCore);
        System.out.println("Размер памяти: "+memorySize);
        System.out.println("Наименование: "+name);
        System.out.println("Производитель: "+manufacture);
    }
}
