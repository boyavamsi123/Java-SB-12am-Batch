class Test{
    public static void m1(){
        int a; //local variable only declaration
            a=100;
        System.out.println(a);
    }
    public static void m2(){
        int b;  //local & declaration
            b=200;
        System.out.println(a+b);
    }
    public static void main(String[] args){
        m1();
        m2();
    }
}