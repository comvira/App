package LectuteFive.Test;

public class Monitor implements Detail {

    private String manufacture;

    public Monitor(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public void createDetail() {

    }

    @Override
    public void getInfo() {
        System.out.println("Производитель монитора: " + manufacture);
    }

}
