package LectuteFour.CarEngine;

 public abstract class Car extends Engine{

    private String model;
    private String classAuto;
    private double weight;
    /*private String start;
    private String stop;
    private String turnRight;
    private String turnLeft;*/

     public Car(String model, String classAuto,
                double weight) {
         this.model = model;
         this.classAuto = classAuto;
         this.weight = weight;
     }

     Car() {

    }

    public void start() {
        System.out.println(this.classAuto + " поехал");
    }

     public void stop() {
         System.out.println(this.classAuto + " остановился");
     }

     public void turnRight() {
         System.out.println(this.classAuto + " Поворот направо");
     }

     public void turnLeft() {
         System.out.println(this.classAuto + " Поворот налево");
     }

    Engine engine = new Engine() {
        @Override
        public int getPower() {
            return super.getPower();
        }

        @Override
        public String getManufacturer() {
            return super.getManufacturer();
        }

        @Override
        public void setPower(int power) {
            super.setPower(power);
        }

        @Override
        public void setManufacturer(String manufacturer) {
            super.setManufacturer(manufacturer);
        }
    };

    public void printInfo(){
        System.out.println("Модель: " + model);
        System.out.println("Производитель: " + super.getManufacturer());
        System.out.println("Power: " + super.getPower());
        System.out.println("Класс Авто: " + classAuto);
        System.out.println("Вес: " + weight);
    }
 }
