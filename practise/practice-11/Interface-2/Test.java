interface A{
    void m1();
    public abstract void m2(); 
}
class Test implements A{
    public void m1(){}
    public void m2(){}
}
//wheather we are declared or not every interface method is by default -
// it is abstract and public