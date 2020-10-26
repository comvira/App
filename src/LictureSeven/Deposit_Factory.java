package LictureSeven;

public class Deposit_Factory extends Operation_Factory{
    @Override
    public Operation createOperation(){
        return new Deposit();
    }
}