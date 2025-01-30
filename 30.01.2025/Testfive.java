class Test{
    byte 1;
    short 2;
    int 4;
    long 8;
    float 4;
    double 8;
    char 1;
    public static void main(String[] args){
        Test t1=new Test();
        System.out.println(t1.1);
        System.out.println(t1.2);
        System.out.println(t1.4);
        System.out.println(t1.8);
        System.out.println(t1.4);
        System.out.println(t1.8);        
        System.out.println(t1.1);           
    }
}