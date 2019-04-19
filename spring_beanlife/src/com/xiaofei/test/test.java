package com.xiaofei.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xiaofei.life.BeanLife;




public class test {
	
	@Test
	public void test() {
		//1.初始化spring容器，加载配置文件
		ClassPathXmlApplicationContext cls = 
									new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("获得对象前");
		BeanLife beanlife= (BeanLife) cls.getBean("beanLife");
		System.out.println("获得对象后" + beanlife);
		//关闭容器，销毁Bean对象
		cls.close();
	}

}