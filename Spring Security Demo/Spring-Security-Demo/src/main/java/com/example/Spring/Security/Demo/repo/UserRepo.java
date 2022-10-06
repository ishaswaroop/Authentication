package com.example.Spring.Security.Demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring.Security.Demo.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long>{

	User findByUsername(String username);
}
