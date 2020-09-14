package LectuteFour;

public abstract class Car {

    private String model;
    private int maxSpeed;

    public abstract void start();

    public abstract void stop();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
