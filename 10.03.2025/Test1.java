class Test{
    public static void main(String[] args) {
        System.out.println("Hello, Gm"); //Hello, Gm
        System.out.println(10/5);        //2
        try {
            System.out.println(10/0);  //AE - ArithmaticException
        } catch (Exception e) {
            System.out.println(10/1);     //10
        }
        System.out.println("GN");         //GN
    }
}