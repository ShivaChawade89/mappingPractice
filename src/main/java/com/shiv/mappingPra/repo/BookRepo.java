package com.shiv.mappingPra.repo;

import com.shiv.mappingPra.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {
}
