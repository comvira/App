package LectuteFive.Test;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Philips");
        monitor.getInfo();

        Processor_Factory processor_factory =
                new Processor_Factory(3000,4,8,
                        "AMD","AMD");

        processor_factory.createDetail();
        processor_factory.getInfo();
    }
}
