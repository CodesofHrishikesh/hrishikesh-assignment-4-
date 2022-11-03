package com.gl.EmployeeManagement.Entity;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.gl.EmployeeManagement.Entity.Role;

public class User {

	@Id
	private Long id;
	private String username;
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="user_roles",
			joinColumns = @JoinColumn(name="userid"),
			 inverseJoinColumns = @JoinColumn(name="roleid")
	)
	private List<Role> roles;
}
