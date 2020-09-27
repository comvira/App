package LectuteFour.CarEngine;

class Lorry extends Car {

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
         System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("грузовик остановился");
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
