class Animal{
    void eat(){
        System.out.println("Animal Eats");
    }
}
class Dog extends Animal{

}
public class inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}
