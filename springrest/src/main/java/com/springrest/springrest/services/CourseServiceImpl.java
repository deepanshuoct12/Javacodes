package com.springrest.springrest.services;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {
   // public List<Course>l;
    @Autowired
   private CourseDao courseDao;
    public CourseServiceImpl() {
//        l=new ArrayList<>();
//        l.add(new Course(1,"english","this is english course"));
//        l.add(new Course(2,"Math","this is Math course"));
    }

    @Override
    public List<Course> getCourses() {
        return this.courseDao.findAll();
       // return this.l;
    }

    @Override
    public Course getCourse(long courseid) {
//        Course c=null;
//        for(Course course:l)
//        {
//            if(course.getId()==courseid)
//            {
//                c=course;
//                break;
//            }
//        }
//        return c;
//   Course obj=courseDao.getById(courseid);
//        System.out.println(obj);
//      return obj;

        return courseDao.findById(courseid).get();
    }

    @Override
    public Course addCourse(Course course) {
       // this.l.add(course);
        this.courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long courseid) {
        //this.l=this.l.stream().filter(e->e.getId()!=courseid).collect(Collectors.toList());
        this.courseDao.deleteById(courseid);
    }

    @Override
    public Course updateCourse(Course course) {
//        Course updatedcourse=null;
//        for(Course c:l)
//        {
//            if(c.getId()==course.getId())
//            {
//                c.setTitle(course.getTitle());
//                c.setDescription(course.getDescription());
//                updatedcourse=c;
//                break;
//            }
//        }
        this.courseDao.save(course);
        return course;
    }
}
