package LectuteFour.CarEngine;

class SportCar extends Car{

    public int getPower() {
        return super.power;
    }

    public void setPower(int power) {
        super.power = power;
    }

    public String getManufacturer() {
        return super.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        super.manufacturer = manufacturer;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void turnLeft() {

    }

    public void setModel(String model) {
        super.model = model;
    }

    public String getModel() {
        return super.model;
    }
}
