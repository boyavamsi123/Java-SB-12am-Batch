
import javax.swing.text.View;

public class Test2{
    public static void main(String[] args) {
        m1();
    }
    public static Void m1(){
        m2();
    }
    public static void m2(){
        m1();
    }
}