package LectuteFour.CarEngine;

public abstract class Car extends Engine{

    static String model;
    public abstract String start();
    public abstract String stop();
    public abstract void turnRight();
    public abstract void turnLeft();
    public abstract void printInfo();

}
