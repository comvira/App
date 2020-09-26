package LectuteFour.CarEngine;

public class Lorry implements Car {
    private String model;
    public Lorry(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("грузовик остановился");
    }

    @Override
    public String getModel() {
        return model;
    }
}
