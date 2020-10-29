package LectuteFive.TaskTwoComputer3;

public class ProcessorFactory extends Detail_Factory {
    @Override
    public Detail createDetailPC() {
        return new Processor("", "", "", "", 0, 0);
    }

}
