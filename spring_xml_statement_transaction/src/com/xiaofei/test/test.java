package com.xiaofei.test;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xiaofei.controller.StatementController;

public class test {
	
	@Test
	public void test() {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		StatementController statementController = (StatementController) applicationContext.getBean("statementController");
		String result = statementController.test();
		System.out.println(result);
	}

}