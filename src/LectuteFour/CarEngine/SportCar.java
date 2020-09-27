package LectuteFour.CarEngine;

class SportCar extends Car{
    static int maxSpeed;
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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Максимальная скорость: " + maxSpeed);
    }

    @Override
    public void start() {
        System.out.println(super.getClassAuto() +" поехал");
    }

    @Override
    public void stop() {
        System.out.println(super.getClassAuto() +"  остановился");
    }

    @Override
    public void turnRight() {

    }

    @Override
    public void turnLeft() {

    }
    @Override
    public void setModel(String model) {
        super.model = model;
    }
    @Override
    public String getModel() {
        return super.model;
    }
    @Override
    public String getClassAuto() {
        return super.classAuto;
    }
    @Override
    public void setClassAuto(String classAuto) {
        super.classAuto = classAuto;
    }
    @Override
    public double getWeight() {
        return super.weight;
    }
    @Override
    public void setWeight(double weight) {
        super.weight = weight;
    }
}
