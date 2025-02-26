public class Account{
    int acc_Id;
    String acc_Name;
    public  Account(int id, String Name){
        this.acc_Id = id;
        this.acc_Name = Name;
    }
    public static void main(String[] args) {
        Account a1 = new Account(101, "Rahul");
        System.out.println(a1.acc_Id); //101
        System.out.println(a1.acc_Name); //Rahul
        System.out.println(a1); // Object address Account@1fb3ebeb
        Account a2 = new Account(102, "Sonia"); //102Sonia
        System.out.println(a2.acc_Id); //102
        System.out.println(a2.acc_Name); //Sonial
        System.out.println(a2); //Account@548c4f57
    }
}