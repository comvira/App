package LectuteFour.CarEngine;

abstract class Car extends Engine{

    static String model;
    static String classAuto;
    static double weight;
    public abstract void start();
    public abstract void stop();
    public abstract void turnRight();
    public abstract void turnLeft();
    public void printInfo(){
        System.out.println("Модель: " + model);
        System.out.println("Производитель: " + super.getManufacturer());
        System.out.println("Power: " + super.getPower());
        System.out.println("Класс Авто: " + classAuto);
        System.out.println("Вес: " + weight);
    }

    public String getClassAuto() {
        return classAuto;
    }

    public void setClassAuto(String classAuto) {
        this.classAuto = classAuto;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

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
 }
