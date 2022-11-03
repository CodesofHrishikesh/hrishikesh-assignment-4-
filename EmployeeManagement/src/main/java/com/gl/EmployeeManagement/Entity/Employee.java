package com.gl.EmployeeManagement.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor


public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Employeeid;
	private String firstname;
	private String lastname;
	private String email;
	public Employee(String firstname, String lastname, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		
	}
	
	
	
}
