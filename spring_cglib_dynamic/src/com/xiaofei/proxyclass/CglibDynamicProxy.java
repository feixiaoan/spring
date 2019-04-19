package com.xiaofei.proxyclass;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import com.xiaofei.aspect.MyAspect;

public class CglibDynamicProxy implements MethodInterceptor {
	
	/**
	 * ��������ķ���������CGLIB�������
	 * target��Ŀ�������Ҫ��ǿ�Ķ���
	 * ����Ŀ������CGLIB�������
	 */
	public Object createProxy(Object target) {
		//����һ����̬����󣬼���ǿ�����
		Enhancer enhancer = new Enhancer();
		//ȷ����ǿ���࣬�����丸��
		enhancer.setSuperclass(target.getClass());
		//ȷ�������߼�����Ϊ��ǰ����Ҫ��ǰ����ʵ��MethodInterceptor�ķ���
		enhancer.setCallback(this);
		//���ش����Ĵ������
		return enhancer.create();
	}
	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		//����һ������
		MyAspect myAspect = new MyAspect();
		//ǰ��ǿ
		myAspect.check();
		myAspect.except();
		//Ŀ�귽��ִ�У����ش�����
		Object object = methodProxy.invokeSuper(proxy, args);
		//����ǿ
		myAspect.log();
		myAspect.monitor();
		return object;
	}

}
