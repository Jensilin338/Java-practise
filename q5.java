class bankAccount{
    private double balance;
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited Amount: " + amount);
        
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient balance. ");
        }else{
            balance = balance-amount;
        System.out.println("Withdrawed amount: " + amount);
        }
    }
    public void getBalance(){
        System.out.println("Balance after withdraw: "+balance);
    }
}
public class q5 {
    public static void main(String[] args) {
        bankAccount b = new bankAccount();
        b.deposit(10000);
        b.withdraw(50000);
        b.getBalance();
    }
}
