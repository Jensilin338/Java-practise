class BankAccount{
    int balance=0;
   synchronized void deposit(int amount){
    balance = balance+amount;
   }
}
class MyThread extends Thread{
    BankAccount acc;
    MyThread(BankAccount acc){
        this.acc = acc;
    }
    public void run(){
        for(int i=0;i<1000;i++){
            acc.deposit(1);
        }
    }
}
public class synchro2 {
    public static void main(String[] args) throws InterruptedException {
        BankAccount acc = new BankAccount();

        MyThread t1 = new MyThread(acc);
        MyThread t2 = new MyThread(acc);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Balance: "+acc.balance);
    }
    
}
