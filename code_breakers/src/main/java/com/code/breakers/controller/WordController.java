package com.code.breakers.controller;

import java.util.List;

import javax.swing.GroupLayout.Group;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.breakers.entity.Word;

@RestController
@RequestMapping("/words")
public class WordController {
	@PostMapping("/fillWords")
	public ResponseEntity<?> fillWordData(List<Word> words){
		return ResponseEntity.ok().body("Filled data success");
	}
}
