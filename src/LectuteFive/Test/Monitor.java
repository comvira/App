package LectuteFive.Test;

public class Monitor implements Detail {

    private String manufacture;

    public Monitor(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public void createDetail() {
        System.out.println("Производитель монитора: " + manufacture);
    }
}
