package LectureSix.TaskTwo;

public class Main {

     public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> box1 = new Box<>(apple1, apple2, apple3);//заполняем яблоками
        Box<Orange> box2 = new Box<>(orange1, orange2);//заполняем апельсинами

        System.out.println(box1.compare(box2));//сравниваем

        Box<Orange> box3 = new Box<>();
        box2.transfer(box3);// пересыпаем апельсины из 2 в 3

         System.out.println(box1.compare(box2));//ещё раз сравниваем после пересыпки из 2 в 3
    }
}