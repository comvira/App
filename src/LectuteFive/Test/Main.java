package LectuteFive.Test;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Philips");
        System.out.println("Монитор: " + monitor.getManufacture());
        monitor.createComputer();
    }
}
