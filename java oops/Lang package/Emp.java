class Emp{
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int c=100;

    Emp e1 = new Emp();
    Emp e2 = new Emp();
    String s1 = "Rahul";
    String s2 = "Rahul";
    String s3 = new String("Rahul");
    String s4 = new String("Rahul");

    System.out.println(a==b);           //false
    System.out.println(a==c);           //true - content comparision
    System.out.println(s1==s2);         //true - Ref comparision
    System.out.println(s1==s3);         //false - Ref comparision
    System.out.println(s1.equals(s3));  //true - content comarision
    System.out.println(e1==e2);         //false -  Ref 
    System.out.println(e1.equals(e2));  //false - Object class eq Ref
    System.out.println(s3.equals(s4));  //true -  Ref 
    System.out.println(s3==s4);         //false -  String class eq- contenet
    }
}