package com.course.project.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.project.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
