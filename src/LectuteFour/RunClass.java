package LectuteFour;

public class RunClass {
    public static void main(String[] args) {
        Person employee = new Employee("a");
        Person person = new Employee("b");
        Person student = new Student("C");

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
    }
}

