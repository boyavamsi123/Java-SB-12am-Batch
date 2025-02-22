class Parent{
    public void m1(){
        System.out.println("Parent class - m1 method"); 
    }
}
class Child extends Parent{
    public void m2(){
        System.out.println("Parent class - m2 method");
    }
}

public static void main(String[] args){
    Parent p = new Parent();
    p.m1();
}
