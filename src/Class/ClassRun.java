package Class;

public class ClassRun {
    static Employee[] e = new Employee[2];
    public static void main(String[] args){
        e[0] = new Employee("A",100.0);
        e[1] = new Manager("B",200.0,100.0);

        for (int i = 0; i<2; i++){
            System.out.println(e[i].getSalary());
        }
    }
}


