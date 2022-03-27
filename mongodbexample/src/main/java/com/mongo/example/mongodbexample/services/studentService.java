package com.mongo.example.mongodbexample.services;

import com.mongo.example.mongodbexample.models.Student;

import java.util.List;

public interface studentService {
public List<Student> getStudents();
public Student getStudent(int studentid);
public void addStudent(Student student);
public void updateStudent(Student student);
public void deleteStudent(int studentid);
public Student temp(int studentid);
}
