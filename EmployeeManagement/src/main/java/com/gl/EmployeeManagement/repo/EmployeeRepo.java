package com.gl.EmployeeManagement.repo;

import java.util.List;   

import org.springframework.data.jpa.repository.JpaRepository;


import com.gl.EmployeeManagement.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	public List<Employee> findByNameContainsAndAuthorContainsAllIgnoreCase(String firstname, String lastname);

}
