package com.code.breakers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.code.breakers.dao.CategoryRepository;
import com.code.breakers.entity.Category;

public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public List<Category> getCategory() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public String acceptData(List<Category> category) {
		List<Category> Categories = categoryRepository.saveAll(category);
		if(Categories != null)
			return "Success";
		else {
			return "Failed";
		}
	}

}
