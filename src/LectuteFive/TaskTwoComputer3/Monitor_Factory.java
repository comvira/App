package LectuteFive.TaskTwoComputer3;

public class Monitor_Factory extends Detail_Factory {
    @Override
    public Detail createDetailPC() {
        return new Monitor("");
    }

}
