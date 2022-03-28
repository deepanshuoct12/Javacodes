package com.company;
import  java.util.Scanner;
public class practiseques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter sub1 marks");
//        float a= sc.nextFloat();
//        System.out.println("enter second marks");
//        float b=sc.nextFloat();
//        System.out.println("enter sub3 marks");
//        float c= sc.nextFloat();
//
//        float perc=((a+b+c)/3.0f);
//        if(a>=33 && b>=33 && c>=33 && perc>=40)
//            System.out.println("pass");
//        else
//            System.out.println("fail");


//        System.out.println("enter salary");
//        float sal= sc.nextFloat();
//
//        if(sal>=250000 && sal<=500000)
//            System.out.println(sal*0.05f);
//        else if(sal>=500000 && sal<=1000000)
//            System.out.println(sal*0.2f);
//        else
//            System.out.println(0.3f*sal);


//        System.out.println("enter number");
//        int n= sc.nextInt();
//        switch (n) {
//            case 1:
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println("tuesday");
//                break;
//            case 3:
//                System.out.println("wednesday");
//                break;
//            case 4:
//                System.out.println("thursday");
//                break;
//            case 5:
//                System.out.println("friday");
//                break;
//            case 6:
//                System.out.println("saturday");
//                break;
//            default:
//                System.out.println("sunday");
//                break;
//        }
//        System.out.println("enter website");
//        String str=sc.nextLine();
//
//        int idx=str.indexOf('.');
//        String sub=str.substring(idx+1);
//        System.out.println(sub);
//
//        if(sub.equals("com"))
//            System.out.println("commercial website");
//        else if(sub.equals("org"))
//            System.out.println("organisation website");
//        else if(sub.equals("in"))
//            System.out.println("indian website");
//        else
//            System.out.println("cant detect");
     for(int i=0;i<=10;i++)
         System.out.println(i);
     int n=10000;
     while(n>0)
     {
         System.out.println(n);
         n/=10;
     }
     int x=0;
     do{
         System.out.print(x);
         x+=10;
         break;
     }while(x<100);
    }
}
