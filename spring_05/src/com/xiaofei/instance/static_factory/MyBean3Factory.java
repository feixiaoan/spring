package com.xiaofei.instance.static_factory;

public class MyBean3Factory {
	public MyBean3Factory(){
		
	}
	//使用自己的工厂创建Bean3的实例
	public Bean3 createBean() {
		return new Bean3();
	}
}
