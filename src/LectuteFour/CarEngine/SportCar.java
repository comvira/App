package LectuteFour.CarEngine;

public class SportCar extends Car{
    private String model;
    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public String getModel() {
        return model;
    }


}
