package com.xiaofei.ioc;

public class UserServiceImpl implements UserService {
	//声明UserDao属性
	public UserDao userDao;
	//添加UserDao属性的setter方法，用于实现依赖注入
	public void setUserDao(UserDao userDao){
		this.userDao = userDao;
	}
	//实现接口中的方法
	@Override
	public void say() {
		//调用UserDao中的say()方法，并执行输出语句
		this.userDao.say();
		
		System.out.println("userService say hello.");
	}

}
