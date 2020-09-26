package LectuteFour.Shape;

public class Triangle implements Shape {
    private double a, b;
    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getSquare() {
        return (a * b) /2;
    }
}
