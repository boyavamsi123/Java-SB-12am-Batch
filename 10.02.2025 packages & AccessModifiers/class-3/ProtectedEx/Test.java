package pack2;
import pack1.Parent;

public class Test{
    public static void main(String[] args) {
        Parent p1 = new Parent();
               p1.m1();
               p1.m2();
        System.out.println("====================================");
        Child c1 = new Child();
              c1.m1();
              c1.m2();
              c1.m4();
    }
}