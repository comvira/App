package LectuteFive.TaskTwo;

public class Computer {
    private String classComp;
    private Processor processor;
    private Memory memory;
    private VideoCard videoCard;
    private Disk disk;
    private Monitor monitor;

    public String getClassComp() {
        return classComp;
    }

    public void setClassComp(String classComp) {
        this.classComp = classComp;
    }

    public Monitor getMonitor() {
        return monitor;
    }


    public Computer(Processor processor, Memory memory, Disk disc) {
        this.processor = processor;
        this.memory = memory;
        this.disk = disk;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public Disk getDisk() {
        return disk;
    }
}
