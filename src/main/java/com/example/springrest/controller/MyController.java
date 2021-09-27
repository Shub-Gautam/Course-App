package com.example.springrest.controller;

import com.example.springrest.entity.Course;
import com.example.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService ;

    @GetMapping("/courses")
    public List<Course> getcouses(){
        return this.courseService.getCourse();
    }

    @GetMapping("/courses/{courseid}")
    public Course getcourse(@PathVariable String courseid){
        return this.courseService.getCourse(Long.parseLong(courseid));
    }

}
