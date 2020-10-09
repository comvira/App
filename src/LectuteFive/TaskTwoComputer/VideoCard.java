package LectuteFive.TaskTwoComputer;

public class VideoCard {
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

    public String getManufacture() {
        return manufacture;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public int getFrequency() {
        return frequency;
    }

    public boolean isCooling() {
        return cooling;
    }
}
