package LectuteFour.PersonEmplyee;

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String getDescription() {
        return "студент, изучающий вычислительную технику";
    }
}
