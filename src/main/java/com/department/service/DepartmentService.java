package com.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.department.application.SecurityConfiguration;
import com.department.entity.Department;
import com.department.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired(required = false)
	DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {

		return departmentRepository.findByDepartmentId(departmentId);
	}

}
