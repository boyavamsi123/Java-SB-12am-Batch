package pack1;

public class B{
    public static void main(String[] args) {
        A a1 = new A();
        a1.m1();  //class A public m1 method
        //a1.m2(); //this one is compile time error
       /* javac -d . B.java
        B.java:7: error: m2() has private access in A
        a1.m2();*/
        a1.m3();  //class A protected m3 method
        a1.m4();  //class A default m4 method
    }
}