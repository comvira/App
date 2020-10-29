package LectuteFive.TaskTwoComputer3;

public class MonitorFactory extends DetailFactory {
    @Override
    public Detail createDetailPC() {
        return new Monitor("");
    }

}
