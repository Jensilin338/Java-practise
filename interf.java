interface Vehicle{
    void start();
}
class bike implements Vehicle{
    public void start(){
        System.out.println("Bike Started");
    }
}
public class interf {
    public static void main(String[] args) throws Exception {
        Vehicle v = new bike();
        bike b = new bike();
        v.start();
        b.start();
    }
    
}
