package com.company;

import java.util.ArrayList;
class mygeneric<T1,T2>{
    private int val;
    private T1 t1;
    private T2 t2;
    mygeneric(int val,T1 t1,T2 t2)
    {
        this.val=val;
        this.t1=t1;
        this.t2=t2;
    }

    T1 gett1()
    {
        return this.t1;
    }
    T1 sett1(T1 t1)
    {
       return this.t1=t1;
    }

    T2 gett2()
    {
        return this.t2;
    }
    T2 sett2(T2 t2)
    {
        return this.t2=t2;
    }

    int getval()
    {
        return this.val;
    }
}
public class generic {
    public static void main(String[] args) {
//        ArrayList arr = new ArrayList();
//        arr.add(1);
//        arr.add("jii");
//        arr.add(1.9f);
//        System.out.println(arr);

        mygeneric <String,Integer>obj=new mygeneric<String, Integer>(12,"abhi",21);
        System.out.println(obj.getval());
        System.out.println(obj.gett1());
        System.out.println(obj.gett2());
        obj.sett1("deepanshu");
        obj.sett2(23);
        System.out.println(obj.getval());
        System.out.println(obj.gett1());
        System.out.println(obj.gett2());
    }
}
