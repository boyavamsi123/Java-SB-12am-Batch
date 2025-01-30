class Test{
    int a=100;//non static or instance vaiable
    static int b=200;//static variable or class level

    public static void main(String[] args){
        Test t1=new Test();
        System.out.println(t1.a);  //100
    }
}