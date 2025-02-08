
import java.util.Arrays;

class Test{
    public static void main(String[] args) {
        int[] Array={12,24,63,45};
        System.out.println("Array Before Resize: ");
        for(int i = 0; i<Array.length; i++){
            System.out.println(Array[i]);
        }

        Array = Arrays.copyOf(Array, 6);
        Array[4] = 11;
        Array[5] = 55;

        System.out.println("Array After Resize: ");
        for(int i = 0; i < Array.length; i++){
            System.out.println(Array[i]);
        }
    }
}