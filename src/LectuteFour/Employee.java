package LectuteFour;
public class Employee extends Person {
    private  String name;

    public Employee(String name) {
        super(name);
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return "Emloyee";
    }

}
