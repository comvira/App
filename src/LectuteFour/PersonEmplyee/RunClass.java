package LectuteFour.PersonEmplyee;

public class RunClass {
    public static void main(String[] args) {
        String name;
        Person employee = new Employee();
        employee.setName("a");
        Person person = new Employee();
        person.setName("b");
        Person student = new Employee();
        student.setName("c");
        Person UncnownPerson = new Employee();
        student.setName("d");

        //UncnownPerson uncnownPerson = new UncnownPerson();

/*        if (person instanceof Person){
            System.out.println("это сотрудник");
        }*/

        /*if (uncnownPerson instanceof Person){
            System.out.println("uncnownPerson in person");
        } else {
            System.out.println("uncnownPerson not person");
        }*/
        System.out.println(employee.getName());
        System.out.println(person.getName());
        System.out.println(student.getName());
        System.out.println(UncnownPerson.getName());
    }
}

