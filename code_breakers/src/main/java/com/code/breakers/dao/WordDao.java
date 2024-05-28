package com.code.breakers.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.breakers.entity.Word;

public interface WordDao extends JpaRepository<Word, Integer>{

}
