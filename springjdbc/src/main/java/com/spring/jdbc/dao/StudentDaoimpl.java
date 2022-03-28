package com.spring.jdbc.dao;
import com.spring.jdbc.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("studentDao")
public class StudentDaoimpl implements StudentDao{
    @Autowired
   private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        String query="insert into student(id,name,city) values (?,?,?)";
        int result = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        return result;
    }
    public int change(Student student)
    {
        String query = "update student set city=?,name=? where id=?";
        int result = this.jdbcTemplate.update(query,student.getCity(),student.getName(),student.getId());
        return  result;
    }

    @Override
    public int delete(int studentid) {
        String query = "delete from student where id=?";
        int result = this.jdbcTemplate.update(query,studentid);
        return  result;
    }

    @Override
    public Student getStudent(int sid) {
        String query = "select * from student where id=?";
        RowMapper<Student> rowMapper=new RowMapperimpl() ;
        Student student = this.jdbcTemplate.queryForObject(query,rowMapper,sid);

        return student;
    }

    @Override
    public List<Student> getAllstudent() {
        String query = "select * from student";
        List<Student> studentlist = this.jdbcTemplate.query(query,new RowMapperimpl());

        return studentlist;
    }

    public JdbcTemplate getJdbcTemplate() {
        return this.jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
