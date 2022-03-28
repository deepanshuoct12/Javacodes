package package2;

class X{
    int x=10000;
    protected int y=200000;
    void fun()
    {
        System.out.println("hi i am fun() of X class");
        temp4 ob=new temp4();
        System.out.println(ob.mainvariable);
    }
}
class A{
      int a;
    void seta(int a)
    {
        this.a=a;
    }
    void fun()
    {
        System.out.println("Hii i am fun of A");
        X ob=new X();
        System.out.println(ob.x);
        System.out.println(ob.y);
        ob.fun();
    }

}

class B extends  A{
    int b;
    void setb(int b)
    {
        this.b=b;
    }
    void fun2(){
        System.out.println("Hii i am fun2 of B");
        System.out.println(a);
        A ob=new A();
        System.out.println(ob.a);
        ob.fun();
    }
}
public class temp4 {
    public int mainvariable=2929290;
    protected void tempfun()
    {
        System.out.println("hii i am protected function in temp4 class of package2 ");
    }
    public static void main(String[] args) {

        A obj1=new A();
        B obj2=new B();
        obj1.seta(100);
        obj2.setb(900);

        System.out.println(obj1.a);
        System.out.println(obj2.b);
        obj2.fun2();
    }
}
