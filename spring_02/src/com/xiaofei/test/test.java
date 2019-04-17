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
		//1.初始化spring容器，加载配置文件
		ApplicationContext applicationContext = 
									new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.通过容器获取userDao实例
		UserService userService = (UserService) applicationContext.getBean("userService");
		//3.调用实例中的say()方法
		userService.say();
	}
	
	
	
}