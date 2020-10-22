package LectuteFive.TaskTwoComputer3;

public class Processor extends DetailPC {
    public Processor(String name, String volMem, String tipMem,
               String manufacturerName, double cpuspeed, int cpunumCores) {
        super(name, volMem, tipMem, manufacturerName);
        this.cpuSpeed = cpuspeed;
        this.cpuNumCores = cpunumCores;
        this.componentType = "Processor";
    }

    private double cpuSpeed;
    private int cpuNumCores;

    public double getCpuSpeed() {
        return this.cpuSpeed;
    }
    public int getCpuNumCores() {
        return this.cpuNumCores;
    }
}