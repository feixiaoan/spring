package com.xiaofei.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xiaofei.scope.Scope;

public class test {
	
	@Test
	public void test() {
		//1.初始化spring容器，加载配置文件
		ApplicationContext applicationContext = 
									new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.通过容器获取Bean3实例
		Scope scope = (Scope) applicationContext.getBean("scope");
		Scope scope1 = (Scope) applicationContext.getBean("scope");
		System.out.println(scope);
		System.out.println("---------------查看两次的输出结果--------------------");
		System.out.println(scope1);
	}

}