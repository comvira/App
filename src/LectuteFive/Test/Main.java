package LectuteFive.Test;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Philips");
        System.out.println(monitor.getManufacture());
        monitor.createComputer();
    }
}
