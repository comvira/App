package LectuteFour.CarEngine;

class Engine {
    static int power;
    static String manufacturer;

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
