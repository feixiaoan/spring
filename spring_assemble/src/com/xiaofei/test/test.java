package com.xiaofei.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaofei.xml.User;



public class test {
	
	@Test
	public void test() {
		//1.��ʼ��spring���������������ļ�
		ApplicationContext applicationContext = 
									new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.ͨ��������ȡBean3ʵ��
		User user1 = (User) applicationContext.getBean("user1");
		User user2 = (User) applicationContext.getBean("user2");
		System.out.println(user1);
		System.out.println("---------------�鿴���ε�������--------------------");
		System.out.println(user2);
	}

}