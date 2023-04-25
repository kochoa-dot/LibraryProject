package com.example.Biblioteca.repository;

import com.example.Biblioteca.model.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Authors, Integer> {

}
