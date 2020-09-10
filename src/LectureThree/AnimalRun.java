package LectureThree;

public class AnimalRun {
    static Animal[] animal = new Animal[3];
    public static void main(String[] args) {
        animal [0] = new Cat("Вискас", "Москва");
        animal [1] = new Dog("Нет","Подольск");
        animal [2] = new Horse("Да","Киров");
        Ветеринар anialServices = new Ветеринар();
        for (int i = 2; i >= 0; i--) {
            System.out.println(animal[i].food + " " + animal[i].location);
        }
    }
}
