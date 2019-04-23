package com.xiaofei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xiaofei.service.TestService;

@Controller
public class StatementController {
	@Autowired
	private TestService testService;
	public String test() {
		String message = "";
		String sql = "delete from user";
		String sql1 = "insert into user values (?, ?, ?)";
		Object[] param = {
				1,
				"闫儿子",
				"女"
		};
		try {
			testService.delete(sql, null);
			testService.save(sql1, param);
			//插入重复数据
			testService.save(sql1, param);
		} catch (Exception e) {
			message = "主键重复，事务回滚";
		}
		return message;
	}
}
