package LectureThree.Animal;

public abstract class Animal {
    private String food;
    private String location;
    private String sleep;

    public Animal(String eat) {
        this.food = eat;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
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

    public abstract String getSleep();
}
