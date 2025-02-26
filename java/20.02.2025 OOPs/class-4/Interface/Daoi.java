interface Daoi{
    public abstract void login();
    public abstract void logout(); 
}
interface UserI{
    public abstract void forgetPassword();
}

class User implements Daoi,UserI{
    public void login(){
        System.out.println("Login Method");
    } 
    public void logout(){
        System.out.println("Logout Method");
    }
    public void forgetPassword(){
        System.out.println("forgetPassword Method");
    }
    public static void main(String[] args) {
        User u1 = new User();
        u1.login();
        u1.logout();
        u1.forgetPassword();
    }
}