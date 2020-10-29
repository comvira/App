package LectuteFive.TaskTwoComputer3;

public class MonitorFactory extends Detail_Factory {
    @Override
    public Detail createDetailPC() {
        return new Monitor("");
    }

}
