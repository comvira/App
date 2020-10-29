package LectuteFive.TaskTwoComputer3;

public class ProcessorFactory extends DetailFactory {
    @Override
    public Detail createDetailPC() {
        return new Processor("", "", "", "", 0, 0);
    }

}
