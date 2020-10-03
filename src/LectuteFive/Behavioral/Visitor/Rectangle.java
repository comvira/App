package LectuteFive.Behavioral.Visitor;

public class Rectangle extends Shape {

    public Rectangle(String name, int square) {
        super(name, square);
    }

    @Override
    void draw() {
        System.out.println("Draw Rectangle");
    }

    @Override
    String accept(Visitor visitor) {
        return visitor.visitRectangle(this);
    }
}