package com.xiaofei.ioc;

public class UserServiceImpl implements UserService {
	//����UserDao����
	public UserDao userDao;
	//���UserDao���Ե�setter����������ʵ������ע��
	public void setUserDao(UserDao userDao){
		this.userDao = userDao;
	}
	//ʵ�ֽӿ��еķ���
	@Override
	public void say() {
		//����UserDao�е�say()��������ִ��������
		this.userDao.say();
		
		System.out.println("userService say hello.");
	}

}
