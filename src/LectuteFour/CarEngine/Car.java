package LectuteFour.CarEngine;

public abstract class Car {

    private String model;
    private int power;

    public abstract String start();
    public abstract String stop();
    public abstract void turnRight();
    public abstract void turnLeft();
    public abstract void printInfo();
}
