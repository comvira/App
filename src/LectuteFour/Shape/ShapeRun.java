package LectuteFour.Shape;

public class ShapeRun {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(1.0, 2.0);
        shape[1] = new Circle(5.0);
        shape[2] = new Rectangle(6.4, 8.4);
        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.getSquare());
        }
    }
}