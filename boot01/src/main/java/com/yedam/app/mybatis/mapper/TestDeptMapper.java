package com.yedam.app.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yedam.app.mybatis.dept.service.impl.DeptInfo;

@Mapper
public interface TestDeptMapper {

	
	public List<DeptInfo> deptList();
}
