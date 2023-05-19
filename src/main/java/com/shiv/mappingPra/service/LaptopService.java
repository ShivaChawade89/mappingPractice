package com.shiv.mappingPra.service;

import com.shiv.mappingPra.model.Laptop;
import com.shiv.mappingPra.repo.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    LaptopRepo laptopRepo;

    public Laptop addLaptop(Laptop laptop) {
        return laptopRepo.save(laptop);
    }

    public List<Laptop> getAllLaptop() {
        return laptopRepo.findAll();
    }

    public String deleteLaptop(Integer id) {
        laptopRepo.deleteById(id);
        return "deleted";
    }
}
