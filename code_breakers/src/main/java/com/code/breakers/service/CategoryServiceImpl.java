package com.code.breakers.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.breakers.dao.CategoryRepository;
import com.code.breakers.entity.Category;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public List<Category> getCategory() {
		// TODO Auto-generated method stub
		List<Category> list = categoryRepository.findAll();
		return list;
	}

	@Override
	public String acceptData() {
		
		List<Category> categories = new ArrayList<>();
		categories.add(new Category("Animals"));
        categories.add(new Category("Fruits"));
        categories.add(new Category("Countries"));
        categories.add(new Category("Colors"));
        categories.add(new Category("Vegetables"));
        categories.add(new Category("Sports"));
        categories.add(new Category("Professions"));
        categories.add(new Category("Body Parts"));
        categories.add(new Category("Vehicles"));
        categories.add(new Category("Shapes"));
        categories.add(new Category("Tools"));
        categories.add(new Category("Emotions"));
        categories.add(new Category("Clothing"));
        categories.add(new Category("Furniture"));
        categories.add(new Category("Insects"));
        categories.add(new Category("Planets"));
        categories.add(new Category("Flowers"));
        categories.add(new Category("Birds"));
        categories.add(new Category("Drinks"));
        categories.add(new Category("Desserts"));
        categories.add(new Category("Musical Instruments"));
        categories.add(new Category("Jobs"));
        categories.add(new Category("Sea Creatures"));
        categories.add(new Category("Mountains"));
        categories.add(new Category("Continents"));
        categories.add(new Category("Hobbies"));
        categories.add(new Category("Languages"));
        categories.add(new Category("Currencies"));
        categories.add(new Category("Dinosaurs"));
        categories.add(new Category("Famous Landmarks"));
        categories.add(new Category("Weather"));
        categories.add(new Category("Buildings"));
        categories.add(new Category("Famous People"));
        categories.add(new Category("Holidays"));
        categories.add(new Category("School Subjects"));
        categories.add(new Category("Modes of Transportation"));
        categories.add(new Category("Kitchen Items"));
        categories.add(new Category("Body Systems"));
        categories.add(new Category("Mythical Creatures"));
        categories.add(new Category("Constellations"));
        categories.add(new Category("Electronics"));
        categories.add(new Category("Games"));
        categories.add(new Category("Trees"));
        categories.add(new Category("Time Periods"));
        categories.add(new Category("Historical Events"));
        categories.add(new Category("Occupations"));
        categories.add(new Category("Art Styles"));
        categories.add(new Category("Gemstones"));
        categories.add(new Category("Fairy Tales"));
        categories.add(new Category("Superheroes"));
        categories.add(new Category("Greek Gods and Goddesses"));
        categories.add(new Category("Marvel Characters"));
        categories.add(new Category("DC Characters"));
        categories.add(new Category("Pixar Movies"));
        categories.add(new Category("Disney Princesses"));
        categories.add(new Category("Elements"));
        categories.add(new Category("Zodiac Signs"));
        categories.add(new Category("National Parks"));
        categories.add(new Category("Oceans"));
        categories.add(new Category("Mountains"));
        categories.add(new Category("Rivers"));
        categories.add(new Category("Lakes"));
        categories.add(new Category("Islands"));
        categories.add(new Category("Capitals"));
        categories.add(new Category("National Flags"));
        categories.add(new Category("Famous Authors"));
        categories.add(new Category("Famous Artists"));
        categories.add(new Category("Famous Scientists"));
        categories.add(new Category("Famous Inventors"));
        categories.add(new Category("Musical Genres"));
        categories.add(new Category("Types of Dances"));
        categories.add(new Category("Types of Music"));
        categories.add(new Category("Card Games"));
        categories.add(new Category("Board Games"));
        categories.add(new Category("Video Games"));
        categories.add(new Category("Computer Brands"));
        categories.add(new Category("Programming Languages"));
        categories.add(new Category("Web Browsers"));
        categories.add(new Category("Social Media Platforms"));
        categories.add(new Category("Search Engines"));
        categories.add(new Category("Operating Systems"));
        categories.add(new Category("Mobile Apps"));
        categories.add(new Category("Web Development Tools"));
        categories.add(new Category("Programming Concepts"));
        categories.add(new Category("Math Concepts"));
        categories.add(new Category("Physics Concepts"));
        categories.add(new Category("Chemistry Concepts"));
        categories.add(new Category("Biology Concepts"));
        categories.add(new Category("Geography Terms"));
        categories.add(new Category("History Terms"));
        categories.add(new Category("Literature Terms"));
        categories.add(new Category("Art Terms"));
        categories.add(new Category("Music Terms"));
        categories.add(new Category("Film Terms"));
        categories.add(new Category("Theater Terms"));
        categories.add(new Category("Photography Terms"));
        categories.add(new Category("Fashion Terms"));
        categories.add(new Category("Cooking Terms"));
        categories.add(new Category("Gardening Terms"));
        categories.add(new Category("DIY Projects"));
        
        List<Category> list = categoryRepository.saveAll(categories);
		if(list != null)
			return "Success";
		else {
			return "Failed";
		}
	}

}
