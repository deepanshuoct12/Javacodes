package com.company;
import java.util.Scanner;

class library{
    private String [] availbooks;
    private String [] issuedbooks;
    private int capacity;
    public library(int capacity)
    {
        this.capacity=capacity;
        availbooks=new String[this.capacity];
        issuedbooks=new String [this.capacity];
    }
    public void addbook(String book)
    {
        for(int i=0;i<this.capacity;i++)
        {   if(availbooks[i]==null)
            continue;
            if(availbooks[i].equals(book))
            {
                System.out.println("Book is already present ");
                return;
            }
        }

        if(availbooks[capacity-1]!=null)
        {
            System.out.println("capacity is fulll cant add further");
            return;
        }

        for(int i=0;i<capacity;i++)
        {
            if(availbooks[i]==null)
            {
                availbooks[i]=book;
                return;
            }
        }
    }

    public void issuebook(String book)
    {
        boolean present=false;
     for(int i=0;i<capacity;i++)
     {
         if(availbooks[i]==null)
             continue;
         if(availbooks[i].equals(book))
         {
             present=true;
            // break;
         }
         if(present)
             availbooks[i]=availbooks[i+1];
     }
     if(!present)
     {
         System.out.println("not present so cant issue book");
         return;
     }
     for(int i=0;i<capacity;i++)
     {
         if(issuedbooks[i]==null)
         {
             issuedbooks[i]=book;
             break;
         }
     }
        System.out.println("book issued successfully");
     return;
    }

    public void returnbook(String book)
    {
        boolean present=false;
      for(int i=0;i<capacity;i++)
      {
          if(issuedbooks[i]==null)
              continue;
          if(issuedbooks[i].equals(book))
          {
              present=true;
          }
          if(present)
              issuedbooks[i]=issuedbooks[i+1];
      }

      for(int i=0;i<capacity;i++)
      {
          if(availbooks[i]==null)
          { availbooks[i]=book;break;}
      }

        System.out.println("book returned successfully ");
         return;
    }
    public void showavailablebook()
    {
     for(int i=0;i<capacity;i++)
     {
         System.out.print(availbooks[i]);
         System.out.print('\t');
     }
        System.out.println();
     return;
    }

}
public class practiseques5 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    library obj=new library(5);
   obj.addbook("A");
    obj.addbook("B");
    obj.addbook("C");

    obj.showavailablebook();


    obj.issuebook("C");
        obj.showavailablebook();
        obj.returnbook("C");
        obj.showavailablebook();

        obj.issuebook("F");
        obj.addbook("D");
        obj.addbook("E");
        obj.addbook("F");
        obj.showavailablebook();
    }
}
