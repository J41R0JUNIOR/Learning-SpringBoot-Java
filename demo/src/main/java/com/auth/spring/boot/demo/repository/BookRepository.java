package com.auth.spring.boot.demo.repository;

import com.auth.spring.boot.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{
    
}
