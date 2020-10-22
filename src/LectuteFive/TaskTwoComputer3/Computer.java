package LectuteFive.TaskTwoComputer3;

public class Computer implements NewComputer {
    private Processor processor;
    private Memory memory;
    private VideoCard videoCard;
    private Disk disk;
    private Monitor monitor;
    private String name;

    public Computer(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setProcessor(Processor processor){
        this.processor=processor;
    }

    public void setMemory(Memory memory){
        this.memory=memory;
    }

    public void setVideoCard(VideoCard videoCard){
        this.videoCard=videoCard;
    }

    public void setDisk(Disk disk){
        this.disk=disk;
    }

    public void setMonitor(Monitor monitor){
        this.monitor=monitor;
    }

    @Override
    public void getInfo() {
        System.out.println("Тип компьютера: " + this.getName());
        System.out.println();

        System.out.println("Производитель монитора: " + monitor.getManufacturer());
        System.out.println();

        System.out.println(processor.getComponentType() + ":");
        System.out.println("Наименование: " + processor.getName());
        System.out.println("Частота: " + processor.getCpuSpeed());
        System.out.println("Кол-во ядер: " + processor.getCpuNumCores());
        System.out.println("Производитель: " + processor.getManufacturer());
        System.out.println("Тип памяти: " + processor.getTypeMemory());
        System.out.println("Кеш: " + processor.getVolumeMemory());
        System.out.println();

        System.out.println(memory.getComponentType() + ":");
        System.out.println("Наименование: " + memory.getName());
        System.out.println("Производитель: " + memory.getManufacturer());
        System.out.println("Тип памяти: " + memory.getTypeMemory());
        System.out.println("Объём: " + memory.getVolumeMemory());
        System.out.println("Скорость: " + memory.getMemorySpeed());
        System.out.println();

        System.out.println(videoCard.getComponentType() + ":");
        System.out.println("Наименование: " + videoCard.getName());
        System.out.println("Производитель: " + videoCard.getManufacturer());
        System.out.println("Тип памяти: " + videoCard.getTypeMemory());
        System.out.println("Объём: " + videoCard.getVolumeMemory());
        System.out.println("Скорость: " + videoCard.getCoolingType());
        System.out.println();

        System.out.println(disk.getComponentType() + ":");
        System.out.println("Наименование: " + disk.getName());
        System.out.println("Производитель: " + disk.getManufacturer());
        System.out.println("Тип памяти: " + disk.getTypeMemory());
        System.out.println("Объём: " + disk.getVolumeMemory());
        System.out.println("Скорость: " + disk.getformFactor());

        System.out.println();
        System.out.println("Готово :\\");
    }
}
