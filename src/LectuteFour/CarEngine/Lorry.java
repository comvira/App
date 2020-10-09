package LectuteFour.CarEngine;

class Lorry extends Car {
    private int maxWeight;

    public Lorry(String model, String classAuto, double weight, int maxWeight) {
        super(model, classAuto, weight);
        this.maxWeight = maxWeight;
    }

    public Lorry(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
