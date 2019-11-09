package com.course.project.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.project.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
