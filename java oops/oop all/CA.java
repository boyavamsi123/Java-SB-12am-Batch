public class CA extends Account{
    double min_Bal = 12000;
    int acc_Id;
    double acc_Bal;
    public CA(int id,String name,String email,double bal){
        super(name,email);
        this.acc_Id=id;
        this.acc_Bal=bal;
    }
    public void cal_Bal(){
        double bal = this.acc_Bal - this.min_Bal;
        System.out.println(bal);
    }
}