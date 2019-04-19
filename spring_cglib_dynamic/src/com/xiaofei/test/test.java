package com.xiaofei.test;

import org.junit.Test;
import com.xiaofei.dao.TestDao;
import com.xiaofei.proxyclass.CglibDynamicProxy;


public class test {
	
	@Test
	public void test() {
		//创建代理对象
		CglibDynamicProxy cglibProxy = new CglibDynamicProxy();
		//创建目标对象
		TestDao testDao = new TestDao();
		
		//获取增强后的对象
		TestDao testDaoAspect = (TestDao) cglibProxy.createProxy(testDao);
		//执行方法
		testDaoAspect.save();
		System.out.println("=========================");
		testDaoAspect.modify();
		System.out.println("=========================");
		testDaoAspect.delete();
	}

}