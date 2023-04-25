package com.example.Biblioteca.service;

import com.example.Biblioteca.model.Category;
import com.example.Biblioteca.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
