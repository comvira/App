package LectuteFour.Shape;

public class Circle implements Shape {
    private double r;
    public Circle(double r) {
        this.r = r;
    }

    public double getSquare() {//площадь круга
        return Math.PI * Math.pow(r, 2);
    }
}