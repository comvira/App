package LectuteFive.Behavioral.Visitor;

public class Circle extends Shape {
    public Circle(String name, int square) {
        super(name, square);
    }

    @Override
    void draw() {

        System.out.println("Draw Circle");
    }

    @Override
    String accept(Visitor visitor) {

        return visitor.visitCircle(this);
    }
}