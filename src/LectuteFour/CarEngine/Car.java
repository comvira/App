package LectuteFour.CarEngine;

public abstract class Car {

    private String model;
    private int power;

    public abstract String  start() {

    }

    public abstract String  stop() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void turnRight() {

    }

    public void turnLeft() {

    }
    public void printInfo() {

    }
}
