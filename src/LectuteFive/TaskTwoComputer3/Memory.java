package LectuteFive.TaskTwoComputer3;

public class Memory extends DetailPC {
    double memorySpeed;
    public Memory(String name, String volMem, String typeMem,
                  String manufacturerName, double memorySpeed) {
        super(name, volMem, typeMem, manufacturerName);
        this.memorySpeed = memorySpeed;
        this.componentType = "Memory";
    }

    public double getMemorySpeed() {
        return this.memorySpeed;
    }
}