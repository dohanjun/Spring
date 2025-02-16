package com.yedam.app.dept.service;

import java.util.List;
import java.util.Map;

public interface DeptService {
	public List<DeptVO> findAllDept();
	
	
	public DeptVO findDeptInfo(DeptVO deptVO);
	
	
	public int createDeptInfo(DeptVO deptVO);
	
	
	public Map<String, Object>
				modifyDeptInfo(DeptVO deptVO);
	
	
	public Map<String, Object>
				removeDeptInfo(int departmentId);
}
