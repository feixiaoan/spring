package com.xiaofei.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.xiaofei.bean.MyUser;
import com.xiaofei.dao.TestDao;
@Repository("testDao")
public class TestDaoImpl implements TestDao {

	//ʹ�������ļ��е�JDBCģ��
	@Autowired
	private JdbcTemplate jdbcTemplate;
	/**
	 * ���·�����������ӣ��޸ģ�ɾ��
	 * paramΪSQL�еĲ���������ͨ�����
	 */
	@Override
	public int update(String sql, Object[] param) {
		return jdbcTemplate.update(sql,param); 
	}
	/**
	 * ��ѯ����
	 * paramΪSQL�еĲ���������ͨ�����
	 */
	@Override
	public List<MyUser> query(String sql, Object[] param) {
		RowMapper<MyUser> rowMapper = new BeanPropertyRowMapper<MyUser>(MyUser.class);
		return jdbcTemplate.query(sql, rowMapper, param);
	}

}
