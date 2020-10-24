package Exceptions;

public class MyResource implements  AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Закритие ресурсов класса: " + this.getClass());
    }


}
