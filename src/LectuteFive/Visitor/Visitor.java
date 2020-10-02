package LectuteFive.Visitor;

public interface Visitor {
    String visitCircle(Circle circle);
    String visitTriangle(Triangle triangle);
    String visitRectangle(Rectangle rectangle);
}
