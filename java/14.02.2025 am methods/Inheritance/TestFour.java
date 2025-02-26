class Account{
    final int min_Bal=500;

    public static void main(String[] args) {
        Account a1 = new Account();
        System.out.println(a1.min_Bal);//500
        a1.min_Bal=600; //cannot assign a value to final variable min_Bal
        System.out.println(a1.min_Bal);//600
    }
}