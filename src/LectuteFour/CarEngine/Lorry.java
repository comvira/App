package LectuteFour.CarEngine;

public abstract class Lorry extends Car {

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

    }

    @Override
    public String start() {
         System.out.println("Грузовик поехал");
    }

    @Override
    public String stop() {
        System.out.println("грузовик остановился");
    }


    public void setModel(String model) {
        super.model = model;
    }

    public String getModel() {
        return super.model;
    }
}
