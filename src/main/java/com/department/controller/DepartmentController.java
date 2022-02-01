package com.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.entity.Department;
import com.department.repository.DepartmentRepository;
import com.department.service.DepartmentService;


@RestController
@RequestMapping(path = "/departments")
public class DepartmentController {
	
	
	
	@Autowired
	DepartmentService departmentService;
	//@ApiOperation(value = "retrive departments", notes = "")
	
	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Department saveDepartment(@RequestBody Department department) {
		System.out.println(department.getDepartmentName());
		return departmentService.saveDepartment(department);
	}
	 
	
	@GetMapping("/hello")
	public String findDepartmentById() {
		return "Hi Welcome";
		
	}

}
