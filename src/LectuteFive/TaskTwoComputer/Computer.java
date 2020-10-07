package LectuteFive.TaskTwoComputer;

public class Computer {
    private String classComp;
    private Processor processor;
    private Memory memory;
    private VideoCard videoCard;
    private Disk disk;
    private Monitor monitor;

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
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

    public Computer(Processor processor, Memory memory, Disk disc, Monitor monitor) {
        this.processor = getProcessor();
        this.memory = getMemory();
        this.disk = getDisk();
        this.videoCard = getVideoCard();
        this.monitor = getMonitor();
    }
}
