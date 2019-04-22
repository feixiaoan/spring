package com.xiaofei.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaofei.bean.MyUser;
import com.xiaofei.dao.TestDao;



public class test {
	
	@Test
	public void test() {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TestDao testDao = (TestDao) applicationContext.getBean("testDao");
		String insertSql = "insert into user values(null, ?, ?)";
		//����param��ֵ��insertSql����еģ�һһ��Ӧ
		Object param1[] = {"С��1", "��"};
		Object param2[] = {"С��2", "��"};
		Object param3[] = {"С��3","��"};		
		//����û�
		testDao.update(insertSql, param1);
		testDao.update(insertSql,param2);
		testDao.update(insertSql, param3);
		//��ѯ�û�
		String selectSql = "select * from user";
		List<MyUser> list = testDao.query(selectSql,null);
		for(MyUser mu: list) {
			System.out.println(mu);
		}
		
		
		
		
	}

}