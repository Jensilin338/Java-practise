class Vehicle{
    void start(){
        System.out.println("Vehicle Starts");
    }
    void stop(){
        System.out.println("Vehicle Stops");
    }
}
class bike extends Vehicle{
    void ride(){
        System.out.println("Riding a bike");
    }
}
public class q3 {
   public static void main(String[] args) {
    bike b = new bike();
    b.start();
    b.stop();
    b.ride();
   }
    
}
