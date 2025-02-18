interface Bank1{
    //public static final int min_Bal=500;
    int min_Bal=500;
}
class Account implements Bank1{
    public static void main(String[] args){
        int min_Bal=600;
        System.out.println(min_Bal);
        System.out.println(Account.min_Bal);
    }
}