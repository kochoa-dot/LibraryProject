package com.example.Biblioteca.repository;

import com.example.Biblioteca.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface BooksRepository extends JpaRepository<Books, Integer> {

}
