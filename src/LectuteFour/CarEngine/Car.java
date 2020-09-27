package LectuteFour.CarEngine;

public abstract class Car extends Engine{

    static String model;
    public abstract String start();
    public abstract String stop();
    public abstract void turnRight();


    @Override
    public int getPower() {
        return Engine.power;
    }

    @Override
    public void setPower(int power) {
        Engine.power = power;
    }

    @Override
    public String getManufacturer() {
        return Engine.manufacturer;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        Engine.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        Car.model = model;
    }

    public abstract void turnLeft();
    public abstract void printInfo();

}
