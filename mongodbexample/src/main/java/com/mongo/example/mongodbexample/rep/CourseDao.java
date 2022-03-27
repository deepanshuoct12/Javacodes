package com.mongo.example.mongodbexample.rep;

import com.mongo.example.mongodbexample.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long> {

}
