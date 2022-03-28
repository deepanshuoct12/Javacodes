package com.company;
import  java.util.*;
public class try_catch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//
//        try {
//            int c=a/b;
//            System.out.println(c);
//        }
//        catch (Exception e)
//        {
//            System.out.println("Cant divide");
//            System.out.println(e);
//        }


        int [] arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
//        System.out.println("enter index to access");
//        int idx=sc.nextInt();
//        System.out.println("enter no. to divide");
//        int no=sc.nextInt();
//        try {
//            System.out.println("value = " +arr[idx]);
//            System.out.println("division = "+arr[idx]/no);
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println("illegal divide");
//            System.out.println(e);
//        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("inded out of bounds");
//            System.out.println(e);
//        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }
      boolean flag=true;
      while(flag)
      {
          int idx=sc.nextInt();

          try {
              System.out.println("Welcome");
              try {
                  System.out.println("value = "+arr[idx]);
                  flag=false;
              }
              catch(ArrayIndexOutOfBoundsException e){
                  System.out.println("exception in level 2");
                  System.out.println("enter new number");
              }
          }
          catch (Exception e)
          {
              System.out.println("Exception in level 1");
              System.out.println(e);
          }
      }

    }
}
