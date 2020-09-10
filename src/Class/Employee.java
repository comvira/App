package Class;

class Employee{
    private double salary;
    private String name;
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }
}
