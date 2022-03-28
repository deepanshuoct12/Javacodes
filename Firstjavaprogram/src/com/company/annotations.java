package com.company;

class phone{
    @Deprecated
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
}
@FunctionalInterface
interface Dyno{
    void sum();
}
public class annotations {
    @SuppressWarnings("depreciation")
    public static void main(String[] args) {
        phone obj=new phone();
        obj.sum(1,2);
    }
}
