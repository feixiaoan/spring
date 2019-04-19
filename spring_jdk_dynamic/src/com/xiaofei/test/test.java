package com.xiaofei.test;

import org.junit.Test;
import com.xiaofei.dao.TestDao;
import com.xiaofei.dao.impl.TestDaoImpl;
import com.xiaofei.proxyclass.JDKDynamicProxy;




public class test {
	
	@Test
	public void test() {
		//创建代理对象
		JDKDynamicProxy jdkProxy = new JDKDynamicProxy();
		//创建目标对象
		TestDao testDao = new TestDaoImpl();
		/*
		 * 从代理对象中获取增强后的目标对象，该对象是一个被代理的对象，
		 * 它会进入代理的逻辑方法invoke中
		 */
		TestDao testDaoAspect = (TestDao) jdkProxy.createProxy(testDao);
		//执行方法
		testDaoAspect.save();
		System.out.println("=========================");
		testDaoAspect.modify();
		System.out.println("=========================");
		testDaoAspect.delete();
	}

}