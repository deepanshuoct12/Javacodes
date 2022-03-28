package com.company;

interface one {
    void a();
    void b();
}
interface two extends one{
    void c();
    void d();
}
interface three extends one,two{
    void e();
    void f();
}
class sample implements three{
    public void a(){
        System.out.println("a");
    }
    public void b(){
        System.out.println("b");
    }
    public void c()
    {
        System.out.println("c");
    }
    public  void d(){
        System.out.println("d");
    }
    public void e()
    {
        System.out.println("e");
    }
   public void f(){
        System.out.println("f");
    }
}
public class inheritence_interface {
    public static void main(String[] args) {
     sample obj= new sample();
     obj.a();
     obj.b();
     obj.c();
     obj.d();
     obj.e();
     obj.f();
    }
}
