package LectuteFour.CarEngine;

import LectuteFour.Shape.Shape;

public class CarRun {
    public static void main(String[] args) {

        Lorry lorry = new Lorry();
        lorry.setModel("Honda");
        lorry.setPower(5);
        lorry.setManufacturer("Honda LTD");
        System.out.println(lorry.getModel());
        lorry.printInfo();

        SportCar sportCar = new SportCar();
        sportCar.setModel("Ока");
        lorry.setPower(0);
        lorry.setManufacturer("ВедроСтроительный LTD");
        System.out.println(sportCar.getModel());
        sportCar.printInfo();
    }
}