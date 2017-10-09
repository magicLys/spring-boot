package com.lys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lys.entity.UserEntity;
import com.lys.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	public UserEntity getUserById(String userId) {
		UserEntity user = userService.getUserById(userId);
		return user;
	}

}
