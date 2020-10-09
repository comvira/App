package LectuteFour.CarEngine;

import LectuteFour.Shape.Shape;

public class CarRun {
    public static void main(String[] args) {

        Lorry lorry = new Lorry("Volvo","Lorry",4.2,5000);
        lorry.setPower(500);
        lorry.setManufacturer("Volvo");

        lorry.start();
        lorry.turnRight();
        lorry.turnLeft();
        lorry.stop();

        lorry.printInfo();

        System.out.println();

        SportCar sportCar = new SportCar("Ока","SportCar",100.0,60);
            sportCar.setPower(1);
            sportCar.setManufacturer("ВедроСтроительный");

            sportCar.start();
            sportCar.turnLeft();
            sportCar.turnRight();
            sportCar.stop();

            sportCar.printInfo();
    }
}