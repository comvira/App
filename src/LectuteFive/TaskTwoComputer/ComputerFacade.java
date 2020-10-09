package LectuteFive.TaskTwoComputer;

public class ComputerFacade implements NewComputer {
    private Processor processor;
    private Memory memory;
    private VideoCard videoCard;
    private Disk disk;
    private Monitor monitor;
    private CompType compType;

    public ComputerFacade() {
        this.processor = processor;
        this.memory = memory;
        this.videoCard = videoCard;
        this.disk = disk;
        this.monitor = monitor;
        this.compType = compType;


    }

/*    public void setCompType(CompType compType) {
        this.compType = compType;
    }*/

    public String[] createComputer() {
        String[] arr = new String[19];
        arr[0] = processor.getClockFrequency();
        arr[1] = processor.getManufacture();
        arr[2] = String.valueOf(processor.getMemorySize());
        arr[3] = processor.getName();
        arr[4] = String.valueOf(processor.getNumCore());
        arr[5] = String.valueOf(memory.getFrequency());
        arr[6] = memory.getManufacture();
        arr[7] = String.valueOf(memory.getMemorySize());
        arr[8] = memory.getMemoryType();
        arr[9] = String.valueOf(videoCard.getFrequency());
        arr[10] = videoCard.getManufacture();
        arr[11] = String.valueOf(videoCard.getMemorySize());
        arr[12] = videoCard.getMemoryType();
        arr[13] = String.valueOf(disk.getFormFactor());
        arr[14] = disk.getTypeDisk();
        arr[15] = disk.getManufacture();
        arr[16] = String.valueOf(disk.getMemorySize());
        arr[17] = monitor.getManufacture();
        arr[18] = this.compType.toString();
        return arr;
    }
}
