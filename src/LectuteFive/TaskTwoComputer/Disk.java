package LectuteFive.TaskTwoComputer;

public class Disk implements NewComputer {
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

    public void createComputer() {
        System.out.println("Производитель: "+manufacture);
        System.out.println("Объём диска: "+memorySize);
        System.out.println("Тип диска: "+typeDisk);
        System.out.println("Форм-Фактор: "+formFactor);
    }
}
