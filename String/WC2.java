class WC2{
    public static void main(String[] args) {
        Integer a1 = 100; //auto boxing
        //internally caling - Integer.valueOf(100)

        System.out.println(a1);  //100


        int a = a1.intValue(); // create wrapper class object for given primitive & object 

        System.out.println(a);   //100

        int b = a1; //Unboxing
        //int b = a1.intValue();  //Unboxing

        System.out.println(b);    //100
    }
}