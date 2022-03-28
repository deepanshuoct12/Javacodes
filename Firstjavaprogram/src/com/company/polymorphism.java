package com.company;

interface bicycle2{
    int x=100;
    void applybreak();
    void speedup();

}
interface hornbicycle2{
    int y=200;
    void hornbig();
    void hornsmall();
}
class supercycle2{
    protected int z=900;
    public void superfun()
    {
        System.out.println("hii i am super class and x value is" + z);
    }
}
class cycle2 extends supercycle2 implements bicycle2, hornbicycle2{
    public int a,b;

    public cycle2(){
        a=x;
        b=y;
    }
    public void fun()
    {
        System.out.println("Hii i am function of cycle class");
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
    }
    public void applybreak(){
        System.out.println("bicycle:break applied");
    }
    public void speedup(){
        System.out.println("bicycle:speedup");
    }

    public void hornbig(){
        System.out.println("hornbicycle:blow big horn");
    }
    public void hornsmall(){
        System.out.println("hornbicycle:blow small horn");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        cycle2 obj= new cycle2();
        obj.hornbig();
        obj.fun();
        obj.superfun();
        System.out.println(obj.z);
        System.out.println(obj.a);
        System.out.println(obj.b);

        bicycle2 obj2=new cycle2();
        obj2.applybreak();
        obj2.speedup();

        hornbicycle2 obj3=new cycle2();
        obj3.hornbig();
        obj3.hornsmall();
    }
}
