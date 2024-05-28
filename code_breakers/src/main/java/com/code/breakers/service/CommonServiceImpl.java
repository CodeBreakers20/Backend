package com.code.breakers.service;

import java.util.UUID;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import com.code.breakers.dao.UserDao;
import com.code.breakers.entity.UserTemp;

public class CommonServiceImpl implements CommonService{
	
	@Autowired
	UserDao userDao;

	@Override
	public String generateUrl(Integer user_id) {
		UUID uuid  = UUID.randomUUID();
		
		UserTemp user = userDao.getById(user_id);
		user.setSessionId(uuid.toString());
		
		String urlString = 
	}

}
