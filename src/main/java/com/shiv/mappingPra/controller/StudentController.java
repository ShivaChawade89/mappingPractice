package com.shiv.mappingPra.controller;

import com.shiv.mappingPra.model.Student;
import com.shiv.mappingPra.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@RequestParam Integer id){
        return studentService.deleteStudent(id);
    }
}
