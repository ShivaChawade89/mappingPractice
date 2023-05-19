package com.shiv.mappingPra.repo;

import com.shiv.mappingPra.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
