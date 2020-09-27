package LectuteFour.CarEngine;

public abstract class Car extends Engine{

    static String model;
    public abstract String start();
    public abstract String stop();
    public abstract void turnRight();


    @Override
    public int getPower() {
        return super.power;
    }

    @Override
    public void setPower(int power) {
        super.power = power;
    }

    @Override
    public String getManufacturer() {
        return super.manufacturer;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        super.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract void turnLeft();
    public abstract void printInfo();

}
