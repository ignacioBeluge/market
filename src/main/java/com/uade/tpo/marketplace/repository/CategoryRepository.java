package com.uade.tpo.marketplace.repository;

import java.util.ArrayList;
import java.util.Arrays;

import com.uade.tpo.marketplace.entity.Category;

public class CategoryRepository {
    private ArrayList<Category> categories = new ArrayList<Category>(
        Arrays.asList(  Category.builder().description("electronica").id(1).build(),
                        Category.builder().description("cocina").id(2).build(),
                        Category.builder().description("gaming").id(3).build()      
        )
    );

    public ArrayList<Category> getCategories() {
        return this.categories;
    }
    public String getCategoryById (int categoryId) {
        return null;
    }
    public String createCategory(String entity) {
        return null;
    }
    
}


