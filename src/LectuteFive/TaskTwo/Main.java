package LectuteFive.TaskTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Какой коммпьютер собираем?");
        Scanner sc = new Scanner(System.in);
        CompType type = null;
        String monitor;
        String[] array;

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

        //arr.add("Монитор: " + monitor + ", ");
        Context context = new Context();
        context.setStrategy(new ComputerAssembler()) {

            context.createComp(array);
            System.out.println(Arrays.toString(array));
        }

        System.out.println("Введите марку монитора:");
        Computer computer = new Computer();
        monitor = sc.nextLine();
        computer.setMonitor() = monitor;
        computer.setClassComp("Ноут");

        ComputerAssembler computerAssembler = new ComputerAssembler();
        computerAssembler.getCreateComp();

        //System.out.println(Arrays.toString(arr.toArray()));
    }
}
