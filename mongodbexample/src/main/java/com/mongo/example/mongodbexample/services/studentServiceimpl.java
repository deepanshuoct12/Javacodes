package com.mongo.example.mongodbexample.services;

import com.mongo.example.mongodbexample.models.Course;
import com.mongo.example.mongodbexample.models.Student;
import com.mongo.example.mongodbexample.rep.CourseDao;
import com.mongo.example.mongodbexample.rep.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentServiceimpl implements studentService {

    @Autowired
     private StudentRepository studentRepository;
    @Autowired
    private CourseDao courseDao;

    public studentServiceimpl() {

    }

    @Override
    public List<Student> getStudents() {
        return this.studentRepository.findAll();
    }

    @Override
    public Student getStudent(int studentid) {
        return this.studentRepository.findById(studentid).get();
    }

    @Override
    public void addStudent(Student student) {
         this.studentRepository.save(student);
    }

    @Override
    public void updateStudent(Student student) {
         this.studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int studentid) {
      this.studentRepository.deleteById(studentid);
    }

    @Override
    public Student temp(int studentid) {
        Course course=this.courseDao.findById((long) studentid).get();
        Student student=this.studentRepository.findById(studentid).get();
        student.setName(course.getTitle());
        System.out.println(student);
        this.studentRepository.save(student);
        return student;
    }


}
