package com.auth.spring.boot.demo.service;

import com.auth.spring.boot.demo.model.Book;

import java.util.List;
import java.util.Optional;


public interface BookService {
    
    Book save(Book book);

    List<Book> findAll();

    Optional<Book> findById(Long id);

    Book update(Book book);

    void deleteById(Long id);
}
