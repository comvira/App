package LectuteFive.Creational.Factory;

public class TCXFactory extends StoreFactory {
    @Override
    public Store createStore() {
        return new TCX();
    }
}