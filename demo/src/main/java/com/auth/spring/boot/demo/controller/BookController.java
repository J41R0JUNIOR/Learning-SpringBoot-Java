package com.auth.spring.boot.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.auth.spring.boot.demo.model.Book;
import com.auth.spring.boot.demo.service.BookService;

@RestController
@RequestMapping("api/v1/books")
public class BookController {
    
    @Autowired
    private BookService bookService;

    @GetMapping 
    public ResponseEntity<List<Book>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(bookService.findAll());
    }

    @GetMapping("/{id}")  
    public ResponseEntity<Optional<Book>> findBtId(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(bookService.findById(id));
    }

    @PostMapping  
    public ResponseEntity<Book> create(@RequestBody Book book) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.save(book));
    }

    @PutMapping
    public ResponseEntity<Book> update(@RequestBody Book book) {
        return ResponseEntity.status(HttpStatus.OK).body(bookService.save(book));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
