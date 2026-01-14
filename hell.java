class Animal {
    void sound(){
        System.out.println("Animal makes a noise");
    }
}
class cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat says Meow Meow!!");
    }
}
class dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog says Bow Bow!!");
    }
}
public class hell {
   public static void main(String[] args) {
    Animal a = new Animal();
    dog d = new dog();
    cat c = new cat();
    d.sound();
    a.sound();
    c.sound();
   } 
}
