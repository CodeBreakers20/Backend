package com.code.breakers.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.breakers.entity.UserTemp;

public interface UserDao extends JpaRepository<UserTemp, Integer>{

}
