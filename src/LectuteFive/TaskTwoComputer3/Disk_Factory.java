package LectuteFive.TaskTwoComputer3;

public class Disk_Factory extends Detail_Factory {
    @Override
    public Detail createDetailPC() {
        return new Disk("", "", "", "", 0);
    }
}
