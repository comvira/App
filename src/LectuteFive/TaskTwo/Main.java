package LectuteFive.TaskTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String monitor;

        System.out.println("Введите иарку монитора:");
        monitor = sc.nextLine();

        ComputerAssembler computerAssembler = new ComputerAssembler();
        computerAssembler.getCreateComp();

    }
}
