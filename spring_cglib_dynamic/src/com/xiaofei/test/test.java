package com.xiaofei.test;

import org.junit.Test;
import com.xiaofei.dao.TestDao;
import com.xiaofei.proxyclass.CglibDynamicProxy;


public class test {
	
	@Test
	public void test() {
		//�����������
		CglibDynamicProxy cglibProxy = new CglibDynamicProxy();
		//����Ŀ�����
		TestDao testDao = new TestDao();
		
		//��ȡ��ǿ��Ķ���
		TestDao testDaoAspect = (TestDao) cglibProxy.createProxy(testDao);
		//ִ�з���
		testDaoAspect.save();
		System.out.println("=========================");
		testDaoAspect.modify();
		System.out.println("=========================");
		testDaoAspect.delete();
	}

}