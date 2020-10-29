package LectuteFive.TaskTwoComputer3;

public class MemoryFactory extends DetailFactory{
    @Override
    public Detail createDetailPC (){
        return new Memory("","",
                "","",0);
    }

}
