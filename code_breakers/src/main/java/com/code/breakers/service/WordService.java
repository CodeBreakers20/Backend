package com.code.breakers.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.code.breakers.entity.Word;

@Service
public interface WordService {
	
	public void fillData(List<Word> list);

}
