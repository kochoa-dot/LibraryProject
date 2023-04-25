package com.example.Biblioteca.repository;

import com.example.Biblioteca.model.Books;
import com.example.Biblioteca.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
@CrossOrigin
public interface BooksRepository extends JpaRepository<Books, Integer> {

}
