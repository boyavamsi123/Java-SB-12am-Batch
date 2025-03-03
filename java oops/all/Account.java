public class Account extends Bank{
    private String acc_Name;
    private String acc_Email;

    public String getAcc_Name() {
        return acc_Name;
    }

    public void setAcc_Name(String acc_Name) {
        this.acc_Name = acc_Name;
    }

    public String getAcc_Email() {
        return acc_Email;
    }

    public void setAcc_Email(String acc_Email) {
        this.acc_Email = acc_Email;
    }

    @Override
    public void cal_Bal() {

    }
}