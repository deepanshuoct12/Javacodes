package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hii i am new to java ");
        Scanner s = new Scanner(System.in);
        System.out.println("enter first no");
        float a=s.nextFloat();
//          if(s.hasNextInt())
//              System.out.println("integer");
//          else
//              System.out.println("not integer");
        System.out.println("enter secoind no.");
        float b=s.nextFloat();

        System.out.println("enter third no.");
        float c=s.nextFloat();

        System.out.println("enter 4th no.");
        float d=s.nextFloat();

        System.out.println("enter 5th no.");
        float e=s.nextFloat();


        float sum=a+b+c+d+e;
        float perc= (float) (sum/5.0);
        String name="harry";
        System.out.print( name + "percentage is = " +perc);
    }
}
