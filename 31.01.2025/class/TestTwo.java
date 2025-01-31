class Test{
    int a;
    static int b;
    public static void main(String[] args){
        int c=300;
        System.out.println(b+Test.b); //0
        //                   0 + 0      //default value
        //how to access static variable
        // using object
        //using class name
        //using directly in static context
    }
}