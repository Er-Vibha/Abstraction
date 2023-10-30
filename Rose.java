//Example of an abstract class that has abstract and non-abstract methods  
abstract class Flower{
    Flower(){
        System.out.println("All flower have fragrance");
    }
    abstract void color();
    void colorchange() {
        System.out.println("Lily color is white");
    }
}
public class Rose extends Flower{
    void color(){
        System.out.println("Rose color is red");
    }
    public static void main(String[] args) {
        Flower flow=new Rose();
        flow.color();
        flow.colorchange();
    }
}
