package LectuteFour.PersonEmplyee;

public class Student extends Person {
    private String name;

    public void setName() {

        this.name = name;
    }

    @Override
    public String getDescription() {

        return "Student";
    }
}
