package com.xiaofei.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xiaofei.dao.TestDao;
import com.xiaofei.service.TestService;
@Service("testService")
@Transactional
//加上@Transactional注解就可以指定这个类需要受spring的 事务管理
//注意@Transactional只能针对public属性范围内的方法添加
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDao testDao;
	@Override
	public int save(String sql, Object[] param) {
		return testDao.save(sql, param);
	}

	@Override
	public int delete(String sql, Object[] param) {
		return testDao.delete(sql, param);
	}

}
