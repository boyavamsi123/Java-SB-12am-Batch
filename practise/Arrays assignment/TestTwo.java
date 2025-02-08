class Test{
    public static void main(String[] args) {
        int[] Array = {12,24,63,45};
        System.out.println("Array Before Resize: ");
        for(int i=0; i<Array.length; i++){
            System.out.println(Array[i]);
        }

        int[] temp = new int[6];
        int length = Array.length;
        for(int j = 0; j < length; j++){
            temp[j] = Array[j];
        }
        Array = temp;

        System.out.println("Array After Resize: ");
        for(int i = 0; i < Array.length; i++){
            System.out.println(Array[i]);
        }
    }
}