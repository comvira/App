package LectuteFive.TaskTwoComputer3;

public class Disk extends DetailPC {
    private double formFactor;

    public Disk(String name, String volMem, String typeMem, String manufacturerName,
                double formFactor) {
        super(name, volMem, typeMem, manufacturerName);
        this.formFactor = formFactor;
        this.componentType = "Disk";
    }

    public double getformFactor() {
        return this.formFactor;
    }
}
