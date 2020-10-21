package LectuteFive.Test;

public class Processor_Factory implements Detail{
    private int clockFrequency;
    private int numCore;
    private int memorySize;
    private String name;
    private String manufacture;

    public Processor_Factory(int clockFrequency, int numCore,
                             int memorySize, String name, String manufacture) {
        this.clockFrequency = clockFrequency;
        this.numCore = numCore;
        this.memorySize = memorySize;
        this.name = name;
        this.manufacture = manufacture;
    }
    public Detail createDetail(Processor_Enum processor) {
        Detail toReturn = null;

        switch (processor) {
            case INTEL:
                toReturn = new Processor(clockFrequency,numCore,memorySize,"INTEL",manufacture);
                break;
            case AMD:
                toReturn = new Processor(clockFrequency,numCore,memorySize,"AMD",manufacture);
                break;
        }
        return toReturn;
    }

    public void getInfo() {
        System.out.println();
        System.out.println("Процессор:");
        System.out.println("Частота: "+clockFrequency);
        System.out.println("Кол-во ядер: "+numCore);
        System.out.println("Размер памяти: "+memorySize);
        System.out.println("Наименование: "+name);
        System.out.println("Производитель: "+manufacture);
    }
}
