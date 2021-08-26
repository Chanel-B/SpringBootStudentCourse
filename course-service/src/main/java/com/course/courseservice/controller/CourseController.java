package com.course.courseservice.controller;

import com.course.courseservice.model.Course;
import com.course.courseservice.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseRepository repo;

    @GetMapping
    Collection<Course> getAll(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    Course getCourseById(@PathVariable("id") int id){
        return repo.findById(id);
    }

}