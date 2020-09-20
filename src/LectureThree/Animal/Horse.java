package LectureThree.Animal;

public class Horse extends Animal{
    private String name = "Horse";
    private String eat;
    private String sleep = "Да";

    public Horse(String eat) {
        super(eat);
    }

    public Horse(String eat, String name, String sleep) {
        super(eat);
        this.name = name;
        this.sleep = sleep;
    }

    public String getName() {
        return name;
    }

    public String getEat() {

        return eat;
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

    public void setSleep(String sleep) {

        this.sleep = sleep;
    }
}
