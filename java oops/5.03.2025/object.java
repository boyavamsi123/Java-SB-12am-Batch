class object{
    public boolean equales(object obj){
        return true;
    }
    public String toString(){
        return "Hi";
    }
}
class emp{
    public static void main(String[] args) {
        emp e1 = new emp();
        emp e2 = new emp();
        System.out.println(e1.toString());
        System.out.println(e1.equals(e2));
        //System.out.println(100.equals(100));
    }
}