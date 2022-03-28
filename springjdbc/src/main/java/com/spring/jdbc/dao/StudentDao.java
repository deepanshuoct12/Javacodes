package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;

import java.util.List;

public interface StudentDao {
    int insert(Student student);

    int change(Student student);

    int delete(int studentid);

    Student getStudent(int id);

    List<Student> getAllstudent();
}
