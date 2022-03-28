package com.spring.jdbc;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoimpl;
import com.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");//for using configuration xml file
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);// for not using xml config and using jdbcconfig.java file
                Student student = new Student();
    //   student.setId(3);
//        student.setName("abhishek");
//        student.setCity("banglore ");

          int id=2;
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
       // int res=studentDao.delete(id);
//        Student s=studentDao.getStudent(id);
//        System.out.println(s.getName());
        List<Student> obj=studentDao.getAllstudent();
        for(Student s: obj)
            System.out.println(s.getName());
      //  System.out.println(obj);
        //System.out.println("updates "+ obj.getCity() +" "+  obj.getName());
//        JdbcTemplate template=context.getBean("jdbcTemplate", JdbcTemplate.class);
//        String query="insert into student(id,name,city) values (?,?,?)";
//        int result = template.update(query,2,"abhi","mumbai");
//        System.out.println("inserted " + result);
    }
}
