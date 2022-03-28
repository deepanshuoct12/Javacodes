package com.company;
import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();

        if(a!=10)
            System.out.println("under age");
        else if(a>10 && a<89)
            System.out.println("between age");
        else
            System.out.println("greater age");


       int b=20;
        System.out.println(a>b?"a is greater":"b is greater");

        System.out.println(a|b);
        System.out.println(a&b);
        System.out.println(a^b);
        System.out.println(a==b);
        boolean f=true;
        boolean c=!f;
        System.out.println(c);
        System.out.println(false && true);
        System.out.println(true||true);




        ////switch case
        switch (a) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");

                System.out.println("default");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
