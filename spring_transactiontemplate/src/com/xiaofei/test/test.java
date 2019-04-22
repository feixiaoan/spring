package com.xiaofei.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xiaofei.transaction.CodeTransaction;



public class test {
	
	@Test
	public void test() {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		CodeTransaction codeTransaction = (CodeTransaction) applicationContext.getBean("codeTransaction");
		String result = codeTransaction.test();
		System.out.println(result);
		
	}

}