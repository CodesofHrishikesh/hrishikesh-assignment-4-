package com.gl.EmployeeManagement.repo;

import org.springframework.data.repository.CrudRepository; 

import com.gl.EmployeeManagement.Entity.Role;

public interface RoleRepo extends CrudRepository<Role, Integer>{

}
