package com.example.springrest.controller;

import com.example.springrest.entity.Course;
import com.example.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService ;

//    @RequestMapping(path = "/courses",method = RequestMethod.GET)    =====> this is an alternative approach in mvc
    @GetMapping("/courses")
    public List<Course> getcouses(){
        return this.courseService.getCourse();
    }

    @GetMapping("/courses/{courseid}")
    public Course getcourse(@PathVariable String courseid){
        return this.courseService.getCourse(Long.parseLong(courseid));
    }

    @PostMapping("/courses")
    public void addCourse(@RequestBody Course body){
        this.courseService.addCourse(body);
    }
}
