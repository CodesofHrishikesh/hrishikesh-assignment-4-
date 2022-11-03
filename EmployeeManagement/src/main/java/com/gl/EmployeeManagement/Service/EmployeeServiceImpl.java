package com.gl.EmployeeManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.EmployeeManagement.Entity.Employee;
import com.gl.EmployeeManagement.repo.EmployeeRepo;
import com.gl.EmployeeManagement.Service.EmployeeService;


	
	@Service
	public class EmployeeServiceImpl implements EmployeeService{

		@Autowired
		private EmployeeRepo repo;
		
		@Override
		public List<Employee> findAll() {
			return repo.findAll();
		}

		@Override
		public Employee findById(int theId) {
			return repo.findById(theId).get();
		}

		@Override
		public void save(Employee theEmployee) {
			repo.save(theEmployee);
			
		}

		@Override
		public void deleteById(int theId) {
			repo.deleteById(theId);
			
		}

		@Override
		public List<Employee> searchBy(String firstname, String lastname) {
			// TODO Auto-generated method stub
			return repo.findByNameContainsAndAuthorContainsAllIgnoreCase(firstname, lastname);
		}

	}
