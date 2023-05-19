package com.shiv.mappingPra.service;

import com.shiv.mappingPra.model.Book;
import com.shiv.mappingPra.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;
    public Book addBook(Book book) {
        return bookRepo.save(book);
    }

    public List<Book> getAllBook() {
        return bookRepo.findAll();
    }

    public String deleteBook(Integer id) {
        bookRepo.deleteById(id);
        return "deleted Book";
    }
}
