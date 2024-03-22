package com.dailycodebuffer.Springboot.tutorial.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.dailycodebuffer.Springboot.tutorial.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
		
		
		
	}

	@Override
	public List<Department> fetchDepartmentList() {
		
		return departmentRepository.findAll();
	}

	@Override
	public Department fetchDepartmentbyId(Long departmentId) {
		
		return departmentRepository.findById(departmentId).get();
	}

	@Override
	public void deleteDepartmentbyId(Long departmentId) {
		
		departmentRepository.deleteById(departmentId);
	
	}

	@Override
	public Department updateDepartmentbyId(Long departmentId, Department department) {
		Department depDb= departmentRepository.findById(departmentId).get();
		
		if(Objects.nonNull(department.getDepartmentName())&&
				!"".equalsIgnoreCase(department.getDepartmentName())) {
			depDb.setDepartmentName(department.getDepartmentName());
		}

		if(Objects.nonNull(department.getDepartmentAddress())&&
				!"".equalsIgnoreCase(department.getDepartmentAddress())) {
			depDb.setDepartmentAddress(department.getDepartmentAddress());
		}
		
		if(Objects.nonNull(department.getDepartmentCode())&&
				!"".equalsIgnoreCase(department.getDepartmentCode())) {
			depDb.setDepartmentCode(department.getDepartmentCode());
		}
		
		return departmentRepository.save(depDb);
		}


	@Override
	public Department fetchDepartmenByName(String departmentName) {
		
		return departmentRepository.findByDepartmentName(departmentName);
	}
	

	}

	
	

