package package2;

public class temp5 {
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
