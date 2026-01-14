class Product{
    String name;
    int price;

    void showDetails(){
        System.out.println(name + " -- ₹" +price);
    }
}

public class classnobj {
    public static void main(String[] args) {
        Product p = new Product();
        p.name="Laptop";
        p.price=55000;
        p.showDetails();
    }
    
}
