class Test{
    int a=100;
    int b=200;
    static int c=300;
    public static void main(String[] args){
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println(t1.a+t2.b+c); //600
        t2.a=11;
        System.out.println(t1.a+t1.b); //300
        System.out.println(t2.a+t2.b); //211
    }
}