package LectuteFour.PersonEmplyee;

public class RunClass {
    public static void main(String[] args) {
        //String name;
        Person employee = new Employee("Employee");
        //employee.setName("a");
        Person person = new Person("Person") {
            @Override
            protected String getDescription() {
                return "человек";
            }
        };
        //person.setName("b");
        Person student = new Student("Student");
        //student.setName("c");
        Person uncnownPerson = new UncnownPerson("Uncnown");
        //uncnownPerson.setName("d");

        System.out.println(employee.getDescription());
        System.out.println(person.getDescription());
        System.out.println(student.getDescription());
        System.out.println(uncnownPerson.getDescription());
    }
}

