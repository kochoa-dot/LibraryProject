package com.example.Biblioteca.service;

import com.example.Biblioteca.model.Authors;

import java.util.List;

public interface AuthorService {
    public Authors saveAuthor(Authors authors);
    public List<Authors> getAllAuthors();
}
