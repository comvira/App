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

        Detail anyComponent;
        Detail_Factory detail_factory;
        detail_factory = new Processor_Factory();
        anyComponent = detail_factory.createDetailPC();
        anyComponent.getComponentType();

        detail_factory = new Memory_Factory();
        anyComponent = detail_factory.createDetailPC();
        anyComponent.getComponentType();

        detail_factory = new VideoCard_Factory();
        anyComponent = detail_factory.createDetailPC();
        anyComponent.getComponentType();

        detail_factory = new Disk_Factory();
        anyComponent = detail_factory.createDetailPC();
        anyComponent.getComponentType();

        detail_factory = new Monitor_Factory();
        anyComponent = detail_factory.createDetailPC();
        anyComponent.getComponentType();

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

        computer.getInfo();
    }
}
