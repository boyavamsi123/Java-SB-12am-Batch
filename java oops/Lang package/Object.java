/*public class Object{
    public String toString(){
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        //return "alia";
    }
    public boolean equales(Object obj){
        return true;
    }
}
class  Test{
    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(t1.toString());
        System.out.println(t1);
    }
}*/

/*public class Test extends Object{
    public String toString() {
        //return getClass().getName() + "@" + Integer.toHexString(hashCode());
        return "Test Class - to String method";
    }
   
    public static void main(String[] args) {
        Test t1=new Test();
        System.out.println(t1);//Test@2c7b84de
        System.out.println(t1.toString());//Test@2c7b84de
    }
}*/

class object{
    public boolean equales(object obj){
        return true;
    }
    public String toString(){
        return "Hi";
    }
}
class emp{
    public static void main(String[] args) {
        emp e1 = new emp();
        emp e2 = new emp();
        System.out.println(e1.toString());
        System.out.println(e1.equals(e2));
    }
}