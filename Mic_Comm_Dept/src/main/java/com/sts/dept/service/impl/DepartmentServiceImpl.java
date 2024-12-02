package com.sts.dept.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.dept.entity.Department;
import com.sts.dept.repository.DepartmentRepository;
import com.sts.dept.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department addDepartment(Department department) {
		log.info("Inside save dept of Dept service");
		return departmentRepository.save(department);
	}

	@Override
	public Department getDepartment(long departmentId) {
	
		return departmentRepository.findById(departmentId).get();
	}

	
}
