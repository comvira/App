package LectuteFive.TaskTwo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args, Memory memory) {
        System.out.println("Какой коммпьютер собираем?");
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

        //arr.add("Монитор: " + monitor + ", ");
        Context context = new Context();
        context.setStrategy((Strategy) new ComputerAssembler());



        System.out.println("Введите марку монитора:");
        Monitor monitor = new Monitor();
        Computer computer = new Computer(processor, memory, disk);
        computer.setClassComp("Ноут");

        ComputerAssembler computerAssembler = new ComputerAssembler();
        computerAssembler.getCreateComp();

        context.createComp(type);
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(arr.toArray()));
    }
}
