public class Demo{
    public static void main(String[] args) {
        SA sa1 = new SA();
        sa1.setAcc_Id(101);
        sa1.setAcc_Name("Rahul");
        sa1.setAcc_Email("rahul@gmail.com");
        sa1.setAcc_Bal(5000);
        sa1.cal_Bal();

        CA ca1 = new CA();
        ca1.setAcc_Id(102);
        ca1.setAcc_Name("Sonia");
        ca1.setAcc_Email("Sonia@gamil.com");
        ca1.setAcc_Bal(55000);
        ca1.cal_Bal();
    }
}