/*public abstract class Bank{
    public abstract void cal_Bal();
    
    public String getDetails(){
        return null;
    }
}
class Account extends Bank{
   public void cal_Bal(){
    System.out.println("Test case 123");
   }
   public static void main(String[] args) {
       Account a1 = new Account();
       a1.cal_Bal();
       System.out.println(a1.getDetails());
   }
}*/

public abstract class Bank{
    public abstract void cal_Bal();
    
    public String get_Bank_Details(){
        return "Bank Details :SBI";
    }
}
class Account extends Bank{
   public void cal_Bal(){
    System.out.println("Calculating Balance! Please wait");
   }
   public static void main(String[] args) {
       Account a1 = new Account();
       a1.cal_Bal();
       System.out.println(a1.get_Bank_Details());
   }
}