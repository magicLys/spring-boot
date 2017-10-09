package com.lys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lys.dao.UserDao;
import com.lys.entity.UserEntity;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;

	public UserEntity getUserById(String userId) {
		return userDao.selectByPrimaryKey(userId);
	}
}
