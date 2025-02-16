package com.yedam.app.mybatis.dept.service.impl;

import lombok.Data;

@Data
public class DeptInfo {
	private int departmentId;
	private String departmentName;
	private int managerId;
	private int locationId;
}
