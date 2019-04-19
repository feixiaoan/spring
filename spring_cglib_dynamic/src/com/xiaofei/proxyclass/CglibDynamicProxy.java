package com.xiaofei.proxyclass;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import com.xiaofei.aspect.MyAspect;

public class CglibDynamicProxy implements MethodInterceptor {
	
	/**
	 * 创建代理的方法，生成CGLIB代理对象
	 * target是目标对象，需要增强的对象
	 * 返回目标对象的CGLIB代理对象
	 */
	public Object createProxy(Object target) {
		//创建一个动态类对象，即增强类对象
		Enhancer enhancer = new Enhancer();
		//确定增强的类，设置其父类
		enhancer.setSuperclass(target.getClass());
		//确定代理逻辑对象为当前对象，要求当前对象实现MethodInterceptor的方法
		enhancer.setCallback(this);
		//返回创建的代理对象
		return enhancer.create();
	}
	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		//创建一个切面
		MyAspect myAspect = new MyAspect();
		//前增强
		myAspect.check();
		myAspect.except();
		//目标方法执行，返回代理结果
		Object object = methodProxy.invokeSuper(proxy, args);
		//后增强
		myAspect.log();
		myAspect.monitor();
		return object;
	}

}
