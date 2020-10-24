package Exceptions;

public class TryWithResourses {
    public static void myFunction() throws ExampleException {
        throw new ExampleException();
    }

    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            System.out.println("Выросняем метод...");
            int x = 0;
            myFunction();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
