package com.company;
class temp1 extends Thread{
    public void run()
    {
        int i=0;
        while (i<40) {
            System.out.println("good morning");
            i++;
        }
    }
}
class temp2 extends Thread{
    public void run(){
        int i=0;
        while(i<40) {
            System.out.println("Welcome");
            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
public class practiseques_threads {
    public static void main(String[] args) {
        temp1 ob1=new temp1();
        temp2 ob2=new temp2();
        System.out.println(ob1.getState());
        ob1.start();
        ob2.start();
        System.out.println(ob1.getState());
    }
}