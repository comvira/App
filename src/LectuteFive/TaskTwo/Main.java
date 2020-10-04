package LectuteFive.TaskTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String monitor;
        //ArrayList arr = new ArrayList();

        System.out.println("Введите марку монитора:");
        Computer computer = new Computer();
        computer.setMonitor(sc.nextLine());
        computer.setClassComp("Ноут");

        Processor processor = new Processor();
        processor.setName("AMD");

        VideoCard videoCard = new VideoCard();
        videoCard.setManufacture("Intel");

        Disk disk = new Disk();
        disk.setManufacture("Toshiba");

        //arr.add("Монитор: " + monitor + ", ");

        ComputerAssembler computerAssembler = new ComputerAssembler();
        computerAssembler.getCreateComp();


        //System.out.println(Arrays.toString(arr.toArray()));
    }
}
