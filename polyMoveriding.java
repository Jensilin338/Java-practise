class Notification{
    void send(){
        System.out.println("Sending Notification");
    }
}
class EmailNotification extends Notification {
    @Override
    void send(){
        System.out.println("Sending Email");
    }
}
class SmsNotification extends Notification {
    @Override
    void send(){
        System.out.println("Sending Sms");
    }
}
public class polyMoveriding {
    public static void main(String[] args) {
        Notification n = new Notification();
        SmsNotification s = new SmsNotification();
        n.send();
        s.send();
    }
    
}
