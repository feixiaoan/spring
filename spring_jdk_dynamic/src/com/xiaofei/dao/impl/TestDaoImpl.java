package com.xiaofei.dao.impl;

import com.xiaofei.dao.TestDao;

public class TestDaoImpl implements TestDao {

	@Override
	public void save() {
		System.out.println("±£´æ");
	}

	@Override
	public void modify() {
		System.out.println("ÐÞ¸Ä");
	}

	@Override
	public void delete() {
		System.out.println("É¾³ý");
	}

}
