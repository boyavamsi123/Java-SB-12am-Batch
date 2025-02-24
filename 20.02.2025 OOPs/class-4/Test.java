class GP{
    public void m1(){
        System.out.println("GP m1-method");
    }
}
class Parent extends GP{
    public void m2(){
        System.out.println("Parent m2-method");
    }
}
class Child extends Parent{
    public void m3(){
        System.out.println("child m3-method");
    }
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.m1(); // GP m1-method
        c1.m2(); //Parent m2-method
        c1.m3(); //child m3-method
    }
}