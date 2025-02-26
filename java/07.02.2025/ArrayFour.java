class Array{
    public static void main(String[] args) {
        int[] nums={3,8,6,5,10,12,15,7,16};

        int i=0;
        while(i<=9){
            if(nums[i]%2==0){
                System.out.println("Even numbers:"+nums[i]);
            }
            i++;
        }
    }
}