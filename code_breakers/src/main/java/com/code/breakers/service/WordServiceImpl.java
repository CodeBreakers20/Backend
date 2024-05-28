package com.code.breakers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.breakers.dao.WordDao;
import com.code.breakers.entity.Word;

@Service
public class WordServiceImpl implements WordService{
		
	@Autowired
	WordDao wordDao;
	
	@Override
	public void fillData(List<Word> list) {
		wordDao.saveAll(list);
	}

}
