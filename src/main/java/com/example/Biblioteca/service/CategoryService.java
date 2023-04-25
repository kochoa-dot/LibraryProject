package com.example.Biblioteca.service;

import com.example.Biblioteca.model.Category;

import java.util.List;

public interface CategoryService {
    public Category saveCategory(Category category);
    public List<Category> getAllCategories();
}
