package com.example.Biblioteca.controller;

import com.example.Biblioteca.model.Category;
import com.example.Biblioteca.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/add")
    public String add(@RequestBody Category category){
        categoryService.saveCategory(category);
        return "New category is added";
    }

    @GetMapping("/getAll")
    public List<Category> getAllCategories(){return categoryService.getAllCategories();}
}
