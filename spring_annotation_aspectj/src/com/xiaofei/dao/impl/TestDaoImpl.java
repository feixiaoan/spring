package com.xiaofei.dao.impl;

import org.springframework.stereotype.Repository;

import com.xiaofei.dao.TestDao;
@Repository("testDao")  //�൱��<bean id="testDao" class="com.xiaofei.dao.impl.TestDaoImpl"/>
public class TestDaoImpl implements TestDao {

	@Override
	public void save() {
		System.out.println("����");
		//�����쳣֪ͨ
		//int n = 100/0;   
	}

	@Override
	public void modify() {
		System.out.println("�޸�");
	}

	@Override
	public void delete() {
		System.out.println("ɾ��");
	}

}
