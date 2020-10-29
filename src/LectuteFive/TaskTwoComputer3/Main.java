package LectuteFive.TaskTwoComputer3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Какой компьютер собираем? " +
                Arrays.toString(CompType.values()));
        Scanner sc = new Scanner(System.in);
        CompType compType = null;

        try {
            compType = CompType.valueOf(sc.nextLine());

        } catch (Exception e) {
            System.out.println("Нет такого типа компьютера :(");
            System.exit(0);
        }

        Computer computer = new Computer(compType.toString());
        Processor processor = new Processor("Core i3", "6Mb",
                "L3", "Intel tm", 4.3, 4);
        Memory memory = new Memory("ASUS", "4Gb",
                "DDR4", "ASUS", 2400.D);
        VideoCard videoCard = new VideoCard("Intel", "4Gb",
                "DDR", "MSI", CoolingType.Active);
        Disk disk = new Disk("Toshiba", "128Gb", "SSD",
                "Toshiba tm", 3.5);
        Monitor monitor = new Monitor("Philips tm");

        computer.setProcessor(processor);
        computer.setMemory(memory);
        computer.setVideoCard(videoCard);
        computer.setDisk(disk);
        computer.setMonitor(monitor);

        Detail anyComponent;
        DetailFactory detailfactory;
        detailfactory = new ProcessorFactory();
        anyComponent = detailfactory.createDetailPC();
        anyComponent.getComponentType();

        detailfactory = new MemoryFactory();
        anyComponent = detailfactory.createDetailPC();
        anyComponent.getComponentType();

        detailfactory = new VideoCardFactory();
        anyComponent = detailfactory.createDetailPC();
        anyComponent.getComponentType();

        detailfactory = new DiskFactory();
        anyComponent = detailfactory.createDetailPC();
        anyComponent.getComponentType();

        detailfactory = new MonitorFactory();
        anyComponent = detailfactory.createDetailPC();
        anyComponent.getComponentType();

        computer.getInfo();
    }
}
