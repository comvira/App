package LectuteFive.TaskTwoComputer3;

public class DiskFactory extends DetailFactory {
    @Override
    public Detail createDetailPC() {
        return new Disk("", "", "", "", 0);
    }
}
