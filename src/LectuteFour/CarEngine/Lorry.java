package LectuteFour.CarEngine;

public abstract class Lorry extends Car {
    private String model;

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
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
