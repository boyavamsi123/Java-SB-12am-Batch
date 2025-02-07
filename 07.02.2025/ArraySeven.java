class Array{
    public static void main(String[] args) {
        int[] nums={3,8,6,5,10,12,15,7,16};

        int sum=0;
        for(int num : nums){
            sum = sum+num;
        }
        System.out.println("Sum of array elements:"+sum);
    }
}