class Test{
    public static void main(String[] args) {
        int[] Array = new int[-4];
        for(int i=0; i < Array.length; ++i){
            System.out.println(Array[i]);
        }
    }
}

//Exception in thread "main" java.lang.NegativeArraySizeException: -4
        //at Test.main(TestOne.java:3)