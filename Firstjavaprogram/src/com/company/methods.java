package com.company;
import java.util.Scanner;
public class methods {
    static int fun(int a,int b)
    {
        int min = Math.min(a, b);
        return min;
    }
    int fun2(int a,int b)
    {
        return Math.min(a,b);
    }
    static void fun3(int []arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            arr[i]+=100;
        }
    }
    static void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    static void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    static void sum(int a,int b,int c,int d)
    {
        System.out.println(a+b+c+d);
    }
    static int fun4(int ...arr)
    {
        //varags
        //arguments are recieved as array
        int sum=0;
        for(int x:arr)
            sum+=x;
        return sum;
    }
    static int fun5(int y,int ...arr)
    {
        //varags
        //arguments are recieved as array
        int sum=y;
        for(int x:arr)
            sum+=x;
        return sum;
    }
    static int fact(int n)
    {
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
//        for(String str:args)
//            System.out.println(str);

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(fun(a,b));

        methods obj=new methods();
        System.out.println(obj.fun2(a,b));//call with object
        int []arr={1,2,3,4,5};
        fun3(arr);
        for(int x:arr)
            System.out.print(x);

        ////methodoverloading//
        sum(2,3);
        sum(2,3,4);
        sum(1,2,3,4);

        System.out.println(fun4(1,2,34,5,6,6,7,8));
        System.out.println(fun5(5));

        System.out.println(fact(10));
    }
}
