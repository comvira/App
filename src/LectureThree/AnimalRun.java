package LectureThree;

import java.util.Objects;

public class AnimalRun {
    public static void main(String[] args) {
        Animal [] animal = new Animal [3];
        Cat cat = new Cat();
        System.out.println(cat.eat + " " + cat.location);
        animal [0] = new Cat();
        animal [1] = new Dog();
        animal [2] = new Horse();
        for (int i = 2; i >= 0; i--) {
            System.out.println(animal[i]);
                //Ветеринар.treatAnimal(animal[i]);
            }
    }
}
