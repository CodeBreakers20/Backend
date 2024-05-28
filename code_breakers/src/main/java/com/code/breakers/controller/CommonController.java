package com.code.breakers.controller;

import java.util.UUID;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.GeneratedValue;

@RestController
@RequestMapping("/game")
public class CommonController {
	
	@Autowired
	CommonService commonService
	
	@GetMapping("/getUrl")
	public ResponseEntity<?> generateUrl() {
		
		
		return ResponseEntity.ok().body(null);
	}

	
}
