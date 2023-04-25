package com.example.Biblioteca.service;

import com.example.Biblioteca.model.Books;

import java.awt.print.Book;
import java.util.List;

public interface BooksService {

    public Books saveBooks(Books books);

    public List<Books> getAllBooks();

}
