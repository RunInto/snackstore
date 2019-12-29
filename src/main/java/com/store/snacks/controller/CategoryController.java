package com.store.snacks.controller;

import com.store.snacks.entity.Category;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @PostMapping("/insert")
    public void insert(/*@RequestBody Category c*/){
        Category c = new Category();
        c.setId(1);
        c.insert();
    }
}
