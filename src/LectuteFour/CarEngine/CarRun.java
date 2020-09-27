package LectuteFour.CarEngine;

import LectuteFour.Shape.Shape;

public class CarRun {
    public static void main(String[] args) {

        Lorry lorry = new Lorry();
        lorry.setModel("Honda");
        SportCar sportCar = new SportCar();
        sportCar.setModel("Ока");
        System.out.println(lorry.getModel());
        System.out.println(sportCar.getModel());
    }
}