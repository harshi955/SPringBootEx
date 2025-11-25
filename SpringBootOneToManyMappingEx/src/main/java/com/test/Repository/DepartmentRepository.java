package com.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.Entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long>{

}
