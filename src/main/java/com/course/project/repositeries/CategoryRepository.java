package com.course.project.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.project.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
