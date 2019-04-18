package com.xiaofei.instance.static_factory;

public class MyBean2Factory {
	//使用自己的工厂创建Bean1的实例
	public static Bean1 createBean() {
		return new Bean1();
	}
}
