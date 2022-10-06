package com.example.Jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Jwt.dao.RoleDao;
import com.example.Jwt.entity.Role;

@Service
public class RoleService {
	@Autowired
	private RoleDao roledao;
	
	public Role createNewRole(Role role) {
		return roledao.save(role);
		
	}
}
