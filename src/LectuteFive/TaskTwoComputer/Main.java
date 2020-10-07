package LectuteFive.TaskTwoComputer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Какой коммпьютер собираем? " +
                "HOMELAPTOP, WORKLAPTOP, WORKSTATION, HOMESTATION, TABLET");
        Scanner sc = new Scanner(System.in);
        CompType compType = null;

        try {
            compType = CompType.valueOf(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Нет такого типа компьютера");
            System.exit(0);
        }

        Processor processor = new Processor();
        processor.setName("AMD");

        VideoCard videoCard = new VideoCard();
        videoCard.setManufacture("Intel");

        Disk disk = new Disk();
        disk.setManufacture("Toshiba");

        Memory memory = new Memory();
        memory.setManufacture("Toshiba");


        Monitor monitor = new Monitor();
        System.out.println("Введите марку монитора:");
        monitor.setManufacture(sc.nextLine());

        ComputerFacade computerFacade = new ComputerFacade();
        String s[] = computerFacade.createComputer();
        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
        System.out.println(compType);
    }
}

