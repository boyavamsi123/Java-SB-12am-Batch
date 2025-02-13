abstract class Test{
    abstract void m1(); //declaration
    abstract void m2(); //declaration
    void m3(){}
}
abstract class child extends Test{
    void m1(){}  //implimentation
    void m2(){}
}