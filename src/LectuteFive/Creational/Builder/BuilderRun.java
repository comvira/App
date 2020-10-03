package LectuteFive.Creational.Builder;

public class BuilderRun {
    public static void main(String[] args) {
        CarBuilder  carBuilder = new CarBuilder();

        Car car = carBuilder.withName("Ока").withEngine("V1").withSpeed(60).withWeight(100).build();
        System.out.println(car);
    }
}
