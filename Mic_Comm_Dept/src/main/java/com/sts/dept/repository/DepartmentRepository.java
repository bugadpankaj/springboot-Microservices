package com.sts.dept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sts.dept.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
