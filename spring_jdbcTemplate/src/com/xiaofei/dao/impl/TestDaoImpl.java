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

	//使用配置文件中的JDBC模板
	@Autowired
	private JdbcTemplate jdbcTemplate;
	/**
	 * 更新方法，包括添加，修改，删除
	 * param为SQL中的参数，例如通配符？
	 */
	@Override
	public int update(String sql, Object[] param) {
		return jdbcTemplate.update(sql,param); 
	}
	/**
	 * 查询方法
	 * param为SQL中的参数，例如通配符？
	 */
	@Override
	public List<MyUser> query(String sql, Object[] param) {
		RowMapper<MyUser> rowMapper = new BeanPropertyRowMapper<MyUser>(MyUser.class);
		return jdbcTemplate.query(sql, rowMapper, param);
	}

}
