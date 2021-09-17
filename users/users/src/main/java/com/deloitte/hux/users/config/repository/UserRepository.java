package com.deloitte.hux.users.config.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.hux.users.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{

	 public User findByUsername(String username);
}
