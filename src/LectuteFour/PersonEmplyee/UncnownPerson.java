package LectuteFour.PersonEmplyee;

public class UncnownPerson extends Person {
    public UncnownPerson(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String getDescription() {
        return "неизвестный";
    }
}
