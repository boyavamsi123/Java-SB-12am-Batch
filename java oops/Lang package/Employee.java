public class Employee{
    public static void main(String[] args){
        String s1 = "Rahul"; //using string iteral - only 1 string literal
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        String s2 = new String();
        String s3 = new String();
        System.out.println(e1);   //Employee@2f92e0f4
        System.out.println(e2);   //Employee@28a418fc
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equals(s3)); //false
        System.out.println(e1.equals(e2)); //false
    }
}