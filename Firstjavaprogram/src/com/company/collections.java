package com.company;

import java.util.*;

public class collections {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<Integer>arr=new ArrayList<Integer>();

        for(int i=0;i<10;i++)
            arr.add(i);

        System.out.println("Arraylist -> " + arr);
        arr.add(1,10);
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);

        System.out.println(arr.contains(9));
        ArrayList<Integer>arr2 = new ArrayList<Integer>();
         for(int i=10;i<=100;i+=10){
             arr2.add(i);
         }
         arr.addAll(arr2);
        System.out.println(arr);
        arr.addAll(4,arr2);
        System.out.println(arr);
        System.out.println("first occurrance --> "+arr.indexOf(10));
        System.out.println("last occurance --> "+arr.lastIndexOf(10));
        for (int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }
        arr.remove(arr.size()-1);
        arr.set(0,1000);
        System.out.println(arr);
        //List//
        System.out.println("...........LINKED LIST.........");
        LinkedList<Integer>l = new LinkedList<Integer>();
        for(int i=100;i<=1000;i+=100)
            l.add(i);

        l.add(0,2000);
        l.remove(1);
        l.set(5,67889);
        l.addLast(290807);
        l.addFirst(909090);
        System.out.println(l);
        System.out.println(l.get(0));

        //Arraydeque//
        System.out.println(".....ARRAYDEQUEUE...");
        ArrayDeque<Integer>q=new ArrayDeque<Integer>();
        q.add(9);
        q.add(90);
        q.add(989);
        q.addAll(arr);
        q.addFirst(876);
        q.addLast(768);
        System.out.println(q.getFirst());
        q.remove(876);
        q.removeLast();
        q.removeFirst();

        System.out.println(q.getLast());
        System.out.println(q.getLast());

        System.out.println(q);
        //Hahset//
        HashSet<Integer>h=new HashSet<>();
        h.add(10);
        h.add(1);
        h.add(2);
        h.add(2);
        h.remove(2);
        System.out.println(h.size());
        h.addAll(arr);
        System.out.println(h.contains(3));
        System.out.println(h);
        //HashMap

        System.out.println(System.currentTimeMillis());

    }
}
