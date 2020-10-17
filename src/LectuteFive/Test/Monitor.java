package LectuteFive.Test;

public class Monitor extends Detail {

    private String manufacture;

    public Monitor(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public void createComputer() {
        System.out.println("Производитель: " + this.manufacture);
    }

    public String getManufacture(){
        return this.manufacture;
    }
}
