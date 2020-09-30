package LectuteFive.Decorator;

public class DecoratorRun {
    public static void main(String[] args) {

        Item pizza4 = new Pizza();
        pizza4.prepare();

        System.out.println();

        Item pizza1 = new DeepFried(new Pizza());
        pizza1.prepare();

        System.out.println();

        Item pizza2 = new Spicy(new DeepFried(new Pizza()));
        pizza2.prepare();

        System.out.println();

        Item pizza3 = new DoubleCheese(new Pizza());
        pizza3.prepare();

        System.out.println();

        Item pizza5 = new Mushrooms(new Pizza());
        pizza5.prepare();
    }
}