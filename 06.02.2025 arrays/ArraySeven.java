class Array{
    public static void main(String[] args){
        String[] enames;
        enames = new String[4];
        enames[0] = "Rahul";
        enames[1] = "sonia";
        enames[2] = "null";
        enames[3] = "modi";

        int i=0;
        while(i<=3){
            System.out.println(enames[i]);
            i++;
        }
    }
}