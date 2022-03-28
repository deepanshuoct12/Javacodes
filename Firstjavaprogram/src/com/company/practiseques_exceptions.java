package com.company;
import java.io.IOException;
import java.util.*;


class myexception2 extends Exception{
    String str;
    myexception2(String str)
    {
        this.str=str;
    }
    public String toString()
    {
        return this.str;
    }
}
public class practiseques_exceptions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        try {
//            int a= sc.nextInt();
//            int b=sc.nextInt();
//            int c=a/b;
//            System.out.println(c);
//        } catch (ArithmeticException a)
//        {
//            System.out.println("haha");
//        }
//        catch (IllegalArgumentException i)
//        {
//            System.out.println("hehe");
//
//        }
        int []arr= new int [10];
      for(int i=0;i<10;i++)
          arr[i]=i+1;
      boolean flag=true;
      int c=0;
        while (flag)
        {
            int idx=sc.nextInt();

            try {
                System.out.println("Array = " + arr[idx]);
                flag=false;
            }
            catch (Exception e)
            {
                System.out.println(e);
                System.out.println("enter valid index");
            }
            c++;
            if(c>5)
            {
                //System.out.println("error");
                try {
                    throw new myexception2("error");
                }
                catch (Exception e) {
                    System.out.println(e);
                }
                break;
            }
        }

    }
}
