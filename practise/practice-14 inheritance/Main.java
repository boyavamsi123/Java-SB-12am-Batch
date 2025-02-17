class Data{
    int s=10;
    int l=20;
    int b=30;
    int s1=25, s2=35, s3=42;
}
class square extends Data{
    int area;
    void calarea(){
        area = s*s;
        System.out.println(area);
    }
}

class Rectangle extends Data{
    int p, area;
    void calculate(){
        p=2*(l+b);
        area=l*b;
        System.out.println("parameter :"+p);
        System.out.println("area :"+area);
    }
}

class main{
    public static void main(String[] args){
        square s = new square();
        Rectangle r = new Rectangle();
        s.calarea();
        r.calculate();
    }
}