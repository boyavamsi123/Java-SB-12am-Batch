public class Demo2 {
    public static void main(String[] args) {
        SA sa1=new SA(101,"Rahul","rg@gmail.com",50000);
        SA sa2=new SA(102,"Priyanka","pg@gmail.com",150000);

        CA ca1=new CA(1001,"Sonai","sg@gmail.com",5500000);
        CA ca2=new CA(1002,"Narasimha","greetlabs@gmail.com",12100);
        AccountService.get_Bal(sa1);
        AccountService.get_Bal(ca1);
    }
}