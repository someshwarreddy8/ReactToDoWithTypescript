package com.kairos.controller;

import com.kairos.Entity.Category;
import com.kairos.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController()
@RequestMapping("/category")
public class CategoriesController {
    @Autowired
    private CategoryService categoryService;
    @PostMapping("addCategory")
    public ResponseEntity<String> addCategory(@RequestBody Category category) {

        categoryService.addCategory(category);

        return new ResponseEntity<>("category added.", HttpStatus.OK);
    }


    @GetMapping("getCategory")
    public ResponseEntity<Category> getCategory(@RequestParam Long categoryId) {

       Category category = categoryService.getCategory(categoryId);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    @GetMapping("getCategories")
    public ResponseEntity<ArrayList<Category>> getCategoriesList() {

        ArrayList<Category> categories = new ArrayList<>();

        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

}
