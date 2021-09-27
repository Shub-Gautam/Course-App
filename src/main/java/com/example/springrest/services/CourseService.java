package com.example.springrest.services;

import com.example.springrest.entity.Course;
import org.springframework.stereotype.Component;

import java.util.List;
//
//@Component("bean1")
public interface CourseService {
    public List<Course> getCourse();

    public Course getCourse(Long id);

    public void addCourse(Course cr);
}
