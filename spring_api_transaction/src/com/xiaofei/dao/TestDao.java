package com.xiaofei.dao;

import java.util.List;

import com.xiaofei.bean.MyUser;

public interface TestDao {
	public int update(String sql,Object[] param );
	public List<MyUser> query(String sql, Object[] param);
}
