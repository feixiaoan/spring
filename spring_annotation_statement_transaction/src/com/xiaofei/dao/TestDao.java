package com.xiaofei.dao;

public interface TestDao {
	public int save(String sql, Object[] param);
	public int delete(String sql, Object[] param);
}
