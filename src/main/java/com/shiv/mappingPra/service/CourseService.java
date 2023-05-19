package com.shiv.mappingPra.service;

import com.shiv.mappingPra.model.Course;
import com.shiv.mappingPra.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;
    public Course addStudent(Course course) {
        return courseRepo.save(course);
    }

    public List<Course> getAllCourse() {
        return courseRepo.findAll();
    }

    public String deleteCourse(Integer id) {
        courseRepo.deleteById(id);
        return "deleted";
    }
}
