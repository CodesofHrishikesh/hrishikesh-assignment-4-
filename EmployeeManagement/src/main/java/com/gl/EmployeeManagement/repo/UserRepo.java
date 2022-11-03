package com.gl.EmployeeManagement.repo;

import org.springframework.data.repository.CrudRepository; 

import com.gl.EmployeeManagement.Entity.Role;
import com.gl.EmployeeManagement.Entity.User;

public interface UserRepo extends CrudRepository<User, Long>{

	public User findByUsername(String username);
}



