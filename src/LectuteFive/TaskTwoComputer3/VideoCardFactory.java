package LectuteFive.TaskTwoComputer3;

public class VideoCardFactory extends Detail_Factory{
    @Override
    public Detail createDetailPC() {
        return new VideoCard("", "", "", "", CoolingType.Active);
    }

}
