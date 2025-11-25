package com.test.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.Entity.Department;
import com.test.Service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	private final DepartmentService departmentService;

	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	@PostMapping
public Department createDepartment(@RequestBody Department dept)	{
	return departmentService.saveDepartmet(dept);
}

}
