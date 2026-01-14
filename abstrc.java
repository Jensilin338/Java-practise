abstract class Fly {
    abstract void wings();
}
class birds extends Fly{
    void wings(){
        System.out.println("Birds flying");
    }
}
class aeroplanes extends Fly{
    void wings() {
        System.out.println("Aeroplanes flying");
    }
}
class insects extends Fly{
    void wings(){
        System.out.println("Insects flying");
    }
}
public class abstrc {
    public static void main(String[] args) {
        birds b = new birds();
        aeroplanes a = new aeroplanes();
        insects i = new insects();
        b.wings();
        a.wings();
        i.wings();
    }
    
}
