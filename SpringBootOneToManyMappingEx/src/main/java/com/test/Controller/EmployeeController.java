package com.test.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.Entity.Employee;
import com.test.Service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
@PostMapping("/{departmentId}")
	public Employee createEmployee(@PathVariable Long departmentId,@RequestBody Employee emp) {
		return employeeService.createEmployee(departmentId,emp);
	}

}
