package com.kairos.service;

import com.kairos.Entity.Category;
import com.kairos.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;

    public void addCategory(Category category) {
        try {
            categoryRepo.save(category);
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while adding a new category.", e);
        }
    }

    public Category getCategory(Long categoryId) {
        try {
            return categoryRepo.findById(categoryId).get();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while getting category with id.", e);
        }
    }
}
