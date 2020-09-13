package LectuteFour;
public class Employee extends Person{
    public Employee(String name) {
        super(name);
    }

    @Override
    protected String getDescription() {
        return "Emloyee";
    }

}
