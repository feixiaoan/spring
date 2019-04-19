package com.xiaofei.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		check();
		except();
		//执行目标方法
		Object object = arg0.proceed();
		log();
		monitor();
		return null;
	}
	
	public void check() {
		System.out.println("模拟权限控制");
	}
	public void except() {
		System.out.println("模拟异常处理");
	}
	public void log() {
		System.out.println("模拟日志记录");
	}
	public void monitor() {
		System.out.println("性能监控");
	}

}
