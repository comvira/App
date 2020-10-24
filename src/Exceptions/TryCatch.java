package Exceptions;


public class TryCatch {

    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            throw new ExampleException();
            //System.out.println(x / y);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("try");
    }
}
