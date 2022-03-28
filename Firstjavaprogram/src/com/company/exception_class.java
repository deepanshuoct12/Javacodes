package com.company;
import java.io.IOException;
import java.util.*;
class myexception extends Exception{
  //  String str;

//    myexception(String str)
//    {
//        this.str=str;
//    }
@Override
    public String toString()
    {
        return "I am toString()";
      //  return this.str;
    }
    @Override
    public String getMessage()
    {
        return "I am getMessage()";
    }
}

//throws///
class negativeexception extends Exception{

    @Override
    public String toString()
    {
        return "excepton";
    }
    @Override
    public String getMessage()
    {
        return "negative number input";
    }
}
public class exception_class {

    public static int sum(int a,int b) throws negativeexception
    {
        if(a<0 || b<0)
        {
            throw new negativeexception();
        }
        return a+b;
    }
  public static int divide(int a,int b)throws IOException
  {
      if(b<0)
      {
          throw new IOException();
      }
      return a/b;
  }
  //finally block
  public static int greet()
  {
      try{
          int a=10;
          int b=20;
          int c=b/a;
          return c;
      }
      catch (Exception e)
      {
          System.out.println(e);
      }
      finally {
          System.out.println("cleaning  up the resources");
      }
      return -1;
  }
    public static void main(String[] args) throws negativeexception {
     Scanner sc = new Scanner(System.in);
//     int a=sc.nextInt();
//     if(a<10)
//     {
//         try {
//           //  throw new myexception("yo yo exception");
//             throw new myexception();
//             //throw new ArithmeticException();
//         }
//          catch (Exception e) {
//              System.out.println(e);
//              System.out.println(e.getMessage());
//              System.out.println(e.toString());
//             e.printStackTrace();
//         }
//     }

//        int a=sc.nextInt();
//        int b=sc.nextInt();
//
//        try {
//            int c=sum(a,b);
//            System.out.println(c);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//
//   try {
//       int d=sc.nextInt();
//       int e=sc.nextInt();
//
//       int ans=divide(d,e);
//       System.out.println(d);
//   }
//   catch (Exception e)
//   {
//       System.out.println(e);
//   }

        System.out.println(greet());

        try{
            int c=9/0;
            System.out.println(c);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("i am finally");
        }

    }
}
