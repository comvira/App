package LectuteFive.TaskTwoComputer3;

public class MemoryFactory extends Detail_Factory{
    @Override
    public Detail createDetailPC (){
        return new Memory("","",
                "","",0);
    }

}
