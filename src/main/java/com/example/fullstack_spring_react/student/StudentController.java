package com.example.fullstack_spring_react.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//allow us to sue endpoint that the client can consume
@RestController
//changing the url
@RequestMapping(path = "api/v1/students")
public class StudentController {
    @GetMapping
    public List<Student> getAllStudents(){
        List<Student> students = Arrays.asList(
                new Student(1L,
                        "Jamila",
                        "Jamila@amigoscode.edu",
                        Gender.Female),
                new Student(2L,
                        "Alex",
                        "Alex@amigoscode.edu",
                        Gender.Male)
        );
        return students;
    }
}
