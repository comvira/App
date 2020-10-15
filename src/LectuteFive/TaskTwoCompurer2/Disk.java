package LectuteFive.TaskTwoCompurer2;

public class Disk extends Detail {
    //private String manufacture;
    //private int memorySize;
    private String typeDisk;
    private int formFactor;

    public Disk(String manufacture, int memorySize, String typeDisk, int formFactor) {
        super.manufacture = manufacture;
        super.memorySize = memorySize;
        this.typeDisk = typeDisk;
        this.formFactor = formFactor;
    }

    @Override
    public void createComputer() {
        System.out.println("Производитель: "+manufacture);
        System.out.println("Объём диска: "+memorySize);
        System.out.println("Тип диска: "+typeDisk);
        System.out.println("Форм-Фактор: "+formFactor);
    }
}