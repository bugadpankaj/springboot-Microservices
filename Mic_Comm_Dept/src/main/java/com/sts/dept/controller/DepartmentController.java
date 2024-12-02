package com.sts.dept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.dept.entity.Department;
import com.sts.dept.service.DepartmentService;

@RestController
@RequestMapping("/dept")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	
	@PostMapping("/")
	public Department addDepartment(@RequestBody Department department) {
		return departmentService.addDepartment(department); 
	}
	
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") long departmentId) {
		return departmentService.getDepartment(departmentId);
	}
}
