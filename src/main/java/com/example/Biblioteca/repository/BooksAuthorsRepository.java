package com.example.Biblioteca.repository;

import com.example.Biblioteca.model.BooksAuthors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksAuthorsRepository extends JpaRepository<BooksAuthors, Integer> {

}
