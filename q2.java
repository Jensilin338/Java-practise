class Employee{
    String name;
    int id;
    int salary;
    Employee(String name,int id,int salary){
        this.name = name;
        this.id = id;
        this.salary=salary;
    }
}
public class q2 {
    public static void main(String[] args) {
        Employee e = new Employee("Jensilin", 123, 2000);
        System.out.println(e.name);
    }
}
