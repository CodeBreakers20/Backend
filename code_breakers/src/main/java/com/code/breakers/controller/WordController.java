package com.code.breakers.controller;

import java.util.List;

import javax.swing.GroupLayout.Group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.breakers.entity.Word;
import com.code.breakers.service.WordService;

@RestController
@RequestMapping("/words")
public class WordController {
	
	@Autowired
	WordService wordService;
	
	@PostMapping("/fillWords")
	public ResponseEntity<?> fillWordData(List<Word> words){
		wordService.fillData(words);
		return ResponseEntity.ok().body("Filled data success");
	}	
	
}
