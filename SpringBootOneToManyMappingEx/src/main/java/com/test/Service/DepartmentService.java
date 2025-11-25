package com.test.Service;

import org.springframework.stereotype.Service;

import com.test.Entity.Department;
import com.test.Repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	private final DepartmentRepository departmentRepository;

	public DepartmentService(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}

	public Department saveDepartmet(Department dept) {
		if(dept.getEmployees() !=null) {
			dept.getEmployees().forEach(emp -> emp.setDepartment(dept));
		}
	
		return departmentRepository.save(dept);
	}
	
	

}
