package com.company;

class employee{
    private int id;
    private int salary;
    private String name;
    public employee(){
        id=100;
        salary=1000000;
        name="dyno";
    }
    public employee(int i,int s,String n)
    {
        id=i;
        s=salary;
        name=n;
    }

    public int get_salary()
    {
        return this.salary;
    }
    public String getName()
    {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print()
    {
        System.out.println(name);
        System.out.println(salary);
        System.out.println(id);
    }

}

class square{
    private int side;

    square(int side)
    {
        this.side=side;
    }
    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}
public class oops {
    public static void main(String[] args) {
        employee e1=new employee();
//        e1.id=1;
//        e1.name="abc";
//        e1.salary=9000000;

        employee e2=new employee(89,90000000,"kjl");
//        e2.id=2;
//        e2.salary=9800000;
//        e2.name="def";

        e1.print();
        e2.print();
        e1.setName("jkliu");
        System.out.println(e1.getName());
        System.out.println(e2.getName());



        square s=new square(4);

        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}
