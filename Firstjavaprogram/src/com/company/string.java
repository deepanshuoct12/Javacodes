package com.company;

import java.util.Locale;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter first string");
//        String str=sc.next();
//        System.out.println(str);
//        System.out.println("enter second string ");
//        String str2=sc.nextLine();
//        System.out.println(str2);

        String name=new String("harry");
        System.out.println(name);

        int a=90;
        float b=9.0f;
        System.out.printf("value of a is %d and value of b is %8.9f",a,b);
        System.out.format("value of a is %d and value of b is %f",a,b);
        System.out.println();
        char []str = {'e','e','k','l','o'};
        String hello = new String(str);
        System.out.println(hello);

        int len = hello.length();
        System.out.println(len);
        System.out.println(hello.charAt(0));

        String s1="HELLO i am groot";
        String s2=s1.toLowerCase(Locale.ROOT);
        String s3=s2.toUpperCase(Locale.ROOT);
        String s4=s3.trim();
        String s5=s4.substring(2,7);
        String s6=s4.replace('L','o');
        System.out.println(s6.startsWith("HE"));
        System.out.println(s6.indexOf("HE",3));
        System.out.println(s1.lastIndexOf("L",3));
        String s7="HELLO i am groot";
        System.out.println(s1==s7);
        System.out.println(s1.equals(s7));
    }
}
