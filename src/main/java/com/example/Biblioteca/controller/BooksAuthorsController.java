package com.example.Biblioteca.controller;

import com.example.Biblioteca.model.BooksAuthors;
import com.example.Biblioteca.service.BooksAuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booksAuthors")
@CrossOrigin
public class BooksAuthorsController {
    @Autowired
    private BooksAuthorsService booksAuthorsService;

    @PostMapping("/add")
    public String add(@RequestBody BooksAuthors booksAuthors){
        booksAuthorsService.saveBookAuthor(booksAuthors);
        return "New Id's has added";
    }

    @GetMapping("/getAll")
    public List<BooksAuthors> getBooksAuthors(){
        return booksAuthorsService.getAllBooksAuthors();
    }
}
