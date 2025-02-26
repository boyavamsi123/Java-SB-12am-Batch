class parent{
    public void m1(){
        System.out.println("parent class - m1() method");
    }
}
class child extends parent{
    public void m2(){
        System.out.println("child class - m2() method");
    }
}
public class Test{
    public static void main(String[] args) {
        parent p = new parent();
        p.m1();
        System.out.println("===================================");
        child c = new child();
        c.m1();
        c.m2();
        System.out.println("===================================");
        parent p1 = new child();
        p1.m1();
        
        child c1 = new parent();
        // incompatible types: parent cannot be converted to child
        // child c1 = new parent();
    }
}