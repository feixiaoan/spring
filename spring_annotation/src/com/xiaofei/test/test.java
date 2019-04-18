package com.xiaofei.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaofei.controller.UserController;




public class test {
	
	@Test
	public void test() {
		//1.初始化spring容器，加载配置文件
		ApplicationContext applicationContext = 
									new ClassPathXmlApplicationContext("applicationContext.xml");
		UserController userController = (UserController) applicationContext.getBean("userController");
		userController.say();
	}

}