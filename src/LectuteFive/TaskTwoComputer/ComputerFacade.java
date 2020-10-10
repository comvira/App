package LectuteFive.TaskTwoComputer;

public  class ComputerFacade implements NewComputer {
    private Processor processor;
    private Memory memory;
    private VideoCard videoCard;
    private Disk disk;
    private Monitor monitor;
    private CompType compType;

    public ComputerFacade() {
        processor = new Processor("AMD",4,5,"что-то","AMD");
        memory = new Memory("Toshiba",8,4,"DDR");
        videoCard = new VideoCard("Intel","A",4,5,true);
        disk = new Disk("Toshiba",255,"SSD",3);
    }

    public void setCompType(CompType compType) {
        this.compType = compType;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void createComputer() {
        processor.createComputer();
        System.out.println();

        videoCard.createComputer();
        System.out.println();

        memory.createComputer();
        System.out.println();

        disk.createComputer();
        System.out.println();

        System.out.println(compType.toString());

        System.out.println(monitor.getManufacture());
    }
}
