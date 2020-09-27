package LectuteFour.CarEngine;

public class CarRun {
    public static void main(String[] args) {
        CarRun[] car = new CarRun[2];
        car[0] = new Lorry("Honda");
        car[1] = new SportCar("Oka");
        for (CarRun cars : car) {
            System.out.println(cars());
        }
    }
}