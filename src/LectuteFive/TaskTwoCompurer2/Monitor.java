package LectuteFive.TaskTwoCompurer2;

public class Monitor extends Detail {
    //private String manufacture;

    public Monitor(String manufacture) {
        super.manufacture = manufacture;
    }

    @Override
    public void createComputer() {
        System.out.println("Производитель: " + super.manufacture);
    }

    public String getManufacture(){
        return super.manufacture;
    }

}