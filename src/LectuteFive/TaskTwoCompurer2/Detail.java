package LectuteFive.TaskTwoCompurer2;

public abstract class Detail implements Computer {
    public String manufacture;
    public int memorySize;

    public Detail(String manufacture, int memorySize) {
        this.manufacture = manufacture;
        this.memorySize = memorySize;
    }

    public Detail(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public void createComputer() {

    }

    public Detail() {

    }
}
