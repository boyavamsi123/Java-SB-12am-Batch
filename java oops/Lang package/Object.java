public class Object{
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
}

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