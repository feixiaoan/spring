package com.xiaofei.dao.impl;

import org.springframework.stereotype.Repository;

import com.xiaofei.dao.UserDao;
@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public void say() {
		System.out.println("UserDao say hello!");
	}

}
