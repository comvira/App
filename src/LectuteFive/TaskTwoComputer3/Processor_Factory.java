package LectuteFive.TaskTwoComputer3;

public class Processor_Factory extends Detail_Factory {
    @Override
    public Detail createDetailPC() {
        return new Processor("", "", "", "", 0, 0);
    }

}
