package com.xiaofei.test;

import org.junit.Test;
import com.xiaofei.dao.TestDao;
import com.xiaofei.dao.impl.TestDaoImpl;
import com.xiaofei.proxyclass.JDKDynamicProxy;




public class test {
	
	@Test
	public void test() {
		//�����������
		JDKDynamicProxy jdkProxy = new JDKDynamicProxy();
		//����Ŀ�����
		TestDao testDao = new TestDaoImpl();
		/*
		 * �Ӵ�������л�ȡ��ǿ���Ŀ����󣬸ö�����һ��������Ķ���
		 * ������������߼�����invoke��
		 */
		TestDao testDaoAspect = (TestDao) jdkProxy.createProxy(testDao);
		//ִ�з���
		testDaoAspect.save();
		System.out.println("=========================");
		testDaoAspect.modify();
		System.out.println("=========================");
		testDaoAspect.delete();
	}

}