package package1;

import package2.temp4;

class C extends temp4 {
    int c;
    void fun3(){
        System.out.println("hii i am fun3 of c class");
        tempfun();
    }

}
public class temp3 {
    public static void main(String[] args) {
        dyno obj=new dyno(1000);
        System.out.println(obj.fun2());
        obj.fun();

       temp4 ob=new temp4();
        System.out.println(ob.mainvariable);
        C object=new C();
        object.fun3();

    }
}
