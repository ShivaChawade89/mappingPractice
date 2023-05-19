package com.shiv.mappingPra.controller;

import com.shiv.mappingPra.model.Laptop;
import com.shiv.mappingPra.model.Student;
import com.shiv.mappingPra.service.LaptopService;
import com.shiv.mappingPra.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("laptop")
public class LaptopController {
    @Autowired
    LaptopService laptopService;


    @PostMapping
    public Laptop addLaptop(@RequestBody Laptop laptop){
        return laptopService.addLaptop(laptop);
    }
    @GetMapping
    public List<Laptop> getAllLaptop(){
        return laptopService.getAllLaptop();
    }

    @DeleteMapping("/{id}")
    public String deleteLaptop(@RequestParam Integer id){
        return laptopService.deleteLaptop(id);
    }
}
