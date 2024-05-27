package com.code.breakers.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.breakers.entity.Word;

public interface WordRepository extends JpaRepository<Word, Integer>{

}
