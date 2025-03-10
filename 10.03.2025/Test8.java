class Test{
    public static void main(String[] args) {
        int a1 = Integer.parseInt("10");
        System.out.println(a1);  //10
        int a2 = Integer.parseInt("Rahul");
        System.out.println(a2);  //Exception in thread "main" java.lang.NumberFormatException: For input string: "Rahul"
    }
}