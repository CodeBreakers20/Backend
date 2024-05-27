package com.code.breakers.service;

import java.util.List;

import com.code.breakers.entity.Category;

public interface CategoryService {
	public List<Category> getCategory();
	public String acceptData(List<Category> category);
}
