package LectuteFive.TaskTwoCompurer2;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Sony");
        Memory memory = new Memory("Toshiba",8,4,"DDR");

        System.out.println("ОЗУ:");
        memory.createComputer();

        System.out.println();

        System.out.println("Монитор:");
        monitor.createComputer();

    }
}
