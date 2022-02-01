package com.department.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.department.entity.Department;

@Repository
@Service
public interface DepartmentRepository extends CrudRepository<Department, Long>{

	Department findByDepartmentId(Long departmentId);

}
