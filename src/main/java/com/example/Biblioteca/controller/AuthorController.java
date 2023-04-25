package com.example.Biblioteca.controller;

import com.example.Biblioteca.model.Authors;
import com.example.Biblioteca.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
@CrossOrigin
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @PostMapping("/add")
    public String add(@RequestBody Authors authors){
        authorService.saveAuthor(authors);
        return "New author has added";
    }

    @GetMapping("/getAll")
    public List<Authors> getAllAuthors(){
        return authorService.getAllAuthors();
    }
}
