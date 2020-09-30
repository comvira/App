package LectuteFive.Decorator;

public class Mushrooms extends PizzaDecorator{
    public Mushrooms(Item pizza) {
        super(pizza);
    }
    @Override
    public void prepare() {
        super.prepare();
        System.out.print(" + грибы");
    }
}

