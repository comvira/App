package LectuteFour.CarEngine;

public abstract class SportCar extends Car{

    public int getPower() {
        return Car.power;
    }

    public void setPower(int power) {
        Car.power = power;
    }

    public String getManufacturer() {
        return Car.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Car.manufacturer = manufacturer;
    }

    @Override
    public void printInfo() {

    }

    @Override
    public String start() {
        System.out.println("SportCar поехал")
    }

    @Override
    public String stop() {
        System.out.println("SportCar остановился");

    }

    public void setModel(String model) {
        Car.model = model;
    }

    public String getModel() {
        return Car.model;
    }
}
