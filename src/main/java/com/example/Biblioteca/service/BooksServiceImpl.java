package com.example.Biblioteca.service;

import com.example.Biblioteca.model.Books;
import com.example.Biblioteca.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {
    @Autowired
    private BooksRepository booksRepository;

    @Override
    public Books saveBooks(Books books) {
        return booksRepository.save(books);
    }

    @Override
    public List<Books> getAllBooks() {
        return booksRepository.findAll();
    }
}
