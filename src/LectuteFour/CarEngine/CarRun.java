package LectuteFour.CarEngine;

public class CarRun {
    public static void main(String[] args) {
        CarRun[] car = new CarRun[3];
        car[0] = new Lorry("dd");
        car[1] = new SportCar();
        for (CarRun cars : car) {
            System.out.println("Площадь фигуры: " + cars.());
        }
    }
}