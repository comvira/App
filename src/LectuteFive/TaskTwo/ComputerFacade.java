package LectuteFive.TaskTwo;

public class ComputerFacade {
    private Processor processor;
    private Memory memory;
    private VideoCard videoCard;
    private Disk disk;

    public ComputerFacade() {
        processor = new Processor();
        memory = new Memory();
        videoCard = new VideoCard();
        disk = new Disk();
    }

    public void createComputer() {
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
