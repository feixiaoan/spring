package com.xiaofei.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xiaofei.life.BeanLife;




public class test {
	
	@Test
	public void test() {
		//1.��ʼ��spring���������������ļ�
		ClassPathXmlApplicationContext cls = 
									new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("��ö���ǰ");
		BeanLife beanlife= (BeanLife) cls.getBean("beanLife");
		System.out.println("��ö����" + beanlife);
		//�ر�����������Bean����
		cls.close();
	}

}