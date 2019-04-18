package com.xiaofei.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaofei.xml.User;



public class test {
	
	@Test
	public void test() {
		//1.初始化spring容器，加载配置文件
		ApplicationContext applicationContext = 
									new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.通过容器获取Bean3实例
		User user1 = (User) applicationContext.getBean("user1");
		User user2 = (User) applicationContext.getBean("user2");
		System.out.println(user1);
		System.out.println("---------------查看两次的输出结果--------------------");
		System.out.println(user2);
	}

}