package com.sts.dept.service;

import com.sts.dept.entity.Department;

public interface DepartmentService {
	
	public Department addDepartment(Department department);

	public Department getDepartment(long departmentId);

}
