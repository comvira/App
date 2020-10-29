package LectuteFive.TaskTwoComputer3;

public class VideoCardFactory extends DetailFactory{
    @Override
    public Detail createDetailPC() {
        return new VideoCard("", "", "", "", CoolingType.Active);
    }

}
