package com.shiv.mappingPra.controller;

import com.shiv.mappingPra.model.Book;
import com.shiv.mappingPra.model.Student;
import com.shiv.mappingPra.service.BookService;
import com.shiv.mappingPra.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }
    @GetMapping
    public List<Book> getAllBook(){
        return bookService.getAllBook();
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@RequestParam Integer id){
        return bookService.deleteBook(id);
    }
}
