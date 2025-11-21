package com.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.Entity.Employee;
import com.test.Service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeService empServ;
	@PostMapping("/save")
	public Employee createEmployee(@RequestBody Employee emp) {
		return empServ.createEmployee(emp);
	}
	@GetMapping("/get")
	public List<Employee> getAllEmployees(){
		return empServ.getAllEmployees();
	}
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable Integer id) {
		return empServ.getEmployeeById(id);
		
	}
	@PutMapping("/{id}")
	
	public Employee updateEmployeeById(@PathVariable Integer id,@RequestBody Employee emp) {
		return empServ.updateEmployeeById(id,emp);
	}
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Integer id) {
		empServ.deleteEmployee(id);
	}

}
