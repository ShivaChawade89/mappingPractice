package com.shiv.mappingPra.controller;

import com.shiv.mappingPra.model.Course;
import com.shiv.mappingPra.model.Student;
import com.shiv.mappingPra.service.CourseService;
import com.shiv.mappingPra.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")
public class CourseController {
    @Autowired
    CourseService  courseService;

    @PostMapping
    public Course addStudent(@RequestBody Course course){
        return courseService.addStudent(course);
    }
    @GetMapping
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }

    @DeleteMapping("/{id}")
    public String deleteCourse(@RequestParam Integer id){
        return courseService.deleteCourse(id);
    }

}
