package LectureThree;

public class Animal {
    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    String food;
    String location;

    public void makeNoise(String eat){
        food = eat;
    }

    public void makeNoise(String sleep, String name){
        System.out.println("Такое-то животное спит: " + name + " " + sleep);
    }

    public String getLocation() {
        return location;
    }

    public String getFood() {
        return food;
    }

}
