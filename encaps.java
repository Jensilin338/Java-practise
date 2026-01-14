class employee{
    private int salary;

    public void setSalary(int s){
        salary = s;
    }
    public int getSalary(){
        return salary;
    }
}
public class encaps {
    public static void main(String[] args){
        employee e = new employee();
        e.setSalary(550000);
        System.out.println("Salary: " + e.getSalary());
    }
}
