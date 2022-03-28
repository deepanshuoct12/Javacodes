package com.company;

interface demoano{
    void meth1();
    void meth2();
}
class ano implements demoano
{

    @Override
     public void meth1()
    {
        System.out.println(" i am meth1 of ano class");
    }
    @Override
    public void meth2(){
        System.out.println("i am meth2 of ano class");
    }
}
interface sample2{
    void fun(int a);
}
public class anonymousclass_lambdaexpressions {
    public static void main(String[] args) {
        demoano obj= new demoano() {
            @Override
            public void meth1() {
                System.out.println("i am meth1");
            }

            @Override
            public void meth2() {
                System.out.println("i am meth2");
            }
        };

        obj.meth1();
        obj.meth2();

        //
        demoano ob=new ano();
        ob.meth1();
        ob.meth2();

        //lambda//
        sample2 s=(a)->{
            System.out.println(a);
        };
        s.fun(8);
    }
}
