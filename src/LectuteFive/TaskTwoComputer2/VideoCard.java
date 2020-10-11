package LectuteFive.TaskTwoComputer2;

public class VideoCard implements Computer {
    private String manufacture;
    private String memoryType;
    private int memorySize;
    private int frequency;
    private boolean cooling; //охлаждение(активное или пассивное)

    public VideoCard(String manufacture, String memoryType, int memorySize, int frequency, boolean cooling) {
        this.manufacture = manufacture;
        this.memoryType = memoryType;
        this.memorySize = memorySize;
        this.frequency = frequency;
        this.cooling = cooling;
    }

    public void createComputer() {
        System.out.println("Производитель: "+manufacture);
        System.out.println("Тип памяти: "+memoryType);
        System.out.println("Объём памяти: "+memorySize);
        System.out.println("Частота: "+frequency);
        System.out.println("Охлаждение(активное или пассивное): "+cooling);
    }
}
