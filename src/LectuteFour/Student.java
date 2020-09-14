package LectuteFour;

public class Student extends Person {
    private String name;

    public Student(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "C";
    }

/*    public void setName(Student name) {
        this.name = name;
    }*/
}
