class calculator{
    void multiply(int a, int b){
        System.out.println(a*b);
    }
     void multiply(int a, int b,int c){
        System.out.println(a*b*c);
    }
     void multiply(double a, int b){
        System.out.println(a*b);
    }
}
public class q4 {
    public static void main(String[] args) {
        calculator c = new calculator();
        c.multiply(10,20);
        c.multiply(10.55,7);
        c.multiply(10,20,30);
        }
    
}
