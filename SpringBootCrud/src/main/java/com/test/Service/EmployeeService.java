package com.test.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Entity.Employee;
import com.test.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	
	private EmployeeRepository empRepo;

	public Employee createEmployee(Employee emp) {
		
		return empRepo.save(emp);
	}

	public List<Employee> getAllEmployees() {
		
		return empRepo.findAll();
	}

	public Employee getEmployeeById(Integer id) {
		
		return empRepo.findById(id).orElse(null);
	}

	public Employee updateEmployeeById(Integer id, Employee emp) {
		emp.setId(id);
		return empRepo.save(emp);
	}

	public void deleteEmployee(Integer id) {
		empRepo.deleteById(id);
		
	}

}
