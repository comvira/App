package LectureThree.Animal;

public class AnimalRun {
    static Animal[] animal = new Animal[3];
    public static void main(String[] args) {
        animal [0] = new Cat("Вискас");
        animal [0].setLocation("Москва");
        animal [0].setSleep("да");
        animal [1] = new Dog("Нет");
        animal [1].setLocation("Подольск");
        animal [1].setSleep("да");
        animal [2] = new Horse("Да");
        animal [2].setLocation("Киров");
        animal [2].setSleep("да");
        Veterinarian anialServices = new Veterinarian();
        for (int i = 2; i >= 0; i--) {
            System.out.println(animal[i].getFood() + " " + animal[i].getLocation() + " " + animal[i].getSleep());
        }
    }
}
