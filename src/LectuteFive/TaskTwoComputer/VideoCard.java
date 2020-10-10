package LectuteFive.TaskTwoComputer;

public class VideoCard implements NewComputer{
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
        System.out.println(manufacture);
        System.out.println(memoryType);
        System.out.println(memorySize);
        System.out.println(frequency);
        System.out.println(cooling);
    }
}
