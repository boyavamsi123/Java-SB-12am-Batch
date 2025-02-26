class Test{
    int a;        //instance
    static int b; //static var
    public static void main(String[] args){
        int c=300; //local var
        System.out.println(b+Test.b); //0
        Test t1=new Test();
        System.out.println(t1.a+t1.b+c);//300
        Test t2=new Test();
        t2.a=101;
        Test.b=11;
        System.out.println(t1.a+t2.a+t1.b); //112
        b=14;
        System.out.println(t1.b+t1.b+b+Test.b); //56

    }
}