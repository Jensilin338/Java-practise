class payment{
    int fee(int amount){
        return amount+10;
    }
    int fee(int amount, int tax){
        return amount + tax + 20;
    }
}
public class polymovR{
    public static void main(String[] args) {
        payment p = new payment();
        System.out.println(p.fee(20)); 
        System.out.println(p.fee(20,5));
        
    }
}
