class Test{
    public static void main(String[] args) {
        int[] eids = {101,102,103,104};
        System.out.println(eids[0]);  //101
        System.out.println(eids[20]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 4
    }
}