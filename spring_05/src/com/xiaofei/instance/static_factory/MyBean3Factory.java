package com.xiaofei.instance.static_factory;

public class MyBean3Factory {
	public MyBean3Factory(){
		
	}
	//ʹ���Լ��Ĺ�������Bean3��ʵ��
	public Bean3 createBean() {
		return new Bean3();
	}
}
