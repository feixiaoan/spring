package com.xiaofei.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaofei.dao.UserDao;
import com.xiaofei.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	//@Resource(name="userDao")
	@Autowired
	private UserDao userDao;
	@Override
	public void say() {
		this.userDao.say();
		System.out.println("UserService say hello!");
	}

}
