abstract class A{
    public final int x = 100;
    abstract void m1();
}
class B extends A{
    public void m1(){}
    public static void main(String[] args){
        B b = new B();
        System.out.println(b.x);
    }
}
