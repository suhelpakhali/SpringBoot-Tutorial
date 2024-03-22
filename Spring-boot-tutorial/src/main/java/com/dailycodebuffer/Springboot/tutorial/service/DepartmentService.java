package com.dailycodebuffer.Springboot.tutorial.service;

import java.util.List;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);
	
public List<Department> fetchDepartmentList();

public Department fetchDepartmentbyId(Long departmentId);

public void deleteDepartmentbyId(Long departmentId);

public Department updateDepartmentbyId(Long departmentId, Department department);

public Department fetchDepartmenByName(String departmentName);




} 
