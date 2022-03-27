package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import com.springrest.springrest.services.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/home")
    public String home()
    {
        return "Welcome to application";
    }

    //get all request
    @GetMapping("/courses")
    public List<Course>getCourse(){
      //  courseService = new CourseServiceImpl();
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseid}")
    public Course getCourse(@PathVariable long courseid)
    {
        Course obj=this.courseService.getCourse(courseid);
      //  System.out.println(obj.getTitle());
        return obj;
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return this.courseService.addCourse(course);
    }

    @PutMapping ("/courses")
    public Course updateCourse(@RequestBody Course course)
    {
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseid}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable long courseid) {

        try {
            this.courseService.deleteCourse(courseid);
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
