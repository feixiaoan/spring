package com.xiaofei.test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaofei.ioc.UserService;

public class test {
	@Before
	public void berore() {
		
	}
	@Test
	public void test() {
		//1.��ʼ��spring���������������ļ�
		ApplicationContext applicationContext = 
									new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.ͨ��������ȡuserDaoʵ��
		UserService userService = (UserService) applicationContext.getBean("userService");
		//3.����ʵ���е�say()����
		userService.say();
	}
	
	
	
}