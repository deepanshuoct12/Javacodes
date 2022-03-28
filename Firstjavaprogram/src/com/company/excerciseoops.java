package com.company;

import java.util.Scanner;

class game{
    int randno;
    int userno;
    int guess;
    public game()
    {
        randno=43;
        userno=-1;
        guess=0;
    }
    public void getuserno()
    {
        Scanner sc=new Scanner(System.in);
                int val=sc.nextInt();
                userno=val;
    }
    private void increment()
    {
        guess++;
    }
    public int play()
    {
        while(userno!=randno) {
            if (userno < randno) {
                System.out.println("no is less");
                Scanner sc=new Scanner(System.in);
                int val=sc.nextInt();
                userno=val;
                increment();
            } else if (userno > randno) {
                System.out.println("no is more");
                Scanner sc=new Scanner(System.in);
                int val=sc.nextInt();
                userno=val;
                increment();
            }
            else break;
        }
        return guess;
    }
}
public class excerciseoops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        game g=new game();

        g.getuserno();
        System.out.println(g.play());
    }
}
