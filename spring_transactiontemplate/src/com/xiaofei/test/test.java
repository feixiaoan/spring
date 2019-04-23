package com.xiaofei.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xiaofei.transaction.TransactionTemplateDao;



public class test {
	
	@Test
	public void test() {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		TransactionTemplateDao transactionTemplateDao = (TransactionTemplateDao) applicationContext.getBean("transactionTemplateDao");
		String result = transactionTemplateDao.test();
		System.out.println(result);
	}

}