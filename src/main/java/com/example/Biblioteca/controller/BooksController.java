package com.example.Biblioteca.controller;

import com.example.Biblioteca.model.Books;
import com.example.Biblioteca.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@CrossOrigin
public class BooksController {
    @Autowired
    private BooksService booksService;

    @PostMapping("/add")
    public String add(@RequestBody Books books){
        booksService.saveBooks(books);
        return "New Book is added";
    }

    @GetMapping("/getAll")
    public List<Books> getAllBooks(){
        return booksService.getAllBooks();
    }
}
