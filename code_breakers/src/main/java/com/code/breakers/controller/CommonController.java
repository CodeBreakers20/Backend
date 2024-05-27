package com.code.breakers.controller;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.GeneratedValue;

@RestController
@RequestMapping("/newGame")
public class CommonController {
	
	public ResponseEntity<?> GenerateUrl() {
		return null;
	}

	
}
