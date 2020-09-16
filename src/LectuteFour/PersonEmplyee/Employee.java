package LectuteFour.PersonEmplyee;

public class Employee extends Person {
    public Employee(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String getDescription() {
        return "наёмный рабочий";
    }
}
