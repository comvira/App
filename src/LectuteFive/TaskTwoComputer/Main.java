package LectuteFive.TaskTwoComputer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Какой коммпьютер собираем? " +
                Arrays.toString(CompType.values()));
        Scanner sc = new Scanner(System.in);
        CompType compType = null;

        ComputerFacade computerFacade = new ComputerFacade();

        try {
            compType = CompType.valueOf(sc.nextLine());

        } catch (Exception e) {
            System.out.println("Нет такого типа компьютера");
            System.exit(0);
        }

        Processor processor = new Processor("AMD",4,5,"что-то","AMD");
        computerFacade.setProcessor(processor);

        Memory memory = new Memory("Toshiba",8,4,"DDR");
        computerFacade.setMemory(memory);

        VideoCard videoCard = new VideoCard("Intel","A",4,5,true);
        computerFacade.setVideoCard(videoCard);

        Disk disk = new Disk("Toshiba",255,"SSD",3);
        computerFacade.setDisk(disk);

        System.out.println("Введите марку монитора:");
        Monitor monitor = new Monitor(sc.nextLine());

        computerFacade.setCompType(compType);
        computerFacade.setMonitor(monitor);

        System.out.println();

        computerFacade.createComputer();
    }
}

