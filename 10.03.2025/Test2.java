public class Test2{
    public static void main(String[] args) {
        String ename = null;
        System.out.println(ename.length());
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
        //at Test2.main(Test2.java:4)
    }
}