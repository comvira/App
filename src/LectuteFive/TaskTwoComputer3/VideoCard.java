package LectuteFive.TaskTwoComputer3;

public class VideoCard extends DetailPC {
    public VideoCard(String name, String volMem, String typeMem, String manufacturerName, CoolingType coolingVideo) {
        super(name, volMem, typeMem, manufacturerName);
        this.coolingVideo = coolingVideo;
        this.componentType = "VideoCard";
    }

    private CoolingType coolingVideo;
    public CoolingType getCoolingType() {
        return this.coolingVideo;
    }

}