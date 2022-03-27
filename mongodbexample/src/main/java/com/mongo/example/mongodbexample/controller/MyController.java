package com.mongo.example.mongodbexample.controller;

import com.mongo.example.mongodbexample.models.Student;
import com.mongo.example.mongodbexample.rep.StudentRepository;
import com.mongo.example.mongodbexample.services.studentService;
import jdk.jshell.Snippet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class MyController {
//   @Autowired
//    private StudentRepository studentRepository;
//    @PostMapping("/")
//    public ResponseEntity<?>addStudent(@RequestBody Student student){
//      Student save=this.studentRepository.save(student);
//      return ResponseEntity.ok(save);
//    }
//
//    @GetMapping("/")
//    public ResponseEntity<?>getStudent(){
//
//        return ResponseEntity.ok(this.studentRepository.findAll());
//    }

    @Autowired
    private studentService studentservice;

    @GetMapping("/")
    public List<Student> getStudents()
    {
       return this.studentservice.getStudents();
    }

    @GetMapping("/{studentid}")
    public Student getStudent(@PathVariable int studentid)
    {
       return this.studentservice.getStudent(studentid);
    }
    @PostMapping("/")
     public ResponseEntity<String> addStudent(@RequestBody Student student)
     {
         this.studentservice.addStudent(student);
         return new ResponseEntity<>("Student added",HttpStatus.OK);
     }
     @PutMapping("/")
    public ResponseEntity<String>updateStudent(@RequestBody Student student)
     {
         this.studentservice.updateStudent(student);
         return new ResponseEntity<>("Student updated",HttpStatus.OK);
     }

     @DeleteMapping("/{studentid}")
     public ResponseEntity<String> deleteStudent(@PathVariable int studentid)
     {
         try{
             this.studentservice.deleteStudent(studentid);
             return new ResponseEntity<>("deleted",HttpStatus.OK);
         }catch (Exception e)
         {
             System.out.println(e);
             return new ResponseEntity<>("",HttpStatus.INTERNAL_SERVER_ERROR);
         }

     }
     @GetMapping("/temp/{studentid}")
     public Student temp(@PathVariable int studentid)
     {
         return this.studentservice.temp(studentid);
     }
}
