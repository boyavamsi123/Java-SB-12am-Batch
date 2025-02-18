interface UserInterface{
    public void login();
    abstract void logout();
    void forgetPassword();
}
public class User implements UserInterface{
    public void login(){
        System.out.println("login");
    }
    public void logout(){
        System.out.println("logout");
    }
    public void forgetPassword(){
        System.out.println("forgetPassword");
    }
    public static void main(String[] args) {
        User u1 = new User();
        u1.login();
        u1.logout();
        u1.forgetPassword();
    }
}
