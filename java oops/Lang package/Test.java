/*class Test{
    public String getMyname(){
        return "ProStack";
    }
    public static void main(String[] args) {
        Test t1 = new  Test();
        System.out.println(t1);               //Test@2f92e0f4
        System.out.println(t1.toString());    //Test@2f92e0f4
        System.out.println(t1.getMyname());   //ProStack
    }
}*/

class Test{
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println(t1.equals(t2));
    }
}