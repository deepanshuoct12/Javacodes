package com.company;
import java.util.Locale;
import java.util.Scanner;
public class practiseques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name ");
        String name=sc.nextLine();
        String str="HII MY NAME IS " + name;
        String ans=str.toLowerCase(Locale.ROOT);
        System.out.println("answer is " + ans);

        String ans2=ans.replace(' ','_');
        System.out.println("ans2 "+ans2);
        String ans3=ans.replace(name,"dynamik");
        System.out.println("ans3 " + ans3);
        String temp="this is  temp   string";
        System.out.println(temp.indexOf(' '));
        System.out.println(temp.indexOf("   "));

        String letter = "Dear Harry,\n\tThis java Course is nice.\n\tthanks";
        System.out.println(letter);
    }
}
