package com.xiaofei.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaofei.instance.static_factory.Bean3;

public class test {
	
	@Test
	public void test() {
		//1.初始化spring容器，加载配置文件
		ApplicationContext applicationContext = 
									new ClassPathXmlApplicationContext("bean3.xml");
		//2.通过容器获取Bean3实例
		Bean3 bean = (Bean3) applicationContext.getBean("bean3");
		System.out.println(bean);
	}

}