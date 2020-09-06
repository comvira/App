
package LectureThree;

public class Ветеринар extends Animal{
    public void treatAnimal(Animal animal){
        System.out.println(animal.food + " " + animal.location);
    }
}
