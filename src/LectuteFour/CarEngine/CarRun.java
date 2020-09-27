package LectuteFour.CarEngine;

import LectuteFour.Shape.Shape;

public class CarRun {
    public static void main(String[] args) {

        Lorry lorry = new Lorry();
        lorry.setModel("Honda");
        lorry.setPower(5);
        lorry.setManufacturer("Honda LTD");
        lorry.setClassAuto("грузовик");
        lorry.setWeight(8000.0);
        System.out.println(lorry.getModel());
        lorry.printInfo();

        System.out.println();

        SportCar sportCar = new SportCar();
        sportCar.setModel("Ока");
        lorry.setPower(0);
        lorry.setManufacturer("ВедроСтроительный LTD");
        System.out.println(sportCar.getModel());
        sportCar.printInfo();
    }
}