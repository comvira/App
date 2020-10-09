package LectuteFour.CarEngine;

class SportCar extends Car{
    private int maxSpeed;

    public SportCar(String model, String classAuto, double weight, int maxSpeed) {
        super(model, classAuto, weight);
        this.maxSpeed = maxSpeed;
    }

    public SportCar(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
