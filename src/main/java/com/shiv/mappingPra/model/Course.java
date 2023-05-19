package com.shiv.mappingPra.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String title;
    private String description;
    private String duration;

    @ManyToMany
    List<Student> studentList;
}

