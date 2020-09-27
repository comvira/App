package LectuteFour.CarEngine;

public abstract class SportCar extends Car{
    private String model;
    @Override
    public String start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void printInfo() {

    }

    @Override
    public String stop() {
        System.out.println("SportCar остановился");

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
