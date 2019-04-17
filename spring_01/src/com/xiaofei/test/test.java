package com.xiaofei.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import com.xiaofei.ioc.UserDao;

public class test {
	@Before
	public void berore() {
		
	}
	@Test
	public void test() {
		//1.��ʼ��spring���������������ļ�
		ApplicationContext applicationContext = 
									new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.ͨ��������ȡuserDaoʵ��
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		//3.����ʵ���е�say()����
		userDao.say();
	}
	
	
	
}