package com.dailycodebuffer.Springboot.tutorial.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.dailycodebuffer.Springboot.tutorial.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/departments")
	public Department saveDepartment( @Valid @RequestBody Department department) {
		
		
		return departmentService.saveDepartment(department);
		
	}
		@GetMapping("/departments")
		public List<Department> fetchDepartmentList(){
			
			return departmentService.fetchDepartmentList();
			
		}
		
		
		@GetMapping("/departments/{id}")
		public Department fetchDepartmentbyId(@PathVariable("id") Long departmentId) {
			return departmentService.fetchDepartmentbyId(departmentId);
		}
		
		
		@DeleteMapping("/departments/{id}")
		public String deleteDepartmentbyId(@PathVariable("id") Long departmentId) {
			
			departmentService.deleteDepartmentbyId(departmentId);
			
			return "Deleted Successfully!!!!";
		}
		
		
		@PutMapping("/departments/{id}")
		public Department updateDepartmentbyId(@PathVariable("id") Long departmentId, @RequestBody Department department) {
			return departmentService.updateDepartmentbyId(departmentId,department);
		}
	
	
		@GetMapping("/departments/name/{name}")
		public Department fetchDepartmentbyName(@PathVariable("name") String departmentName) {
			
		//	System.out.println("departmentName");
			return departmentService.fetchDepartmenByName(departmentName);
		}
		
		
}
