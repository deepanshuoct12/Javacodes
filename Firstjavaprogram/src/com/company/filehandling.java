package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandling {
    public static void main(String[] args) throws IOException {


       File myfile=new File("tempfile.txt");

        //create a file//
//        try{
//            myfile.createNewFile();
//        }
//        catch (IOException e)
//        {
//            System.out.println("cant create file");
//            System.out.println(e);
//        }

        //write to a file//
        try {
            FileWriter obj=new FileWriter("tempfile.txt");
            obj.write("Hii i am new file");
            obj.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
            System.out.println("Cant write in a file");
        }
     // reading from a file

        try {
            Scanner sc=new Scanner(myfile);
            while (sc.hasNextLine())
            {
                String str=sc.nextLine();
                System.out.println(str);
            }
            sc.close();
        }
        catch (IOException e)
        {
            System.out.println("cant read");
            System.out.println(e);
        }

          //delete a file//
        if(myfile.delete())
        {
            System.out.println("file delete "+myfile.getName());
        }
        else
        {
            System.out.println("error ocuured");
        }
    }

}
