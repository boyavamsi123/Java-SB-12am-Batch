class Test{
    public static void main(String[] args) {
        System.out.println("GM");
        Thread.sleep(5000);   //CompileTimeException
        System.out.println("Gm");
    }
}