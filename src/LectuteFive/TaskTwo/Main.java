package LectuteFive.TaskTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String monitor;
        ArrayList arr = new ArrayList();

        System.out.println("Введите марку монитора:");
        monitor = sc.nextLine();
        arr.add("Монитор: " + monitor + ", ");

        ComputerAssembler computerAssembler = new ComputerAssembler();
        computerAssembler.getCreateComp();


        System.out.println(Arrays.toString(arr.toArray()));
    }
}
