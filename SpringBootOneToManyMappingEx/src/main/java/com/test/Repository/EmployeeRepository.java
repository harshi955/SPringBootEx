package com.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
