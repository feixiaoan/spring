package com.xiaofei.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaofei.dao.TestDao;



public class test {
	
	@Test
	public void test() {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取增强后的目标方法
		TestDao testDaoAdvice = (TestDao) applicationContext.getBean("testDao");
		//执行方法
		testDaoAdvice.save();
		System.out.println("-------------------------");
		testDaoAdvice.modify();
		System.out.println("-------------------------");
		testDaoAdvice.delete();
	}

}