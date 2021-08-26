package com.course.courseservice.repository;

import com.course.courseservice.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    //Course findBiId(int id);
    public Course findById(int id);
}
