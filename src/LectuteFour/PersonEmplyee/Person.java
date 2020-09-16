package LectuteFour.PersonEmplyee;
public abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract String getDescription();
}

