package LectuteFour;

public class Lorry extends Car {
    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("грузовик остановился");
    }
}
