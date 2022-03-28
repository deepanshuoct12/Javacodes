package package1;

import package2.temp2;
class dyno{
    int a;
    public dyno(int a)
    {
        this.a=a;
    }
     public void fun()
     {
         System.out.println("Hii this is dyno class");
     }
     public int fun2()
     {
         return this.a;
     }
}
public class temp1 {
    public static void main(String[] args) {
        System.out.println("hii i am temp1");
        temp2 obj = new temp2();
        obj.main();
        System.out.println(obj.fun(10,20));
    }
}
