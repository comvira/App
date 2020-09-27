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
        lorry.setMaxWeight(15000);
        System.out.println(lorry.getModel());
        lorry.start();
        lorry.stop();
        lorry.printInfo();

        System.out.println();

        SportCar sportCar = new SportCar();
        sportCar.setModel("Ока");
        sportCar.setPower(0);
        sportCar.setManufacturer("ВедроСтроительный LTD");
        sportCar.setClassAuto("консервная банка");
        sportCar.setWeight(200.0);
        sportCar.setMaxSpeed(60);
        System.out.println(sportCar.getModel());
        sportCar.start();
        sportCar.stop();
        sportCar.printInfo();
    }
}