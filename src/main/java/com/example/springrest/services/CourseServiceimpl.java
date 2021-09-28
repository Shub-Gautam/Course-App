package com.example.springrest.services;

import com.example.springrest.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceimpl implements CourseService{

    List<Course> list ;

    public CourseServiceimpl() {
        list = new ArrayList<>();
        list.add(new Course(124,"Spring Boot Course","This is a spring boot online course"));
        list.add(new Course(224,"Java Tutorial","This is a java course"));
    }

    @Override
    public List<Course> getCourse() {
        return list;
    }

    @Override
    public Course getCourse(Long id) {
        Course c = null;
        for(Course cr : list){
            if (cr.getId()==id){
                c = cr ;
                break;
            }
        }
        return c ;
    }

    @Override
    public void addCourse(Course cr) {
        list.add(cr);
    }

    @Override
    public Course updateCourse(Course course) {
        long courseid = course.getId();
        list.forEach(e -> {
            if(e.getId()==course.getId()){
                e.setTitle(course.getTitle());
                e.setDescription(course.getDescription());
            }
        });
        return course ;
    }

    @Override
    public void deleteCourse(Long id){
            list=this.list.stream().filter(e->e.getId()!=id).collect(Collectors.toList());
    }

}
