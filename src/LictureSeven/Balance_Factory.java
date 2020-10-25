package LictureSeven;

public class Balance_Factory extends Operation_Factory{
    @Override
    public Operation createOperation(){
        return new Balance();
    }
}
