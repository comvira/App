package LectuteFive.TaskTwoCompurer2;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Какой компьютер собираем? " +
                Arrays.toString(CompType.values()));
        Scanner sc = new Scanner(System.in);
        CompType compType = null;

        Computer_Facade computer_Facade = new Computer_Facade();

        try {
            compType = CompType.valueOf(sc.nextLine());

        } catch (Exception e) {
            System.out.println("Нет такого типа компьютера");
            System.exit(0);
        }

        Monitor monitor = new Monitor("Sony");
        computer_Facade.setMonitor(monitor);
        Processor processor = new Processor("AMD",4,
                4,"A","AND");
        computer_Facade.setProcessor(processor);
        Memory memory = new Memory("Toshiba",8,4,"DDR");
        computer_Facade.setMemory(memory);
        VideoCard videoCard = new VideoCard("Intel","B",
                4,4,true);
        computer_Facade.setVideoCard(videoCard);
        Disk disk = new Disk("Toshiba",128,"SSD",4);
        computer_Facade.setDisk(disk);

        computer_Facade.setCompType(compType);

/*        System.out.println("ОЗУ:");
        memory.createComputer();

        System.out.println();

        System.out.println("Монитор:");
        monitor.createComputer();*/
        computer_Facade.createComputer();

    }
}
