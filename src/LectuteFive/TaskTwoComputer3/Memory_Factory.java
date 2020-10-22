package LectuteFive.TaskTwoComputer3;

public class Memory_Factory extends Detail_Factory{
    @Override
    public Detail createDetailPC (){
        return new Memory("","",
                "","",0);
    }

}
