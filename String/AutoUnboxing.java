class AutoUnboxing  {
    public static void main(String[] args) {
        Integer a1 = 100; //auto boxing - convert primitive to object
        int b = a1; //Unboxing - convert object to primitive
          int a = a1.intValue(); // create wrapper class object for given primitive & object

        //internally caling - Integer.valueOf(100)

        System.out.println(a);   //100
        System.out.println(a1);  //100
        System.out.println(b);   //100

    }
}