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
				"�ƶ���",
				"Ů"
		};
		try {
			testService.delete(sql, null);
			testService.save(sql1, param);
			//�����ظ�����
			testService.save(sql1, param);
		} catch (Exception e) {
			message = "�����ظ�������ع�";
		}
		return message;
	}
}
