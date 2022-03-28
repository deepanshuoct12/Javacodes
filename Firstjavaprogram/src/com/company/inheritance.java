package com.company;

class base{
    public int b;
    base(int n)
    {
        this.b=n;
    }
    public int getb()
    {
        return this.b;
    }
    public void setb(int n)
    {
        this.b=n;
    }
}

class derived extends base{
    public int d;
    derived(int a,int b)
    {
       super(a);

        this.d=b;
    }
    public int getd(){
      //  return super.getb();
        return this.d;
    }
    public void setd(int d){
        this.d=d;
    }
    public int getbase_b()
    {
        return super.getb();
    }
    public int setbase_b(int val)
    {
        super.b=val;
        return super.b;
    }
}

//method overriding////
class A{
    public int a;
    A(int a)
    {
        this.a=a;
    }

    public int getA()
    {
        return this.a;
    }

    public void setA(int val)
    {
        this.a=val;
    }
    protected void fun()
    {
        System.out.println("base:override");
    }

}

class B extends A{
    public int b;
    B(int x,int y)
    {
        super(x);
        this.b=y;
    }
    public int getB()
    {
        return this.b;
    }

    public void setB(int val)
    {
        this.b=val;
    }

    @Override
    public void fun()
    {
        System.out.println("derived:override");
    }
}
public class inheritance {
    public static void main(String[] args) {
//    base ob1=new base(10);
//        System.out.println(ob1.getb());
//        ob1.setb(20);
//        System.out.println(ob1.getb());
//        derived ob2=new derived(1234,890);
//
//        System.out.println(ob2.getd());
//        ob2.setb(200);
//        System.out.println(ob2.getb());
//        System.out.println(ob2.b);
//        System.out.println(ob2.d);
//        System.out.println(ob2.setbase_b(190876767));

       //A a=new A(1990);
        //B d=new B(10,100);
        A a=new B(10,89);

        a.fun();
        System.out.println(a.getA());
    }
}
