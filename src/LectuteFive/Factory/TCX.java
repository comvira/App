package LectuteFive.Factory;

public class TCX implements Store {
    @Override
    public void open() {
        System.out.println("Открываем Перекрёсток");
    }
}
