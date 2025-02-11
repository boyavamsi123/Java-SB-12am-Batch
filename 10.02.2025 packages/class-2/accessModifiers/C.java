package pack2;
import pack1.A;

public class C extends A {
    public static void main(String[] args) {
        C c1 = new C();
        c1.m1();
        //c1.m2(); //m2 is private
        c1.m3();
        //c1.m4();  //m4 is default
    }
}       