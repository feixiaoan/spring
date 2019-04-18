package com.xiaofei.test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaofei.instance.static_factory.Bean1;

public class test {
	@Before
	public void berore() {
		
	}
	@Test
	public void test() {
		//1.初始化spring容器，加载配置文件
		ApplicationContext applicationContext = 
									new ClassPathXmlApplicationContext("bean1.xml");
		//2.通过容器获取Bean1实例
		Bean1 bean = (Bean1) applicationContext.getBean("bean1");
		System.out.println(applicationContext.getBean("bean1"));
	}

}