abstract class TestA{
 abstract void run();
}
class TestAbs extends TestA{
    void run() {
        System.out.println("This is sub class");
    }
public static void main(String[] args) {
TestA obj=new TestAbs();
obj.run();
    }
}
