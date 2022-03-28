package com.company;

class thread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<40000)
        {
            System.out.println("first");
            i++;
        }
    }

}

class thread2 extends Thread{

    @Override
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("second");
            i++;
        }
    }
}
///implement///
class threadrunnable1 implements Runnable{

    @Override
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("1");
            i++;
        }
    }
}
class threadrunnable2 implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("2");
            i++;
        }
    }
}

//constructor///

class mythr extends Thread{
    mythr(String str)
    {
        super(str);
    }
//   mythr(Runnable r){
//        super(r);
//   }
    public void run(){
        System.out.println("Hii i am thread");
    }
}


//////thread priority//////

class sam extends Thread{
    sam(String str)
    {
        super(str);
    }
    @Override
    public void run()
    {
        System.out.println(this.getId()+" --> " + this.getName() + " ---> " + this.getPriority());
    }
}

////thread methods////
class th1 extends Thread{
    public  void run()
    {
        int i=0;
        while(i<40)
        {
            System.out.println("1");
            try {
                sleep(455);
               // interrupt();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class th2 extends Thread{
    public  void run()
    {
        int i=0;
        while(i<40)
        {
            System.out.println("2");
            i++;
        }
    }
}

public class multithreading{
    public static void main(String[] args) throws InterruptedException {
//        thread1 t1=new thread1();
//        thread2 t2=new thread2();
//        t1.start();
//        t2.start();

//        threadrunnable1 bullet1 = new threadrunnable1();
//        threadrunnable2 bullet2 = new threadrunnable2();
//
//
//        Thread gun1= new Thread(bullet1);
//        Thread gun2 = new Thread(bullet2);
//
//        gun1.start();
//        gun2.start();

//        mythr obj = new mythr("abcdef");
//        obj.start();
//        System.out.println(obj.getId());
//        System.out.println(obj.getName());
//        System.out.println(obj.getPriority());

//        sam obj1 = new sam("A");
//        sam obj2 = new sam("B");
//        sam obj3 = new sam("C");
//        sam obj4 = new sam("D");
//        sam obj5 = new sam("E");
//
//        obj5.setPriority(Thread.MAX_PRIORITY);
//        obj1.setPriority(Thread.MIN_PRIORITY);
//        obj1.start();
//        obj2.start();
//        obj3.start();
//        obj4.start();
//        obj5.start();
  th1 ob1=new th1();
  th2 ob2 = new th2();


  ob1.start();
  ob1.interrupt();
//    try {
//        ob1.join();
//    }
//    catch (Exception e)
//    {
//        System.out.println(e);
//    }
     //   ob1.sleep(455);
  ob2.start();


    }
}
