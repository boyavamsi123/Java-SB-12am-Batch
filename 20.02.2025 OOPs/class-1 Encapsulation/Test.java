public class Test{
    public Test(){
        System.out.println("Constructor-special method");
    }
    public void m1(){
        System.out.println("Normal Method - m1");
    }
    public static void main(String[] args) {
        new Test();
        new Test();
        new Test();
    }
}