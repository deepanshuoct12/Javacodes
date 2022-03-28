package com.company;
import java.util.Scanner;
//import java.util.Arrays;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int [] arr= new int[5];
//        for(int i=0;i<5;i++)
//        {
//            int v=sc.nextInt();
//            arr[i]=v;
//        }
//        sort(arr);//sort
//        for(int i=arr.length-1;i>=0;i--)
//        {
//            System.out.println(arr[i]);
//        }
//        for(int v:arr)
//            System.out.print(v);

//        System.out.println();
//        System.out.println(binarySearch(arr,3));//binary search
//
//        int []arr2={1,2,3,4,5};
//        if(Arrays.equals(arr, arr2))
//            System.out.println("equal");
//        else
//            System.out.println("not equals");
//
        int [][] arr3;
        arr3 = new int [3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int val=sc.nextInt();
                arr3[i][j]=val;
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr3[i][j]);
                System.out.print('\t');
            }
            System.out.println();
        }

    }
}
