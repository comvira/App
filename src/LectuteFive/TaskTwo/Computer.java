package LectuteFive.TaskTwo;

public class Computer {
    private String monitor;
    private String classComp;
    private Processor processor;
    private Memory memory;
    private VideoCard videoCard;
    private Disk disk;

    public String getClassComp() {
        return classComp;
    }

    public void setClassComp(String classComp) {
        this.classComp = classComp;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public Computer(Processor processor, Memory memory, Disk disc) {
        this.processor = processor;
        this.memory = memory;
        this.disk = disk;
    }
}
