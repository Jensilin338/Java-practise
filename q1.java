class Book{
    String title;
    String author;
    int price;
    void showDetails(){
        System.out.println("Book Title: "+title+ ", Author: "+author+" Price: $"+price);
    }    
}
public class q1 {
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "C program";
        b.author = "John Doe";
        b.price = 20;
        b.showDetails();
    }
    
}
