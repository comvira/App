package LectuteFive.Creational.Factory;

public class TC5Factory extends StoreFactory {
    @Override
    public Store createStore() {
        return new TC5();
    }
}
