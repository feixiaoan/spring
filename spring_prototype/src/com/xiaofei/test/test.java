package com.xiaofei.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xiaofei.scope.Scope;

public class test {
	
	@Test
	public void test() {
		//1.��ʼ��spring���������������ļ�
		ApplicationContext applicationContext = 
									new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.ͨ��������ȡBean3ʵ��
		Scope scope = (Scope) applicationContext.getBean("scope");
		Scope scope1 = (Scope) applicationContext.getBean("scope");
		System.out.println(scope);
		System.out.println("---------------�鿴���ε�������--------------------");
		System.out.println(scope1);
	}

}