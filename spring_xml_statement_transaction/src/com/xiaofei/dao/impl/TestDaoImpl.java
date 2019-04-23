package com.xiaofei.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.xiaofei.dao.TestDao;
@Repository("testDao")
public class TestDaoImpl implements TestDao {

	//ʹ�������ļ��е�JDBCģ��
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int save(String sql, Object[] param) {
		return jdbcTemplate.update(sql, param);
	}
	public int delete(String sql, Object[] param) {
		return jdbcTemplate.update(sql, param);
	}
}
