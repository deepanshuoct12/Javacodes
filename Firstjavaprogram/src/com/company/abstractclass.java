package com.company;


abstract class parent{
    private int a;

    public void fun()
    {
        System.out.println("hii i am parent");
    }

    abstract protected void greet();
}
class child extends parent{
    private int b;

    public void fun2()
    {
        System.out.println("hii i am chiild class");
    }

    @Override
    public void greet(){
        System.out.println("good morning");
    }
}
public class abstractclass {
    public static void main(String[] args) {

        child obj=new child();
        parent p=new child();
        p.fun();
        p.greet();
        //p.fun2(); invalid
        obj.greet();
    }
}
