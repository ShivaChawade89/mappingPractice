package com.shiv.mappingPra.repo;

import com.shiv.mappingPra.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop,Integer> {
}
