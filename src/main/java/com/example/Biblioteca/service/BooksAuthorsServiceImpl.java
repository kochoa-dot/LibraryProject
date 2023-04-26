package com.example.Biblioteca.service;

import com.example.Biblioteca.model.BooksAuthors;
import com.example.Biblioteca.repository.BooksAuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BooksAuthorsServiceImpl implements BooksAuthorsService {
    @Autowired
    private BooksAuthorsRepository booksAuthorsRepository;
    @Override
    public BooksAuthors saveBookAuthor(BooksAuthors booksAuthors) {
        return booksAuthorsRepository.save(booksAuthors);
    }

    @Override
    public List<BooksAuthors> getAllBooksAuthors() {
        return booksAuthorsRepository.findAll();
    }
}
