package com.gl.EmployeeManagement;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gl.EmployeeManagement.Entity.Employee;
import com.gl.EmployeeManagement.repo.EmployeeRepo;

@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}
	
	@Autowired 
	private EmployeeRepo repo;
	/*
	//@Bean
	public void initialize()
	{
		Employee E1 = new Employee();
		E1.setfirstname("first");
		E1.setlastname("last");
		E1.setemail("@gl");
		Employee E2 = new Employee();
		E2.setfirstname("first2");
		E2.setlastname("last2");
		E2.setemail("@gl");
		Employee E3 = new Employee();
		E3.setAuthor("first3");
		E3.setName("last3");
		E3.setCategory("@gl");
		repo.save(E1);
		repo.save(E2);
		repo.save(E3);
	}
*/
}
