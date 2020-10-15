package LectuteFive.TaskTwoCompurer2;

public class Computer_Facade implements Computer{
    private Processor processor;
    private Memory memory;
    private Disk disk;
    private VideoCard videoCard;
    private Monitor monitor;
    private CompType compType;

    public void setProcessor(Processor processor){
        this.processor= processor;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public void setCompType(CompType compType) {
        this.compType = compType;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void createComputer() {
        System.out.println("Процессор:");
        processor.createComputer();
        System.out.println();

        System.out.println("Видеокарта:");
        videoCard.createComputer();
        System.out.println();

        System.out.println("ОЗУ:");
        memory.createComputer();
        System.out.println();

        System.out.println("Диск:");
        disk.createComputer();
        System.out.println();

        System.out.println("Тип компьютера: "+compType.toString());

        System.out.println("Монитор: "+monitor.getManufacture());
    }
}
