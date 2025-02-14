class parent{
    public void getGoodQualiting(){
    System.out.println("parent class-method - getGoodQualiting");
}
class child extends parent{
    public void getGoodQualiting(){
    System.out.println("child class-method - getGoodQualiting");
}

public static void main(String[] args) {
    parent p1 = new parent();
    p1.getGoodQualiting();
    child c1 = new child();

}
}
}
