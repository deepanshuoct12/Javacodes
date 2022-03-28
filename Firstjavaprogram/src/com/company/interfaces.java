package com.company;

interface bicycle{
    int x=100;
    void applybreak();
    void speedup();
//    private void greet(){ error
//        System.out.println("good morning");
//    }
    default void handle(){   // it can be overrided
     //   greet();
        System.out.println("add new handle");
    }
}
interface hornbicycle{
    int y=200;
    void hornbig();
    void hornsmall();
}
class supercycle{
    protected int z=900;
    public void superfun()
    {
        System.out.println("hii i am super class and x value is" + z);
    }
}
class cycle extends supercycle implements bicycle, hornbicycle{
    public int a,b;

    public cycle(){
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
public class interfaces {
    public static void main(String[] args) {
        cycle obj=new cycle();
         obj.hornbig();
         obj.fun();
         obj.superfun();
        System.out.println(obj.z);
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.handle();
        bicycle obj2=new cycle();


        obj2.applybreak();
        obj2.speedup();

        hornbicycle obj3=new cycle();
        obj3.hornbig();
        obj3.hornsmall();
    }
}
