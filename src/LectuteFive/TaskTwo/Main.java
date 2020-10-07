package LectuteFive.TaskTwo;

import LectuteFive.Behavioral.Strategy.QuickSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Какой коммпьютер собираем? " +
                "HOMELAPTOP, WORKLAPTOP, WORKSTATION, HOMESTATION, TABLET");
        Scanner sc = new Scanner(System.in);
        CompType type = null;

        try {
            type = CompType.valueOf(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Нет такого типа компьютера");
            System.exit(0);
        }

        //ArrayList arr = new ArrayList();

        Processor processor = new Processor();
        processor.setName("AMD");

        VideoCard videoCard = new VideoCard();
        videoCard.setManufacture("Intel");

        Disk disk = new Disk();
        disk.setManufacture("Toshiba");

        Memory memory = new Memory();
        memory.setManufacture("Toshiba");

        //arr.add("Монитор: " + monitor + ", ");
        Context context = new Context();
        context.setStrategy = new ComputerAssembler();

        System.out.println("Введите марку монитора:");
        Monitor monitor = new Monitor();
        Computer computer = new Computer(processor, memory, disk);
        computer.setClassComp("Ноут");

        ComputerAssembler computerAssembler = new ComputerAssembler();
        computerAssembler.getCreateComp();

        context.setStrategy(new ComputerFacade());

        System.out.println(computer.getClassComp());
    }
}
