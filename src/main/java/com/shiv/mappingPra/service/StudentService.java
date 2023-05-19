package com.shiv.mappingPra.service;

import com.shiv.mappingPra.model.Student;
import com.shiv.mappingPra.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;
    public Student addStudent(Student student) {
       return studentRepo.save(student);
    }

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    public String deleteStudent(Integer id) {
         studentRepo.deleteById(id);
         return "deleted";
    }
}
