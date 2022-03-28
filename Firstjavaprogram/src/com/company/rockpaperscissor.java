package com.company;
import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        Random random=new Random();
        int comp=random.nextInt(3);
        Scanner sc=new Scanner(System.in);

        System.out.println("enter 0/1/2");
        int n=sc.nextInt();
        //0->paper,1->scissor,2->rock;
        System.out.println("player-> "+ n);
        System.out.println("computer-> "+comp);
        if(comp==0 && n==2)
            System.out.println("computer wins");
        else if(comp==1 && n==0)
            System.out.println("computer wins");
        else if(comp==2 && n==1)
            System.out.println("computer wins");
        else if(comp==2 && n==0)
            System.out.println("user wins");
        else if(comp==0 && n==1)
            System.out.println("player wins");
        else if(comp==1 && n==2)
            System.out.println("player wins");
        else
            System.out.println("draw");


    }
}
