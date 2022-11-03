package com.gl.EmployeeManagement.Service;

import java.util.List; 

import com.gl.EmployeeManagement.Entity.Employee;

public interface EmployeeService {
	

	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);

	public List<Employee> searchBy(String firstname, String lastname);
}


