package LectureThree.Animal;

public class Animal {
    private String food;
    private String location;

    public Animal(String eat) {
        this.food = eat;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoise(String eat){
        food = eat;
    }

    public void makeNoise(String sleep, String name){
        System.out.println("Такое-то животное спит: " + name + " " + sleep);
    }
}
