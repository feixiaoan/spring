package com.xiaofei.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xiaofei.service.UserService;

@Controller("userController")
public class UserController {
	@Resource(name="userService")
	//@Autowired
	private UserService userService;
	public void say() {
		this.userService.say();
		System.out.println("userController say hello");
	}
}
