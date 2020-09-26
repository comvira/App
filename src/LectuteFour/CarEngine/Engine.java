package LectuteFour.CarEngine;

public abstract class Engine {
    private int power;
    private String manufacturer;

    public int getPower() {
         return power;
    }

    public String getManufacturer() {
         return manufacturer;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
