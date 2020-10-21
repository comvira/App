package LectuteFive.Test;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Philips");
        monitor.getInfo();

        Processor processor = new Processor(1000,
                4,4,"Core","Intel");
        processor.getInfo();

    }
}
