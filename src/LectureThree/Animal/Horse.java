package LectureThree.Animal;

public class Horse extends Animal{
    private String name = "Horse";
    private String eat;
    private String location;
    private String sleep = "Да";

    public Horse(String eat) {
        super(eat);
    }

    public String getName() {
        return name;
    }

    public String getEat() {
        return eat;
    }

    @Override
    public String getLocation() {
        return location;
    }

    public String getSleep() {
        return sleep;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }
}
