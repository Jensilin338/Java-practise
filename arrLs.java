import java.util.*;

class Employee{
    int id;
    String name;
    double salary;
    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void display(){
        System.out.println(id+" " +name + " " + salary + " ");
    }
}
public class arrLs {
    public static void main(String[] args) {
        List <Employee> employees = new ArrayList<> ();
        employees.add(new Employee(1,"John",20000));
        employees.add(new Employee(2,"Jerome",45000));
        for(Employee e: employees){
            e.display();
        }

    }
}
