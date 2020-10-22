package LectuteFive.TaskTwoComputer3;

public class VideoCard_Factory extends Detail_Factory{
    @Override
    public Detail createDetailPC() {
        return new VideoCard("", "", "", "", CoolingType.Active);
    }

}
