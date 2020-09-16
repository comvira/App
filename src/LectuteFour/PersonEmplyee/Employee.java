package LectuteFour.PersonEmplyee;

import LectuteFour.PersonEmplyee.Person;

public class Employee extends Person {
    private String name;

    public void setName() {

        this.name = name;
    }

    @Override
    public String getDescription() {

        return "Emloyee";
    }

}
