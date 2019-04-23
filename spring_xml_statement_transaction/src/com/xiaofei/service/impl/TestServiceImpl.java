package com.xiaofei.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaofei.dao.TestDao;
import com.xiaofei.service.TestService;
@Service("testService")
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
