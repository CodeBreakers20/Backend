package com.code.breakers.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.code.breakers.entity.Category;

@Service
public interface CategoryService {
	public List<Category> getCategory();
	public String acceptData();
}
