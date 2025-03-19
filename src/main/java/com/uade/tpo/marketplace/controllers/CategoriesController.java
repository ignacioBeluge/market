package com.uade.tpo.marketplace.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uade.tpo.marketplace.entity.Category;
import com.uade.tpo.marketplace.service.CategoryService;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("categories") //localhost:8080/categories

public class CategoriesController {
    @GetMapping //localhost:8080/categories (GET)
    public ArrayList<Category> getCategories() {
        CategoryService categoryService = new CategoryService();
        return categoryService.getCategories();
    }
    
    @GetMapping("/{categoryId}") //localhost:8080/categories/1 (get) me trae las categorias con id == 1. lo que va entre corchetes es variable, path = //
    public String getCategoryById (@PathVariable int categoryId) {
        CategoryService categoryService = new CategoryService();
        return categoryService.getCategoryById(categoryId);
    }
    
    @PostMapping //localhost:8080/categories (POST)
    public String createCategory(@RequestBody String categoryId) {
        //TODO: process POST request
        CategoryService categoryService = new CategoryService();
        return categoryService.createCategory(categoryId);
    }
    
    
}
