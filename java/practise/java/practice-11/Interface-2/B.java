abstract class A{
abstract void m1();
public final int x = 100;
}
class B extends A{
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.x);
    }
}