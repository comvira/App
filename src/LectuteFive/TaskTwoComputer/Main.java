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

        Processor processor = new Processor("AMD",4,5,"что-то","AMD");

        VideoCard videoCard = new VideoCard("Intel","A",4,5,true);

        Disk disk = new Disk("Toshiba",255,"SSD",3);

        Memory memory = new Memory("Toshiba",8,4,"DDR");


        System.out.println("Введите марку монитора:");
        Monitor monitor = new Monitor(sc.nextLine());


        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.(compType);
        String s[] = computerFacade.createComputer();
        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }

        System.out.println(monitor.getManufacture());

        System.out.println(compType);
    }
}

