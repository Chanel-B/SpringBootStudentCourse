package com.student.studentservice.controller;

import com.student.studentservice.model.Student;
import com.student.studentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * mapping all request to "/student"
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentRepository repo;

    @GetMapping
    Collection<Student> getAll() {
        return repo.findAll();
    }
}
