package com.company;
//q1
abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen{
    void write()
    {
        System.out.println("writting");
    }
    void refill()
    {
        System.out.println("refilling");
    }
}

///q2
abstract class monkey {
    abstract void jump();
    abstract void bite();
}
interface basicanimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicanimal{
    @Override
    void jump()
    {
        System.out.println("jump");
    }
    @Override
    void bite()
    {
        System.out.println("bite");
    }
    @Override
    public void eat()
    {
        System.out.println("eat");
    }
    @Override
    public void sleep(){
        System.out.println("sleep");
    }
}

public class practiseques4 {
    public static void main(String[] args) {
        fountainpen p=new fountainpen();
        p.refill();
        p.write();

        human h=new human();
        h.jump();
        h.bite();
        basicanimal bs=new human();
        bs.eat();
        bs.sleep();
    }
}
