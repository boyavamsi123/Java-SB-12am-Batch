abstract class A{
    abstract void login();
}
class B extends A{
    public static void main(String[] args) {
        new B();
    }
}   

/* note: if class extending abstract class we have to provide
          implementation for abstract methods */