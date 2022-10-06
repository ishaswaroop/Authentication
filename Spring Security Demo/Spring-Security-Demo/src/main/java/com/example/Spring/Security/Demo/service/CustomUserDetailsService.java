package com.example.Spring.Security.Demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.Spring.Security.Demo.Entity.User;
import com.example.Spring.Security.Demo.component.CustomUserDetails;
import com.example.Spring.Security.Demo.repo.UserRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService{
    
	@Autowired
	private UserRepo userrepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=userrepo.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("User Not Found");
		}
		return new CustomUserDetails(user);
	}

}
