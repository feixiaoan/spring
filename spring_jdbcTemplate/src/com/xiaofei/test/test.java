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
		//数组param的值与insertSql语句中的？一一对应
		Object param1[] = {"小飞1", "男"};
		Object param2[] = {"小飞2", "男"};
		Object param3[] = {"小飞3","男"};		
		//添加用户
		testDao.update(insertSql, param1);
		testDao.update(insertSql,param2);
		testDao.update(insertSql, param3);
		//查询用户
		String selectSql = "select * from user";
		List<MyUser> list = testDao.query(selectSql,null);
		for(MyUser mu: list) {
			System.out.println(mu);
		}
		
		
		
		
	}

}