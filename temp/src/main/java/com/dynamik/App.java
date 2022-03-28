package com.dynamik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args ) throws Exception
    {
       // System.out.println( "Hello Worl d!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        vehicle obj = (vehicle)context.getBean("vehicle");
        obj.drive();
    }
}
