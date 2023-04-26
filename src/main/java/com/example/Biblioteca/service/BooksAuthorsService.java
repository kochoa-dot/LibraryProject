package com.example.Biblioteca.service;

import com.example.Biblioteca.model.BooksAuthors;

import java.util.List;

public interface BooksAuthorsService {
    public BooksAuthors saveBookAuthor(BooksAuthors booksAuthors);

    public List<BooksAuthors> getAllBooksAuthors();

}
