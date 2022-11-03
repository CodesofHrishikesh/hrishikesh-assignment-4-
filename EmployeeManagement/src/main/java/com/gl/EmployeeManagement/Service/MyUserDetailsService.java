package com.gl.EmployeeManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.gl.EmployeeManagement.Entity.MyUserDetails;
import com.gl.EmployeeManagement.Entity.User;
import com.gl.EmployeeManagement.repo.UserRepo;

public class MyUserDetailsService {
	
	@Autowired
	private UserRepo repo;
	@Override
	public UserDetails loadUserByfirstname(String firstname) throws UsernameNotFoundException {
		System.out.println("Username entered by the user "+firstname);
		User user = repo.findByUsername(firstname);
		if(user==null)
			throw new UsernameNotFoundException("user not found");
		return new MyUserDetails(user);
	}

}
