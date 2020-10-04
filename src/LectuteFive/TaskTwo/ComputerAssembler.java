package LectuteFive.TaskTwo;

public class ComputerAssembler {
    private Processor processor;
    private Memory memory;
    private VideoCard videoCard;
    private Disk disk;

    public  ComputerAssembler() {
        this.processor = new Processor();
        this.memory = new Memory();
        this.videoCard = new VideoCard();
        this.disk = new Disk();
    }

    public void getCreateComp() {
        processor.getClockFrequency();
        processor.getManufacture();
        processor.getMemorySize();
        processor.getName();
        processor.getNumCore();
        memory.getFrequency();
        memory.getManufacture();
        memory.getMemorySize();
        memory.getMemoryType();
        videoCard.getFrequency();
        videoCard.getManufacture();
        videoCard.getMemorySize();
        videoCard.getMemoryType();
        disk.getFormFactor();
        disk.getTypeDisk();
        disk.getManufacture();
        disk.getMemorySize();
    }
}
