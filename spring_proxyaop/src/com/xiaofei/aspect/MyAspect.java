package com.xiaofei.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		check();
		except();
		//ִ��Ŀ�귽��
		Object object = arg0.proceed();
		log();
		monitor();
		return null;
	}
	
	public void check() {
		System.out.println("ģ��Ȩ�޿���");
	}
	public void except() {
		System.out.println("ģ���쳣����");
	}
	public void log() {
		System.out.println("ģ����־��¼");
	}
	public void monitor() {
		System.out.println("���ܼ��");
	}

}
