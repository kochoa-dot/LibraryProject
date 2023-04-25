package com.example.Biblioteca.service;

import com.example.Biblioteca.model.Authors;
import com.example.Biblioteca.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;
    @Override
    public Authors saveAuthor(Authors authors) {
        return authorRepository.save(authors);
    }

    @Override
    public List<Authors> getAllAuthors() {
        return authorRepository.findAll();
    }
}
