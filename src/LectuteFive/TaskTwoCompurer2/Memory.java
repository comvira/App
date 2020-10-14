package LectuteFive.TaskTwoCompurer2;

public class Memory extends Detail {
/*    private String manufacture;
    private int memorySize;*/
    private int frequency;
    private String memoryType;

    public Memory(String manufacture, int memorySize, int frequency, String memoryType) {
        super.manufacture = manufacture;
        super.memorySize = memorySize;
        this.frequency = frequency;
        this.memoryType = memoryType;
    }

    public void createComputer() {
        System.out.println("Производитель: "+super.manufacture);
        System.out.println("Объём памяти: "+super.memorySize);
        System.out.println("Частота: "+frequency);
        System.out.println("Тип памяти: "+memoryType);
    }
}
