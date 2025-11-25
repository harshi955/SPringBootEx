package com.test.Service;

import org.springframework.stereotype.Service;

import com.test.Entity.Department;
import com.test.Entity.Employee;
import com.test.Repository.DepartmentRepository;
import com.test.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;
private final DepartmentRepository departmentRepository;
	public EmployeeService(EmployeeRepository employeeRepository,DepartmentRepository departmentRepository) {
		this.employeeRepository = employeeRepository;
		this.departmentRepository=departmentRepository;
	}

	public Employee createEmployee(Long departmentId,Employee emp) {
		
		Department department=departmentRepository.findById(departmentId).orElseThrow(() -> new RuntimeException("Department Not Found.."));
		emp.setDepartment(department);
		return employeeRepository.save(emp);
		
	}
	
	

}
