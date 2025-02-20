/*interface UserInterface{
    public abstract void login();
    public abstract void logout();
}
class User implements UserInterface{
    public void login(){
        System.out.println("login");
    }
    public void logout(){
        System.out.println("logout");
    }
    public static void main(String[] args) {
        User u1 = new User();
        u1.login();
        u1.logout();
    }
}*/

interface UserInterface{
    public void login();
    abstract void logout();
    void forgetPassword();
}
public class User1 implements UserInterface{
    public void login(){
        System.out.println("login");
    }
    public void logout(){
        System.out.println("logout");
    }
    public void forgetPassword(){

    }
    public static void main(String[] args) {
        User u1 = new User();
        u1.login();
        u1.logout();
    }
}

