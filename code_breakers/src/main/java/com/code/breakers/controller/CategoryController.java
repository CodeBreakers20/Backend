package com.code.breakers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.breakers.entity.Category;
import com.code.breakers.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	
	@GetMapping("/getCategoryData")
	public ResponseEntity<?> sendCategoryData(){
		return ResponseEntity.ok().body(categoryService.getCategory());
	}
	
	@PostMapping
	public ResponseEntity<?> acceptData(List<Category> category){
		return ResponseEntity.ok().body(categoryService.acceptData(category));
	}
}
