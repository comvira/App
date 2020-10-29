package LectuteFive.TaskTwoComputer3;

public class DiskFactory extends Detail_Factory {
    @Override
    public Detail createDetailPC() {
        return new Disk("", "", "", "", 0);
    }
}
