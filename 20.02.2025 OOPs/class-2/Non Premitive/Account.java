public class Account{
    int acc_Id;
    String acc_Name;
    private double  acc_Bal;
    public Account(int aid, String name){
        this.acc_Id = aid;
        this.acc_Name = name;
    }
    public void  set_acc_Bal(double bal){
        this.acc_Bal = this.acc_Bal+bal;
    }
    public double get_acc_Bal(){
        return this.acc_Bal;
    }
    public void cal_Bal(){
        System.out.println(this.acc_Bal-500);
    }
    public static void main(String[] args) {
       
    }
}