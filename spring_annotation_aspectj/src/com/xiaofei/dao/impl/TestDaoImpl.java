package com.xiaofei.dao.impl;

import org.springframework.stereotype.Repository;

import com.xiaofei.dao.TestDao;
@Repository("testDao")  //相当于<bean id="testDao" class="com.xiaofei.dao.impl.TestDaoImpl"/>
public class TestDaoImpl implements TestDao {

	@Override
	public void save() {
		System.out.println("保存");
		//测试异常通知
		//int n = 100/0;   
	}

	@Override
	public void modify() {
		System.out.println("修改");
	}

	@Override
	public void delete() {
		System.out.println("删除");
	}

}
