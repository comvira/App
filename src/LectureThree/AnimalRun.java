package LectureThree;

import java.util.Objects;

public class AnimalRun {
    public static void main(String[] args) {
        Animal [] animal = new Animal [3];
        animal [0] = new Cat("Вискас", "Москва");
        animal [1] = new Dog("Нет","Подольск");
        animal [2] = new Horse("Да","Киров");
        Ветеринар anialServices = new Ветеринар();
        for (int i = 2; i >= 0; i--) {
            System.out.println(animal[i]); //тут наверно завис :( не очень понимаю как реализовать
            // вывод из класса Ветеринар т.е. передаци стоки массива. пересмотрел три раза урок, но к сожалению не понял,
            // что делаю не так? или просто - что то упускаю в этом задании.
            System.out.println(animal[i].food + " " + animal[i].location);
        }
    }
}
